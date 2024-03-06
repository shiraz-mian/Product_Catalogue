import { Component } from '@angular/core';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
 
  constructor(private userservice:UserService){

  }
 public user = {
  firstname:'',
  lastname:'',
  password:'',
  email:''
 }

  formsubmit(){
    this.userservice.adduser(this.user).subscribe(
      (data) =>{
        alert("success")
      }
    );
  }
}
