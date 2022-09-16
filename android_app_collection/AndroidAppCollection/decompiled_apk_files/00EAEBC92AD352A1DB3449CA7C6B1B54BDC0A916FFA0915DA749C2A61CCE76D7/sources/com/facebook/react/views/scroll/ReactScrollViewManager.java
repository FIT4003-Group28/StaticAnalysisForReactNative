package com.facebook.react.views.scroll;

import a.g.m.v;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.f;
import java.util.ArrayList;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<e> implements f.a<e> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a(i.a(i.SCROLL), com.facebook.react.common.f.a("registrationName", "onScroll"));
        a2.a(i.a(i.BEGIN_DRAG), com.facebook.react.common.f.a("registrationName", "onScrollBeginDrag"));
        a2.a(i.a(i.END_DRAG), com.facebook.react.common.f.a("registrationName", "onScrollEndDrag"));
        a2.a(i.a(i.MOMENTUM_BEGIN), com.facebook.react.common.f.a("registrationName", "onMomentumScrollBegin"));
        a2.a(i.a(i.MOMENTUM_END), com.facebook.react.common.f.a("registrationName", "onMomentumScrollEnd"));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public e mo345createViewInstance(k0 k0Var) {
        return new e(k0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(e eVar) {
        eVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i, ReadableArray readableArray) {
        f.a(this, eVar, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        f.a(this, eVar, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(e eVar, f.b bVar) {
        if (bVar.f6227c) {
            eVar.smoothScrollTo(bVar.f6225a, bVar.f6226b);
        } else {
            eVar.scrollTo(bVar.f6225a, bVar.f6226b);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(e eVar, f.c cVar) {
        int height = eVar.getChildAt(0).getHeight() + eVar.getPaddingBottom();
        if (cVar.f6228a) {
            eVar.smoothScrollTo(eVar.getScrollX(), height);
        } else {
            eVar.scrollTo(eVar.getScrollX(), height);
        }
    }

    @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(e eVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f2 = num.intValue() >>> 24;
        }
        eVar.a(SPACING_TYPES[i], intValue, f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(e eVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        if (i == 0) {
            eVar.setBorderRadius(f2);
        } else {
            eVar.a(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(e eVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        eVar.a(SPACING_TYPES[i], f2);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "decelerationRate")
    public void setDecelerationRate(e eVar, float f2) {
        eVar.setDecelerationRate(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(e eVar, int i) {
        if (i > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
        } else {
            i = 0;
            eVar.setVerticalFadingEdgeEnabled(false);
        }
        eVar.setFadingEdgeLength(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z) {
        v.c(eVar, z);
    }

    @com.facebook.react.uimanager.e1.a(name = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(g.a(str));
    }

    @com.facebook.react.uimanager.e1.a(name = "overflow")
    public void setOverflow(e eVar, String str) {
        eVar.setOverflow(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "pagingEnabled")
    public void setPagingEnabled(e eVar, boolean z) {
        eVar.setPagingEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(e eVar, boolean z) {
        eVar.setScrollbarFadingEnabled(!z);
    }

    @com.facebook.react.uimanager.e1.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z) {
        eVar.setScrollEnabled(z);
        eVar.setFocusable(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(e eVar, boolean z) {
        eVar.setVerticalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToEnd")
    public void setSnapToEnd(e eVar, boolean z) {
        eVar.setSnapToEnd(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToInterval")
    public void setSnapToInterval(e eVar, float f2) {
        eVar.setSnapInterval((int) (f2 * com.facebook.react.uimanager.c.a().density));
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, ReadableArray readableArray) {
        DisplayMetrics a2 = com.facebook.react.uimanager.c.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * a2.density)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToStart")
    public void setSnapToStart(e eVar, boolean z) {
        eVar.setSnapToStart(z);
    }
}
