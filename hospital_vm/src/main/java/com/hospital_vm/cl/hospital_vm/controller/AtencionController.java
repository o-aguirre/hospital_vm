package com.hospital_vm.cl.hospital_vm.controller;


import com.hospital_vm.cl.hospital_vm.model.Atencion;
import com.hospital_vm.cl.hospital_vm.service.AtencionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/atenciones")
public class AtencionController {

    private AtencionService atencionService;

    @GetMapping
    public ResponseEntity<List<Atencion>> listar(){
        List<Atencion> atenciones = atencionService.findAll();

        if (atenciones.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(atenciones);
    }
}
