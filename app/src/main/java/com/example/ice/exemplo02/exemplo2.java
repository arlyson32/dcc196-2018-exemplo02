package com.example.ice.exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class exemplo2 extends AppCompatActivity {

    private Button btnProfessor;
    private EditText edtNome;
    //private static EditText PESSOA_NOME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo2);
        btnProfessor = findViewById(R.id.btn_professor);
        edtNome = findViewById(R.id.edtNome);
        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exemplo2.this,ProfessorActivity.class);
                intent.putExtra("nome", edtNome.getText().toString());
                startActivity(intent);
            }
        });

    }
}
