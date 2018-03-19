package info.paybeam.www.paybeam.LoginActivity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import info.paybeam.www.paybeam.R;
import info.paybeam.www.paybeam.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity implements LoginInterface.LoginView
{
    private LoginPresenter loginPresenter;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        LoginActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.login_activity);
        loginPresenter = new LoginPresenter(this);
        binding.setPresenter(loginPresenter);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    @Override
    public void extractPassword()
    {
        loginPresenter.handleAuthentication(username.getText().toString(), password.getText().toString());
    }

    public void showSuccess()
    {
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
    }

    public void showFailure()
    {
        Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
    }

    public void showHomeScreen()
    {

    }
}
