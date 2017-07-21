package com.example.psyclone.labtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TritharaGames on 7/21/2017.
 */

public class AccountAdapter extends ArrayAdapter<Account> {
    private ArrayList<Account> accounts;
    Context mContext;
    int resource;

    public AccountAdapter(Context context, int resource, ArrayList<Account> accounts) {
        super(context, resource, accounts);

        this.accounts = accounts;
        this.mContext = context;
        this.resource = resource;


    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Account account = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null) {
            convertView = mInflater.inflate(resource, parent, false);
        }

        TextView accountTextName = (TextView) convertView.findViewById(R.id.account_name);
        accountTextName.setText(account.getName());

        TextView accountEmailText = (TextView) convertView.findViewById(R.id.account_email);
        accountEmailText.setText(account.getTel());

        TextView accountTelText = (TextView) convertView.findViewById(R.id.account_tel);
        accountTelText.setText(account.getEmail());

        return convertView;
    }
}
