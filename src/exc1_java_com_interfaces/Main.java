package exc1_java_com_interfaces;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("Documento",".txt");
        Foto foto = new Foto("Foto",".jpg");
        Documento documento = new Documento("Documento","docx");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.ImprimirTudo();

    }
}
