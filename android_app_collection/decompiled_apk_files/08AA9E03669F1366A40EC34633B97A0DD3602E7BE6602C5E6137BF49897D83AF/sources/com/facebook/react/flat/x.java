package com.facebook.react.flat;

import com.facebook.f.e.o;
import com.facebook.react.bridge.am;
import com.facebook.react.flat.b;
import com.facebook.react.flat.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RCTImageView.java */
/* loaded from: classes.dex */
public class x<T extends b & j> extends q {

    /* renamed from: d  reason: collision with root package name */
    static Object f3433d = x.class;
    private T e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f() {
        return f3433d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(T t) {
        this.e = t;
    }

    @com.facebook.react.uimanager.a.a(a = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(boolean z) {
        g().b(z ? getReactTag() : 0);
    }

    @com.facebook.react.uimanager.a.a(a = "src")
    public void setSource(am amVar) {
        g().a(getThemedContext(), amVar);
    }

    @com.facebook.react.uimanager.a.a(a = "tintColor")
    public void setTintColor(int i) {
        g().a(i);
    }

    @com.facebook.react.uimanager.a.a(a = "resizeMode")
    public void setResizeMode(String str) {
        o.b a2 = com.facebook.react.views.image.d.a(str);
        if (this.e.b() != a2) {
            g().a(a2);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderColor", b = "Color")
    public void setBorderColor(int i) {
        if (this.e.e() != i) {
            g().c(i);
        }
    }

    @Override // com.facebook.react.uimanager.x
    public void setBorder(int i, float f) {
        super.setBorder(i, f);
        if (i != 8 || this.e.c() == f) {
            return;
        }
        g().a(f);
    }

    @com.facebook.react.uimanager.a.a(a = "borderRadius")
    public void setBorderRadius(float f) {
        if (this.e.d() != f) {
            g().b(com.facebook.react.uimanager.o.a(f));
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fadeDuration")
    public void setFadeDuration(int i) {
        g().d(i);
    }

    @com.facebook.react.uimanager.a.a(a = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(boolean z) {
        g().a(z);
    }

    private T g() {
        if (this.e.m()) {
            this.e = (T) this.e.l();
            b();
        }
        return this.e;
    }
}
