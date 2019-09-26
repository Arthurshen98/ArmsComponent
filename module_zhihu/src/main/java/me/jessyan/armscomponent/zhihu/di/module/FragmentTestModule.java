package me.jessyan.armscomponent.zhihu.di.module;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import me.jessyan.armscomponent.zhihu.mvp.contract.FragmentTestContract;
import me.jessyan.armscomponent.zhihu.mvp.model.FragmentTestModel;


/**
 * =============================================
 * 作    者：贺兴波
 * 时    间：2019/08/19 16:01
 * 描    述：
 * =============================================
 */
@Module
public abstract class FragmentTestModule {

    @Binds
    abstract FragmentTestContract.Model bindFragmentTestModel(FragmentTestModel model);
}