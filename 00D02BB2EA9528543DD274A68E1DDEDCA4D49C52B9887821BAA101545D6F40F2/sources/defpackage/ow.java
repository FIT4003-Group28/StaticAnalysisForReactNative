package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: ow  reason: default package */
/* loaded from: classes.dex */
public class ow {
    public static final ow a;
    private final ov b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = ou.b;
        } else {
            a = ov.c;
        }
    }

    public ow(ow owVar) {
        this.b = new ov(this);
    }

    public static ow a(WindowInsets windowInsets) {
        return b(windowInsets, null);
    }

    public static ow b(WindowInsets windowInsets, View view) {
        nb.b(windowInsets);
        ow owVar = new ow(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            owVar.r(od.R(view));
            owVar.s(view.getRootView());
        }
        return owVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kd q(kd kdVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, kdVar.b - i);
        int max2 = Math.max(0, kdVar.c - i2);
        int max3 = Math.max(0, kdVar.d - i3);
        int max4 = Math.max(0, kdVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? kdVar : kd.a(max, max2, max3, max4);
    }

    @Deprecated
    public int c() {
        return this.b.b().b;
    }

    @Deprecated
    public int d() {
        return this.b.b().c;
    }

    @Deprecated
    public int e() {
        return this.b.b().d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ow) {
            return Objects.equals(this.b, ((ow) obj).b);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.b.b().e;
    }

    public boolean g() {
        return this.b.f();
    }

    @Deprecated
    public ow h() {
        return this.b.h();
    }

    public int hashCode() {
        ov ovVar = this.b;
        if (ovVar == null) {
            return 0;
        }
        return ovVar.hashCode();
    }

    @Deprecated
    public ow i(int i, int i2, int i3, int i4) {
        op omVar;
        if (Build.VERSION.SDK_INT >= 30) {
            omVar = new oo(this);
        } else if (Build.VERSION.SDK_INT >= 29) {
            omVar = new on(this);
        } else {
            omVar = new om(this);
        }
        ol.b(kd.a(i, i2, i3, i4), omVar);
        return ol.a(omVar);
    }

    @Deprecated
    public ow j() {
        return this.b.g();
    }

    @Deprecated
    public ow k() {
        return this.b.k();
    }

    @Deprecated
    public kd l() {
        return this.b.b();
    }

    @Deprecated
    public kd m() {
        return this.b.m();
    }

    @Deprecated
    public kd n() {
        return this.b.l();
    }

    public ow o(int i, int i2, int i3, int i4) {
        return this.b.c(i, i2, i3, i4);
    }

    public WindowInsets p() {
        ov ovVar = this.b;
        if (ovVar instanceof oq) {
            return ((oq) ovVar).a;
        }
        return null;
    }

    public void r(ow owVar) {
        this.b.e();
    }

    public void s(View view) {
        this.b.d(view);
    }

    private ow(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new ou(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new ot(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new os(this, windowInsets);
        } else {
            this.b = new or(this, windowInsets);
        }
    }
}
