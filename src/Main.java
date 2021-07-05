import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String nameFile1;
    static String passWord1;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        returnMain();
    }

    public static void returnMain() throws IOException, ClassNotFoundException {
        start();

        Manager manager = new Manager(nameFile1);
        while (true) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("             ******* [" + nameFile1 + "] ******                  o online");
            System.out.println("___________________________________________________________________");
            System.out.println("1.Add                                       | 11.Tro lai dang nhap|");
            System.out.println("2.Edit                                      | 12.Exit             |");
            System.out.println("3.EditForStatus                             ----------------------|");
            System.out.println("4.Find by Name                                                    |");
            System.out.println("5.Check for status                                                |");
            System.out.println("6.Remove nhan vien                                   ACCOUNT      |");
            System.out.println("7.Show nhan vien theo tung loai              |=>9.Remove account  |");
            System.out.println("8.Show thong tin nhan vien                   |=>10.Show info acc  |");
            System.out.println("__________________________________________________________________|");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.editByName();
                    break;
                case 3:
                    manager.editStatusByName();
                    break;
                case 4:
                    manager.findByName();
                    break;
                case 5:
                    manager.checkStatus();
                    break;
                case 6:
                    manager.remove();
                    break;
                case 7:
                    manager.showTypeNhanVien();
                    break;

                case 8:
                    manager.show();
                    break;
                case 9:
                    ManagerUser.removeUser(nameFile1);
                    returnMain();
                    break;
                case 10:
                    System.out.println("UserName: " + nameFile1);
                    System.out.println("PassWord: " + passWord1);
                    break;
                case 11:
                    returnMain();
                case 12:
                    System.exit(0);
            }
        }
    }


    public static void start() throws IOException, ClassNotFoundException {
        File file = new File("user7.txt");

        if (!file.exists()) {
            ManagerUser.listUser.add(new UserPerson("new", "new"));
            ManagerUser.writeFileUser();
        }


        ManagerUser.readFileUser();
        System.out.println("--------------");
        System.out.println("1.Dang Nhap  |");
        System.out.println("2 Dang ky    |");
        System.out.println("--------------");
        int choose = scanner.nextInt();
        if (choose == 2) {
            while (true) {
                System.out.println("Nhap username");
                String userName = scanner.next();
                int check = -1;

                for (int i = 0; i < ManagerUser.listUser.size(); i++) {
                    if (ManagerUser.listUser.get(i).getUserName().equals(userName)) {
                        check = i;
                    }
                }
                if (check > 0) {
                    System.out.println("da co ");
                } else {
                    System.out.println("Nhap password");
                    String password = scanner.next();
                    UserPerson userPerson = new UserPerson(userName, password);
                    ManagerUser.listUser.add(userPerson);
                    ManagerUser.writeFileUser();
                    nameFile1 = userName;
                    System.out.println("WELCOME " + userName);
                    passWord1 = password;
                    break;
                }
            }
        } else {
            int check1 = -1;
            while (true) {
                System.out.println("Nhap username");
                String userName = scanner.next();
                for (int i = 0; i < ManagerUser.listUser.size(); i++) {
                    if (ManagerUser.listUser.get(i).getUserName().equals(userName)) {
                        while (true) {
                            System.out.println("Nhap Password");
                            String password = scanner.next();
                            if (ManagerUser.listUser.get(i).getPassword().equals(password)) {
                                nameFile1 = userName;
                                System.out.println("WELCOME " + userName);
                                check1 = 1;
                                passWord1 = password;
                                break;
                            }
                            System.out.println("sai pass");
                        }
                    }
                }
                if (check1 > 0) {
                    break;
                }
                System.out.println("sai user");
            }
        }
    }


}
