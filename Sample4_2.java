public class Sample4_2 {

    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
        rccar1.show(); // 呼叫父類別的 show 方法
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，將汽油量設為 " + gas);
    }

    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar(int n, double g, int c) {
        super(); // 呼叫父類別的無參數建構函數
        setCar(n, g); // 呼叫父類別的 setCar 方法
        course = c;
        System.out.println("生產了賽車，賽車編號設為 " + course);
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為 " + course);
    }
}
