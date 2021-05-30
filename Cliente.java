public class Cliente {
    
    //declarando atributos
    
    String Name;
    String Cpf;
    String Phone;
    
     public Cliente() {
    }
    
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getCpf(){
        return Cpf;
    }

    public void setCpf(String Cpf){
        this.Cpf = Cpf;
    }

    public String getPhone(){
        return Phone;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    

}
