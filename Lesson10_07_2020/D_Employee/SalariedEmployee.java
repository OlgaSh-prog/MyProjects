package Lesson10_07_2020.D_Employee;

public class SalariedEmployee extends Employee {

    protected int SSN;

    public SalariedEmployee(int employeeID) {
        super(employeeID);
    }

    
}

//    Опишите конструкторы с двумя параметрами для класса ContractEmployee
//    и класса SalariedEmployee для инициализации соответствующих полей.
//      getFullInfo должен вернуть строку, содержащую:
//        - employeeelD и SSN для SalariedEmployee
//        - employeeelD и FederalTaxIDMember для ContractEmployee
