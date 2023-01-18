public class Encapsulation {
    private int id;
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        if(id>100)
            this.id = id;
        else {
            System.out.println("Enter a value greater than 100");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
