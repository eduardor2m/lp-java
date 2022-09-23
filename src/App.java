public class App {
    public static void main(String[] args) throws Exception {

        App app = new App();

        System.out.println(app.add(2, 3));
        System.out.println(app.sub(2, 3));
        System.out.println(app.mul(2, 3));
        System.out.println(app.div(2, 3));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

}
