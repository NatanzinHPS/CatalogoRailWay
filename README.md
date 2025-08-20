# Catálogo de Filmes

API REST para gerenciar catálogo de filmes com Spring Boot e MySQL.

## Tecnologias

- Java 17
- Spring Boot
- MySQL
- Railway

## Endpoints

- `GET /filmes` - Lista todos os filmes
- `POST /filmes` - Cria um filme
- `GET /filmes/{id}` - Busca filme por ID

## Exemplo de Filme

```json
{
  "titulo": "Inception",
  "diretor": "Christopher Nolan",
  "ano": 2010,
  "nota": 8.8
}
```

## Executar

```bash
./mvnw spring-boot:run
```

## Documentação

Swagger UI: `/swagger-ui.html`

## Deploy

Projeto configurado para deploy no Railway.
