import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.util.Date;
import java.text.SimpleDateFormat;



void main() throws ParseException {
  DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yy");
  String departament;
  String name;
  String workerLevel;
  double baseSalary;
  int n;
  DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  DateTimeFormatter incomeFormat = DateTimeFormatter.ofPattern("MM/yyyy");
  Scanner sc = new Scanner(System.in);

  IO.println("Enter department's name: ");
  departament = sc.nextLine();
  IO.println("Enter worker data: ");
  IO.println("Name: ");
  name = sc.nextLine();
  IO.println("Level: ");
  workerLevel = sc.nextLine();
  IO.println("Base salary: ");
  baseSalary = sc.nextDouble();
  Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departament));
  IO.println("How many contracts to this worker?");
  n = sc.nextInt();

  for (int i = 1; i<=n; i++) {
    System.out.printf("Enter contract #%d data: ", i);
    IO.println("Date (DD/MM/YYYY): ");
    String inputDate = sc.next();
    LocalDate date = LocalDate.parse(inputDate, sdf);

    IO.println("Value per hour: ");
    double valuePerHour = sc.nextDouble();
    IO.println("Duration (hours): ");
    int duration = sc.nextInt();
    HourContract hourContract = new HourContract(date, valuePerHour, duration);
    worker.addContract(hourContract);
  }
    IO.println("Enter month and date to calculate income (MM/YYYY)");
    YearMonth dateIncome = YearMonth.parse(sc.next(), incomeFormat);
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for " + dateIncome + ": " + String.format("%.2f", worker.income(dateIncome.getYear(), dateIncome.getMonthValue())));







  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.

  }

