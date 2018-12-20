package com.prospec.prospecservice;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuAssetActivity extends AppCompatActivity {

    //  Explicit  ประกาศตัวแปร
    private Button button1, button2, button3, button4, button5, button6;
    final Context context1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_asset);

        //        Bind Widget
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

//        //Get Event From Click ที่ดินเปล่า
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(context1);
//                View mView = layoutInflaterAndroid.inflate(R.layout.activity_land_building, null);
//                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(context1);
//                alertDialogBuilderUserInput.setView(mView);
//
////                final EditText userInputDialogEditText = (EditText) findViewById(R.id.editText);
//                alertDialogBuilderUserInput
//                        .setCancelable(false)
//                        .setPositiveButton("Send", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialogBox, int id) {
//                                // สิ่งที่ต้องทำเพื่อให้ได้ข้อมูลของผู้ใช้ที่นี่
//                            }
//                        })
//
//                        .setNegativeButton("Cancel",
//                                new DialogInterface.OnClickListener() {
//                                    public void onClick(DialogInterface dialogBox, int id) {
//                                        dialogBox.cancel();
//                                    }
//                                });
//
//                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
//                alertDialogAndroid.show();
//            }
//        });

        //Get Event From Click Land and Building
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAssetActivity.this, LandBuildingActivity.class));

            }
        });
        //Get Event From Click Land and Building
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAssetActivity.this, BuildingActivity.class));

            }
        });

        //Get Event From Click Room
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAssetActivity.this, RoomActivity.class));

            }
        });
    }
}
