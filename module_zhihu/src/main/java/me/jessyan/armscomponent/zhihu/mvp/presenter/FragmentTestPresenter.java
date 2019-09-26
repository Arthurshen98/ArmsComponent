package me.jessyan.armscomponent.zhihu.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import me.jessyan.armscomponent.zhihu.mvp.contract.FragmentTestContract;


/**
 * =============================================
 * 作    者：贺兴波
 * 时    间：2019/08/19 16:01
 * 描    述：
 * =============================================
 */
@FragmentScope
public class FragmentTestPresenter extends BasePresenter<FragmentTestContract.Model, FragmentTestContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public FragmentTestPresenter(FragmentTestContract.Model model, FragmentTestContract.View rootView) {
        super(model, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
