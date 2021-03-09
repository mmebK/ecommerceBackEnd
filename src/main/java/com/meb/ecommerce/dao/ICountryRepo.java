package com.meb.ecommerce.dao;


import com.meb.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface ICountryRepo extends JpaRepository<Country, Long> {
}
