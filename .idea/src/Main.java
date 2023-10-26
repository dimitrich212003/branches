public class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        int a = 1;
        int b = 2;
        System.out.print(a + b);

        boolean flag = true;
        while(flag) {
            if (a > 10) {
                flag = false;
            }
            a++;
        }
        System.out.print(a);
        Random random = new Random();
        System.out.println(random.nextInt(4) + 4);

        for (int i = 0; i < 10; i++) {
            a = a + b;
        }
    }
}