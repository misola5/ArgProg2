import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {
  
  url="http://localhost:8080/auth/";
  currentUserSubject: BehaviorSubject<any>;
  constructor(private http:HttpClient) { 
    console.log("servicio login corriendo");
    this.currentUserSubject = new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser')||'{}'))
  }

  inciarSesion(credenciales:any):Observable<any>{
    return this.http.post(this.url+"login", credenciales).pipe(map(data=>{
      //ahora vamos a guardar informacion en el storage (el Token)
      sessionStorage.setItem('currentUser', JSON.stringify(data));
      this.currentUserSubject.next(data);
      return data;
    }))
  }

  get UsuarioAutenticado() {
    return this.currentUserSubject.value;
  }

}
