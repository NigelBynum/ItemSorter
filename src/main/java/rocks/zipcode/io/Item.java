package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
   private Double price;
   private String name;
   private Long id;

   public Item() {
        this.price = 0.01;
        this.name= "";
        this.id= 0L;
    }

    public Item(Long id, String name, Double price) {
        this.price = price;
        this.name= name;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) { this.price = price;
    }
}
