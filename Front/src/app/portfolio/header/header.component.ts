import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../servicios/service.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutenticacionService } from 'src/app/auth/service/autenticacion.service';



@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  form: FormGroup;
  dataHeader: any;
  constructor(private data: ServiceService,
    private formBuilder: FormBuilder,
    private autenticacionService: AutenticacionService) {
    this.form = this.formBuilder.group({
      //Con esto le da forma a la informacion que se va a manejar, de acuerdo al modelo del back
      nombreUsuario: ["", [Validators.required]],
      password: ["", [Validators.required]],
      // deviceId: ["17867868768"],
      // deviceType: ["DEVICE_TYPE_ANDROID"],
      // notificationToken: ["67657575eececc34"]
    })
  }

  ngOnInit(): void {

    this.data.getJson("http://localhost:8080/verPersona/1").subscribe(data2 => {
      this.dataHeader = data2
      // console.log ("servicio cabecera")
    })

  }

  //LOGIN
  get NombreUsuario() {
    return this.form.get('nombreUsuario');
  }
  get Password() {
    return this.form.get('password');
  }
  onEnviar(event:Event){
    event.preventDefault;
    this.autenticacionService.inciarSesion(this.form.value).subscribe(data=>{
      console.log("data"+JSON.stringify(data));
      
      //this.ruta.navigate(['/porfolio']);      Redirecciona usando el route
      this.closePopup();
      location.reload;
    })
  }


  // VENTANA MODAL
  displayStyle = "none";

  openPopup() {
    this.displayStyle = "block";
  }
  closePopup() {
    this.displayStyle = "none";
  }

}












