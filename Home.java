/**
 * Home
 */
public class Home {
    HomeState away; /* possible states for the home */
    HomeState stay;
    HomeState cancel; 

    HomeState homeState; /* maintains current state */

    int pin; /* password/pin for the home */

    Door door1; /* our doors/zones */
    Door door2;
    Door door3;

    public Home() {
        away = new Away(this);
        stay = new Stay(this);
        cancel = new Cancel(this);

        homeState = cancel;

    }

    public void setHomeState(HomeState homeState) {
        this.homeState = homeState;
    }

}