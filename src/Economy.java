public class Economy {
    private String name;
    private Double economyRate;
    public Economy(String name,Double economyRate){
        this.name=name;
        this.economyRate=economyRate;
    }
    public String getName(){
        return name;
    }
    public Double getEconomyRate(){
        return economyRate;
    }

}
