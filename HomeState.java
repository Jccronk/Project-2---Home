/**
 * HomeState
 */
public interface HomeState {
    Home home;

    boolean status = false;

    public boolean isArmed();

    public boolean checkForMotion();

}