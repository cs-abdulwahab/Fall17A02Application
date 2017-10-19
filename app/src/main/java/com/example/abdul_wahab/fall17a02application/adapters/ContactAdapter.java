package com.example.abdul_wahab.fall17a02application.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.abdul_wahab.fall17a02application.R;
import com.example.abdul_wahab.fall17a02application.events.ContactPressEvent;
import com.example.abdul_wahab.fall17a02application.models.Contact;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Abdul-Wahab on 10/9/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.RecyclerViewHolder> {

    private static final String TAG = "MTAG";
    private Context context;
    private List<Contact> contactList;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    int oncreateviewholder = 0;

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);

        Log.d(TAG, "onCreateViewHolder: " + oncreateviewholder++);

        return new RecyclerViewHolder(view);
    }

    int onbindviewholder = 0;

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Log.d(TAG, "onBindViewHolder: " + onbindviewholder++);

        Contact contact = contactList.get(position);
        holder.txtName.setText(contact.getName());


        // holder.circleImageView.setImageResource();
        Picasso.with(context)
                .load(contact.getProfilepic())
                .resize(50, 50)
                .placeholder(R.drawable.placeholder)
                .into(holder.circleImageView);

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView txtName;
        public CircleImageView circleImageView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            circleImageView = (CircleImageView) itemView.findViewById(R.id.profile_image);
            Button btnRemove = (Button) itemView.findViewById(R.id.btnRemove);

            btnRemove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("MTAG", "onClick:  REMOVE Button Pressed " + getAdapterPosition());

                    contactList.remove(getAdapterPosition());
                    notifyDataSetChanged();


                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Log.d("MTAG", "onClick: getadapterposition " + getAdapterPosition());
                    Log.d("MTAG", "onClick: getlayoutposition " + getLayoutPosition());

                    EventBus.getDefault().post(new ContactPressEvent(getLayoutPosition()));

                }
            });


            String s = "";

        }


    }


}
