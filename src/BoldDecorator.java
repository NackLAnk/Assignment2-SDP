public class BoldDecorator implements Report {
    private Report wrappedReport;

    public BoldDecorator(Report wrappedReport) {
        this.wrappedReport = wrappedReport;
    }

    @Override
    public void generate() {
        System.out.println("=== Report with Bolt Text ===");
        wrappedReport.generate();
        System.out.println("=============");
    }
}
