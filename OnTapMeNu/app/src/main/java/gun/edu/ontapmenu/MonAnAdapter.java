package gun.edu.ontapmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;
    private Context context;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.dsMonAn = dsMonAn;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() { return dsMonAn.size(); }
    @Override
    public Object getItem(int position) { return dsMonAn.get(position); }
    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_monan, null);
        }

        TextView tvTen = convertView.findViewById(R.id.txt_tenmonan);
        TextView tvGia = convertView.findViewById(R.id.txt_dongia);
        TextView tvMoTa = convertView.findViewById(R.id.txt_mota);
        ImageView img = convertView.findViewById(R.id.img_monan);

        MonAn monAn = dsMonAn.get(position);
        tvTen.setText(monAn.getTenMonAn());
        tvGia.setText(String.valueOf(monAn.getDonGia()));
        tvMoTa.setText(monAn.getMoTa());
        img.setImageResource(monAn.getIdAnhMinhHoa());

        return convertView;
    }
}