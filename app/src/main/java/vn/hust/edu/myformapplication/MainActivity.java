package vn.hust.edu.myformapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    EditText editID;
    EditText editDoB;
    EditText editPhone;
    EditText editEmail;
    TextView notice;
    CheckBox checkSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.InputName);
        editID = findViewById(R.id.InputID);
        editDoB = findViewById(R.id.editTextDate);
        editPhone = findViewById(R.id.InputPhone);
        editEmail = findViewById(R.id.InputEmail);
        checkSubmit = findViewById(R.id.Submit);
        notice = findViewById(R.id.textView3);

        editName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    editName.setError("Missing Name");
                } else {
                    editName.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editDoB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    editDoB.setError("Missing DoB");
                } else {
                    editDoB.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    editID.setError("Missing ID");
                } else {
                    editID.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    editPhone.setError("Missing Phone");
                } else {
                    editPhone.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    editEmail.setError("Missing Email");
                } else {
                    editEmail.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void showToast() {
        Toast.makeText(this,"Fill information successfully", Toast.LENGTH_SHORT).show();

    }

    public void check(View view) {
        if(checkSubmit.isChecked()){
        showToast();
    }else{
        notice.setText("Please check Submit box above");
        notice.setTextColor(Color.RED);
    }
    }
}