package me.jessyan.armscomponent.zhihu.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

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
public class FragmentTestModel extends BaseModel implements FragmentTestContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentTestModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }
}