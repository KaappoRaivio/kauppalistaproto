package com.example.oikeecardview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.quiz_list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ShoppingListAdapter(new EntryProvider().populateEntries()));
    }

    class ShoppingListAdapter extends RecyclerView.Adapter<ListViewHolder> {
        private final List<Entry> entries;

        ShoppingListAdapter(List<Entry> entries) {
            this.entries = entries;
        }

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            final View v = layoutInflater.inflate(R.layout.kortti, viewGroup, false);
            return new ListViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ListViewHolder listViewHolder, int i) {
            listViewHolder.title.setText(entries.get(i).getTitle());
            listViewHolder.body.setText(entries.get(i).getShortenedBody());


            // että onButtonClick saa yksittäisitä viewgroupeista tietoa
            listViewHolder.button.setTag(entries.get(i).getId());


            listViewHolder.card.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
            listViewHolder.relativeLayout.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;











        }

        @Override
        public int getItemCount() {
            return entries.size();
        }



    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView body;
        CardView card;
        RelativeLayout relativeLayout;
        Button button;


        ListViewHolder(View itemView) {

            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            body = (TextView) itemView.findViewById(R.id.body_shortened);
            card = (CardView) itemView.findViewById(R.id.card);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
            button = (Button) itemView.findViewById(R.id.imageButton);

        }
    }

    public void onButtonClick(View view) {
        int entryId = (Integer) view.getTag();
        Entry entry = Entry.findEntryById(entryId);

        Intent starttaaja = new Intent(this, CreateList.class);
        starttaaja.putExtra("entry", entryId);
        startActivity(starttaaja);
    }


    public void toasti(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }

}