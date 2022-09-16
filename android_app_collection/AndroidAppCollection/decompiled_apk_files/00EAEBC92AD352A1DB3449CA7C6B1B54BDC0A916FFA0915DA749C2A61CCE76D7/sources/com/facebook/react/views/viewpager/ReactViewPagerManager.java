package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.i0.m;
import com.facebook.react.i0.n;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y0;
import com.horcrux.svg.BuildConfig;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactViewPagerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewPagerManager extends ViewGroupManager<d> implements n<d> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";
    private final y0<d> mDelegate = new m(this);

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d dVar, View view, int i) {
        dVar.a(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo345createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(d dVar, int i) {
        return dVar.d(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(d dVar) {
        return dVar.getViewCountInAdapter();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public y0<d> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topPageScroll", f.a("registrationName", "onPageScroll"), "topPageScrollStateChanged", f.a("registrationName", "onPageScrollStateChanged"), "topPageSelected", f.a("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, ReadableArray readableArray) {
        c.d.k.a.a.a(dVar);
        c.d.k.a.a.a(readableArray);
        if (i == 1) {
            dVar.b(readableArray.getInt(0), true);
        } else if (i != 2) {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), ReactViewPagerManager.class.getSimpleName()));
        } else {
            dVar.b(readableArray.getInt(0), false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        char c2;
        c.d.k.a.a.a(dVar);
        c.d.k.a.a.a(readableArray);
        int hashCode = str.hashCode();
        if (hashCode != -445763635) {
            if (hashCode == 1984860689 && str.equals("setPage")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("setPageWithoutAnimation")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            dVar.b(readableArray.getInt(0), true);
        } else if (c2 != 1) {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", str, ReactViewPagerManager.class.getSimpleName()));
        } else {
            dVar.b(readableArray.getInt(0), false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d dVar, int i) {
        dVar.e(i);
    }

    @Override // com.facebook.react.i0.n
    public void setInitialPage(d dVar, int i) {
    }

    @Override // com.facebook.react.i0.n
    public void setKeyboardDismissMode(d dVar, String str) {
    }

    public void setPage(d dVar, int i) {
    }

    @Override // com.facebook.react.i0.n
    @com.facebook.react.uimanager.e1.a(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(d dVar, int i) {
        dVar.setPageMargin((int) q.b(i));
    }

    public void setPageWithoutAnimation(d dVar, int i) {
    }

    @Override // com.facebook.react.i0.n
    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "peekEnabled")
    public void setPeekEnabled(d dVar, boolean z) {
        dVar.setClipToPadding(!z);
    }

    @Override // com.facebook.react.i0.n
    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }
}
