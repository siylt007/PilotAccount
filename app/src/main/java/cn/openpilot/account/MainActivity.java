package cn.openpilot.account;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tbruyelle.rxpermissions2.RxPermissions;

import butterknife.BindView;
import butterknife.OnClick;
import cn.openpilot.account.di.component.DaggerUserComponent;
import cn.openpilot.account.di.module.UserModule;
import cn.openpilot.account.mvp.contract.UserContract;
import cn.openpilot.account.mvp.presenter.UserPresenter;

public class MainActivity extends BaseActivity<UserPresenter> implements UserContract.View {

    @BindView(R.id.test)
    public TextView mText;



    @OnClick(R.id.test)
    public void showToast(){
        Toast.makeText(this, "is a click", Toast.LENGTH_SHORT).show();
        mPresenter.requestUsers(true);

    }


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

       // DaggerUserComponent.builder().appComponent(appComponent).userModule(new UserModule(this)).build().inject(this);
        DaggerUserComponent
                .builder()
                .appComponent(appComponent)
                .userModule(new UserModule(this))
                .build()
                .inject(this);

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void startLoadMore() {

    }

    @Override
    public void endLoadMore() {

    }

    @Override
    public Activity getActivity() {
        return null;
    }

    @Override
    public RxPermissions getRxPermissions() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void launchActivity(@NonNull Intent intent) {

    }

    @Override
    public void killMyself() {

    }
}
