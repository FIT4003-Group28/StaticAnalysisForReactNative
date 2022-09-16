package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: xjz  reason: default package */
/* loaded from: classes4.dex */
public final class xjz implements xfk, xhr, ahku {
    public xig a;
    private final xih b;
    private xjw c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private final Resources h;

    public xjz(Resources resources, acti actiVar, wzx wzxVar) {
        this.h = resources;
        xih xihVar = new xih(actiVar, wzxVar);
        this.b = xihVar;
        xihVar.c(this);
    }

    private final void o() {
        xjw xjwVar = this.c;
        if (xjwVar == null || this.a == null) {
            return;
        }
        xjwVar.b = new xjy(this);
    }

    @Override // defpackage.xhr
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    @Override // defpackage.xhr
    public final void b() {
    }

    @Override // defpackage.xhr
    public final void c(int i) {
    }

    @Override // defpackage.xhr
    public final void d(int i) {
        xjw xjwVar = this.c;
        if (xjwVar != null) {
            xjwVar.d(i);
        }
        this.e = i;
    }

    @Override // defpackage.xhr
    public final void e(wzr wzrVar) {
    }

    @Override // defpackage.xhr
    public final void f(xdb xdbVar) {
    }

    @Override // defpackage.xhr
    public final void g(float f, int i) {
    }

    @Override // defpackage.xhr
    public final void h(aozw aozwVar) {
    }

    @Override // defpackage.xhr
    public final void i(auwp auwpVar) {
    }

    @Override // defpackage.xhr
    public final void j(int i, boolean z) {
        this.g = i;
        if (z) {
            n(false);
        } else if (i == 0) {
            n(true);
            xjw xjwVar = this.c;
            if (xjwVar == null) {
                return;
            }
            xjwVar.d(this.e);
        } else if (i == 1) {
            n(true);
            xjw xjwVar2 = this.c;
            if (xjwVar2 == null) {
                return;
            }
            xjwVar2.a();
        } else if (i != 2 && i != 3) {
        } else {
            xjw xjwVar3 = this.c;
            if (xjwVar3 != null) {
                xjwVar3.e(false);
                xjwVar3.a.e(0);
                xjx xjxVar = xjwVar3.a;
                xjxVar.l = true;
                xjxVar.d(false);
            }
            this.d = false;
            this.e = 0;
            n(false);
        }
    }

    @Override // defpackage.xhr
    public final void k(float f) {
    }

    @Override // defpackage.xhr
    public final void l(xho xhoVar, boolean z, int i) {
    }

    public final void m(xjw xjwVar) {
        this.c = xjwVar;
        if (xjwVar != null) {
            o();
            this.c.e(this.d);
            this.c.d(this.e);
            this.c.b(this.f);
            boolean z = true;
            if (this.g == 1) {
                this.c.a();
            }
            int i = this.g;
            if (i != 0 && i != 1) {
                z = false;
            }
            n(z);
        }
    }

    public final void n(boolean z) {
        xjw xjwVar = this.c;
        if (xjwVar != null) {
            xjwVar.a.l = !z;
        }
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        this.a = xigVar;
        o();
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        m(new xjw(this.h, new Handler(Looper.getMainLooper()), ahobVar.a(), ahofVar, ahobVar));
        ahobVar.d(this.c);
    }

    @Override // defpackage.ahku
    public final void qU() {
        m(null);
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        boolean z = xguVar.a;
        xjw xjwVar = this.c;
        if (xjwVar != null) {
            xjwVar.e(z);
        }
        this.d = z;
        int i = xguVar.e.a;
        if (this.f != i) {
            xjw xjwVar2 = this.c;
            if (xjwVar2 != null) {
                xjwVar2.b(i);
            }
            this.f = i;
        }
        this.b.e(xguVar.c, xguVar.a);
    }
}
