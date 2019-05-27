package com.example.wavesofgood.HelpEvent;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wavesofgood.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.PersonViewHolder>{

    private List<Person> persons;



    RvAdapter(List<Person> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personNumber.setText(persons.get(i).number);
        personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personNumber;
        ImageView personPhoto;
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cardViewEvent);
            personName = (TextView)itemView.findViewById(R.id.cardViewNameEvent);
            personNumber = (TextView)itemView.findViewById(R.id.cardViewNumberPersons);
            personPhoto = (ImageView)itemView.findViewById(R.id.cardViewImage);
        }
    }
}