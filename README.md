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
- Testes de interface gráfica, front-end 
- Testes de integração  

---

## 4. 🚪 Critérios de Entrada

- Código  concluído e compilável  
- Ambiente de testes configurado (IDE, JDK, dependências JUnit)  
- Casos de uso definidos para as operações  
- Estratégia de versionamento com Github

---

## 5. 🚪 Critérios de Saída

- Todos os testes devem passar sem falhas  
- Todos os requisitos testáveis atendidos
- Relatório de cobertura com no mínimo 90% (ex: com JaCoCo)  

---

## 6. ✅ Critérios de Aceitação

- Todos os métodos devem retornar os valores esperados com entradas válidas  
- O sistema deve lançar exceções para entradas inválidas  
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

| ID     | Nome do Teste                       | Entrada        | Saída Esperada                  | Resultado Esperado                         |
|--------|-------------------------------------|----------------|---------------------------------|--------------------------------------------|
| TC001  | testCalculateFreight_ValidDistance  | 10.0           | 25                              | Frete deve ser 10km * 2.5 = 25.0           |
| TC002  | testCalculateFreight_ZeroDistance   | 0.0            | exception.getMessage()          | Distância deve ser maior que zero          |
| TC003  | testUpdateStatus                    | updateStatus() | order.getStatus() == PROCESSING | Status deve ser atualizado para PROCESSING |



---

## 9. ⚠️ Riscos

| Tipo       | Descrição                                  | Mitigação               |
|------------|--------------------------------------------|-------------------------|
| Técnico    | Falta de cobertura de testes em edge cases | Revisão manual + JaCoCo |
| Humano     | Implementação incorreta dos testes         | Revisão de pares + PRs  |
| Ferramenta | Erros de build por configuração incorreta  | Pipeline de CI          |

---

## 10. 📊 Métricas de Teste

- Cobertura de código (70%)  
- Número de testes executados  
- Número de falhas  
- Tempo de execução médio  

---


## 11 ☕ JaCoCo
```bash
cd "C:\Workspace\Repositories\DeliverySystem"
mvn clean verify
```


---

## 12. 📅 Cronograma de Testes

| Atividade              | Responsável     | Data Início | Data Fim    |
|------------------------|------------------|-------------|-------------|
| Escrita dos testes     | Pedro            | 06/06/2025  | 10/06/2025  |
| Execução dos testes    | Olivier          | 06/06/2025  | 10/06/2025  |
| Análise de resultados  | Pedro e Olivier  | 06/06/2025  | 10/06/2025  |

---

## 13. ✅ Aprovação

| Nome         | Cargo         |
|--------------|---------------|
| Pedro Belém  | QA / PO / Dev |
| Olivier Leal | QA / SM / Dev |

## 14. 📷 Imagens

### DeliveryService
![DeliveryService](https://github.com/pbelem/DeliverySystem/blob/main/assets/DeliveryService.png)

### Order
![Order](https://github.com/pbelem/DeliverySystem/blob/main/assets/Order.png)

### OrderStatus
![OrderStatus](https://github.com/pbelem/DeliverySystem/blob/main/assets/OrderStatus.png)

### SampleTest
![SampleTest](https://github.com/pbelem/DeliverySystem/blob/main/assets/SampleTest.png)

### DeliveryServiceTest
![DeliveryServiceTest](https://github.com/pbelem/DeliverySystem/blob/main/assets/DeliveryServiceTest.png)

### DeliveryServiceTestRunOk
![DeliveryServiceTestRunOk](https://github.com/pbelem/DeliverySystem/blob/main/assets/DeliveryServiceTestRunOk.png)

### DeliveryServiceTestRunFail
![DeliveryServiceTestRunFail](https://github.com/pbelem/DeliverySystem/blob/main/assets/DeliveryServiceTestRunFail.png)



