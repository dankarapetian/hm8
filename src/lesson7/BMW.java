package lesson7;

public abstract class BMW implements Auto{

    private String version;
    private static final String brand = "BMW";
    private int maxSpeed;
    private double accelerationTo100;
    private static boolean speedCutterOn;
    private static boolean climateControlOn;

    public BMW(String m5, String automatic, String medium, int i, byte b, byte b1, byte b2, int i1, double v, double v1, boolean b3, boolean b4) {
    }

    public void BMW (String M5 , String automatic, String version, int i, byte b2, byte b1, byte b, int maxSpeed, double v, double accelerationTo100, boolean speedCutterOn, boolean climateControlOn) {
        this.version = version;
        this.maxSpeed = maxSpeed;
        this.accelerationTo100 = accelerationTo100;
        this.speedCutterOn = speedCutterOn;
        this.climateControlOn = climateControlOn;
    }

    public BMW(String version, int maxSpeed, double accelerationTo100) {
        this.version = version;
        this.maxSpeed = maxSpeed;
        this.accelerationTo100 = accelerationTo100;
    }

    public String getVersion() {
        return version;
    }

    public static String getBrand() {
        return brand;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getAccelerationTo100() {
        return accelerationTo100;
    }

    public static boolean isSpeedCutterOn() {
        return speedCutterOn;
    }

    private static void setSpeedCutterOn(boolean speedCutterOn) {
        BMW.speedCutterOn = speedCutterOn;
    }

    public static boolean isClimateControlOn() {
        return climateControlOn;
    }

    private static void setClimateControlOn(boolean climateControlOn) {
        BMW.climateControlOn = climateControlOn;
    }

    public static void workWithSpeedCutter(boolean onOrOff){
        if(isSpeedCutterOn()==onOrOff){
            System.out.println("The speed limiter is already in this state.");
        }
        else{
            if(!onOrOff){
                setSpeedCutterOn(false);
                System.out.println("Speed limiter in " + getBrand() + " removed!");
            }
            else {
                setSpeedCutterOn(true);
                System.out.println("Speed limiter in " + getBrand() + " included!");
            }
        }
    }

    public static void workWithClimateControl(boolean onOrOff){
        if(isClimateControlOn()==onOrOff){
            System.out.println("The climate control is already in this state.");
        }
        else{
            if(!onOrOff){
                setClimateControlOn(false);
                System.out.println("Climate control in " + getBrand() + " off!");
            }
            else {
                setClimateControlOn(true);
                System.out.println("Climate control in " + getBrand() + " is on, have a nice trip!\n");
            }
        }
    }

    @Override
    public void drive() {
        System.out.printf("\n%s %s is driving.", getBrand(), getVersion());
    }

    @Override
    public void brake() {
        System.out.println( getBrand() + " is braking.");
    }

    @Override
    public void turn(String direction) {
        System.out.println( getBrand() + " is turning on " + direction);
    }

    @Override
    public void openTrunk() {
        System.out.println( getBrand() + "'s trunk opened.");
    }

}

