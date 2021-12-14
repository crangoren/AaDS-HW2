public class Notebook {

    Integer id;
    Integer price;
    Integer opMem;
    String brand;

    public Notebook(Integer id, Integer price, Integer opMem, String brand) {
        this.id = id;
        this.price = price;
        this.opMem = opMem;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOpMem() {
        return opMem;
    }

    public void setOpMem(Integer opMem) {
        this.opMem = opMem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
