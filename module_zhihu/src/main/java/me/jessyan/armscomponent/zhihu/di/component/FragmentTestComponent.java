package me.jessyan.armscomponent.zhihu.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import me.jessyan.armscomponent.zhihu.di.module.FragmentTestModule;
import me.jessyan.armscomponent.zhihu.mvp.contract.FragmentTestContract;

import com.jess.arms.di.scope.FragmentScope;

import me.jessyan.armscomponent.zhihu.mvp.ui.fragment.FragmentTestFragment;


/**
 * =============================================
 * 作    者：贺兴波
 * 时    间：2019/08/19 16:01
 * 描    述：
 * =============================================
 */
@FragmentScope
@Component(modules = FragmentTestModule.class, dependencies = AppComponent.class)
public interface FragmentTestComponent {
    void inject(FragmentTestFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        FragmentTestComponent.Builder view(FragmentTestContract.View view);

        FragmentTestComponent.Builder appComponent(AppComponent appComponent);

        FragmentTestComponent build();
    }
}