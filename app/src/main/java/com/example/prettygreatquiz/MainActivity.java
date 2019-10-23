package com.example.prettygreatquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button buttonTrue;
    private Button buttonFalse;
    private TextView textViewQuestion;
    private TextView textViewQuestionNumber;
    private String jsonString;

    public static final String EXTRA_QUESTION = "question";
    public static final String EXTRA_ANSWER = "answer";
    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();

        //read json file into a string-pull json data file
        //use gson on string to convert to a list of objects
        //create a quiz object from list of questions
        //load first question

        //need to make quiz class

        //two listeners: false/true


        //use on click listeners to wait for user interactions



        textViewQuestionNumber.setVisibility(View.INVISIBLE);
        textViewQuestion.setVisibility(View.INVISIBLE);
        buttonFalse.setVisibility(View.INVISIBLE);
        buttonTrue.setVisibility(View.INVISIBLE);


        InputStream xmlFileInputStream = getResources().openRawResource(R.raw.questions);
        jsonString = readTextFile(xmlFileInputStream);
        // create a gson object
        Gson gson = new Gson();
        // read your json file into an array of questions
        Question[] questions =  gson.fromJson(jsonString, Question[].class);
        // convert your array to a list using the Arrays utility class
        List<Question> questionList = Arrays.asList(questions);
        // verify that it read everything properly
        Log.d(TAG, "onCreate: " + questionList.toString());
    }

    private void setListeners() {
        buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void wireWidgets()
    {
        buttonFalse=findViewById(R.id.button_main_false);
        buttonTrue=findViewById(R.id.button_main_true);
        textViewQuestion=findViewById(R.id.textView_main_question);
        textViewQuestionNumber=findViewById(R.id.textView_main_questionNumber);
    }

    public String readTextFile(InputStream inputStream){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();

    }
}
