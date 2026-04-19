package gun.edu.ontap_bottomnavigationviewmenu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {

    private EditText edtA, edtB, edtKQ;
    private Button btnCong;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance() {
        return new Cau1Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cau1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 1. Tìm và tham chiếu đến các điều khiển trên giao diện thông qua view
        edtA = view.findViewById(R.id.edtA);
        edtB = view.findViewById(R.id.edtB);
        edtKQ = view.findViewById(R.id.edtKQ);
        btnCong = view.findViewById(R.id.btnCong);

        // 2. Thiết lập sự kiện Click cho nút Cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyCong();
            }
        });
    }

    private void xuLyCong() {
        // 3. Lấy dữ liệu và kiểm tra trống
        String strA = edtA.getText().toString().trim();
        String strB = edtB.getText().toString().trim();

        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đủ số a và b", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // 4. Chuyển dữ liệu sang số và tính toán
            double soA = Double.parseDouble(strA);
            double soB = Double.parseDouble(strB);
            double tong = soA + soB;

            // 5. Hiển thị kết quả
            edtKQ.setText(String.valueOf(tong));
        } catch (NumberFormatException e) {
            Toast.makeText(getContext(), "Dữ liệu nhập vào không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
