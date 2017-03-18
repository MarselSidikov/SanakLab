package ru.sanak.list;

public class TestMerge {
    public static void main(String args[]){
        LinkedList aList = new LinkedList();
        LinkedList bList = new LinkedList();
        aList.add(2);aList.add(4);aList.add(6);aList.add(8);
        bList.add(1);bList.add(3);bList.add(5);bList.add(7);

        LinkedList mergedList = LinkedList.merge(aList,bList);

        for(int i = 0 ; i<8 ; i++){
            System.out.println(mergedList.getByIndex(i));
        }

    }


}
