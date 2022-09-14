package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.react.b.f;
import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactViewPagerManager extends ViewGroupManager<d> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    protected static final String REACT_CLASS = "AndroidViewPager";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo170createViewInstance(af afVar) {
        return new d(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollEnabled", f = true)
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return f.a("topPageScroll", f.a("registrationName", "onPageScroll"), "topPageScrollStateChanged", f.a("registrationName", "onPageScrollStateChanged"), "topPageSelected", f.a("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, am amVar) {
        com.facebook.j.a.a.b(dVar);
        com.facebook.j.a.a.b(amVar);
        switch (i) {
            case 1:
                dVar.b(amVar.getInt(0), true);
                return;
            case 2:
                dVar.b(amVar.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d dVar, View view, int i) {
        dVar.a(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(d dVar) {
        return dVar.getViewCountInAdapter();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(d dVar, int i) {
        return dVar.e(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d dVar, int i) {
        dVar.d(i);
    }

    @com.facebook.react.uimanager.a.a(a = "pageMargin", d = BitmapDescriptorFactory.HUE_RED)
    public void setPageMargin(d dVar, float f) {
        dVar.setPageMargin((int) o.a(f));
    }

    @com.facebook.react.uimanager.a.a(a = "peekEnabled", f = false)
    public void setPeekEnabled(d dVar, boolean z) {
        dVar.setClipToPadding(!z);
    }
}
