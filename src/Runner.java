public class Runner {
    public static void main(String[] args) {
        RangeInput random = new RangeInput();
        System.out.println("default current tempreature " + random.getCurrentTempreature());
        random = new RangeInput(55, 61);
        System.out.println("custom current tempreature " + random.getCurrentTempreature());
        random.up();
        random.up();
        random.up();
        random.up();
        System.out.println("default current tempreature " + random.getCurrentTempreature());
        random.down();
        random.up();
        random.down();
        System.out.println("default current tempreature " + random.getCurrentTempreature());
    }
}
