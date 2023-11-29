import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /* DO/WHILE 
            EXERCICIO 1
        int tempoAssistido = 0;

        System.out.println("Bem-vindo à sessão de cinema virtual!");

       
        while (tempoAssistido < 120) {
            System.out.println("Você está assistindo ao filme. Digite 'parar' para encerrar a sessão.");
            
            String comando = scanner.nextLine();

       
            if (comando.equalsIgnoreCase("parar")) {
                break; 
            }

          
            tempoAssistido += 10;
        }


        System.out.println("Sessão encerrada. Obrigado por assistir!");
        
       */
    

        /*EXERCICIO 2 
        int contador=1;
        int maximoDeUsuarios=0;
        System.out.println("Bem vindo ao Sistema:");
        do {
             try{
                String[] array=new String[10];
                System.out.print("Digite seu nome de usuário:");
                String usuario=scanner.nextLine();
                Thread.sleep(1000);
                array[contador]=usuario;
                
                System.out.println("Usuário conectado:"+array[contador]);
                System.out.println("Número de usuários conectados:"+contador++);
            }catch(InterruptedException e){
                e.getStackTrace();
            }
        } while (maximoDeUsuarios<10)
        */
        /* EXERCICIO 3
        List<String> frutas=new ArrayList<>();
        boolean sair=false;
        String saida;
        while (sair==false) {
                System.out.println("Digite o nome de uma fruta:");
        String fruta=scanner.nextLine();
        if(fruta!=""){
            frutas.add(fruta);
        }
        else{
            System.out.println("Digite um nome válido");
       
        }
        System.out.println("Deseja digitar mais algum nome de fruta?");
        System.out.println("Digite S  para continuar ou digite N para sair:");
        saida=scanner.nextLine().toUpperCase();
        if(saida.equals("N")){
            break;
        }
        System.out.println("Foram adicionadas"+frutas.size()+"frutas,quais sejam:"+frutas);
     }
     */
    

     /*EXERCICIO 4 
    String[] nomesProdutos = {"Maçã (kg)", "Pão (un)", "Coca-cola(2l)", "Chocolate (Barra)"};
    Double[] precosProdutos = {7.59, 0.51, 27.86, 8.99};
    short capacidadeMaximaDoCarrinho = 4; 

    short codProduto;
    List<String> nomesProdutosCarrinho = new ArrayList<>();
    List<Double> precosProdutosCarrinho = new ArrayList<>();
    List<Double> qtdsProdutosCarrinho = new ArrayList<>();
    List<Double> subtotalProdutosCarrinho = new ArrayList<>();
    List<Short> codigosProdutosCarrinho = new ArrayList<>();
    Double qtdProduto;
    short idProdTemp;
    boolean carrinhoCheio = false;
    short qtdProdutosCarrinho = 0;

    while (carrinhoCheio==false) {
        idProdTemp = 0;
        while (idProdTemp < nomesProdutos.length) {
            System.out.println("Cód[" + idProdTemp + "] - Produto:" + nomesProdutos[idProdTemp]);
            idProdTemp++;
        }

        System.out.println("Digite o código do produto que deseja adicionar ao carrinho:");
        codProduto = scanner.nextShort();
        codigosProdutosCarrinho.add(codProduto);
        nomesProdutosCarrinho.add(nomesProdutos[codProduto]);
        precosProdutosCarrinho.add(precosProdutos[codProduto]);

        System.out.println("Digite a quantidade do produto que deseja adicionar ao carrinho:");
        qtdProduto = scanner.nextDouble();
        scanner.nextLine(); 

        qtdsProdutosCarrinho.add(qtdProduto);
        subtotalProdutosCarrinho.add(precosProdutos[codProduto] * qtdProduto);
        qtdProdutosCarrinho++;

        if (qtdProdutosCarrinho ==nomesProdutos.length) {
            carrinhoCheio = true;
            break;
        }

        System.out.println("Deseja adicionar mais algum produto no carrinho? (Digite 'NAO' para sair)");
        if (scanner.nextLine().toUpperCase().equals("NAO")) {
            break;
        }
    }

    short idProdCarrinhoTmp = 0;
    Double precoTotal = 0.0;

    while (idProdCarrinhoTmp < nomesProdutosCarrinho.size()) {
        System.out.println("Código: " + codigosProdutosCarrinho.get(idProdCarrinhoTmp) +
                "| Produto: " + nomesProdutosCarrinho.get(idProdCarrinhoTmp) +
                "| Preço unitário: " + precosProdutosCarrinho.get(idProdCarrinhoTmp) +
                "| Quantidade: " + qtdsProdutosCarrinho.get(idProdCarrinhoTmp) +
                "| Subtotal: " + subtotalProdutosCarrinho.get(idProdCarrinhoTmp));
        precoTotal += subtotalProdutosCarrinho.get(idProdCarrinhoTmp);
        idProdCarrinhoTmp++;
    }

    System.out.println("Total da compra: R$" + precoTotal);
    */
}
}
