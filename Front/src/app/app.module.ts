import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './portfolio/header/header.component';
import { DatospersonalesComponent } from './portfolio/datospersonales/datospersonales.component';
import { EstudiosComponent } from './portfolio/estudios/estudios.component';
import { ExperienciaComponent } from './portfolio/experiencia/experiencia.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ServiceService } from './portfolio/servicios/service.service';

import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'; 
import { InterceptorService } from './auth/service/interceptor.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DatospersonalesComponent,
    EstudiosComponent,
    ExperienciaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FontAwesomeModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [ServiceService,
            {provide: HTTP_INTERCEPTORS, useClass: InterceptorService, multi: true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
