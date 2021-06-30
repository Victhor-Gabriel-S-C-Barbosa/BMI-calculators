package victhor.gabriel.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResult);

    }

    public void calcularImc(View view){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double imc = peso / (altura*altura);

        /*IMC = Peso (ALtura*Altura)*/
        DecimalFormat df = new DecimalFormat("0.00");

        if(imc <=18.4){
            textResultado.setText("Abaixo do Peso, IMC = " + df.format(imc));
        }
        else if (imc >= 18.5 && imc <= 24.99){
            textResultado.setText("Peso normal, IMC = " + df.format(imc));
        }
        else if (imc >=25 && imc <=29.99){
            textResultado.setText("Acima do Peso, IMC = " + df.format(imc));
        }
        else if (imc >=30 && imc <= 34.99){
            textResultado.setText("Obesidade 1, IMC = " + df.format(imc));
        }
        else textResultado.setText("Obesidade 2(severa), IMC = " + imc);
    }
}