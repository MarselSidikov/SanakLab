package ru.sanak.stack;

public class ProgramBrackets {

    public static void main(String[] args) {
        char brackets[] = "[([][]{[]}())]{}".toCharArray();
        int i = 0;
        Stack stack = new Stack();
        boolean isCorrect = true;
        while(i < brackets.length && isCorrect == true) {
            if (brackets[i] == '('
                    || brackets[i] == '['
                    || brackets[i] == '{') {
                stack.push(brackets[i]);
            }
            else {
                if (stack.size() == 0){
                    isCorrect = false;
                }
                else if((brackets[i] == ')' && stack.peek() == '(')
                        || (brackets[i] == ']' && stack.peek() == '[')
                        || (brackets[i] == '}' && stack.peek() == '{')) {
                    stack.pop();
                }
                else{
                    isCorrect = false;
                }
            }
            i++;
        }
        // если открывающих скобок больше, чем закрывающих - то в стеке остаются элементы
        if (stack.size() != 0) {
            isCorrect = false;
        }
        // isCorrect = true, тогда, когда у тебя в стеке нет элементов, а вся строка просмотрена
        System.out.println(isCorrect);
    }
}
