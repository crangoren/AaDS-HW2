import java.lang.reflect.Array;
import java.util.Random;

public class NotebookArray {
    private Notebook[] notebooks;
    private String[] brands;
    private Random random;

    public NotebookArray(int size) {
        random = new Random();
        initializeBrands();
        notebooks = generateArray(size);
    }

    public Notebook[] getNotebooks() {
        return notebooks;
    }

    private String getBrand() {
        return brands[random.nextInt(4)];
    }

    private Notebook[] generateArray(int size) {
        Notebook[] notebooks = new Notebook[size];
        for (int i = 0; i < size; i++) {
            notebooks[i] = new Notebook(i, 500 + 10 * random.nextInt(151), 4 + 4 * random.nextInt(6), getBrand());
        }
        return notebooks;
    }

    private void initializeBrands() {
        brands = new String[5];
        brands[0] = "Asus";
        brands[1] = "Acer";
        brands[2] = "Lenovo";
        brands[3] = "Mac";
        brands[4] = "Xiaomi";
    }
}
//1. Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.
//        Условия для сортировки:
//        1) по цене. От 500 до 2000 долларов с шагом в 50
//        если цена равная, то
//        2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
//        если памяти тоже равное количество, то 3) по производителю:
//        Lenuvo > Asos > MacNote > Eser > Xamiou
//
//        2(дополнительно). Оптимизировать сортировку выбором, добавив поиск по максимального значения