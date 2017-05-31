package utils;


import org.json.simple.parser.ParseException;
import sad.Empresa;
import java.util.List;

public interface EmpresasUploader {

    List<Empresa> procesarArchivo(String ruta) throws ParseException;
}
