import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service'

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
// We use selector as a custom html element 
// and this selector will be replaced with employee-list.component.html present in templateUrl during runtime.
export class EmployeeListComponent implements OnInit {


  employees:any;

  constructor(private employeeService: EmployeeService,private router:Router) { }

  ngOnInit(): void {
    // this.employees=[{
    //   "id":1,"firstName":"Mitesh","lastName":"kumar","emailId":"xyz@gmail.com"

    // },
    // {
    //   "id":2,"firstName":"Ram","lastName":"kumar","emailId":"z@gmail.com"
    // }];
    this.getEmployees();
  }

  private getEmployees(){
    this.employeeService.getEmployeesList().subscribe(data=>{
      console.log("Hi mitesh",data);
      this.employees=data;

    });
  }

  employeeDetails(id:number){
    this.router.navigate(['employee-details',id]);

  }




  updateEmployee(id:number){
    this.router.navigate(['update-employee',id]);

  }
  deleteEmployee(id:any){

 
    this.employeeService.deleteEmployee(id).subscribe( data => {
      console.log(data);
      this.getEmployees();
    })

  }

    
  }



