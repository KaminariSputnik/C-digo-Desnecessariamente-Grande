import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        criarObjeto();
        System.out.println("Sistema encerrado.");
    }

    private static void criarObjeto() {
        Scanner scanner = new Scanner(System.in);
        String obj;
        Objeto[] objetos = new Objeto[50];
        boolean escolha = true;

        String cor, marca;

        boolean bool_rgb = false, bool_wire = false;
        char rgb;
        char wireless;

        while  (escolha){
            System.out.println("Qual objeto deseja criar? Mouse, teclado, monitor, impressora ou mangá?");
            System.out.println("Ou digite Listar para ver os objetos ou Sair para encerrar.");
            obj = scanner.next().toUpperCase();
            switch(obj){
                case "MOUSE":

                    System.out.println("Digite a cor e a marca do mouse: ");
                    cor = scanner.next();
                    marca = scanner.next();

                    System.out.println("O mouse possui as seguintes propriedades: ");

                    do{
                        System.out.println("Função RGB? Digite s ou n: ");
                        rgb = Character.toLowerCase(scanner.next().charAt(0));
                    } while(rgb != 's' && rgb != 'n');

                    do{
                        System.out.println("Função wireless? Digite s ou n: ");
                        wireless = Character.toLowerCase(scanner.next().charAt(0));
                    }while(rgb != 's' && rgb != 'n');

                    if (rgb == 's'){
                        bool_rgb = true;
                    }
                    if (wireless == 's'){
                        bool_wire = true;
                    }

                    for (int i = 0; i <objetos.length; i++){
                        if (objetos[i] == null){
                            objetos[i] = new Objeto.Mouse(obj, cor, marca, bool_rgb, bool_wire);
                            break;
                        }
                    }
                    break;

                case "TECLADO":
                    System.out.println("Digite a cor e a marca do teclado: ");
                    cor = scanner.next();
                    marca = scanner.next();

                    System.out.println("O teclado possui as seguintes propriedades: ");

                    do{
                        System.out.println("Função RGB? Digite s ou n: ");
                        rgb = Character.toLowerCase(scanner.next().charAt(0));
                    } while(rgb != 's' && rgb != 'n');

                    do{
                        System.out.println("Função wireless? Digite s ou n: ");
                        wireless = Character.toLowerCase(scanner.next().charAt(0));
                    }while(rgb != 's' && rgb != 'n');

                    if (rgb == 's'){
                        bool_rgb = true;
                    }
                    if (wireless == 's'){
                        bool_wire = true;
                    }

                    for (int i = 0; i <objetos.length; i++){
                        if (objetos[i] == null){
                            objetos[i] = new Objeto.Teclado(obj, cor, marca, bool_rgb, bool_wire);
                            break;
                        }
                    }
                    break;

                case "IMPRESSORA":
                    System.out.println("Digite a cor e a marca da impressora: ");
                    cor = scanner.next();
                    marca = scanner.next();

                    System.out.println("A impressora possui as seguintes propriedades: ");

                    do{
                        System.out.println("Sistema de cor RGB? Digite s ou n: ");
                        rgb = Character.toLowerCase(scanner.next().charAt(0));
                    } while(rgb != 's' && rgb != 'n');

                    do{
                        System.out.println("Função wireless? Digite s ou n: ");
                        wireless = Character.toLowerCase(scanner.next().charAt(0));
                    }while(rgb != 's' && rgb != 'n');

                    char multifuncao;
                    boolean bool_multifuncao = false;
                    do {
                        System.out.println("A impressora é multifuncional? Digite s ou n: ");
                        multifuncao = Character.toLowerCase(scanner.next().charAt(0));
                    } while(multifuncao != 's' && multifuncao != 'n');
                    if (rgb == 's'){
                        bool_rgb = true;
                    }
                    if (wireless == 's'){
                        bool_wire = true;
                    }
                    if (multifuncao == 's'){
                        bool_multifuncao = true;
                    }

                    for (int i = 0; i <objetos.length; i++){
                        if (objetos[i] == null){
                            objetos[i] = new Objeto.Impressora(obj, cor, marca, bool_rgb, bool_wire);
                            break;
                        }
                    }
                    break;

                case "MONITOR":
                    System.out.println("Digite a cor e a marca do monitor: ");
                    cor = scanner.next();
                    marca = scanner.next();

                    System.out.println("Quantas entradas possui o monitor? ");
                    int entradas = scanner.nextInt();

                    System.out.println("Qual é o tamanho do monitor em polegadas? ");
                    double pol = Double.parseDouble((scanner.next()));

                    for(int i = 0; i < objetos.length; i++){
                        if (objetos[i] == null){
                            objetos[i] = new Objeto.Monitor(obj, cor, marca, entradas, pol);
                            break;
                        }
                    }
                    break;

                case "MANGÁ":
                    String autor, genero;
                    System.out.println("Digite a cor e a editora do mangá: ");
                    cor = scanner.next();
                    marca = scanner.next();

                    System.out.println("Digite de quem é a autoria do mangá: ");
                    autor = scanner.next();
                    System.out.println("Digite de qual gênero é o mangá: ");
                    genero = scanner.next();

                    for (int i = 0; i < objetos.length; i++){
                        if (objetos[i] == null){
                            objetos[i] = new Objeto.Manga(obj, cor, marca, autor, genero);
                            break;
                        }
                    }
                    break;

                case "LISTAR":
                    listarObjetos(objetos);
                    break;
                case "SAIR":
                    escolha = false;
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
                    break;
            }
        }
    }

    private static void listarObjetos(Objeto[] objetos) {
        for (int i = 0; i < objetos.length; i++){
            if (objetos[i] != null){
                switch (objetos[i].tipo){
                    case "MOUSE":
                        Objeto.Mouse mouse = (Objeto.Mouse) objetos[i];
                        System.out.printf("Objeto: %s\nCor: %s\nMarca: %s\nRGB: %b\nWireless: %b\n", mouse.tipo, mouse.cor, mouse.marca, mouse.isRGB(), mouse.isWireless());
                        System.out.println("-".repeat(15)+"\n");
                        break;
                    case "TECLADO":
                        Objeto.Teclado teclado = (Objeto.Teclado) objetos[i];
                        System.out.printf("Objeto: %s\nCor: %s\nMarca: %s\nRGB: %b\nWireless: %b\n", teclado.tipo, teclado.cor, teclado.marca, teclado.isRGB(), teclado.isWireless());
                        System.out.println("-".repeat(15)+"\n");
                        break;
                    case "IMPRESSORA":
                        Objeto.Impressora impressora = (Objeto.Impressora) objetos[i];
                        System.out.printf("Objeto: %s\nCor: %s\nMarca: %s\nRGB: %b\nWireless: %b\n", impressora.tipo, impressora.cor, impressora.marca, impressora.isRGB(), impressora.isWireless());
                        System.out.println("-".repeat(15)+"\n");
                        break;
                    case "MONITOR":
                        Objeto.Monitor monitor = (Objeto.Monitor) objetos[i];
                        System.out.printf("Objeto: %s\nCor: %s\nMarca: %s\nEntradas: %d\nTamanho: %.2f''\n", monitor.tipo, monitor.cor, monitor.marca, monitor.getEntradas(), monitor.getPol());
                        System.out.println("-".repeat(15)+"\n");
                        break;
                    case "MANGÁ":
                        Objeto.Manga manga = (Objeto.Manga) objetos[i];
                        System.out.printf("Objeto: %s\nCor: %s\nEditora: %s\nAutor: %s\nGênero: %s\n", manga.tipo, manga.cor, manga.marca, manga.getAutor(), manga.getGenero());
                        System.out.println("-".repeat(15)+"\n");
                        break;
                    default:
                        System.out.println("Comando inválido\n");
                        break;
                }
            }
        }
    }
}
