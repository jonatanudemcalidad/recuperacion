package co.edu.udem.devops.taller1.taller1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.udem.devops.taller1.taller1.controller.FooController;

class FooTest {
    
    @Test
    void Foo(){
        FooController fooController = new FooController();
        Foo foo = fooController.findById(1);
        Foo foo2 = new Foo();
        foo2.setId(1);
        foo2.setName("Test1");
        assertEquals(foo2.getId(),foo.getId());
        assertEquals(foo2.getName(),foo.getName());
    }
    
}
