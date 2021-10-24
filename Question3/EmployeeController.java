@RestController

class EmployeeContoller{

// This service class will do all the work and interact with DB and perform operations

@autowired

ServiceEmployee employee;



@GetMapping("/getEmployee/{employeeId}")

ReponseEntity<> getEmployees(@PathParam int employeeId){

  //Here logic will be getEmployeeById(employeeId))

Employee emp =  service.getEmployees(employeeId));

if(emp == null)

  return new ResponseEntity<>(Employee,HttpCode.404);

return new ResponseEntity<>(Employee,HttpCode.200);



}



@RequestMapping("/deleteEmployee/{employeeId)}", method = METHOD.DELETE, accepts = JSON.APPLICATION.DATA, responseType)

ReponseEntity<> deleteEmployees(@PathParam int employeeId){

//Here logic will be deleteEmployeeById(employeeId))

  Employee emp =  service.deleteEmployee(employeeId));

return new ResponseEntity<>(Employee,HttpCode.200);

}



@RequestMapping("/addEmployee}" method = METHOD.POST, accepts = JSON.APPLICATION.DATA)

ReponseEntity<> addEmployees(@RequestBody Employee employee){

//Here logic will be save(Employee))

  Employee emp =  service.addEmployee(employee);

return new ResponseEntity<>(Employee,HttpCode.201);



}



@RequestMapping("/updateEmployee}" method = METHOD.PUT, accepts = JSON.APPLICATION.DATA)

ReponseEntity<> updateEmployees(@RequestBody Employee employee){

//Here logic will be save(numberOfEmployee)). Here save will override the previous data to new updated data

  Employee emp =  service.updateEmployee(numberOfEmployee));

return new ResponseEntity<>(Employee,HttpCode.200);



}



}
