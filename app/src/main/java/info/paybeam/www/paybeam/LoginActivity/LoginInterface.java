package info.paybeam.www.paybeam.LoginActivity;

import android.view.View;

/**
 * Created by zicokuang on 19/3/18.
 */

public interface LoginInterface
{
    interface LoginView
    {
        void extractPassword();
        void showSuccess();
        void showFailure();
        void showHomeScreen();
    }

    interface LoginPresenter
    {
        void handleAuthentication(String username, String password);
        void handleSubmitButtonClick(View view);
    }
}
