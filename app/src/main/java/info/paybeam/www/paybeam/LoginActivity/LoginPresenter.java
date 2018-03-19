package info.paybeam.www.paybeam.LoginActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by zicokuang on 19/3/18.
 */

public class LoginPresenter implements LoginInterface.LoginPresenter
{
    private LoginInterface.LoginView loginView;

    LoginPresenter(LoginInterface.LoginView view)
    {
        loginView = view;
    }

    @Override
    public void handleAuthentication(String username, String password)
    {
        if(username.equals("username") && password.equals("password"))
            loginView.showSuccess();
        else
            loginView.showFailure();
    }

    @Override
    public void handleSubmitButtonClick(View view)
    {
        loginView.extractPassword();
    }
}
