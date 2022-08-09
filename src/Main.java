public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        //Task 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int a = 10;
        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println();
        System.out.println();


        //Task 2
        int fraidy = 5;
        System.out.println("Сегодня Пятница " + fraidy + "-е число. Необходимо подготовить отчет");
        System.out.println();
        for (int b = 0; b < 3; b++) {
            if (fraidy <= 31) {
                fraidy = fraidy + 7;
            }
            System.out.println("Сегодня Пятница" + fraidy + "-е число. Необходимо подготовить отчет");
            System.out.println();

            //Третью не написал, т.к. её решение перемешивается со вторым заданием.
            }
    }
}