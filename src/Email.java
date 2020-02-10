import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setPassword(10);
        System.out.println("Your Password is: "+this.password);
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+".company.com";
        System.out.println("Your email is: "+this.email);
        setMailboxCapacity(500);
    }

    public String setDepartment(){
        System.out.println("What is your department?");
        Scanner in = new Scanner(System.in);
        int deptNum = in.nextInt();
        String dept="";
        switch (deptNum){
            case 0:
                dept= "";
            case 1:
                 dept= "Sales";
            case 2:
                dept= "Development";
            case 3:
                dept="Accounts";


        }
        return dept;
    }

    public String setPassword(int length){
            String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
            char[] pass = new char[length];
            for(int i =0; i<length ; i++){
                int random = (int)(Math.random()*password.length());
                pass[i] = password.charAt(random);
            }
            return new String(pass);

        }



    public void setMailboxCapacity(int mailboxCapacity){

        this.mailboxCapacity = mailboxCapacity;

    }

    public void setAlternateEmail(String AlternateEmail){

        this.alternateEmail = AlternateEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String ShowInfo(){
        String  info = "Name: " + firstName+" "+ lastName+
                "\nCompany Email: "+email+
                "\nMailbox capacity:" + mailboxCapacity + "GB";
        return info;
    }






}
