package dominio.operandos;

import dominio.Periodo;

import java.math.BigDecimal;

public interface Operando {
    BigDecimal valor(Periodo periodo);
}
