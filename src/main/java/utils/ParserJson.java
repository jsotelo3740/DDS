package utils;

import com.google.gson.Gson;

import dominio.Empresa;

import org.json.simple.JSONObject;

public class ParserJson {

    Empresa jsonAEmpresa(JSONObject json) {
            Gson gson = new Gson();
            return gson.fromJson(json.toString(), Empresa.class);
    }

}
