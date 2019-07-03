package com.school.project.service.impl;

import com.school.project.exception.ModuleNotFoundeException;
import com.school.project.model.entities.Module;
import com.school.project.repository.ModuleRepository;
import com.school.project.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleRepository moduleRepository;

    @Override
    public Module createModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public void updateModule(Module moduleToUpdate, Long id) {
        moduleToUpdate.setId(id);
        moduleRepository.saveAndFlush(moduleToUpdate);
    }

    @Override
    public Module getModuleById(Long id) {
        Optional<Module> byId = moduleRepository.findById(id);
        if (!byId.isPresent()) throw new ModuleNotFoundeException("Module with id : " + id + "is not found");
        return byId.get();
    }

    @Override
    public Module getModuleByName(String name) {
        Optional<Module> moduleByName = moduleRepository.getModuleByName(name);
        if (!moduleByName.isPresent())
            throw new ModuleNotFoundeException("Module with name : " + name + " is not found");
        return moduleByName.get();
    }

    @Override
    public List<Module> getModuleBySubject(Long id) {
        List<Module> moduleBySubjects = moduleRepository.getModuleBySubjectsId(id);
        if (moduleBySubjects.isEmpty())
            throw new ModuleNotFoundeException("Modules with Subject Id : " + id + " is not found");
        return moduleBySubjects;
    }
}