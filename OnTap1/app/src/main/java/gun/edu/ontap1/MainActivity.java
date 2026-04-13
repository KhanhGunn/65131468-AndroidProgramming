package gun.edu.ontap1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    public void XuLyCong(View view){
        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        EditText edtKetQua = findViewById(R.id.edtKQ);

        String StrA = edtA.getText().toString();
        String StrB = edtB.getText().toString();

        int so_A = Integer.parseInt(StrA);
        int so_B = Integer.parseInt(StrB);

        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        edtKetQua.setText(strTong);
    }

}