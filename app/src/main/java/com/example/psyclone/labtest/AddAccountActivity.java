package com.example.psyclone.labtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddAccountActivity extends AppCompatActivity {
    private DatabaseReference mRootRef;
    private DatabaseReference mAccountsRef;
    private Button submitButton;
    private EditText accountNameText, accountTelText, accountEmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        mAccountsRef = mRootRef.child("accounts");

        submitButton = (Button) findViewById(R.id.submit_button);
        accountNameText = (EditText) findViewById(R.id.account_name);
        accountTelText = (EditText) findViewById(R.id.account_tel);
        accountEmailText = (EditText) findViewById(R.id.account_email);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accountName = accountNameText.getText().toString();
                String accountTel = accountTelText.getText().toString();
                String accountEmail = accountEmailText.getText().toString();
                Account account = new Account(accountName, accountTel, accountEmail);

                mAccountsRef.push().setValue(account);
                finish();
            }
        });
    }
}
