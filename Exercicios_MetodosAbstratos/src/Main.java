import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    List <Shape> areas = new ArrayList<>();

    IO.println("Enter the number of shapes: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++){
        System.out.printf("Shape #%d data: ", i);
        IO.println("Rectangle or Circle (r/c)?");
        char typeShape = sc.next().charAt(0);
        IO.println("Color (BLACK/BLUE/RED): ");
        String color = sc.next();
        if (typeShape == 'r'){
            IO.println("Width: ");
            double width = sc.nextDouble();
            IO.println("Height: ");
            double height = sc.nextDouble();
            areas.add(new Rectangle(Color.valueOf(color), height, width));
        }
        else if (typeShape == 'c'){
            IO.println("Radius: ");
            double radius = sc.nextDouble();
            areas.add(new Circle(Color.valueOf(color), radius));
        }
    }
    IO.println("SHAPE AREAS: ");
    for (Shape area : areas){
        IO.println(String.format("%.2f", area.area()));
    }

}
