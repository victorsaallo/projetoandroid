package com.example.victor.projeto;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText nomeEditText;
    EditText nomeEditText1;
    TextView hintTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.botao1);
        b.setOnClickListener(this);
        nomeEditText = (EditText) findViewById( R.id.edi4);
        hintTextView = (TextView) findViewById(R.id.hint1);
        nomeEditText1 = (EditText) findViewById(R.id.edi5);
        nomeEditText.addTextChangedListener(watch);
        nomeEditText1.addTextChangedListener(watch2);
    }

    @Override
    public void onClick(View v) {
        EditText editText = findViewById(R.id.edi1);
        String nomes = editText.getText().toString();
        EditText editText1 = findViewById(R.id.edi2);
        String sobrenome = editText1.getText().toString();
        EditText editText2 = findViewById(R.id.edi5);
        String senha = editText2.getText().toString();
        Context contexto = getApplicationContext();
        String texto = "Bem Vindo, " + editText.getText().toString() + " "+ editText1.getText().toString() + " a sua senha é: " + editText2.getText().toString();
        int duracao = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }

    TextWatcher watch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence text, int start, int before, int count) {
            EditText editText = findViewById(R.id.edi1);
            String nomes = editText.getText().toString();
            EditText editText4 = findViewById(R.id.edi5);
            EditText editText2 = findViewById(R.id.edi4);
            String senha = editText2.getText().toString();
            Context contexto2 = getApplicationContext();
            String texto2 = "a senha possui o número mínimo de caracteres";
            Context contexto3 = getApplicationContext();
            String texto3 = "a senha não pode ser igual ao primeiro nome";
            int duracao2 = Toast.LENGTH_LONG;
            if(editText2.getText().length()==5){
                Toast toast2 = Toast.makeText(contexto2,texto2,duracao2);
                toast2.show();
            }
            String x = editText.getText().toString();
            String x2 = editText2.getText().toString();
            String x3 = editText4.getText().toString();
            if(x.equals(x2)){
                Toast toast3 = Toast.makeText(contexto3,texto3,duracao2);
                toast3.show();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    TextWatcher watch2 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            EditText editText4 = findViewById(R.id.edi5);
            EditText editText2 = findViewById(R.id.edi4);
            String x2 = editText2.getText().toString();
            String x3 = editText4.getText().toString();
            Context contexto4 = getApplicationContext();
            String texto4 = "as senhas devem ser iguais";
            Context contexto5 = getApplication();
            String texto5 = "as senhas estão iguais";
            int duracao2 = Toast.LENGTH_LONG;
            if(x3!= x2){
                Toast toast4 = Toast.makeText(contexto4,texto4,duracao2);
                toast4.show();
            }
            if(x3.equals(x2)){
                Toast toast5 = Toast.makeText(contexto5,texto5,duracao2);
                toast5.show();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}