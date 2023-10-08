public class ItalicDecorator implements Report {
    private Report wrappedReport;

    public ItalicDecorator(Report wrappedReport) {
        this.wrappedReport = wrappedReport;
    }

    @Override
    public void generate() {
        System.out.println("=== Report with italic Text ===");
        wrappedReport.generate();
        System.out.println("=============");
    }
}
