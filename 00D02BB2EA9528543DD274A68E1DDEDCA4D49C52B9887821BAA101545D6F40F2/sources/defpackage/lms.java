package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lms  reason: default package */
/* loaded from: classes7.dex */
public final class lms extends nor {
    private final lwq a;
    private final cjsz b;
    private final not c;
    private final cqkf<lne> d;
    private final lnf e;
    private final kxs f;

    public lms(cqkj cqkjVar, noo nooVar, lwq lwqVar, jzp jzpVar, btrm btrmVar, lzf lzfVar, cjqy cjqyVar, cjqq cjqqVar, String str, not notVar, kxu kxuVar) {
        super(cjqyVar, cjqqVar);
        this.b = new cjsz(dtxm.bM);
        this.a = lwqVar;
        this.c = notVar;
        cqkf<lne> c = cqkjVar.c(new lnd(), null);
        this.d = c;
        this.e = new lnf(nooVar, jzpVar, btrmVar, lzfVar, str);
        View c2 = c.c();
        kxn k = kxo.k();
        k.k();
        this.f = new kxs(c2, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.d.e(this.e);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        s(this.b);
        this.a.q(lwo.SMALL);
        this.a.s(true);
        this.f.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.d.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.f.b();
        this.a.s(false);
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
    }

    @Override // defpackage.non
    public final String g() {
        return "ExitNavigationOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, this.d.c());
    }
}
