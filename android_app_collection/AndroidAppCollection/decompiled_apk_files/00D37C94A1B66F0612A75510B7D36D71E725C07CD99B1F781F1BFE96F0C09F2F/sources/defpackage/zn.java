package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zn  reason: default package */
/* loaded from: classes4.dex */
public abstract class zn extends xs {
    boolean k = true;

    public abstract boolean e(yo yoVar);

    public abstract boolean f(yo yoVar, yo yoVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(yo yoVar, int i, int i2, int i3, int i4);

    public abstract boolean h(yo yoVar);

    @Override // defpackage.xs
    public final boolean o(yo yoVar, xr xrVar, xr xrVar2) {
        int i;
        int i2;
        if (xrVar == null || ((i = xrVar.a) == (i2 = xrVar2.a) && xrVar.b == xrVar2.b)) {
            return e(yoVar);
        }
        return g(yoVar, i, xrVar.b, i2, xrVar2.b);
    }

    @Override // defpackage.xs
    public final boolean p(yo yoVar, yo yoVar2, xr xrVar, xr xrVar2) {
        int i;
        int i2;
        int i3 = xrVar.a;
        int i4 = xrVar.b;
        if (yoVar2.A()) {
            int i5 = xrVar.a;
            i2 = xrVar.b;
            i = i5;
        } else {
            i = xrVar2.a;
            i2 = xrVar2.b;
        }
        return f(yoVar, yoVar2, i3, i4, i, i2);
    }

    @Override // defpackage.xs
    public final boolean q(yo yoVar, xr xrVar, xr xrVar2) {
        int i;
        int i2;
        int i3 = xrVar.a;
        int i4 = xrVar.b;
        View view = yoVar.a;
        if (xrVar2 == null) {
            i = view.getLeft();
        } else {
            i = xrVar2.a;
        }
        int i5 = i;
        if (xrVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = xrVar2.b;
        }
        int i6 = i2;
        if (!yoVar.v() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return g(yoVar, i3, i4, i5, i6);
        }
        return h(yoVar);
    }

    @Override // defpackage.xs
    public final boolean r(yo yoVar, xr xrVar, xr xrVar2) {
        int i = xrVar.a;
        int i2 = xrVar2.a;
        if (i != i2 || xrVar.b != xrVar2.b) {
            return g(yoVar, i, xrVar.b, i2, xrVar2.b);
        }
        l(yoVar);
        return false;
    }

    @Override // defpackage.xs
    public final boolean s(yo yoVar) {
        return !this.k || yoVar.t();
    }

    public final void x() {
        this.k = false;
    }
}
