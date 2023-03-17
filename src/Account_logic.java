public class Account_logic {
    private String name;
    private long id;
    private double operationDate;
    private String reason;
    private double balance;

    public Account_logic(String name, long id, double operationDate, String reason, double balance){

        this.name = name;
        this.id = id;
        this.operationDate = operationDate;
        this.reason = reason;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getOperationDate() {
        return operationDate;
    }

    public void setOperation_date(double operationDate) {
        this.operationDate = operationDate;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        System.out.println("Los datos del dueño son: ");
        System.out.println("Nombre: "+getName());
        System.out.println("Numero de cliente: "+getId());
        System.out.println("Dia de la operación: "+getOperationDate());
        System.out.println("Motivo de la apertura de la cuenta: "+getReason());
        System.out.println("Saldo actual: "+getBalance());

        return "";
    }
}
