public class Aluno {

    //variaveis
    public int codigo;

    public String nome;

    public int nota;

    //gerado automaticamente via opção Generate
    public static int getCodigo() {
        return getCodigo();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void cadastrarNota(int nota) { setNota (nota); }

    //imprimir nota do aluno na consulta
    public void imprimirNota(){
        System.out.println(this.nota);
    }

    //imprimir nome do aluno na consulta
    public String retornarNomeAluno(){
        return ("Fernanda");
    }

    //valor da nota cadastrada via banco
    public int getValorTotal(){ return 20; }
}
