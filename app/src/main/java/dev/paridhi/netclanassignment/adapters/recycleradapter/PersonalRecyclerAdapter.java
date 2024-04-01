package dev.paridhi.netclanassignment.adapters.recycleradapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.paridhi.netclanassignment.R;
import dev.paridhi.netclanassignment.model.PersonalPostData;
import io.getstream.avatarview.AvatarView;

public class PersonalRecyclerAdapter extends RecyclerView.Adapter<PersonalRecyclerAdapter.viewHolder>{
    ArrayList<PersonalPostData> list;
    Context context;

    public PersonalRecyclerAdapter(ArrayList<PersonalPostData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.personal_rv_card,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        PersonalPostData personalPostData=list.get(position);
        holder.name.setText(personalPostData.getName());
        holder.locOccup.setText(personalPostData.getLocOccupation());
        holder.distance.setText(personalPostData.getDistanceRange());
        holder.interest.setText(personalPostData.getInterestsAsString());
        holder.about.setText(personalPostData.getAbout());
        holder.avatarView.setAvatarInitials(personalPostData.getInitials());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        AvatarView avatarView;
        TextView name, locOccup, distance,interest, about;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            avatarView=itemView.findViewById(R.id.personal_rv_avatarView);
            name=itemView.findViewById(R.id.personal_rv_nameTv);
            locOccup=itemView.findViewById(R.id.personal_rv_loc_occupation_tv);
            distance=itemView.findViewById(R.id.personal_rv_distance_tv);
            interest=itemView.findViewById(R.id.personal_rv_interests_tv);
            about=itemView.findViewById(R.id.personal_rv_about_tv);
        }
    }
}
