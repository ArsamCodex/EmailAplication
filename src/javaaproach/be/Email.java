package javaaproach.be;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacityb= 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private  String email;
    private String  Suffix = "intecbrussel.be";
    
    // JUST UPLOAD IT HAS SOME BUGS JUST FOR NOW TO TIME FOR LAST CHECK AND OPTIMIZING .
    



    //CONSTRUCTOR
    public Email(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED " + this.firstName + " " + this.lastName);

        // CALL METHOOD ASLING DEPARTMENT
        this.department = setDepartment();
        System.out.println("DEPARTMENTS " + this.department);

        // CALL METHID THAT RETURN RANDO MPASSWORD
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("YOUR PASSWORD " + this.password);
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@"  + Suffix;
        System.out.println("YOUR EMAIL IS " + email);

    }

    private String setDepartment(){
        System.out.print( "DEP CODE \n1 for sale \n2development\n3 FOR ACOUNTING \n ENTER DEPARTMENT  ");
        Scanner in = new Scanner(System.in);
        int depChoise = in.nextInt();
        if(depChoise == 1 ){return "sake";}
        else if (depChoise == 2 ){return "dev";}
        else if (depChoise == 3) {return "acc";}
        else {return "";}
    }

    private String randomPassword(int length){
        String passwordStd = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char [] password = new char[length];
        for(int i = 0  ; i<length ; i++){
           int rand=  (int) (Math.random() * passwordStd.length());
           password[i] = passwordStd.charAt(rand);
        }
        return new String (password);
    }

    public void setUpMailBox(int capacity){
        this.mailBoxCapacityb = capacity;

    }

    public void  setAlternateEmail(String altMail){
        this.alternateEmail = altMail;
    }

    public void changePassword(String password){
        this.password = password;
    }
    public int getMailBoxCapacityb(){
        return mailBoxCapacityb;
    }
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword (){return password;}
    public String showInfo(){
        return "DISPLAY NAME " + firstName +" " + lastName + " " + lastName+
                "MAILBOX CAPACITY" + mailBoxCapacityb   + "mb";
    }
}
