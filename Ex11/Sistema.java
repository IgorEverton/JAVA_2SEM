package Ex11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

        ArrayList<FrontEnd> listaFrontEnd = new ArrayList<>();
        ArrayList<BackEnd> listaBackEnd = new ArrayList<>();

        int opcao;
        int confirmar;
        String resp;

        int id;
        String Linguagem;
        String Framework = null;
        String descricao;

        FrontEnd front;
        boolean web;
        boolean mobile;

        BackEnd back;
        

        do {

            System.out.println("Sistema para criar e cadastrar Tecnologias:\n\n" +
                    		"1) Front End\n" +
                    		"2) Back End\n" +
                    		"3) Listar Tecnologias\n" +
                    		"4) Sair\n\n");
            opcao = ler.nextInt();

            if (opcao == 1) {

               

                    front = new FrontEnd();

                    id = listaFrontEnd.size() + 1;
                    front.setId(id);

                    System.out.println("Digite o nome da linguagem: ");
                    Linguagem = ler.next();
                    front.setNomeLinguagem(Linguagem);

                    System.out.println("Digite o nome do Framework: ");
                    Linguagem = ler.next();
                    front.setNomeFramework(Framework);

                    System.out.println("Digite a descrição da linguagem e framework: ");
                    descricao = ler.next();
                    front.setDescricaoLinguagem(descricao);

                    System.out.println("Possui portabilidade para Web? S - sim N - nao => ");
                    resp = ler.next();

                    if (resp == "N") {
                        front.setCompatibilidadeWeb(false);
                    } else {
                        front.setCompatibilidadeWeb(true);
                    }

                    System.out.println("Possui portabilidade para Mobile?");
                    resp = ler.next();

                    if (resp == "N") {
                        front.setCompatibilidadeWeb(false);
                    } else {
                        front.setCompatibilidadeWeb(true);
                   

                    
                    listaFrontEnd.add(front);
                    System.in.read();

                    if (listaFrontEnd.size() >= 1) {

                        for (int i = 0; i < listaFrontEnd.size(); i++) {
                            System.out.printf("Tecnologias encontradas: \n\n" + "Nome - %s ", front.getNomeFramework());
                        }

                    }

                
                }

                System.out.println("Cadastrado com sucesso! Digite 4 para sair");

                } else if (opcao == 2) {

                try {

                    back = new BackEnd();

                    id = listaFrontEnd.size() + 1;
                    back.setId(id);

                    System.out.printf("Digite o nome da linguagem de programacao => ");
                    Linguagem = ler.next();
                    back.setNomeLinguagem(Linguagem);

                    System.out.printf("Digite o nome do Framework => ");
                    Framework = ler.next();
                    back.setNomeFramework(Framework);

                    System.out.println("Digite a descrição da linguagem e framework => ");
                    descricao = ler.next();
                    back.setDescricaoLinguagem(descricao);

                    listaBackEnd.add(back);
                    System.in.read();

                    if (listaFrontEnd.size() >= 1) {

                        for (int i = 0; i < listaFrontEnd.size(); i++) {
                            System.out.printf("Tecnologias encontradas: \n\n" + "Nome - %s ", back.getNomeFramework());
                        }

                    }

                } catch (Exception e) {
                    System.out.printf("Revise as informacoes digitadas", e.getMessage());
                }

                System.out.println("Cadastrado com sucesso! Digite 4 para sair. ");

            } else if (opcao == 3) {

                System.out.println("Escolha qual você deseja ver a listagem \n\n" +
                        "1 - FRONT END\n" +
                        "2 - BACK END");
                confirmar = ler.nextInt();

                if (confirmar == 1) {

                    try {

                        if (listaFrontEnd.size() >= 1) {

                            for (FrontEnd f : listaFrontEnd) {
                                System.out.printf(
                                        "\nLIVROS DISPONIVEIS\n Id: %d - Nome da framework: %s \n - Nome da Linguagem: %s",
                                        f.getId(), f.getNomeFramework(), f.getNomeLinguagem());
                            }

                        }

                    } catch (Exception e) {
                        System.out.printf("Não ha quantidade suficiente de informacoes", e);
                    }

                } else {

                    

                        if (listaFrontEnd.size() >= 1) {

                            for (BackEnd b : listaBackEnd) {
                                System.out.printf(
                                        "\nLIVROS DISPONIVEIS\n Id: %d - Nome da framework: %s \n - Nome da Linguagem: %s",
                                        b.getId(), b.getNomeFramework(), b.getNomeLinguagem());
                            }

                        }

                    
                }

            }

        } while (opcao != 4);

        ler.close();
    }

}