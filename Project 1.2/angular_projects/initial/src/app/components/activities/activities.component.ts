import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-activities',
  templateUrl: './activities.component.html',
  styleUrls: ['./activities.component.css']
})
export class ActivitiesComponent implements OnInit {

  id:any;
  qparam:any;
  constructor(router:ActivatedRoute) {
//     router.params.subscribe(params=>{
    router.paramMap.subscribe(params=>{
//     console.log(params)
//     this.id = params.id;
    this.id = params.get('id');
    });

    router.queryParamMap.subscribe(params=>{
      console.log(params);
    })
  }

  ngOnInit(): void {
  }

}
