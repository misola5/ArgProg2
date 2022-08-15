import { Component } from '@angular/core';
import { faCoffee, faTimes, faPlusCircle } from '@fortawesome/free-solid-svg-icons';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'portfolio';
  faCoffee = faCoffee;
  faTimes= faTimes
  faPlusCircle = faPlusCircle

  
  
}
