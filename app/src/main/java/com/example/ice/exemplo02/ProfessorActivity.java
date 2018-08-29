package com.example.ice.exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ProfessorActivity extends AppCompatActivity {
    private TextView txtProfMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        txtProfMensagem = findViewById(R.id.txt_prof_mensagem);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String nome = extras.getString("nome");
            txtProfMensagem.setText("Olá Pro. "+nome+ "!");
        }
    }
}
