package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wuf  reason: default package */
/* loaded from: classes7.dex */
public final class wuf extends wuq {
    public amuk a;
    public Intent b;
    public cjta c;
    public String d;
    public dgas e;
    public dquj f;
    public wur g;
    public wus h;
    public drgz i;
    public wup j;
    public String k;
    public String l;
    public String m;
    public wuu n;
    public int o;
    private String p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Integer t;
    private dpej u;

    public wuf() {
    }

    public wuf(wuv wuvVar) {
        wug wugVar = (wug) wuvVar;
        this.p = wugVar.a;
        this.a = wugVar.b;
        this.b = wugVar.c;
        this.c = wugVar.d;
        this.q = Boolean.valueOf(wugVar.e);
        this.d = wugVar.f;
        this.e = wugVar.g;
        this.f = wugVar.h;
        this.r = Boolean.valueOf(wugVar.i);
        this.g = wugVar.j;
        this.h = wugVar.k;
        this.i = wugVar.l;
        this.j = wugVar.m;
        this.k = wugVar.n;
        this.l = wugVar.o;
        this.s = Boolean.valueOf(wugVar.p);
        this.m = wugVar.q;
        this.o = wugVar.u;
        this.n = wugVar.r;
        this.t = Integer.valueOf(wugVar.s);
        this.u = wugVar.t;
    }

    @Override // defpackage.wuq
    public final void b(int i) {
        this.t = Integer.valueOf(i);
    }

    @Override // defpackage.wuq
    public final void c(dpej dpejVar) {
        if (dpejVar != null) {
            this.u = dpejVar;
            return;
        }
        throw new NullPointerException("Null drivingDelayCategory");
    }

    @Override // defpackage.wuq
    public final void d(@dzsi dquj dqujVar) {
        this.f = dqujVar;
    }

    @Override // defpackage.wuq
    public final void e(boolean z) {
        this.r = Boolean.valueOf(z);
    }

    @Override // defpackage.wuq
    public final void f(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.wuq
    public final void g(String str) {
        if (str != null) {
            this.p = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.wuq
    public final void h(boolean z) {
        this.s = Boolean.valueOf(z);
    }

    @Override // defpackage.wuq
    public final void i(int i) {
        this.o = i;
    }

    @Override // defpackage.wuq
    public final void j(@dzsi dgas dgasVar) {
        this.e = dgasVar;
    }

    @Override // defpackage.wuq
    public final wuv a() {
        String str = this.p == null ? " name" : "";
        if (this.a == null) {
            str = str.concat(" serviceProvider");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" isRickshaw");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" isGoogleConfidential");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" showAdLabel");
        }
        if (this.o == 0) {
            str = String.valueOf(str).concat(" tripEstimateStatus");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" directionsTripIndex");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" drivingDelayCategory");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new wug(this.p, this.a, this.b, this.c, this.q.booleanValue(), this.d, this.e, this.f, this.r.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l, this.s.booleanValue(), this.m, this.o, this.n, this.t.intValue(), this.u);
    }
}
