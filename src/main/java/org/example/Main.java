
package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        DroneStatus m_droneStatus = new DroneStatus(
                "001",
                95,
                4,
                3,
                true
        );


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        int opcao = -1;
        do {

            System.out.println("\n===== SISTEMA DE DRONES =====");
            System.out.println("1 - Serializar drone (Salvar JSON)");
            System.out.println("2 - Desserializar drone (Ler JSON)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();


            switch (opcao) {

                case 1:

                    String json = gson.toJson(m_droneStatus);

                    try (FileWriter writer = new FileWriter("status_drone.json")) {
                        writer.write(json);
                        System.out.println("Arquivo status_drone.json salvo com sucesso!");

                    } catch (IOException e) {
                        System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("Digite o local do seu arquivo");
                    String local = input.next();


                    try (FileReader reader = new FileReader(local)) {


                        DroneStatus droneRecebido = gson.fromJson(
                                reader,
                                DroneStatus.class
                        );

                        System.out.println("\n--- DADOS DO DRONE RECUPERADOS ---");

                        System.out.println("Código: " +
                                droneRecebido.getCodigoIdentificador());

                        System.out.println("Bateria: " +
                                droneRecebido.getNivelBateria() + "%");

                        System.out.println("Latitude: " +
                                droneRecebido.getLatitude());

                        System.out.println("Longitude: " +
                                droneRecebido.getLongitude());

                        System.out.println("Em missão: " +
                                droneRecebido.isEmMissao());

                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                    }
                    break;

                case 0:

                    System.out.println("Encerrando o programa...");

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;
            }

        } while (opcao != 0) ;
    }
}