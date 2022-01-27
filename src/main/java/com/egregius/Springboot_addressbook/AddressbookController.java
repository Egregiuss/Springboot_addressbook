package com.egregius.Springboot_addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



        @RestController
        @RequestMapping("/api/")
        public class AddressbookController {

            @Autowired
            AddressbookRepository addressbookRepository;


            @GetMapping("/get-all-employees")
            public List<AddressbookEntity> getAllEmployee() {
                List<AddressbookEntity> allEmployeelist = addressbookRepository.findAll();
                return allEmployeelist;

            }
            @GetMapping("/get-employee/{id}")
            public AddressbookEntity getEmployeebyId(@PathVariable(value = "id") Integer id) {
                AddressbookEntity employeeEntity = addressbookRepository.findById(id).get();

                return employeeEntity;

            }
            @PostMapping("/create-employees")
            public AddressbookEntity createEmployee(@RequestBody AddressbookEntity employee) {

                AddressbookEntity savedEmployee = addressbookRepository.save(employee);

                return savedEmployee;

            }
            

            @PutMapping("/update-employees/{id}")
            public ResponseEntity<AddressbookEntity> updateEmployee(@PathVariable(value = "id") Integer id,
                                                                 @RequestBody AddressbookEntity employeeDetails) {
                AddressbookEntity employee = addressbookRepository.findById(id).get();


                employee.setFirstname(employeeDetails.getFirstname());
                employee.setLastname(employeeDetails.getLastname());
                employee.setPhonenumber(employeeDetails.getPhonenumber());
                employee.setEmailaddress(employeeDetails.getEmailaddress());
                final AddressbookEntity updatedEmployee = addressbookRepository.save(employee);
                return ResponseEntity.ok(updatedEmployee);
            }

            @DeleteMapping("/delete-employees/{id}")
            public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer id)
            {
                AddressbookEntity employee = addressbookRepository.findById(id).get();

                addressbookRepository.delete(employee);
                Map<String, Boolean> response = new HashMap<>();
                response.put("deleted", Boolean.TRUE);
                return response;
            }
        }



