package com.hospital_vm.cl.hospital_vm.service;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import com.hospital_vm.cl.hospital_vm.repository.AtencionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AtencionService {

    @Autowired
    private AtencionRepository atencionRepository;

    public List<Atencion> findAll() {return atencionRepository.findAll();}
}
