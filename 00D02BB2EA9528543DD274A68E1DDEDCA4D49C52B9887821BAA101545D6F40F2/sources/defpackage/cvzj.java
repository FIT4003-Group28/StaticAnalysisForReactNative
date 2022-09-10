package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cvzj  reason: default package */
/* loaded from: classes.dex */
public final class cvzj<T> extends cvzd<T> {
    public cvzg<T> b;
    public cwjs<T> c;
    public cwjw<T> d;
    public Class<T> e;
    public Boolean f;
    public cwfn g;
    public cskk h;
    private cvyw<T> i;
    private cwdt<T> j;
    private cwdl k;
    private dbsg<cvzn> l;
    private cvuu<T> m;
    private ExecutorService n;
    private cwla o;
    private cwkn p;

    public cvzj() {
        this.l = dbpy.a;
    }

    public cvzj(cvze<T> cvzeVar) {
        this.l = dbpy.a;
        cvzk cvzkVar = (cvzk) cvzeVar;
        this.b = cvzkVar.a;
        this.g = cvzkVar.n;
        this.i = cvzkVar.b;
        this.j = cvzkVar.c;
        this.c = cvzkVar.d;
        this.d = cvzkVar.e;
        this.k = cvzkVar.f;
        this.l = cvzkVar.g;
        this.m = cvzkVar.h;
        this.e = cvzkVar.i;
        this.n = cvzkVar.j;
        this.h = cvzkVar.o;
        this.o = cvzkVar.k;
        this.p = cvzkVar.l;
        this.f = Boolean.valueOf(cvzkVar.m);
    }

    @Override // defpackage.cvzd
    public final dbsg<cwjs<T>> a() {
        cwjs<T> cwjsVar = this.c;
        return cwjsVar == null ? dbpy.a : dbsg.i(cwjsVar);
    }

    @Override // defpackage.cvzd
    public final cvzg<T> b() {
        cvzg<T> cvzgVar = this.b;
        if (cvzgVar != null) {
            return cvzgVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    @Override // defpackage.cvzd
    public final dbsg<cvyw<T>> c() {
        cvyw<T> cvywVar = this.i;
        return cvywVar == null ? dbpy.a : dbsg.i(cvywVar);
    }

    @Override // defpackage.cvzd
    public final cwdt<T> d() {
        cwdt<T> cwdtVar = this.j;
        if (cwdtVar != null) {
            return cwdtVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    @Override // defpackage.cvzd
    public final dbsg<ExecutorService> e() {
        ExecutorService executorService = this.n;
        return executorService == null ? dbpy.a : dbsg.i(executorService);
    }

    @Override // defpackage.cvzd
    public final cwkn f() {
        cwkn cwknVar = this.p;
        if (cwknVar != null) {
            return cwknVar;
        }
        throw new IllegalStateException("Property \"oneGoogleStreamz\" has not been set");
    }

    @Override // defpackage.cvzd
    public final cwjw<T> h() {
        cwjw<T> cwjwVar = this.d;
        if (cwjwVar != null) {
            return cwjwVar;
        }
        throw new IllegalStateException("Property \"oneGoogleEventLogger\" has not been set");
    }

    @Override // defpackage.cvzd
    public final dbsg<cvzn> i() {
        return this.l;
    }

    @Override // defpackage.cvzd
    public final cwfn l() {
        cwfn cwfnVar = this.g;
        if (cwfnVar != null) {
            return cwfnVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    @Override // defpackage.cvzd
    public final cskk m() {
        return this.h;
    }

    @Override // defpackage.cvzd
    public final void n(cvuu<T> cvuuVar) {
        this.m = cvuuVar;
    }

    @Override // defpackage.cvzd
    public final void o(ExecutorService executorService) {
        if (executorService != null) {
            this.n = executorService;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }

    @Override // defpackage.cvzd
    public final void p(cvyw<T> cvywVar) {
        if (cvywVar != null) {
            this.i = cvywVar;
            return;
        }
        throw new NullPointerException("Null clickListeners");
    }

    @Override // defpackage.cvzd
    public final void q(cwdl cwdlVar) {
        if (cwdlVar != null) {
            this.k = cwdlVar;
            return;
        }
        throw new NullPointerException("Null configuration");
    }

    @Override // defpackage.cvzd
    public final void r(cwdt<T> cwdtVar) {
        if (cwdtVar != null) {
            this.j = cwdtVar;
            return;
        }
        throw new NullPointerException("Null features");
    }

    @Override // defpackage.cvzd
    public final void s(cvzn cvznVar) {
        this.l = dbsg.j(cvznVar);
    }

    @Override // defpackage.cvzd
    public final void t(cwjw<T> cwjwVar) {
        this.d = cwjwVar;
    }

    @Override // defpackage.cvzd
    public final void u(cwkn cwknVar) {
        this.p = cwknVar;
    }

    @Override // defpackage.cvzd
    public final void v(cwla cwlaVar) {
        if (cwlaVar != null) {
            this.o = cwlaVar;
            return;
        }
        throw new NullPointerException("Null visualElements");
    }

    @Override // defpackage.cvzd
    public final boolean g() {
        Boolean bool = this.f;
        if (bool == null) {
            throw new IllegalStateException("Property \"useNoopStreamzLogger\" has not been set");
        }
        return bool.booleanValue();
    }

    @Override // defpackage.cvzd
    public final cvze<T> j() {
        String str = this.b == null ? " accountsModel" : "";
        if (this.g == null) {
            str = str.concat(" accountConverter");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" clickListeners");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" features");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" oneGoogleEventLogger");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" configuration");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" avatarImageLoader");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" accountClass");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" backgroundExecutor");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" visualElements");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" oneGoogleStreamz");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" useNoopStreamzLogger");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvzk(this.b, this.g, this.i, this.j, this.c, this.d, this.k, this.l, this.m, this.e, this.n, this.h, this.o, this.p, this.f.booleanValue());
    }
}
