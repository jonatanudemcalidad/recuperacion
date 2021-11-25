package co.edu.udem.devops.taller1.taller1.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import co.edu.udem.devops.taller1.taller1.Foo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foos")
public class FooController {

    Logger logger = LogManager.getLogger(FooController.class);

    @ApiOperation(
            value = "Retorna una lista del Foo ",
            response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna la lista del Foo de forma satisfactoria"),})
    @GetMapping
    public List<Foo> findAll() {
        logger.info("findAll");
        
        Foo foo1 = new Foo();
        foo1.setId(1);
        foo1.setName("Test1");
        
        Foo foo2 = new Foo();
        foo2.setId(2);
        foo2.setName("Test2");
        
        List<Foo> listFoo = new ArrayList<>();
        listFoo.add(foo1);
        listFoo.add(foo2);
        
        return listFoo;
    }

    @ApiOperation(
            value = "Retorna un Foo de la lista ",
            response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna un Foo de la lista de forma satisfactoria"),})
    @GetMapping(value = "/{id}")
    public Foo findById(@ApiParam(value = "Id Foo", required = true) @PathVariable("id") int id) {
        logger.info("findById");
        
        Foo foo = new Foo();
        foo.setId(1);
        foo.setName("Test1");
        
        return foo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Foo resource) {
        logger.info("create");
        long varlocal = 0;
        return varlocal;
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Foo resource) {
        logger.info("Update");
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        logger.info("Delete");
    }

}

