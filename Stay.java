public class Stay implements HomeState {

    Home home;

    public  Stay(Home home) {
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
