import entities.Employee;
import entities.OutsourcedEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    List <Employee> employees = new ArrayList<>();

    IO.println("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i ++){
        System.out.printf("Employee #%d data: ", i);
        IO.println("Outsourced (y/n)?");
        char outsourced = sc.next().charAt(0);
        IO.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        IO.println("Hours: ");
        int hours = sc.nextInt();
        IO.println("Value per hour: ");
        double valuePerHour = sc.nextDouble();

        if (outsourced == 'y'){
            IO.println("Additional Charge: ");
            double additionalCharge = sc.nextDouble();
            employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        }
        else {
            employees.add(new Employee(name, hours, valuePerHour));
        }

    }
    IO.println("PAYMENTS");

    for (Employee employee : employees){
        IO.println(employee.getName() + " - " + "$ " + employee.payment());
    }



    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

}
