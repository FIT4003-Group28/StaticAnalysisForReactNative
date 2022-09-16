package com.facebook.react.views.scroll;

import a.g.m.v;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.f;
import java.util.ArrayList;
@com.facebook.react.d0.a.a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements f.a<d> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo345createViewInstance(k0 k0Var) {
        return new d(k0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(d dVar) {
        dVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, ReadableArray readableArray) {
        f.a(this, dVar, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        f.a(this, dVar, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(d dVar, f.b bVar) {
        if (bVar.f6227c) {
            dVar.smoothScrollTo(bVar.f6225a, bVar.f6226b);
        } else {
            dVar.scrollTo(bVar.f6225a, bVar.f6226b);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(d dVar, f.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.f6228a) {
            dVar.smoothScrollTo(width, dVar.getScrollY());
        } else {
            dVar.scrollTo(width, dVar.getScrollY());
        }
    }

    @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(d dVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f2 = num.intValue() >>> 24;
        }
        dVar.a(SPACING_TYPES[i], intValue, f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(d dVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        if (i == 0) {
            dVar.setBorderRadius(f2);
        } else {
            dVar.a(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderStyle")
    public void setBorderStyle(d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(d dVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        dVar.a(SPACING_TYPES[i], f2);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i) {
        dVar.setEndFillColor(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "decelerationRate")
    public void setDecelerationRate(d dVar, float f2) {
        dVar.setDecelerationRate(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(d dVar, boolean z) {
        dVar.setDisableIntervalMomentum(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(d dVar, int i) {
        if (i > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
        } else {
            i = 0;
            dVar.setHorizontalFadingEdgeEnabled(false);
        }
        dVar.setFadingEdgeLength(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z) {
        v.c(dVar, z);
    }

    @com.facebook.react.uimanager.e1.a(name = "overScrollMode")
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(g.a(str));
    }

    @com.facebook.react.uimanager.e1.a(name = "overflow")
    public void setOverflow(d dVar, String str) {
        dVar.setOverflow(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "pagingEnabled")
    public void setPagingEnabled(d dVar, boolean z) {
        dVar.setPagingEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(d dVar, boolean z) {
        dVar.setScrollbarFadingEnabled(!z);
    }

    @com.facebook.react.uimanager.e1.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z) {
        dVar.setRemoveClippedSubviews(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z) {
        dVar.setSendMomentumEvents(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z) {
        dVar.setHorizontalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToEnd")
    public void setSnapToEnd(d dVar, boolean z) {
        dVar.setSnapToEnd(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToInterval")
    public void setSnapToInterval(d dVar, float f2) {
        dVar.setSnapInterval((int) (f2 * com.facebook.react.uimanager.c.a().density));
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, ReadableArray readableArray) {
        DisplayMetrics a2 = com.facebook.react.uimanager.c.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * a2.density)));
        }
        dVar.setSnapOffsets(arrayList);
    }

    @com.facebook.react.uimanager.e1.a(name = "snapToStart")
    public void setSnapToStart(d dVar, boolean z) {
        dVar.setSnapToStart(z);
    }
}
