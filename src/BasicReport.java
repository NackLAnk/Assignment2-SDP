public class BasicReport implements Report {
    private String content;

    public BasicReport(String content) {
        this.content = content;
    }

    @Override
    public void generate() {
        System.out.println("=== Report ===");
        System.out.println(content);
        System.out.println("=============");
    }
}
