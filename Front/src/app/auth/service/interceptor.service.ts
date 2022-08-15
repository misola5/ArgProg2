import { Injectable } from '@angular/core';
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AutenticacionService } from './autenticacion.service';

@Injectable({
  providedIn: 'root'
})
export class InterceptorService implements HttpInterceptor {

  constructor(private autenticacionService: AutenticacionService) { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {




    //const token = localStorage.getItem('token');
    var currentUser = this.autenticacionService.UsuarioAutenticado;
    let request = req;

    if (currentUser.token) {
      request = req.clone({
        setHeaders: {
          authorization: `Bearer ${ currentUser.token }`
        }
      });
    }
    console.log("Interceptor corriendo" + JSON.stringify(currentUser.token));
    return next.handle(request);
  }
  //   var currentUser = this.autenticacionService.UsuarioAutenticado;
  //   if (currentUser && currentUser.token) {
  //     req = req.clone({
  //       setHeaders: {
  //         Authorization: 'Bearer ${currentUser.token}'
  //       }
  //     })
  //   }
  //   console.log("Interceptor corriendo" + JSON.stringify(currentUser.token));
  //   return next.handle(req);
  // }

}
