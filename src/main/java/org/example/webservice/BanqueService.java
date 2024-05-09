package org.example.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(double mt) {

        return mt ;
    }
    @WebMethod (operationName = "getCompte")
    public Compte getCompte(Integer code) {

        return new Compte(code, 1000.00, new Date());
    }

    @WebMethod (operationName = "listCompte")
    public List<Compte> listComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1,2000.00, new Date()));
        comptes.add(new Compte(2, 2000.00, new Date()));
        comptes.add(new Compte(3, 3000.00, new Date()));
        return comptes;
    }
}
