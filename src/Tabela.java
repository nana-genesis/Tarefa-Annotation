import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação personalizada para nomear tabelas.
 *
 * @author Natalia
 * @version 1.0
 */

// Onde essa anotação pode ser usada (em classes)
@Target(ElementType.TYPE)

// Até quando ela fica disponível (em tempo de execução)
@Retention(RetentionPolicy.RUNTIME)

public @interface Tabela {

    // Valor que a anotação recebe (nome da tabela)
    String nome();}