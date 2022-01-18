package com.poc.prototype;

import java.util.Hashtable;

public class EmployeesHashtable {
    // Hashtable sera utilisé pour simuler une base de données, et des objets prédéfinis simuleront
    // des objets récupérés via des requêtes :
    private static Hashtable<String, Employee> employeeMap = new Hashtable<String, Employee>();

    public static Employee getEmployee(String id) {
        Employee cacheEmployee = employeeMap.get(id);
        // un cast est nécessaire car la méthode clone() renvoie un objet
        return (Employee) cacheEmployee.clone();
    }

    public static void loadCache() {
        // objets prédéfinis pour simuler des objets récupérés de la base de données
        Programmer programmer = new Programmer();
        programmer.setId("ETPN1");
        employeeMap.put(programmer.getId(), programmer);

        Janitor janitor = new Janitor();
        janitor.setId("ETJN1");
        employeeMap.put(janitor.getId(), janitor);

        Manager manager = new Manager();
        manager.setId("ETMN1");
        employeeMap.put(manager.getId(), manager);
    }

}
