import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componenets/login/login.component';
import { RegisterComponent } from './componenets/register/register.component';
import { SearchComponent } from './componenets/search/search.component';

const routes: Routes = [
  {
    path:"register",
    component:RegisterComponent,
    pathMatch:'full'
  },
  {
    path:"search",
    component:SearchComponent,
    pathMatch:'full'
  },
  {
    path:"",
    component:LoginComponent,
    pathMatch:'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
