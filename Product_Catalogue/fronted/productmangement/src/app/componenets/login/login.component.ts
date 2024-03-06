import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AppComponent } from 'src/app/app.component';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private userservice:UserService,private route:Router,private app:AppComponent){

  }
  public auth={

    user:'',

    password:''

  }

  authRequest(){

    this.userservice.authUser(this.auth).subscribe(data=>{

      if(data){

        this.app.flag=true;

        this.route.navigate(['search']);

      }



    })

  }
}
