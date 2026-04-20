package gun.edu.thigk2nguyenquockhanh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        EditText edtAmount = findViewById(R.id.edtAmount);
        EditText edtRate = findViewById(R.id.edtRate);
        Button btnVndToUsd = findViewById(R.id.btnVndToUsd);
        Button btnUsdToVnd = findViewById(R.id.btnUsdToVnd);
        TextView tvResult = findViewById(R.id.tvResult);
        Button btnBack = findViewById(R.id.btnBack);

        btnVndToUsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountStr = edtAmount.getText().toString();
                String rateStr = edtRate.getText().toString();
                if (!amountStr.isEmpty() && !rateStr.isEmpty()) {
                    double amount = Double.parseDouble(amountStr);
                    double rate = Double.parseDouble(rateStr);
                    double result = amount / rate;
                    tvResult.setText(String.format(Locale.getDefault(), "Kết quả: %.2f USD", result));
                } else {
                    Toast.makeText(CurrencyActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnUsdToVnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountStr = edtAmount.getText().toString();
                String rateStr = edtRate.getText().toString();
                if (!amountStr.isEmpty() && !rateStr.isEmpty()) {
                    double amount = Double.parseDouble(amountStr);
                    double rate = Double.parseDouble(rateStr);
                    double result = amount * rate;
                    tvResult.setText(String.format(Locale.getDefault(), "Kết quả: %.0f VND", result));
                } else {
                    Toast.makeText(CurrencyActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}