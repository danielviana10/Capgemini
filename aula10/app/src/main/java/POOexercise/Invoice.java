package POOexercise;

public class Invoice {

    private int codigoItem;
    private String descricao;
    private int quantidadeComprada;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidadeComprada, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidadeComprada(quantidadeComprada);
        this.setPrecoUnitario(precoUnitario);
    }

    public float getInvoiceAmount() {
        return this.getQuantidadeComprada() * this.getPrecoUnitario();
    }
    
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = Math.max(0, quantidadeComprada);
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = Math.max(0, precoUnitario);
    }
}
