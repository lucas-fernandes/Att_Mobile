package com.example.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    //Declaração dos objetos para uso
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //relaciona o Elemento Text View ao objeto criado
        tvResultado = (TextView)findViewById(R.id.result);

        //ler o parametro passado pela tela anterior
        Intent i = getIntent();

        //relaciona os operadores a variáveis declaradas
        float soma = i.getFloatExtra("soma", 0f);
        float subtracao = i.getFloatExtra("subtracao", 0f);
        float divisao = i.getFloatExtra("divisao", 0f);
        float multiplicacao = i.getFloatExtra("multiplicacao", 0f);
        float resultadoCalc;

        //VALIDA qual operador está sendo escolhido
        if(soma != 0){
            resultadoCalc = soma;
        }else if(subtracao !=0 ){
            resultadoCalc = subtracao;
        }else if(divisao != 0){
            resultadoCalc = divisao;
        }else
            resultadoCalc = multiplicacao;

        //retorna uma mensagem do resultado da operação escolhida
        String msg = "O resultado do calculo é: " + resultadoCalc;

        //insere o resultado do operador a view selecionada
        tvResultado.setText(msg);
    }

    //metodo do botao VOLTAR que retorna para a tela inicial
    public void voltar(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}