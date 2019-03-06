public class Client {

    String Name, Surname, Account;

    public Client() {
    }

    public Client(String name, String surname, String account) {
        Name = name;
        Surname = surname;
        Account = account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    @Override
    public String toString() {
        String Str = ("<<< Customer "+Name+" "+Surname+" was added >>>");
        return Str;
    }
}
