# Serialização em Java com Gson

Exemplo de como transformar objetos Java em JSON e JSON de volta em objeto, usando a biblioteca **Gson**.

O modelo é o status de um drone (`DroneStatus`):

```json
{
  "codigoIdentificador": "001",
  "nivelBateria": 95,
  "latitude": 4.0,
  "longitude": 3.0,
  "emMissao": true
}
```

## Tecnologias

Java 25 · Maven · Gson 2.13

## Como rodar

Abra o projeto no IntelliJ (ele baixa o Gson pelo Maven) e rode a classe `Main`. O programa grava o status em `status_drone.json` e depois lê o arquivo de volta.

## Estrutura

```
src/main/java/org/example/
├── DroneStatus.java   modelo serializado
└── Main.java          grava e lê o status_drone.json
```
