package youn0045.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editFirst, editSecond;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirst = (EditText) findViewById(R.id.edit_first);
        editSecond = (EditText) findViewById(R.id.edit_second);
        Button butplus = (Button) findViewById(R.id.but_plus);
        Button butMinus = (Button) findViewById(R.id.but_minus);
        Button butMultiply = (Button) findViewById(R.id.but_multiply);
        Button butDivision = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);
        butplus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butMultiply.setOnClickListener(this);
        butDivision.setOnClickListener(this);

       /* butplus.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view) {
                                              int num1 = Integer.parseInt(editFirst.getText().toString());
                                              int num2 = Integer.parseInt(editSecond.getText().toString());
                                              textResult.setText(num1 + num2 + "");
            }
        });
         butMinus.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             int num1 = Integer.parseInt(editFirst.getText().toString());
                                             int num2 = Integer.parseInt(editSecond.getText().toString());
                                             textResult.setText(num1 - num2 + "");
                                         }
                                     });
                butMultiply.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       int num1 = Integer.parseInt(editFirst.getText().toString());
                                                       int num2 = Integer.parseInt(editSecond.getText().toString());
                                                       textResult.setText(num1 * num2 + "");
                                                   }
                                               });
        butDivision.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View view) {
                                int num1 = Integer.parseInt(editFirst.getText().toString());
                                int num2 = Integer.parseInt(editSecond.getText().toString());
                                textResult.setText(num1 / num2 + "");
                            }


        }); 첫번째 방법
    } //end oncreat*/

    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(editFirst.getText().toString());
            int num2 = Integer.parseInt(editSecond.getText().toString());
            int result = 0;

            switch (view.getId()) {/*아이디 값을 반환*/
                case R.id.but_plus: /*아이디를 바로 호출*/
                    result = num1 + num2;
                    break;


                case R.id.but_minus:
                    result = num1 - num2;
                    break;


                case R.id.but_multiply:
                    result = num1 * num2;
                    break;


                case R.id.but_division:
                    result = num1 / num2;
                    break;
            }

            textResult.setText(result + "");
        }

    };

    }
    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(editFirst.getText().toString());
        int num2 = Integer.parseInt(editSecond.getText().toString());
        int result = 0;

        switch (view.getId()) {/*아이디 값을 반환*/
            case R.id.but_plus: /*아이디를 바로 호출*/
                result = num1 + num2;
                break;


            case R.id.but_minus:
                result = num1 - num2;
                break;


            case R.id.but_multiply:
                result = num1 * num2;
                break;


            case R.id.but_division:
                result = num1 / num2;
                break;
        }

        textResult.setText(result + "");
    }
};

