package com.example.student_application.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_application.R;
import com.example.student_application.model.ChatModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.common.util.concurrent.ForwardingListeningExecutorService;

import de.hdodenhof.circleimageview.CircleImageView;


public class ChatAdapter extends FirestoreRecyclerAdapter<ChatModel, ChatAdapter.ChatViewHolder> {

    public ChatAdapter(@NonNull FirestoreRecyclerOptions<ChatModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ChatViewHolder holder, int position, @NonNull ChatModel model) {
        holder.name.setText(model.getName());
        holder.message.setText(model.getMessage());


    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false);
        return new ChatViewHolder(view);
    }

    class ChatViewHolder extends RecyclerView.ViewHolder {

        TextView name , message;
        CircleImageView user_image;
        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewName);
            message = itemView.findViewById(R.id.textViewMessege);
            user_image = itemView.findViewById(R.id.user_image);


        }
    }

}


