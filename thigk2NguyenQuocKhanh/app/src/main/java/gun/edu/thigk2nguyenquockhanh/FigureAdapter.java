package gun.edu.thigk2nguyenquockhanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FigureAdapter extends ArrayAdapter<HistoricalFigure> {
    private int resourceId;

    public FigureAdapter(@NonNull Context context, int resource, @NonNull List<HistoricalFigure> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        HistoricalFigure figure = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }

        ImageView img = convertView.findViewById(R.id.imgFigure);
        TextView tvName = convertView.findViewById(R.id.tvFigureName);
        TextView tvHometown = convertView.findViewById(R.id.tvFigureHometown);

        if (figure != null) {
            img.setImageResource(figure.getImageResId());
            tvName.setText(figure.getName());
            tvHometown.setText(figure.getHometown());
        }

        return convertView;
    }
}