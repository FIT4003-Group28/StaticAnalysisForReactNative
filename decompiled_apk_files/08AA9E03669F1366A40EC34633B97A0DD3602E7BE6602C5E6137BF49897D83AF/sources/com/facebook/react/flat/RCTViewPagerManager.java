package com.facebook.react.flat;

import android.view.View;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import java.util.List;
/* loaded from: classes.dex */
public class RCTViewPagerManager extends ReactViewPagerManager {
    static final String REACT_CLASS = "AndroidViewPager";

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addViews(com.facebook.react.views.viewpager.d dVar, List list) {
        addViews2(dVar, (List<View>) list);
    }

    /* renamed from: addViews  reason: avoid collision after fix types in other method */
    public void addViews2(com.facebook.react.views.viewpager.d dVar, List<View> list) {
        dVar.setViews(list);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(com.facebook.react.views.viewpager.d dVar) {
        dVar.f();
    }
}
