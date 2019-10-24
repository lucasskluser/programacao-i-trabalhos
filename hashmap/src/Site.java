public class Site {
    // Nome do site
    private String nome;
    // Endereço IP do site
    private String enderecoIP;
    // Status do site | True = bloqueado / False = acesso livre
    private boolean status;

    public Site(String nome, String enderecoIP, boolean status) {
        setNome(nome);
        setEnderecoIP(enderecoIP);
        setStatus(status);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String status = isStatus() ? "Acesso livre" : "Bloqueado";
        return String.format("Site: %s | IP: %s | Status: %s", getNome(), getEnderecoIP(), status);
    }
}
