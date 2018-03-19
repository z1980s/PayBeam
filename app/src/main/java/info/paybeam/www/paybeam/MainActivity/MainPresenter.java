package info.paybeam.www.paybeam.MainActivity;

import android.view.View;

/**
 * Created by zicokuang on 19/3/18.
 */

public class MainPresenter implements MainInterface.MainPresenter
{
    private MainInterface.MainView mView;

    MainPresenter(MainInterface.MainView view)
    {
        mView = view;
    }

    @Override
    public void handleLoginButtonClick(View view)
    {
        mView.showLoginScreen();
    }

    @Override
    public void handleCreateAccountButtonClick(View view)
    {
        mView.showCreateAccountScreen();
    }
}
