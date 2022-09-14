package com.facebook.react.views.scroll;

import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.o;
import com.facebook.react.views.scroll.f;
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements f.a<d> {
    protected static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo170createViewInstance(af afVar) {
        return new d(afVar, this.mFpsListener);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollEnabled", f = true)
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z) {
        dVar.setHorizontalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "snapToInterval")
    public void setSnapToInterval(d dVar, float f) {
        dVar.setSnapInterval((int) (f * com.facebook.react.uimanager.b.b().density));
    }

    @com.facebook.react.uimanager.a.a(a = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z) {
        dVar.setRemoveClippedSubviews(z);
    }

    @com.facebook.react.uimanager.a.a(a = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z) {
        dVar.setSendMomentumEvents(z);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @com.facebook.react.uimanager.a.a(a = "pagingEnabled")
    public void setPagingEnabled(d dVar, boolean z) {
        dVar.setPagingEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "overScrollMode")
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(g.a(str));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, am amVar) {
        f.a(this, dVar, i, amVar);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(d dVar) {
        dVar.b();
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(d dVar, f.b bVar) {
        if (bVar.f4036c) {
            dVar.smoothScrollTo(bVar.f4034a, bVar.f4035b);
        } else {
            dVar.scrollTo(bVar.f4034a, bVar.f4035b);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(d dVar, f.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.f4037a) {
            dVar.smoothScrollTo(width, dVar.getScrollY());
        } else {
            dVar.scrollTo(width, dVar.getScrollY());
        }
    }

    @com.facebook.react.uimanager.a.a(a = "endFillColor", b = "Color", e = 0)
    public void setBottomFillColor(d dVar, int i) {
        dVar.setEndFillColor(i);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"}, c = Float.NaN)
    public void setBorderRadius(d dVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        if (i == 0) {
            dVar.setBorderRadius(f);
        } else {
            dVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"}, c = Float.NaN)
    public void setBorderWidth(d dVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        dVar.a(SPACING_TYPES[i], f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"}, b = "Color")
    public void setBorderColor(d dVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        dVar.a(SPACING_TYPES[i], intValue, f);
    }
}
