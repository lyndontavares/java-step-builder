package com.idomine.stepbuilder;

import java.util.Date;

/**
 * Padrão Step Builder
 * 
 * Uso de interface fluente guiada para construção de um objeto.
 * 
 * @author Lyndon Tavares
 *
 */
public class Teste
{
    public static void main(String[] args)
    {
        Fatura fatura = Fatura.Builder()
                .informeData(new Date())
                .informePessoa("Lyndon")
                .addItem("produto01", 10d, 10d)
                .addItem("produto02", 20d, 20d)
                .addItem("produto03", 30d, 30d)
                .fecharFatura()
                .build();

        System.out.println(fatura);
        
    }

}
