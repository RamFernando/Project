import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'initial';
  fcolor="brown";
  scolor="green";
  name= "";

  users =[
    {fname:"ramesha", lname:"fernando"},
    {fname:"kavisha", lname:"perera"},
    {fname:"sanduni", lname:"thennakoon"},
    {fname:"shaya", lname:"fernando"}
  ]

//   showmyValue(event){
//     this.name=(event.target.value)
//   }
}
