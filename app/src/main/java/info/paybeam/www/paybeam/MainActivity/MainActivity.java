package info.paybeam.www.paybeam.MainActivity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import info.paybeam.www.paybeam.R;
import info.paybeam.www.paybeam.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity implements MainInterface.MainView
{
    private MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        mPresenter =  new MainPresenter(this);
        binding.setPresenter(mPresenter);
    }

    @Override
    public void showLoginScreen()
    {
        Toast.makeText(this, "Bringing user to Login Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showCreateAccountScreen()
    {
        Toast.makeText(this, "Bringing user to Create Account Screen", Toast.LENGTH_SHORT).show();
    }
}
