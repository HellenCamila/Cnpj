/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Empresa {

     public static void main(String[] args)  { 
    
          Scanner teclado = new Scanner(System.in);
        
            Cep cep = new Cep();
        

        System.out.println("Por Favor insira o cep da empresa: ");
        String formCep = teclado.next();
      
            cep.consultaCep(formCep);
        
        System.out.println(cep.bairro);
          
            Cnpj cnpj = new Cnpj();
        
        System.out.println("Por Favor insira o Cnpj da empresa: ");
        String formCnpj = teclado.next();
      
            try {
                 cnpj.consultaCnpj(formCnpj);
            } catch (IOException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        System.out.println(cnpj.id);
        System.out.println(cnpj.numerodainscricao);
        System.out.println(cnpj.tipo);
        System.out.println(cnpj.abertura);
        System.out.println(cnpj.nome);
        System.out.println(cnpj.fantasia);
        System.out.println(cnpj.atividadeprincipalnome);
        System.out.println(cnpj.atividadeprincipalcode);
        System.out.println(cnpj.naturezajuridica);
        System.out.println(cnpj.logradouro);
        System.out.println(cnpj.numero);
        System.out.println(cnpj.complemento);
        System.out.println(cnpj.cep);
        System.out.println(cnpj.bairro);
        System.out.println(cnpj.municipio);
        System.out.println(cnpj.uf);
        System.out.println(cnpj.email);
        System.out.println(cnpj.telefone);
        System.out.println(cnpj.entidadefederativoresponsavel);
        System.out.println(cnpj.situacao);
        System.out.println(cnpj.dtsituacaocadastral);
        System.out.println(cnpj.situacaoespecial);
        System.out.println(cnpj.dtsituacaoespicial);
        System.out.println(cnpj.capitalsocial);
        System.out.println(cnpj.ieorigem);
        System.out.println(cnpj.createdat);
        System.out.println(cnpj.updatedat);           
        } 
    }


//00776574000156