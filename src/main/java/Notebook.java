import java.util.Objects;

public class Notebook implements Comparable<Notebook> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return price.equals(notebook.price) &&
                opMem.equals(notebook.opMem) &&
                brand.equals(notebook.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, opMem, brand);
    }

    @Override
    public int compareTo(Notebook notebook) {
        if (this == notebook || this.equals(notebook)) {
            return 0;
        }
        if (price > notebook.getPrice()) {
            return 1;
        } else if (price < notebook.getPrice()) {
            return -1;
        } else if (opMem > notebook.getOpMem()) {
            return 1;
        } else if (opMem < notebook.getOpMem()) {
            return -1;
        } else if (brand.compareTo(notebook.getBrand()) > 0) {
            return 1;
        } else if (brand.compareTo(notebook.getBrand()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", price=" + price +
                ", opMem=" + opMem +
                ", brand='" + brand + '\'' +
                '}';
    }
}
