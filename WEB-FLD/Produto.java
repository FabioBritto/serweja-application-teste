//import com.google.gson.*;

public class Produto {
    
    private Integer id;
    private String descricao;
    private Double preco;

    public Produto(Integer id, String descricao, Double preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public Double getPreco(){
        return preco;
    }

    public String toJson(){
        return "{ \"id\":" + id + "," +
                "\"descricao\":\"" + descricao + "\"," +
                "\"preco\":" + preco +
                "}";
    }

    public String toString(){
        return toJson();
    }
}
