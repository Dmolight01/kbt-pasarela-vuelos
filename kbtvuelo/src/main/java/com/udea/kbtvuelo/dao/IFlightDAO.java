package com.udea.kbtvuelo.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.udea.kbt.model.Flight;

import java.util.List;


@Repository


public interface IFlightDAO extends CrudRepository<Flight,Long> {


    @Query("from Flight f where f.rating>=4 and f.cumplido=true ")
    public List<Flight> viewBestFlight();
}
