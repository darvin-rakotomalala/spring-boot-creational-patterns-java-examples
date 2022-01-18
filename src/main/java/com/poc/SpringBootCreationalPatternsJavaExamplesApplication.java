package com.poc;

import com.poc.builder.Computer;
import com.poc.factory.Animal;
import com.poc.factory.AnimalFactory;
import com.poc.prototype.Employee;
import com.poc.prototype.EmployeesHashtable;
import com.poc.singleton.SingletonClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCreationalPatternsJavaExamplesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCreationalPatternsJavaExamplesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("==========================================================");
        System.out.println("1- Exemple Factory Method");
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.getAnimal("dOg");
        animal.eat();

        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();

        Animal animal3 = animalFactory.getAnimal("raBbIt");
        animal3.eat();

        System.out.println("==========================================================");
        System.out.println("2- Exemple Builder");
        Computer computer = new Computer.Builder()
                .withCase("Tower")
                .withCPU("Intel i5")
                .withMotherboard("MSI B360M-MORTAR")
                .withGPU("nVidia Geforce GTX 750ti")
                .withHDD("Toshiba 1TB")
                .withOperatingSystem("Windows 10")
                .withPowerSupply(500)
                .withAmountOfRam(8)
                .build();

        // C'est une manière beaucoup plus propre et plus verbeuse que d'écrire :
        /*
        Computer computer = new Computer("Tower", "Intel i5", "MSI B360M-MORTAR",
                "nVidia GeForce GTX 750ti, "Toshiba 1TB", "Windows 10", 500, 8);
        */
        System.out.println("Case : " + computer.getComputerCase());

        System.out.println("==========================================================");
        System.out.println("3- Exemple Prototype");
        EmployeesHashtable.loadCache();

        Employee cloned1 = (Employee) EmployeesHashtable.getEmployee("ETPN1");
        Employee cloned2 = (Employee) EmployeesHashtable.getEmployee("ETJN1");
        Employee cloned3 = (Employee) EmployeesHashtable.getEmployee("ETMN1");

        System.out.println("Employee: " + cloned1.getPosition() + " ID:"
                + cloned1.getId());
        System.out.println("Employee: " + cloned2.getPosition() + " ID:"
                + cloned2.getId());
        System.out.println("Employee: " + cloned3.getPosition() + " ID:"
                + cloned3.getId());

        System.out.println("==========================================================");
        System.out.println("4- Exemple Singleton");
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.showMessage();

        System.out.println("==========================================================");
    }
}
