public class Objeto {
    protected String tipo;
    protected String cor;
    protected String marca;

    public Objeto(String tipo,String cor,String marca){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
    }

    public static class Mouse extends Objeto {
        private boolean RGB;
        private boolean wireless;

        public Mouse(String tipo, String cor, String marca, boolean RGB, boolean wireless) {
            super(tipo, cor, marca);
            this.RGB = RGB;
            this.wireless = wireless;
        }

        public boolean isRGB(){
            return RGB;
        }

        public boolean isWireless(){
            return wireless;
        }
    }


    public static class Teclado extends Objeto{
        private boolean RGB;
        private boolean wireless;

        public Teclado(String tipo, String cor, String marca, boolean RGB, boolean wireless) {
            super(tipo, cor, marca);
            this.RGB = RGB;
            this.wireless = wireless;
        }

        public boolean isRGB(){
            return RGB;
        }

        public boolean isWireless(){
            return wireless;
        }
    }

    public static class Impressora extends Objeto {
        private boolean RGB;
        private boolean wireless;
        private boolean multifuncao;


        public Impressora(String tipo, String cor, String marca, boolean RGB, boolean wireless) {
            super(tipo, cor, marca);
            this.multifuncao = multifuncao;
            this.RGB = RGB;
            this.wireless = wireless;
        }

        public boolean isRGB() {
            return RGB;
        }

        public boolean isWireless() {
            return wireless;
        }

        public boolean isMultifuncao(){
            return multifuncao;
        }
    }

    public static class Monitor extends Objeto{
        private int entradas;
        private double pol;

        public Monitor(String tipo, String cor, String marca, int entradas, double pol) {
            super(tipo, cor, marca);
            this.entradas = entradas;
            this.pol = pol;
        }

        public double getPol(){
            return pol;
        }

        public int getEntradas() {
            return entradas;
        }
    }

    public static class Manga extends Objeto{
        private String autor;
        private String genero;


        public Manga(String tipo, String cor, String marca, String autor, String genero) {
            super(tipo, cor, marca);
            this.autor = autor;
            this.genero = genero;
        }

        public String getAutor() {
            return autor;
        }

        public String getGenero() {
            return genero;
        }
    }
}
