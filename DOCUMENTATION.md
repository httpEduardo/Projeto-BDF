## 1. Endpoint: Obter Movimentos).

**Método:** GET

**URL:** http://localhost:8080/movimentos

**Descrição:** Retorna todos os registros de movimentos manuais.

### Exemplo de Requisição:

```http
GET /movimentos HTTP/1.1
Host: localhost:8080

#### Exemplo de Requisição:

[
  {
    "id": 1,
    "mes": 9,
    "ano": 2024,
    "codigoProduto": "PROD001",
    "descricaoProduto": "Produto Teste",
    "numeroLancamento": 1,
    "descricao": "Movimento de teste",
    "valor": 100.5,
    "dataMovimento": "2024-09-13",
    "codUsuario": "USR001"
  }
]

```
