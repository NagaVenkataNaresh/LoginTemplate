package naresh.logintemplate;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.email_id);
        et2 = (EditText)findViewById(R.id.password);
    }

    public void login(View v)
    {
        String s1 = et1.getText().toString().trim();
        String s2 = et2.getText().toString().trim();
        if(s1.equals(""))
        {
            et1.setError("Enter your mail id");
        }
        else
        {
            if(s2.equals(""))
            {
                et2.setError("Enter your password");
            }
            else
            {
                Toast t = Toast.makeText(this,"Thank You",Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }
        }
    }
    public void close(View v)
    {
        Toast t = Toast.makeText(this,"Completed",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

}
