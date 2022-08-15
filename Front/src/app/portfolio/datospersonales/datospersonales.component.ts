import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../servicios/service.service';


@Component({
  selector: 'app-datospersonales',
  templateUrl: './datospersonales.component.html',
  styleUrls: ['./datospersonales.component.css']
})
export class DatospersonalesComponent implements OnInit {
  datosPersona:any;
  nombre= "";
  apellido="";
  nacionalidad= "";
  nacimiento= "";
  residencia= "";
  about= "";
  instagram= "";
  linkedin= "";
  email= "";
  telefono= "";


  constructor(private data:ServiceService) { 
    this.carga();
  }

  ngOnInit(): void {

    // this.data.getJson("http://localhost:8080/verPersona/1").subscribe(data2=>{
    //   this.datosPersona=data2
      // this.nombre= data2.nombre;
      // this.apellido=data2.apellido;
      // this.nacionalidad= data2.nacionalidad;
      // this.nacimiento= data2.nacimiento;
      // this.residencia= data2.residencia;
      // this.about= data2.about;
      // this.instagram= data2.instagram;
      // this.linkedin= data2.linkedin;
      // this.email= data2.email;
      // this.telefono= data2.telefono;
    //})
    
  }

  public carga(){
    this.data.getJson("http://localhost:8080/verPersona/1").    
    subscribe(data2=>{
         //this.datosPersona=data2
        // console.log(this.datosPersona)
        this.nombre= data2.nombre;
        this.apellido=data2.apellido;
         this.nacionalidad= data2.nacionalidad;
         this.nacimiento= data2.nacimiento;
         this.residencia= data2.residencia;
         this.about= data2.about;
        this.instagram= data2.instagram;
        this.linkedin= data2.linkedin;
        this.email= data2.email;
         this.telefono= data2.telefono;
       }
     )
   }
  

}
