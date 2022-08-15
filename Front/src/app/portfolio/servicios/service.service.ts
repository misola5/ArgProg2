import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
// import 'rxjs/add/operator/map';
// import 'rxjs/add/operator/toPromise';
import { Estudio } from '../../clases/Estudio'

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json; charset=utf-8; Access-Control-Allow-Origin: *; Access-Control-Allow-Methods "GET,POST,PUT,DELETE,OPTIONS"'
  })
}

@Injectable({
  providedIn: 'root'
})



export class ServiceService {

  constructor(private http: HttpClient) { }

  getJson(url: string):Observable<any>{
    // console.log ("el servicio anda")
    return this.http.get<any>(url);
    
  }
  

  deleteEstudio(id: Number) : Observable<any>{
    return this.http.delete<any>("http://localhost:8080/deleteEstudio/"+id);
  }

  deleteExperiencia(id: Number) : Observable<any>{    
    return this.http.delete<any>("http://localhost:8080/deleteExperiencia/"+id);
  }

  // crearEstudio(): Observable<any>{
  //   return this.http.post<any>("http://localhost:8080/")
  // }

  //Envio clase Estudio al back
  // guardarEstudio(Estudio: Estudio ){
  //   return this.http.post("localhost:8080/crearEstudio", Estudio, httpOptions)
  // }

  guardarEstudio(Estudio: Estudio ){

     var jsonAEnviar = { titulo: Estudio.titulo, intitucion: Estudio.intitucion, anioingreso: Estudio.anioingreso,
                         anioegreso: Estudio.anioegreso, urlimgestudio: Estudio.urlimgestudio };

    return this.http.post("http://localhost:8080/crearEstudio", jsonAEnviar)
  }


  // getJson_v2(url: string) {
  //   let headers = new Headers();    
  //   headers.append('Content-Type', 'application/json; charset=utf-8; Access-Control-Allow-Origin: *; Access-Control-Allow-Methods "GET,POST,PUT,DELETE,OPTIONS"');

  //   return this.http.get(url),    
  //   { headers: headers }
    // .map(data => data.json());
  //}



}
