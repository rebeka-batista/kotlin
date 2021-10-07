<img src="https://miro.medium.com/max/1400/1*_Ou2bvBB0pRQqrHOE4O_VA.jpeg" height = "450" width="850">


<h1><strong>Conteúdo deste repositório 🧾</h1></strong>

  <p><h2>Classes</h2></p>
	<p>"class", o construtor padrão é declarado na mesma linha da classe</p>
	<p>Para herdar de uma classe, basta utilizar ":"</p>
	<p>Se a classe for utilizada para herança, deve ser "open" pois o Kotlin tem as classes como final, assim não é possível ter herança</p>   
	<p>Data classes implementam automaticamente equals e hashcode, toString, copy e permite fácil acesso aos atributos, sem getters/setters</p>
	<p>O objeto companion funciona como um Singleton dentro de outra classe e pode ser acessado sem instância</p>
	<p><h2>Variaveis</h2></p>
	<p>var -> são variáveis, podem tem seu valor alterado</p>
	<p>val -> são constantes, não podem ter seu valor alterado</p> 
	<p>O tipo da variável pode ser omitido se um valor for atribuido</p>
	<p>Só podemos ter variaveis e objetos nulos, se indicarmos com "?" no tipo da variável</p>
	<p>Para converter de um tipo para o outro utilizamos "as"</p>
	<p>Para que não seja lançada uma exception caso não seja possível converter podemos usar "as?", assim, o retorno é nulo</p>
	<p><h2>print/println:</h2></p>
	<p>Para imprimir variaveis podemos utilizar: ${variavel} ou ${objeto.propriedade}</p>
  <p><h2>Operadores</h2></p>
	<p>No Kotlin, o operador ternário pode ser usado com if/else</p>
	<p>O operador "?" pode ser utilizado pra seguinte afirmação: Se o valor da variável for nulo, use seu próprio valor. Caso contrário, use outro.</p>
  <p><h2>Funções</h2></p>
	<p>Os parâmtros das funções podem tem valores padrão, o que evita ter de criar métodos com a mesma assinatura</p>
	<p>Vararg é um tipo de parâmetro que pode receber um ou mais parâmetros, separados por vírgula</p>
  <p><h2>Generics</h2></p>
	<p>Ao invés de replicar código, podemos utilizar Generics</p>
	<p><h2>Higher Order Funtions</h2></p>
	<p>No Kotlin é possível funções receber outra função como parâmetro, também permite que uma função retorne outra função</p>
	<p>Para isso, usamos "::funcao" para passar a função como parâmetro. Se a função tiver os mesmos argumentos que a função desejada, a chamada será feita</p>
	
<p>*Código do livro: Android Essencial com Kotlin, Autor Ricardo R. Lecheta*</p>
