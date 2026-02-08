import entities.*;

void main() {
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    IO.println("Enter client data: ");
    IO.println("Name: ");
    String name = sc.nextLine();
    IO.println("Email: ");
    String email = sc.nextLine();
    IO.println("Birth date (DD/MM/YYY): ");
    LocalDate birthDate = LocalDate.parse(sc.next(), fmtData);

    IO.println("Enter order data: ");
    IO.println("Status: ");
    String status = sc.next();
    IO.println("How many items to this order?");
    int quantity = sc.nextInt();

    Client client = new Client(name, email, birthDate);

    Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

    for (int i = 1; i <= quantity; i++){
        System.out.printf("Enter #%d item data: ", i);
        IO.println("Product name: ");
        sc.nextLine();
        String productName = sc.next();
        IO.println("Product price: ");
        Double price = sc.nextDouble();
        IO.println("Quantity: ");
        int quantityProduct = sc.nextInt();

        Product product = new Product(productName, price);
        OrderItem orderItem = new OrderItem(quantity, price, product);

        order.addItem(orderItem);



    }

    System.out.println();
    System.out.println("ORDER SUMMARY:");
    System.out.println(order);





}
