package com.facebook.react.views.scroll;

import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.o;
import com.facebook.react.views.scroll.f;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<e> implements f.a<e> {
    protected static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public e mo170createViewInstance(af afVar) {
        return new e(afVar, this.mFpsListener);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollEnabled", f = true)
    public void setScrollEnabled(e eVar, boolean z) {
        eVar.setScrollEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(e eVar, boolean z) {
        eVar.setVerticalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @com.facebook.react.uimanager.a.a(a = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @com.facebook.react.uimanager.a.a(a = "endFillColor", b = "Color", e = 0)
    public void setBottomFillColor(e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(g.a(str));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i, am amVar) {
        f.a(this, eVar, i, amVar);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(e eVar) {
        eVar.b();
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(e eVar, f.b bVar) {
        if (bVar.f4036c) {
            eVar.smoothScrollTo(bVar.f4034a, bVar.f4035b);
        } else {
            eVar.scrollTo(bVar.f4034a, bVar.f4035b);
        }
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"}, c = Float.NaN)
    public void setBorderRadius(e eVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
        } else {
            eVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"}, c = Float.NaN)
    public void setBorderWidth(e eVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        eVar.a(SPACING_TYPES[i], f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"}, b = "Color")
    public void setBorderColor(e eVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        eVar.a(SPACING_TYPES[i], intValue, f);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(e eVar, f.c cVar) {
        int height = eVar.getChildAt(0).getHeight() + eVar.getPaddingBottom();
        if (cVar.f4037a) {
            eVar.smoothScrollTo(eVar.getScrollX(), height);
        } else {
            eVar.scrollTo(eVar.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    public static Map createExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.b.f.c().a(i.SCROLL.a(), com.facebook.react.b.f.a("registrationName", "onScroll")).a(i.BEGIN_DRAG.a(), com.facebook.react.b.f.a("registrationName", "onScrollBeginDrag")).a(i.END_DRAG.a(), com.facebook.react.b.f.a("registrationName", "onScrollEndDrag")).a(i.MOMENTUM_BEGIN.a(), com.facebook.react.b.f.a("registrationName", "onMomentumScrollBegin")).a(i.MOMENTUM_END.a(), com.facebook.react.b.f.a("registrationName", "onMomentumScrollEnd")).a();
    }
}
