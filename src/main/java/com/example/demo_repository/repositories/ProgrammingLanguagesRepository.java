package com.example.demo_repository.repositories;

import com.example.demo_repository.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceRel = "languages", itemResourceRel = "language")
public interface ProgrammingLanguagesRepository  extends JpaRepository<ProgrammingLanguage, Long> {
}
