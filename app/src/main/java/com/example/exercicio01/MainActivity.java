package com.example.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaração dos objetos para uso
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associação dos elementos aos objetos declarados
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
    }

    //criação do método SOMA
    public void soma(View v){
        //declaração de variáveis
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        //variável para o calculo da operação
        float soma = numero1 + numero2;

        //controle intent que identifica a proxima tela, uma Activty externa
        Intent i = new Intent(this, Resultado.class);
        //lança a operação para a Activty externa
        i.putExtra("soma", soma);
        //chama a proxima tela
        startActivity(i);
    }

    //criação do método SUBTRACAO
    public void subtracao(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());
        float subtracao = numero1 - numero2;

        //controle intent que identifica a proxima tela
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("subtracao", subtracao);
        //chama a proxima tela
        startActivity(i);
    }

    //criação do método DIVISAO
    public void divisao(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float divisao = numero1 / numero2;

        //controle intent que identifica a proxima tela
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("divisao", divisao);
        //chama a proxima tela
        startActivity(i);
    }

    //criação do método MULTIPLICACAO
    public void multiplicacao(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float multiplicacao = numero1 * numero2;

        //controle intent que identifica a proxima tela
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("multiplicacao", multiplicacao);
        //chama a proxima tela
        startActivity(i);
    }

}