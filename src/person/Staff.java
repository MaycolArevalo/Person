package person;

public class Staff extends Persona{
    String school;
    double play;
    
    public void school(String school, double play){
            
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPlay() {
        return play;
    }

    public void setPlay(double play) {
        this.play = play;
    }  

    private void ToString(){
        System.out.println("the name is: "+ name  +"The address is: "+address+ "the fee is: " + school + "the year is: " + play );
        
    }
    
    
}
