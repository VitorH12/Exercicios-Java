import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    List <Product> products = new ArrayList<>();
    IO.println("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i ++){
        System.out.printf("Enter the #%d Product data\n", i);
        IO.println("Common, used or imported (c/u/i)?");
        char productType = sc.next().charAt(0);
        IO.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        IO.println("Price: ");
        double price = sc.nextDouble();
        if (productType == 'i'){
            IO.println("Customs fee: ");
            double customsFee = sc.nextDouble();
            products.add(new ImportedProduct(name, price, customsFee));
        }
        else if (productType == 'u'){
            IO.println("Manufacture Date: ");
            LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt1);
            products.add(new UsedProduct(name, price, manufactureDate));
        }
        else {
            products.add(new Product(name, price));
        }
    }
    IO.println("PRICE TAGS: ");
    for (Product product : products){
        IO.println(product.priceTag());
    }

}
