package ru.sank.list;

/**
 * 03.03.2017
 * TestMerge
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TestMerge {
    public static void main(String[] args) {
        LinkedList aList = new LinkedList();
        LinkedList bList = new LinkedList();

        aList.add(2);
        aList.add(4);
        aList.add(6);
        aList.add(8);

        LinkedList mergedList = LinkedList.merge(aList, bList);

        // напечатать все значения mergedList

        for (int i = 0; i < 4; i++) {
            System.out.println(mergedList.getByIndex(i));
        }

    }
}
