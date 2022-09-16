package com.facebook.react.flat;

import android.graphics.Rect;
import com.facebook.react.bridge.an;
/* compiled from: RCTView.java */
/* loaded from: classes.dex */
final class ac extends q {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f3374d = {8, 0, 2, 1, 3};
    private g e;
    private Rect f;

    @Override // com.facebook.react.flat.q
    public void setBackgroundColor(int i) {
        f().f(i);
    }

    @Override // com.facebook.react.uimanager.g
    public void setBorderWidths(int i, float f) {
        super.setBorderWidths(i, f);
        f().a(f3374d[i], com.facebook.react.uimanager.o.a(f));
    }

    @com.facebook.react.uimanager.a.a(a = "nativeBackgroundAndroid")
    public void setHotspot(an anVar) {
        if (anVar != null) {
            d();
        }
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"}, b = "Color", d = Double.NaN)
    public void setBorderColor(int i, double d2) {
        int i2 = f3374d[i];
        if (Double.isNaN(d2)) {
            f().e(i2);
        } else {
            f().a(i2, (int) d2);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderRadius")
    public void setBorderRadius(float f) {
        this.f3411b = f;
        if (this.f3412c && f > 0.5f) {
            d();
        }
        f().b(com.facebook.react.uimanager.o.a(f));
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(String str) {
        f().a(str);
    }

    @com.facebook.react.uimanager.a.a(a = "hitSlop")
    public void setHitSlop(an anVar) {
        if (anVar == null) {
            this.f = null;
        } else {
            this.f = new Rect((int) com.facebook.react.uimanager.o.a(anVar.getDouble("left")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("top")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("right")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("bottom")));
        }
    }

    @com.facebook.react.uimanager.a.a(a = "pointerEvents")
    public void setPointerEvents(String str) {
        d();
    }

    private g f() {
        if (this.e == null) {
            this.e = new g();
        } else if (this.e.m()) {
            this.e = (g) this.e.l();
        }
        b();
        return this.e;
    }
}
