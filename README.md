# 🧪 PLANO DE TESTES

**Disciplina:** Testes e Qualidade de Software  
**Instituição:** UCSAL  

**Docente:** Prof. Flávio Dusse  
**Discentes:** Pedro Belém, Olivier Leal  

---

## 1. 📄 Identificação do Documento

- **Projeto:** Sistema de Delivery  
- **Data de Criação:** 10/06/2025  
- **Ferramentas:** JUnit 5, Java 21, Maven, IntelliJ IDEA  
- **Tipo de Teste:** Testes Unitários  

---

## 2. 🎯 Objetivo

Garantir que o sistema de delivery funcione corretamente, validando funcionalidades como:

- Cadastro de pedidos  
- Cálculo de frete  
- Atualização de status de entrega  

---

## 3. 📦 Escopo dos Testes

### ✅ Incluído:
- Cadastro de pedidos  
- Cálculo de frete baseado na distância  
- Atualização de status do pedido (ex: "Pendente", "Em entrega", "Entregue")  
- Tratamento de exceções  

### ❌ Excluído:
- Integrações com APIs externas (ex: mapas, pagamentos)  
- Testes de interface gráfica  
- Testes de front-end  
- Testes de integração  

---

## 4. 🚪 Critérios de Entrada

- Código da classe `Calculadora` concluído e compilável  
- Ambiente de testes configurado (IDE, JDK, dependências JUnit)  
- Casos de uso definidos para as operações  
- Estratégia de versionamento (ex: GitHub com branch `develop` para testes)  

---

## 5. 🚪 Critérios de Saída

- Todos os testes automatizados devem passar sem falhas  
- Todos os requisitos testáveis atendidos  
- Relatório de cobertura com no mínimo 90% (ex: com JaCoCo)  

---

## 6. ✅ Critérios de Aceitação

- Todos os métodos devem retornar os valores esperados com entradas válidas  
- O sistema deve lançar exceções para entradas inválidas (ex: divisão por zero)  
- Os nomes de métodos, variáveis e mensagens de erro devem seguir o padrão definido no projeto  

---

## 7. 🖥️ Ambiente de Testes

- **Sistema Operacional:** Windows 11  
- **IDE:** IntelliJ IDEA  
- **JDK:** 21  
- **Framework de Teste:** JUnit 5  
- **Build Tool:** Maven  
- **Relatórios:** JaCoCo (cobertura), Surefire (execução via Maven)  

---

## 8. 🧪 Casos de Teste

| ID     | Nome do Teste               | Entrada   | Saída Esperada | Resultado Esperado             |
|--------|-----------------------------|-----------|----------------|-------------------------------|
| TC001  | Soma simples                | 2, 3      | 5              | Deve retornar 5               |
| TC002  | Subtração                   | 10, 7     | 3              | Deve retornar 3               |
| TC003  | Divisão por zero            | 10, 0     | Exceção        | ArithmeticException           |
| TC004  | Multiplicação de negativos  | -2, -4    | 8              | Deve retornar 8               |
| TC005  | Divisão com resultado exato | 20, 4     | 5              | Deve retornar 5               |

---

## 9. ⚠️ Riscos

| Tipo     | Descrição                                       | Mitigação                |
|----------|--------------------------------------------------|--------------------------|
| Técnico  | Falta de cobertura de testes em edge cases       | Revisão manual + JaCoCo |
| Humano   | Implementação incorreta dos testes               | Revisão de pares + PRs  |
| Ferramenta | Erros de build por configuração incorreta       | Pipeline de CI          |

---

## 10. 📊 Métricas de Teste

- Cobertura de código (%)  
- Número de testes executados  
- Número de falhas  
- Tempo de execução médio  

---

## 11. 📅 Cronograma de Testes

| Atividade              | Responsável     | Data Início | Data Fim    |
|------------------------|------------------|-------------|-------------|
| Escrita dos testes     | Pedro            | 06/06/2025  | 10/06/2025  |
| Execução dos testes    | Olivier          | 06/06/2025  | 10/06/2025  |
| Análise de resultados  | Pedro e Olivier  | 06/06/2025  | 10/06/2025  |

---

## 12. ✅ Aprovação

| Nome         | Cargo         |
|--------------|---------------|
| Pedro Belém  | QA / PO / Dev |
| Olivier Leal | QA / SM / Dev |

##13. 📷 Imagens


