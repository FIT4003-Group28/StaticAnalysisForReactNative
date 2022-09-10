package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: nlt  reason: default package */
/* loaded from: classes7.dex */
public final class nlt extends nlv {
    public String a;
    public akqq b;
    public amvh c;
    public String d;
    public Intent e;
    public dpej f;
    public String g;
    public ddjr h;
    public Integer i;
    private Boolean j;
    private Integer k;
    private String l;
    private Integer m;
    private dowa n;
    private dcdc<akqq> o;
    private dpjs p;

    public nlt() {
    }

    public nlt(nlw nlwVar) {
        nlu nluVar = (nlu) nlwVar;
        this.a = nluVar.a;
        this.b = nluVar.b;
        this.c = nluVar.c;
        this.d = nluVar.d;
        this.e = nluVar.e;
        this.j = Boolean.valueOf(nluVar.f);
        this.k = Integer.valueOf(nluVar.g);
        this.l = nluVar.h;
        this.m = Integer.valueOf(nluVar.i);
        this.n = nluVar.j;
        this.f = nluVar.k;
        this.g = nluVar.l;
        this.o = nluVar.m;
        this.h = nluVar.n;
        this.i = Integer.valueOf(nluVar.o);
        this.p = nluVar.p;
    }

    @Override // defpackage.nlv
    public final void b(int i) {
        this.m = Integer.valueOf(i);
    }

    @Override // defpackage.nlv
    public final void c(dowa dowaVar) {
        if (dowaVar != null) {
            this.n = dowaVar;
            return;
        }
        throw new NullPointerException("Null distanceUnit");
    }

    @Override // defpackage.nlv
    public final void d(dpjs dpjsVar) {
        if (dpjsVar != null) {
            this.p = dpjsVar;
            return;
        }
        throw new NullPointerException("Null entityType");
    }

    @Override // defpackage.nlv
    public final void e(int i) {
        this.k = Integer.valueOf(i);
    }

    @Override // defpackage.nlv
    public final void f(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null formattedEta");
    }

    @Override // defpackage.nlv
    public final void g(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.nlv
    public final void h(@dzsi String str) {
        this.g = str;
    }

    @Override // defpackage.nlv
    public final void i(dcdc<akqq> dcdcVar) {
        if (dcdcVar != null) {
            this.o = dcdcVar;
            return;
        }
        throw new NullPointerException("Null waypoints");
    }

    @Override // defpackage.nlv
    public final nlw a() {
        String str = this.a == null ? " title" : "";
        if (this.d == null) {
            str = str.concat(" url");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" intent");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" hasRoute");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" eta");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" formattedEta");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" distance");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" distanceUnit");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" waypoints");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" index");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" entityType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new nlu(this.a, this.b, this.c, this.d, this.e, this.j.booleanValue(), this.k.intValue(), this.l, this.m.intValue(), this.n, this.f, this.g, this.o, this.h, this.i.intValue(), this.p);
    }
}
