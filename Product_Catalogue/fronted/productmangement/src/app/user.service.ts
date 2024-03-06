import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  url = "http://localhost:8080"
  public adduser(user:any){
    return this.http.post(`${this.url}/Register`,user);
  }

  getAllData():Observable<any>{

    return this.http.get(`http://localhost:8080/product`);

  }

  authUser(data: any): Observable<Object>{



    return this.http.post('http://localhost:8080/user',data);



  }
  findByCode(code:string):Observable<any>{

    return this.http.get('http://localhost:8080/search/'+code);

  }


}
