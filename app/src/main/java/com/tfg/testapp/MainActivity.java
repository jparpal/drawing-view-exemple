package com.tfg.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tfg.componentcapturaescriptura.DrawingView;

public class MainActivity extends AppCompatActivity {
    private DrawingView drawingView;
    private Button eraseButton;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = findViewById(R.id.drawing_view);
        eraseButton = findViewById(R.id.button_erase);
        saveButton = findViewById(R.id.button_save);

        drawingView.backgroundColor(Color.GRAY);
        eraseButton.setOnClickListener(v -> drawingView.clearCanvas());
        saveButton.setOnClickListener(v -> drawingView.saveDrawing());

        TextView leftText = findViewById(R.id.left_text);
        String longText = "This is a long example text that needs to be displayed in the left TextView. " +
                "It can be multiple lines and may exceed the available width of the TextView. ";
        leftText.setText(longText);
        leftText.setEllipsize(TextUtils.TruncateAt.END);
        leftText.setMaxLines(2);
    }
}
