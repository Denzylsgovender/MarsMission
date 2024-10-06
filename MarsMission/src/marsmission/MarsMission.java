
package marsmission;


public class MarsMission {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Mars Space Mission!");

        launchRocket(1000); 
        Thread.sleep(5000); // Implements a 5-second delay

        travelThroughSpace(5000, 1000); 
        Thread.sleep(5000); 

        landOnMars(true); 
        Thread.sleep(5000); 
    }

    public static void launchRocket(int fuel) {
        System.out.println("Launching rocket...");
        assert fuel > 0 : "Rocket cannot launch without fuel!";
        System.out.println("Rocket launched with " + fuel + " units of fuel.");
    }

    public static void travelThroughSpace(int distance, int fuel) {
        System.out.println("Traveling through space...");
        assert fuel >= distance / 10 : "Not enough fuel to travel through space!";
        System.out.println("Travel successful over " + distance + " miles.");
    }

    public static void landOnMars(boolean landingGearDeployed) {
        System.out.println("Preparing to land on Mars...");
        assert landingGearDeployed : "Cannot land without deploying landing gear!";
        System.out.println("Landing successful on Mars!");
    }
}
