package gun.edu.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;

    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.context = _context;
        this.dsMonAn = dsMonAn;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }
    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_monan, null);
        }


        ImageView img = convertView.findViewById(R.id.imAnhDaiDien);
        TextView tvTen = convertView.findViewById(R.id.tvTenMonAn);
        TextView tvGia = convertView.findViewById(R.id.tvDonGia);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);

        MonAn monAn = dsMonAn.get(position);
        tvTen.setText(monAn.getTenMonAn());
        tvGia.setText(String.valueOf(monAn.getDonGia()));
        tvMoTa.setText(monAn.getMoTa());
        img.setImageResource(monAn.getIdAnhMinhHoa());

        return convertView;
    }
}
