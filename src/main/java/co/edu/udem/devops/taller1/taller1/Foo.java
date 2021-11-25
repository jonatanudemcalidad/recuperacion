package co.edu.udem.devops.taller1.taller1;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Foo {
    
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
