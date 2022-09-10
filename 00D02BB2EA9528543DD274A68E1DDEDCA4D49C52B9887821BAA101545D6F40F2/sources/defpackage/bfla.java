package defpackage;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfla  reason: default package */
/* loaded from: classes3.dex */
public class bfla implements jbp {
    public final cjqy a;
    public final ilo b;
    public final dwfl c;
    public final iys d;
    public final bmea e;
    public final cjqq f;
    public final ni g;
    public final ckmm h;
    final GestureDetector.SimpleOnGestureListener i;
    public cjtd j;
    private final jic k;
    @dzsi
    private final cqtd l;
    private cqtv m;

    public bfla(Activity activity, cqhn cqhnVar, cqhu cqhuVar, cjqq cjqqVar, ckmm ckmmVar, cjqy cjqyVar, bfkf bfkfVar, dwfl dwflVar, int i, ilo iloVar, bmea bmeaVar, ddho ddhoVar, boolean z, @dzsi ckql ckqlVar) {
        ckqd b;
        bfkx bfkxVar = new bfkx(this);
        this.i = bfkxVar;
        this.m = cqrp.d(dcyn.a);
        this.a = cjqyVar;
        this.b = iloVar;
        this.c = dwflVar;
        this.e = bmeaVar;
        this.f = cjqqVar;
        this.h = ckmmVar;
        this.g = new ni(activity, bfkxVar);
        cjta b2 = cjtd.b();
        b2.b = dwflVar.b;
        b2.g(dwflVar.c);
        b2.i(i);
        b2.d = ddhoVar;
        this.j = b2.a();
        iys iysVar = new iys();
        this.d = iysVar;
        if (z) {
            iysVar.a(true);
        }
        if (ckob.b(dwflVar)) {
            b = new cknd(dwflVar);
        } else {
            b = jfv.b(dwflVar);
        }
        cqtd cqtdVar = null;
        this.k = new jic(dwflVar.h, b, z ? irg.e() : null, true != z ? 0 : 100, new bfkz(this), ckqlVar);
        this.l = cknv.f(dwflVar) ? cqrt.f(2131231803) : cqtdVar;
    }

    @Override // defpackage.jbp
    public jic a() {
        return this.k;
    }

    @Override // defpackage.jbp
    public jbu b() {
        return this.d;
    }

    @Override // defpackage.jbp
    public cqtv c() {
        return this.m;
    }

    @Override // defpackage.jbp
    @dzsi
    public View.OnTouchListener d() {
        return new bfky(this);
    }

    @Override // defpackage.jbp
    @dzsi
    public cqtd e() {
        return this.l;
    }

    public void f(ddho ddhoVar, dbsg<ddho> dbsgVar) {
        if (dbsgVar.a() && cknv.f(this.c)) {
            ddhoVar = dbsgVar.b();
        }
        cjta c = cjtd.c(this.j);
        c.d = ddhoVar;
        this.j = c.a();
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new gtt(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.j;
    }
}
