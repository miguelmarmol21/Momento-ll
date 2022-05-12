package cesde.edu.co;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        List<Watchman> Watchmans = new ArrayList();
        List<CleaningStaff> CleaningStaffs = new ArrayList();
        List<Accountant> Accountants = new ArrayList();
        List<Admin> Admins = new ArrayList();

        System.out.println("desea seleccionar un perfil  digite 1 para si, 2 para no");

        n = Integer.parseInt(scanner.nextLine());
        while (n == 1) {
            System.out.println("Que perfil desea ingresar, digite 1 Watchman,2 CleaningStaff, 3 Accountant, 4 Admin");
            n = Integer.parseInt(scanner.nextLine());

            if (n == 1) {
                Watchman Watchman = new Watchman();
                System.out.println("Ingrese su nombre");
                Watchman.setName(scanner.nextLine());
                System.out.println("Ingrese su identificacion");
                Watchman.setIdentification(scanner.nextLine());
                System.out.println("Ingrese su edad");
                Watchman.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Ingrese su arma");
                Watchman.setWeapon(scanner.nextLine());
                System.out.println("Ingrese su dia de trabajo");
                Watchman.setWorkday(scanner.nextLine());
                Watchmans.add(Watchman);
            } else {
                if (n == 2) {
                    CleaningStaff CleaningStaff = new CleaningStaff();
                    System.out.println("Ingrese su nombre");
                    CleaningStaff.setName(scanner.nextLine());
                    System.out.println("Ingrese su identificacion");
                    CleaningStaff.setIdentification(scanner.nextLine());
                    System.out.println("Ingrese su edad");
                    CleaningStaff.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese su dia libre");
                    CleaningStaff.setDayOff(scanner.nextLine());
                    CleaningStaffs.add(CleaningStaff);
                } else {
                    if (n == 3) {
                        Accountant Accountant = new Accountant();
                        System.out.println("Ingrese su nombre");
                        Accountant.setName(scanner.nextLine());
                        System.out.println("Ingrese su identificacion");
                        Accountant.setIdentification(scanner.nextLine());
                        System.out.println("Ingrese su edad");
                        Accountant.setAge(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Ingrese su lider");
                        Accountant.setLeader(scanner.nextLine());
                        System.out.println("Ingrese su estacionamiento");
                        Accountant.setParking(scanner.nextLine());
                        Accountants.add(Accountant);
                    } else {
                        if (n == 4) {
                            Admin Admin = new Admin();
                            System.out.println("Ingrese su nombre");
                            Admin.setName(scanner.nextLine());
                            System.out.println("Ingrese su identificacion");
                            Admin.setIdentification(scanner.nextLine());
                            System.out.println("Ingrese su edad");
                            Admin.setAge(Integer.parseInt(scanner.nextLine()));
                            System.out.println("Ingrese su lider");
                            Admin.setLeader(scanner.nextLine());
                            System.out.println("Ingrese su estacionamiento");
                            Admin.setParking(scanner.nextLine());
                            Admins.add(Admin);
                        }
                    }
                }
            }
            System.out.println("desea ingresar  una nueva  profesion  digite 1 para si, 2 para no");
            n = Integer.parseInt(scanner.nextLine());
        }

            System.out.println("Desea ver alguna profesión  1 para si o 2 para no");
            k = Integer.parseInt(scanner.nextLine());

            while (k == 1) {
                System.out.println("Que profesión desea ver 1 para WatcMan, 2 para Cleaningstaff, 3 para Accuntant, 4 para Admin");
                n = Integer.parseInt(scanner.nextLine());
                if (n == 1) {
                    for (int i = 0; i < Watchmans.size(); i++) {
                        System.out.println(Watchmans.get(i).mostrarWatchman());
                    }
                } else {
                    if (n == 2) {
                        for (int i = 0; i < CleaningStaffs.size(); i++) {
                            System.out.println(CleaningStaffs.get(i).mostrarCleaningstaff());
                        }


                    } else {
                        if (n == 3) {
                            for (int i = 0; i < Accountants.size(); i++) {
                                System.out.println(Accountants.get(i).mostrarAccuntant());
                            }
                        } else {
                            if (n == 4) {
                                for (int i = 0; i < Admins.size(); i++) {
                                    System.out.println(Admins.get(i).mostrarAdmin());
                                }
                            }
                        }
                    }
                }
                System.out.println("Desea ver otra profesión 1 para si o 2 para no");
                k = Integer.parseInt(scanner.nextLine());


            }

    }
}

