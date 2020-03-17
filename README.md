<h1>Factory Method</h1>

<h3>Propósito</h3>
<p>O padrão <b>Factory Method</b> fornece uma interface para criar objetos em uma superclasse, permitindo que as subclasses 
alterem o tipo de objetos que serão criados</p>
<p>Em uma definição mais formal, Segundo o GOF (Group Of Four) o padrão Factory Method é: “Um padrão que define uma interface 
para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a 
instanciação para subclasses”. </p>

<h3>Estrutura</h3>
<img src="https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png" />

<p>1. A classe <b>Produto</b> declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses. </p>

<p>2. As classes <b>Produtos Concretos</b> são implementações diferentes da interface do produto. </p>

<p>3. A classe <b>Criador</b> declara o método fábrica que retorna novos objetos produto. É importante que o tipo de retorno desse método corresponda à interface do produto. </p>

<p>Você pode declarar o método fábrica como abstrato para forçar todas as subclasses a implementar suas próprias versões do método. 
Como alternativa, o método fábrica base pode retornar algum tipo de produto padrão. </p>

<p>4. <b>Criadores Concretos</b> sobrescrevem o método fábrica base para retornar um tipo diferente de produto. </p>

<p>Observe que o método fábrica não precisa criar novas instâncias o tempo todo. Ele também pode retornar objetos existentes de um cache, um conjunto de objetos, ou outra fonte. </p>

<h3>Sobre o projeto button</h3>
<p>Este exemplo ilustra como o Factory Method pode ser usado para criar elementos de interface do usuário multiplataforma sem acoplar 
o código do cliente às classes de UI concretas. </p>
<img src="https://refactoring.guru/images/patterns/diagrams/factory-method/example.png" />

<p>A classe base Dialog usa diferentes elementos da UI do usuário para renderizar sua janela. Esses elementos podem parecer um pouco diferentes em sistemas operacionais diferentes, mas ainda devem se comportar de uma forma consistente.</p>

<p>Quando o método fábrica entra em ação, você não precisa reescrever toda a lógica da caixa de diálogo para cada SO. Se declararmos
um método fábrica que produza botões dentro da classe base da caixa de diálogo, depois podemos criar uma subclasse de caixa de diálogo que retorna botões estilo Windows do método fábrica. A subclasse herda a maior parte do código da caixa de diálogo da classe base, mas, graças ao método fábrica, pode renderizar botões estilo Windows na tela. </p>

<p>Para que esse padrão funcione, a classe base da caixa de diálogo deve funcionar com botões abstratos: uma classe base ou uma interface que todos os botões concretos seguem. Dessa forma, o código da caixa de diálogo permanece funcional, independentemente do tipo de botão com o qual ela trabalha. </p>

<h3>Conclusão</h3>
<p>Como foi possível estudar neste artigo, o padrão Factory Method oferece um modo de encapsular as instanciações de tipos concretos. O Creator nos oferece um método para criação de objetos, os demais métodos operam em cima das subclasses de Creator, ou seja, os ConcreteCreator, fabricados pelo factoryMethod. Além disso apenas os ConcreteCreator implementam o método de fábrica e criam Products como pode-se observar no diagrama de classe do padrão. </p>

<h3>Referências</h3>
<p> <a href="https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348">
Padrão de Projeto Factory Method em Java </a> </p>
<p> <a href="https://www.devmedia.com.br/patterns-factory-method/18954"> 
Patterns: Factory Method </a> </p>
<p> <a href="https://refactoring.guru/pt-br/design-patterns/factory-method">
Refactoring Guru: Factory Method</a> </p>
