/**
 * Classe para testar a anotação Tabela
 *
 * @author Natalia
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // Verificando a anotação na classe Usuario
        Class<?> classe = Usuario.class;

        // Verificar se a classe tem a anotação @Tabela
        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classe.getAnnotation(Tabela.class);
            System.out.println("A classe " + classe.getSimpleName() + " está mapeada para a tabela: " + tabela.nome());
        } else {
            System.out.println("A classe não possui a anotação @Tabela");
        }

        // Criando um usuário de exemplo
        Usuario usuario = new Usuario(1L, "João Silva", "joao@email.com");
        System.out.println(usuario);
    }
}
