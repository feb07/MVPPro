package com.feb.mvppro.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.feb.mvppro.R;
import com.feb.mvppro.model.User;

import java.util.List;

/**
 * Created by lilichun on 2019/2/26.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<User> users;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context mContext, List<User> users) {
        this.mContext = mContext;
        this.users = users;
        inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.recycler_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof ViewHolder) {
            if (users != null && users.size() > i) {
                ViewHolder holder = (ViewHolder) viewHolder;
                holder.tv_item.setText(users.get(i).name);
            }
        }
    }

    @Override
    public int getItemCount() {
        if (users != null) {
            return users.size();
        }
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_item = itemView.findViewById(R.id.tv_item);
        }
    }
}
