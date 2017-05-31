package utils;


import org.json.simple.parser.ParseException;

import dominio.Empresa;

import java.util.List;

public interface EmpresasUploader {

    List<Empresa> procesarArchivo(String ruta) throws ParseException;
}
