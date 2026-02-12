import entities.Product;
import java.util.List;
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    IO.println("Enter folder path: ");
    String path = sc.nextLine();

    File sourceFile = new File(path);
    String sourceFolder = sourceFile.getParent();
    boolean success = new File(sourceFolder + "\\out").mkdir();
    String targetFile = sourceFolder + "\\out\\summary.csv";

    List<Product> products = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        String line = br.readLine();

        while (line != null) {
            String[] fields = line.split(";");
            String name = fields[0];
            double price = Double.parseDouble(fields[1]);
            int quantity = Integer.parseInt(fields[2]);
            Product product = new Product(name, price, quantity);
            products.add(product);
            line = br.readLine();
        }
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }


    try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile, true))){
        for (Product product : products){
            bw.write(product.getName() + ", " + String.format("%.2f", product.TotalPrice()));
            bw.newLine();
        }

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    sc.close();

}