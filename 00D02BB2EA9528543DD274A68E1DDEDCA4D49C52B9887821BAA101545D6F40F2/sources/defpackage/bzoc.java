package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzoc  reason: default package */
/* loaded from: classes4.dex */
public class bzoc implements bzoe, bzml {
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    public final cjqy a;
    private final crnh c;
    private final btvo d;
    private final bvrb e;
    private final cjqq f;
    private final bzmm g;
    @dzsi
    private bzod h;
    private boolean i = false;

    public bzoc(crnh crnhVar, btvo btvoVar, bvrb bvrbVar, cjqy cjqyVar, cjqq cjqqVar, bzmm bzmmVar) {
        this.c = crnhVar;
        this.d = btvoVar;
        this.e = bvrbVar;
        this.a = cjqyVar;
        this.f = cjqqVar;
        this.g = bzmmVar;
    }

    @Override // defpackage.bzml
    public dqkc a() {
        return dqkc.ENROUTE_FAB;
    }

    @Override // defpackage.bzml
    public bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public boolean d() {
        bzod bzodVar = this.h;
        return bzodVar != null && bzodVar.g().booleanValue() && this.d.getEnrouteParameters().j;
    }

    @Override // defpackage.bzml
    public bzmk e() {
        return this.g.b(a()) != bzmk.VISIBLE ? bzmk.VISIBLE : bzmk.NONE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED) {
            cjqp g = this.f.g();
            cjta b2 = cjtd.b();
            b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            b2.d = dtxw.bU;
            g.d(b2.a());
            cjqp g2 = this.f.g();
            cjta b3 = cjtd.b();
            b3.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            b3.d = dtxw.bW;
            g2.d(b3.a());
            cjqp g3 = this.f.g();
            cjta b4 = cjtd.b();
            b4.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            b4.d = dtxw.bV;
            g3.d(b4.a());
            return true;
        }
        m(true);
        this.e.a(new Runnable(this) { // from class: bzob
            private final bzoc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bzoc bzocVar = this.a;
                bvrj.UI_THREAD.c();
                if (bzocVar.m(false)) {
                    bzocVar.a.m(new cjte(deaf.ACTION_BY_TIMER), cjtd.a(dtxw.bV));
                }
            }
        }, bvrj.UI_THREAD, b);
        return true;
    }

    @Override // defpackage.bzoe
    public void g(bzod bzodVar) {
        this.h = bzodVar;
    }

    @Override // defpackage.bzoe
    public bzml h() {
        return this;
    }

    @Override // defpackage.bzoe
    public Boolean i() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bzoe
    public cqkl j() {
        m(false);
        return cqkl.a;
    }

    @Override // defpackage.bzoe
    public cqkl k() {
        m(false);
        return cqkl.a;
    }

    @Override // defpackage.bzoe
    public Boolean l() {
        bzod bzodVar = this.h;
        return Boolean.valueOf(bzodVar != null ? bzodVar.l().booleanValue() : false);
    }

    @Override // defpackage.bzoe
    public boolean m(boolean z) {
        if (z != this.i) {
            if (z) {
                this.c.a();
            } else {
                this.c.b();
                this.g.f(a());
            }
            this.i = z;
            cqkx.p(this);
            return true;
        }
        return false;
    }

    @Override // defpackage.bzoe
    public void n() {
        if (this.i) {
            this.c.a();
        }
    }

    @Override // defpackage.bzoe
    public void o() {
        this.c.b();
    }
}
