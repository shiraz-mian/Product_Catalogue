import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AppComponent } from 'src/app/app.component';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  constructor(private userservice: UserService , private route:Router,private app:AppComponent ){

  }

  result : any;
  public search={

    code:''

  }
   ngOnInit():void{
    if(this.app.flag==false){

      this.route.navigate(['login']);

    }
    this.userservice.getAllData().subscribe(data=>{

      console.warn(data)

      this.result=data

    })
   }

   findByCode():void{

    this.userservice.findByCode(this.search.code).subscribe(data=>{

      console.warn(data)

      this.result=data

    })

  }




  

}
