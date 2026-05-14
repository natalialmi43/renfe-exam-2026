package iesam.features.trains.domain;

public class Train {
    private String id;
    private String name;
    private String yearOfConstruction;
    private String colour;

    public Train(String id, String name, String yearOfConstruction, String colour) {
        this.id = id;
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.colour = colour;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(String yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearOfConstruction='" + yearOfConstruction + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
