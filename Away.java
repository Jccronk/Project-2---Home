

public class Away implements HomeState{
    Home home;

    public  Away(Home home) {
        this.home = home;

    }

    @Override
    public boolean isArmed() {
        
        return this.status;
    }

    @Override
    public boolean checkForMotion() {
        // TODO Auto-generated method stub
        return false;
    }

}
