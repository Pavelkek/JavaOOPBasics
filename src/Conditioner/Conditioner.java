package Conditioner;

public class Conditioner {
    private String power = "off";

    public void buttonPower(){
        if(power == "off"){
            power = "on";
        }else{
            power = "off";
            workingTime = 0;
        }
    }
    public String getPower(){
       return power;
    }

    private int workingTime = 0;

    public void buttonWork(){
        if(power == "on"){
            workingTime++;
        }
    }
    public int getWorkingTime(){
        return workingTime;
    }

    private String mode = "Cold air";

    public void buttonMode(){
        if(power == "off"){
            if (mode == "Cold air"){
                mode = "Hot air";
            }else{
                mode = "Cold air";
            }
        }
    }
    public String getMode(){
        return mode;
    }

    public static void main(String[] args){
        Conditioner con = new Conditioner();
        System.out.println("Питание\n"+con.getPower());
        System.out.println("Режим\n"+con.getMode());
        con.buttonWork();
        System.out.println("Время работы\n"+con.getWorkingTime());
        con.buttonMode();
        System.out.println("Режим\n"+con.getMode());
        con.buttonPower();
        System.out.println("Питание\n"+con.getPower());
        con.buttonMode();
        System.out.println("Режим\n"+con.getMode());
        con.buttonWork();
        System.out.println("Время работы\n"+con.getWorkingTime());
        con.buttonWork();
        System.out.println("Время работы\n"+con.getWorkingTime());
        con.buttonPower();
        System.out.println("Питание\n"+con.getPower());
        System.out.println("Время работы\n"+con.getWorkingTime());
    }
}
