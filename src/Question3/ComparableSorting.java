package Question3;

public class ComparableSorting {

    //sort function
    public static <E extends Comparable<E>> void sort(E[] list) {

//      بنقارن كل عنصر بالعناصر اللي بعده
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {

                if (list[i].compareTo(list[j]) > 0) {
//                  العنصر الاول اكبر من التاني
                    E temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                }
            }
        }
    }
}