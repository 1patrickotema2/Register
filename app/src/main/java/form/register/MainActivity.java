package form.register;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private static EditText name;
    private static EditText email;
    private static EditText phone;
    private static Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YES();
    }
    public void YES() {

        signup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //here am creating the toast object and setting diplay duration.
                        EditText name=(EditText)findViewById(R.id.idname);

                        EditText email=(EditText)findViewById(R.id.idemail);

                        EditText phone=(EditText)findViewById(R.id.idphone);

                       Button signup = (Button)findViewById(R.id.idbutton1);

                      Toast.makeText(this, "your are signing up.... thank you"+name+email+phone+.getText().toString(),
                              Toast_LENGHT_SHORT).show();
                    }
                }
        );
    }
}


