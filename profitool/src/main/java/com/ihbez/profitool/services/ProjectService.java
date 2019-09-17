package com.ihbez.profitool.services;

import com.ihbez.profitool.domain.Project;
import com.ihbez.profitool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject (Project priject) {
        return projectRepository.save(priject);
    }
}
