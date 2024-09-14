# Sistema de Gerenciamento de Contatos

Este é um sistema simples de gerenciamento de contatos desenvolvido em Java utilizando uma lista encadeada para armazenar os dados dos contatos. O sistema permite adicionar, buscar, remover e listar contatos através de uma interface de linha de comando (CLI).

## Funcionalidades Principais

1. **Adicionar Contato**: Permite ao usuário adicionar novos contatos à lista com nome, número de telefone e e-mail.
2. **Buscar Contato**: Implementa uma busca linear para encontrar um contato pelo nome ou número de telefone.
3. **Remover Contato**: Permite a remoção de um contato da lista com base no nome ou número de telefone.
4. **Listar Contatos**: Exibe todos os contatos armazenados na lista.

## Requisitos Funcionais (RF)

- **RF01**: Adicionar Contato
- **RF02**: Buscar Contato por Nome ou Telefone
- **RF03**: Remover Contato
- **RF04**: Listar Todos os Contatos
- **RF05**: Exibir Mensagem de Confirmação ou Erro
- **RF06**: Gerenciamento de Memória Eficiente

## Requisitos Não Funcionais (RNF)

- **RNF01**: Desenvolvido em Java
- **RNF02**: Interface de Linha de Comando (CLI)
- **RNF03**: Desempenho aceitável com centenas de contatos
- **RNF04**: Portabilidade (Windows, Linux, macOS)
- **RNF05**: Código modular e boas práticas
- **RNF06**: Documentação clara
- **RNF07**: Segurança para tratar entradas do usuário

## Estrutura do Projeto

- **Contact**: Classe que representa um contato com atributos de nome, telefone e e-mail.
- **Node**: Classe que representa um nó na lista encadeada, contendo um contato e uma referência para o próximo nó.
- **ContactList**: Classe que implementa a lista encadeada para gerenciar os contatos, com métodos para adicionar, buscar, remover e listar contatos.
- **ContactManager**: Classe que contém o método `main` para gerenciar a interação do usuário com o sistema.

## Como Executar o Projeto

1. **Pré-requisitos**: Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

2. **Configuração do Ambiente**:
   - Clone o repositório do projeto ou baixe os arquivos fonte.
   - Abra o projeto em uma IDE de sua preferência, como o Eclipse ou IntelliJ.

3. **Compilação e Execução**:
   - Compile o projeto executando o arquivo `ContactManager.java`.
   - Utilize a interface de linha de comando (CLI) para adicionar, buscar, remover e listar contatos.

## Testes do Programa

- **Adicionar Contatos**: Insira vários contatos para garantir que eles estão sendo armazenados corretamente.
- **Buscar Contatos**: Teste a busca utilizando diferentes critérios (nome e telefone) para garantir que o sistema encontre os contatos corretamente.
- **Remover Contatos**: Remova alguns contatos e verifique se eles foram realmente excluídos da lista.
- **Listar Contatos**: Liste todos os contatos para garantir que o sistema exibe corretamente os dados armazenados.

## Memória de Desenvolvimento

Neste projeto, utilizamos listas encadeadas para armazenar contatos, permitindo a adição, remoção e busca de elementos com complexidade adequada. O algoritmo de busca linear foi escolhido pela simplicidade e eficiência em listas de tamanho moderado (centenas de contatos).

### Classes Utilizadas:

- **Contact**: Gerencia os dados de um contato.
- **Node**: Estrutura que forma a lista encadeada.
- **ContactList**: Manipula a lista de contatos, com operações como adicionar, buscar, remover e listar.
- **ContactManager**: Interface de interação com o usuário, usando CLI.
