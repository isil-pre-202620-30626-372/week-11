public enum Status {
    REGISTERED("Registered"),
    NOT_QUALIFIED("Not qualified"),
    ADMITTED("Admitted"),
    WAITEDLIST("Wait list");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
   
}
