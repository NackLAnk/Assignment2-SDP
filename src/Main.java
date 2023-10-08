public class Main {
    public static void main(String[] args) {
        // basic report
        Report basicReport = new BasicReport("123 Example");
        System.out.println("Basic report:");
        basicReport.generate();

        // report in Bolt style
        Report boldReport = new BoldDecorator(basicReport);
        System.out.println("\nReport with Bolt Text:");
        boldReport.generate();

        // report in italic style
        Report italicReport = new ItalicDecorator(basicReport);
        System.out.println("\nReport with italic Text:");
        italicReport.generate();
    }
}