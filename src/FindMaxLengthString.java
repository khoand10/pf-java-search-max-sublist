import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/*
author: khoa
 */

public class FindMaxLengthString {
    /*
        tao list max de luu list lien tiep co do dai lon nhat. vong lap for xy ly tung ky tu cua chuoi.
        trong for: if ky tu tiep theo <= kytu cuoi cua chuoi thi stop, con khong thi list.add(kytu)
        sau do so sanh size cua list lien tiep voi list max neu lon hon thi add list vao list max
    */
    static LinkedList<Character> findMaxSubList(String string) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        for (char a : findMaxSubList(string)) {
            System.out.print(a + "\t");
        }
    }
}