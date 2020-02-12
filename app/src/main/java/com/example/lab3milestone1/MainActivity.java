package com.example.lab3milestone1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dialogButton = findViewById(R.id.dialogButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuTopItem:
                Toast.makeText(this,"Top Item pressed",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItem1:
                Toast.makeText(this,"Item 1 pressed",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItem2:
                Toast.makeText(this,"Item 2 pressed",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuSubitem1:
                Toast.makeText(this,"SubItem 1 pressed",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuSubitem2:
                Toast.makeText(this,"SubItem 2 pressed",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }
}
