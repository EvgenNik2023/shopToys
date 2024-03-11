public class toys {
    
    protected int id;
    protected String name;
    protected int variable;
    protected int total;


    public toys(int id, String name, int variable, int total) {
        this.id = id;
        this.name = name;
        this.variable = variable;
        this.total = total;

    }

    @Override
    public String toString() {
        return " id: " + id +
                " имя: " + name +
                " вероятность выпадения: " + variable +
                " в наличии: " + total;
    }
}
