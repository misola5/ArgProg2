import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../servicios/service.service';
import { faTimes, faCirclePlus} from '@fortawesome/free-solid-svg-icons';
import { Estudio } from '../../clases/Estudio'

@Component({
  selector: 'app-estudios',
  templateUrl: './estudios.component.html',
  styleUrls: ['./estudios.component.css']
})
export class EstudiosComponent implements OnInit {

  datosEstudio:any;
  public ftitulo = "";
  public fintitucion = "";
  public fanioingreso = "";
  public fanioegreso = "";
  public furlimagenestudio = "";
   
  
  constructor(private data:ServiceService) { }
  
  ngOnInit(): void {
    this.data.getJson("http://localhost:8080/verListaEstudio").subscribe(data=>{
      this.datosEstudio=data
      // console.log (data)
    })
  }
  
  faTimes=faTimes
  faCirclePlus=faCirclePlus
  

  public eliminar(idEstudio: Number) {   

    this.data.deleteEstudio(idEstudio).subscribe(
      data=>{
        // console.log("Se eliminó");
        location.reload();
      },
      err=>{
        console.log("No se pudo eliminar")
      })
  }

  // public guardar(titulo: String, intitucion: String, anioingreso: String, 
  //   anioegreso: String, urlimgestudio: String) {   

  //   this.data.guardarEstudio(titulo, intitucion, anioingreso, 
  //     anioegreso, urlimgestudio).subscribe(
  //     data=>{
  //       console.log("Se guardo");
  //       location.reload();
  //     },
  //     err=>{
  //       console.log(err)
  //     })
  // }

  //public guardar(titulo: String, intitucion: String, anioingreso: String, anioegreso: String, urlimgestudio: String) {   
  public guardar(){   
    let Est: Estudio = new Estudio(this.ftitulo, this.fintitucion, this.fanioingreso, this.fanioegreso, this.furlimagenestudio)

    this.data.guardarEstudio(Est).subscribe(
      data=>{
        console.log("Se guardo");
        location.reload();
      },
      err=>{
        console.log(err)
      })
  }

  displayStyle = "none";
  
  openPopup() {
    this.displayStyle = "block";
  }
  closePopup() {
    this.displayStyle = "none";}
}
