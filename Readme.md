# Gamelist - API REST para Listagem de Jogos 🎮

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-%234169E1) ![Maven](https://img.shields.io/badge/Maven-Build%20Tool-yellow)

## 📌 Sobre o Projeto

Gamelist é uma API REST que permite a listagem e reordenação de jogos de forma dinâmica e eficiente. A API foi desenvolvida como parte do meu portfólio durante a trilha **"Intensivão Java Spring"** da [DevSuperior](https://devsuperior.com.br/), e está hospedada na **Railway**.

🔗 **Demonstração da API:** [Gamelist API - Railway](https://gamelist-production-e05d.up.railway.app)

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **Spring Web**
- **Lombok**
- **Dev Tools**
- **Banco de Dados: PostgreSQL (Homologação e Produção) / H2 (Testes)**
- **Maven para gerenciamento de dependências**
- **Docker para ambiente de desenvolvimento**

## 📂 Estrutura do Projeto

O projeto segue a arquitetura de camadas:

```
📦 gamelist
 ┣ 📂 config        # Configurações gerais (CORS, segurança futura)
 ┣ 📂 controllers   # Endpoints da API
 ┣ 📂 dto           # Data Transfer Objects
 ┣ 📂 entities      # Modelos do banco de dados
 ┣ 📂 repositories  # Interfaces de acesso ao banco
 ┣ 📂 services      # Regras de negócio
 ┣ 📜 application.properties  # Configurações do ambiente
```

## 🔗 Endpoints da API

Todos os endpoints utilizam o método **GET**:

- `GET /games` → Retorna todos os jogos cadastrados.
- `GET /games/{id}` → Retorna os detalhes de um jogo específico.
- `GET /lists` → Retorna todas as listas criadas.
- `GET /lists/{id}` → Retorna os detalhes de uma lista específica.
- `GET /lists/{id}/games` → Retorna todos os jogos de uma lista específica.

## 🏗️ Como Executar o Projeto

### 1️⃣ Pré-requisitos:
- Ter **Java 17** instalado
- Ter o **Maven** instalado
- Ter o **Docker** instalado (opcional, para rodar o PostgreSQL)

### 2️⃣ Rodando a API localmente:

```bash
# Clonar o repositório
git clone https://github.com/RuanPablo2/gamelist.git
cd gamelist

# Executar a aplicação
./mvnw spring-boot:run
```

### 3️⃣ Rodando com Docker (Banco de Dados PostgreSQL):
```bash
docker-compose up -d
```

## 📦 Deploy

A API está hospedada na plataforma **Railway**, garantindo uma esteira de CI/CD para escalabilidade e fácil manutenção. Futuramente, será integrado o **Spring Security** para autenticação e autorização de usuários.

## 📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e melhorá-lo! 😊

## ✨ Autor

Desenvolvido por **Ruan Pablo Bastos Silva** 🚀

[![GitHub](https://img.shields.io/badge/GitHub-RuanPablo2-%23181717?style=for-the-badge&logo=github)](https://github.com/RuanPablo2)

---

Se este projeto foi útil para você, deixe uma ⭐ no repositório! 😃
