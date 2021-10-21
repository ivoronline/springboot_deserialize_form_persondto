package com.ivoronline.springboot_deserialize_form_persondto.controllers;

import com.ivoronline.springboot_deserialize_form_persondto.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class MyController {

  //================================================================================
  // GET FORM DATA
  //================================================================================
  @RequestMapping("GetFormData")
  String getFormData(PersonDTO personDTO) throws IOException {

    //GET FILE CONTENT
    byte[] fileBytes = personDTO.file.getBytes();
    String fileContent      = new String(fileBytes);

    //RETURN SOMETHING
    String result = personDTO.name + " is " + personDTO.age + " years old \n";
           result += fileContent;
    return result;

  }

}


