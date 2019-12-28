import com.app.adt.SortedList;

public class NewMain {

    public static void main(String[] args) {
        String[] names={"bob", "rudolph", "dasher", "prancer", "dancer", "mary","joe","fred"};
        SortedList<String> a=new SortedList<>();
        for (int i=0; i < names.length; i++){
            a.insert(names[i]);
        }

        a.print();
    }
    
}
