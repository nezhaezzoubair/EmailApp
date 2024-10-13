package emailapp;

import java.util.Scanner;

public class email {
    private String fistname;
    private String lastname;
    private String password;
    private String departement;
    private String Email;
    private int mailboxcapacity=500;
    private int defaultpasswordlenght=10;
    private String alternateemail;
    private String suffixcompany="company.com";


    public email(String fistname, String lastname){
        this.fistname=fistname;
        this.lastname=lastname;
        this.departement=setdepatement();
        this.password=randompassword(defaultpasswordlenght);
        System.out.println("your password is:" + this.password);
        Email=fistname.toLowerCase()+ "."+lastname.toLowerCase()+"@"+departement+"."+suffixcompany;



    }
    private String setdepatement(){
        System.out.println(" New worker :"+fistname+"Departement codes: \n1 for sales\n2 for developpement\n3 for acounting\n0 for none\n enter " +
                "departement code:");
        Scanner in=new Scanner(System.in);
        int depchoice=in.nextInt();
        if (depchoice==1){return "sales";}
        else if (depchoice==2) {return "developpement";}
        else if (depchoice==3) {return "accounting";}
        else {return "";}
    }

    private String randompassword(int lenght){
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!§";
        char[] password=new char[lenght];
        for (int i=0 ;i<lenght; i++){
            int rand= (int)(Math.random() * passwordset.length());
            password[i]=passwordset.charAt(rand);
        }
        return new String(password);
    }
   public void setMailboxcapacity(int capacity){
        this.mailboxcapacity=capacity;
   }
   public void setAlternateemail(String altemail){
        this.alternateemail=altemail;
   }
   public void changepassword(String password){
        this.password=password;
   }
   public int getMailboxcapacity(){return mailboxcapacity;}
   public String getAlternateemail(){return alternateemail;}
   public String getPassword(){return password;}

   public String showinfo(){
         return "display name:"+fistname+" "+lastname+
                 " \ncomanyemail"+ Email+
                 " \nmailbox capacity "+mailboxcapacity +" mb";
   }


}
