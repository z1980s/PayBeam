package info.paybeam.www.paybeam.MainActivity;

import android.view.View;

/**
 * Created by zicokuang on 19/3/18.
 */

public interface MainInterface
{
    interface MainView
    {
        void showLoginScreen();

        void showCreateAccountScreen();
    }

    interface MainPresenter
    {
        void handleLoginButtonClick(View view);

        void handleCreateAccountButtonClick(View view);
    }
}
