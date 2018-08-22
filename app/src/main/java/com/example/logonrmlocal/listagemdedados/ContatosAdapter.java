package com.example.logonrmlocal.listagemdedados;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContatosAdapter extends BaseAdapter {

    Context context;
    List<Contato> contatos;

    public ContatosAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int i) {
        return (Object)this.contatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(i);

        View v =  layoutInflater.inflate(R.layout.listview_contatos, null);
        ImageView imgContato = v.findViewById(R.id.imgContato);
        TextView txtNome = v.findViewById(R.id.txtNome);
        TextView txtTelefone = v.findViewById(R.id.txtTelefone);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtTelefone.setText(contato.getTelefone());

        return v;
    }
}
