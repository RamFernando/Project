import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {FormsModule} from '@angular/forms';

import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { SetmycolorDirective } from './directives/setmycolor.directive';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ActivitiesComponent } from './components/activities/activities.component';

const appRoutes: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'activities/:id', component: ActivitiesComponent },
  { path: 'items',component:ActivitiesComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    SetmycolorDirective,
    DashboardComponent,
    ActivitiesComponent,
  ],
  imports: [

  RouterModule.forRoot(appRoutes),
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
