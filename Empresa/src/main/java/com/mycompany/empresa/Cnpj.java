/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author aluno
 */
public class Cnpj {
    
    
    public String cnpj;
    public String id;
    public String numerodainscricao;
    public String tipo;
    public String abertura;
    public String nome;
    public String fantasia; 
    public String atividadeprincipalnome;
    public String atividadeprincipalcode;
    public String naturezajuridica;
    public String logradouro;
    public String numero; 
    public String complemento;
    public String cep;
    public String bairro;
    public String municipio;
    public String uf;
    public String email;
    public String telefone;
    public String entidadefederativoresponsavel;
    public String situacao;
    public String dtsituacaocadastral;
    public String situacaoespecial;
    public String dtsituacaoespicial;
    public String capitalsocial;
    public String ieorigem;
    public String createdat;
    public String updatedat;

    
    
   
    private String request(String cnpj) throws IOException
    {
        String json;        

        URL url = new URL("https://sisdel.com.br/api/hub/cnpjHub/"+ cnpj);
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder jsonSb = new StringBuilder();
        br.lines().forEach(l -> jsonSb.append(l.trim()));
        json = jsonSb.toString();
        // JOptionPane.showMessageDialog(null, json);
        
        return json;
    } 

    
    
public void consultaCnpj(String cnpj) throws IOException{
       
        String resposta = request(cnpj);
       
        resposta = resposta.replaceAll("[{},:]", "");
       
        resposta = resposta.replaceAll("\"", "\n");        
       
        String array[] = new String[101];
       
        array = resposta.split("\n");
           
        
        
//        JOptionPane.showMessageDialog(null, array);
            this.setCnpj(cnpj);
            this.setId(array[2]);  
            this.setNumerodaincricao(array[5]);  
            this.setTipo(array[9]);
            this.setAbertura(array[13]);
            this.setNome(array[17]);
            this.setFantasia(array[21]); 
            this.setAtividadeprincipalnome(array[25]);
            this.setAtividadeprincipalcode(array[29]);
            this.setNaturezajuridica(array[33]);  
            this.setLogradouro(array[37]);
            this.setNumero(array[41]);
            this.setComplemento(array[45]);
            this.setCep(array[49]);       
            this.setBairro(array[53]);
            this.setMunicipio(array[57]);
            this.setUf(array[61]);
            this.setEmail(array[65]); 
            this.setTelefone(array[69]);
            this.setEntidadefederativoresponsavel(array[73]);
            this.setSituacao(array[77]);
            this.setDtsituacaocadastral(array[81]); 
            this.setSituacaoespecial(array[85]);
            this.setDtsituacaoespicial (array[89]); 
            this.setCapitalsocial(array[91]); 
            this.setIeorigem(array[93]);
            this.setCreatedat(array[97]);  
            this.setUpdatedat(array[101]);
           
                
            
                                   
        }
    
           public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

           public void setId(String id) {
            this.id = id;
        } 
           public void setNumerodaincricao(String numerodainscricao) {
            this.numerodainscricao = numerodainscricao;
        }

           public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
           public void setAbertura(String abertura) {
            this.abertura = abertura;
        } 
           public void setNome(String nome) {
            this.nome = nome;
        }
    
           public void setFantasia(String fantasia) {
            this.fantasia = fantasia;
        } 
           public void setAtividadeprincipalnome(String atividadeprincipalnome) {
            this.atividadeprincipalnome = atividadeprincipalnome;
        }

           public void setAtividadeprincipalcode(String atividadeprincipalcode) {
            this.atividadeprincipalcode = atividadeprincipalcode;
        }
           public void setNaturezajuridica(String naturezajuridica) {
            this.naturezajuridica = naturezajuridica;
        }

           public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }
    
           public void setNumero(String numero) {
            this.numero = numero;
        } 
           public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
    
           public void setCep(String cep) {
            this.cep = cep;
        }  
           public void setBairro (String bairro) {
            this.bairro =  bairro;
        }
      
           public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }
      
           public void setBaiiro (String bairro) {
            this.bairro = bairro;
        }
      
           public void setUf (String uf) {
            this.uf = uf;
        }
      
           public void setEmail (String email) {
            this.email = email;
        }
      
           public void setTelefone (String telefone) {
            this.telefone = telefone;
        }
      
           public void setEntidadefederativoresponsavel (String entidadefederativoresponsavel) {
            this.entidadefederativoresponsavel = entidadefederativoresponsavel;
            
        }
           public void setSituacao (String situacao) {
            this.situacao = situacao;
            
        }
           public void setDtsituacaocadastral(String  dtsituacaocadastral) {
            this.dtsituacaocadastral =  dtsituacaocadastral;
            
            
        }
           public void setSituacaoespecial (String situacaoespecial) {
            this.situacaoespecial = situacaoespecial;
            
            
        }
           public void setDtsituacaoespicial (String dtsituacaoespicial) {
            this.dtsituacaoespicial = dtsituacaoespicial;
            
            
        }
           public void setCapitalsocial (String capitalsocial) {
            this.capitalsocial = capitalsocial;
            
        }
           public void setIeorigem (String ieorigem) {
            this.ieorigem = ieorigem;
            
        }
           public void setCreatedat (String createdat) {
            this.createdat = createdat;
            
        }
           public void setUpdatedat (String updatedat) {
            this.updatedat = updatedat;
            
        }
      
    }
         
     


            
            
            
            
   