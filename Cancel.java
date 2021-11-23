

public class Cancel implements HomeState{
Home home;
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
