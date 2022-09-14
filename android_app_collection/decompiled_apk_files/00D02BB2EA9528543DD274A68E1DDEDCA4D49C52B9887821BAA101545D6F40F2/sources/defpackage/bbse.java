package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: bbse  reason: default package */
/* loaded from: classes3.dex */
public final class bbse extends bbtl {
    public Long a;
    public dbsg<String> b;
    public String c;
    private String d;
    private Long e;
    private dddn f;
    private String g;
    private dcep<dwye> h;
    private dbsg<Integer> i;
    private dbsg<Integer> j;
    private dbsg<Integer> k;
    private dbsg<Long> l;
    private dbsg<String> m;
    private crtx n;
    private dbsg<bbti> o;
    private dbsg<akqq> p;
    private dbsg<String> q;
    private dbsg<String> r;
    private bvrt<dfxs> s;

    public bbse() {
        this.i = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
        this.l = dbpy.a;
        this.m = dbpy.a;
        this.o = dbpy.a;
        this.p = dbpy.a;
        this.q = dbpy.a;
        this.b = dbpy.a;
        this.r = dbpy.a;
    }

    public bbse(bbtm bbtmVar) {
        this.i = dbpy.a;
        this.j = dbpy.a;
        this.k = dbpy.a;
        this.l = dbpy.a;
        this.m = dbpy.a;
        this.o = dbpy.a;
        this.p = dbpy.a;
        this.q = dbpy.a;
        this.b = dbpy.a;
        this.r = dbpy.a;
        bbsf bbsfVar = (bbsf) bbtmVar;
        this.d = bbsfVar.a;
        this.a = bbsfVar.b;
        this.e = bbsfVar.c;
        this.f = bbsfVar.d;
        this.g = bbsfVar.e;
        this.h = bbsfVar.f;
        this.i = bbsfVar.g;
        this.j = bbsfVar.h;
        this.k = bbsfVar.i;
        this.l = bbsfVar.j;
        this.m = bbsfVar.k;
        this.n = bbsfVar.l;
        this.o = bbsfVar.m;
        this.p = bbsfVar.n;
        this.q = bbsfVar.o;
        this.b = bbsfVar.p;
        this.r = bbsfVar.q;
        this.c = bbsfVar.r;
        this.s = bbsfVar.s;
    }

    @Override // defpackage.bbtl
    public final void b(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null caption");
    }

    @Override // defpackage.bbtl
    public final void c(@dzsi Long l) {
        this.a = l;
    }

    @Override // defpackage.bbtl
    public final void d(Long l) {
        this.l = dbsg.i(l);
    }

    @Override // defpackage.bbtl
    public final void e(dbsg<String> dbsgVar) {
        this.r = dbsgVar;
    }

    @Override // defpackage.bbtl
    public final void f(String str) {
        this.r = dbsg.i(str);
    }

    @Override // defpackage.bbtl
    public final void g(bbti bbtiVar) {
        this.o = dbsg.i(bbtiVar);
    }

    @Override // defpackage.bbtl
    public final void h(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null imageUriString");
    }

    @Override // defpackage.bbtl
    public final void i(akqq akqqVar) {
        this.p = dbsg.i(akqqVar);
    }

    @Override // defpackage.bbtl
    public final void j(dbsg<String> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.bbtl
    public final void k(String str) {
        this.m = dbsg.i(str);
    }

    @Override // defpackage.bbtl
    public final void l(@dzsi bvrt<dfxs> bvrtVar) {
        this.s = bvrtVar;
    }

    @Override // defpackage.bbtl
    public final void m(Set<dwye> set) {
        this.h = dcep.K(set);
    }

    @Override // defpackage.bbtl
    public final void n(Integer num) {
        this.k = dbsg.i(num);
    }

    @Override // defpackage.bbtl
    public final void o(String str) {
        this.q = dbsg.i(str);
    }

    @Override // defpackage.bbtl
    public final void p(Integer num) {
        this.j = dbsg.i(num);
    }

    @Override // defpackage.bbtl
    public final void q(Integer num) {
        this.i = dbsg.i(num);
    }

    @Override // defpackage.bbtl
    public final void r(dddn dddnVar) {
        if (dddnVar != null) {
            this.f = dddnVar;
            return;
        }
        throw new NullPointerException("Null selectionSource");
    }

    @Override // defpackage.bbtl
    public final void s(crtx crtxVar) {
        if (crtxVar != null) {
            this.n = crtxVar;
            return;
        }
        throw new NullPointerException("Null uploadStatus");
    }

    @Override // defpackage.bbtl
    public final void t(@dzsi Long l) {
        this.e = l;
    }

    @Override // defpackage.bbtl
    public final bbtm a() {
        String str = this.d == null ? " imageUriString" : "";
        if (this.f == null) {
            str = str.concat(" selectionSource");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" caption");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" modifications");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" uploadStatus");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" originalUriString");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsf(this.d, this.a, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.b, this.r, this.c, this.s);
    }
}
