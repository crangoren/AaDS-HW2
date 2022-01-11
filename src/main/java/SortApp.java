import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        NotebookArray notebookArray = new NotebookArray(10000);
        Notebook[] array = notebookArray.getNotebooks();
        System.out.println(Arrays.toString(array));

        Sorter.sort(array, Sorter.SortType.QUICK_SORT);

        System.out.println(Arrays.toString(array));
    }
}
