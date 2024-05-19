public enum Demitir {
    JustaCausa(1),
    DecisaoEmpregador(2),
    Aposentadoria(3);

    private final int VALOR;
    Demitir(int valor) {
        VALOR = valor;
    }
    public int getValor() {
        return VALOR;
    }


}
