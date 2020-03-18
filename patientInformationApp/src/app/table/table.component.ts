import { Component, OnInit } from '@angular/core';
import { TableService } from './table.service';
import { Table } from './Table';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styles: []
})
export class TableComponent implements OnInit {
  //newcomponent = "Entered in new tablecomponent created";	
  patients: Table[];
  constructor(private tservice: TableService) {}
  ngOnInit() {
    this.tservice.getData().subscribe(
      data => {
          //alert(JSON.stringify(data));
          this.patients = data.patients;
    });
  }
}