package gun.edu.ontapgiuaky_recyclerview_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater bômLayout = LayoutInflater.from(context);
        View vItem = bômLayout.inflate(R.layout.item_land, parent, false);
        return new ItemLandHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape hiểnThị = listData.get(position);
        holder.tvCaption.setText(hiểnThị.getCaption());

        // Xử lý nạp ảnh từ thư mục mipmap [00:21:54]
        String pkgName = context.getPackageName();
        int imageID = context.getResources().getIdentifier(hiểnThị.getImageFileName(), "mipmap", pkgName);
        holder.ivLand.setImageResource(imageID);
    }

    @Override
    public int getItemCount() { return listData.size(); }

    // Lớp ViewHolder để giữ các tham chiếu view [00:08:51]
    class ItemLandHolder extends RecyclerView.ViewHolder {
        TextView tvCaption;
        ImageView ivLand;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textView);
            ivLand = itemView.findViewById(R.id.imageView);
        }
    }
}