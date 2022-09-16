package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mht  reason: default package */
/* loaded from: classes7.dex */
public final class mht extends nor {
    public static final /* synthetic */ int k = 0;
    private static final cjsz l = new cjsz(dtxm.aU);
    public final hwe a;
    public final noo b;
    public final ncm c;
    public final mpk d;
    public final kpj e;
    public ldm f;
    public boolean g;
    public boolean h;
    final ksu i;
    public final crzp<ldm> j;
    private final not m;
    private final asmp n;
    private final cqkf<mot> o;
    private final kxs p;
    private final Executor q;
    private final bvrb r;
    private final mpj s;

    public mht(cqkj cqkjVar, not notVar, hwe hweVar, kxu kxuVar, noo nooVar, ncm ncmVar, asmp asmpVar, dndr dndrVar, kdi kdiVar, nop nopVar, nov novVar, kpj kpjVar, btpc btpcVar, kcv kcvVar, Executor executor, bvrb bvrbVar, cjqy cjqyVar, cjqq cjqqVar, btvo btvoVar) {
        super(cjqyVar, cjqqVar);
        this.i = new mhq(this);
        mhr mhrVar = new mhr(this);
        this.s = mhrVar;
        this.j = new mhs(this);
        dbsk.l(false);
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.l(z);
        this.m = notVar;
        this.a = hweVar;
        dbsk.s(nooVar);
        this.b = nooVar;
        this.c = ncmVar;
        dbsk.s(asmpVar);
        this.n = asmpVar;
        ldm l2 = kpjVar.d().l();
        dbsk.s(l2);
        this.f = l2;
        this.e = kpjVar;
        this.q = executor;
        dbsk.s(bvrbVar);
        this.r = bvrbVar;
        this.d = new mpk(cqkjVar, mhrVar, dndrVar, kdiVar, nopVar, novVar, kpjVar, btpcVar, kcvVar, executor, btvoVar);
        cqkf<mot> d = cqkjVar.d(new mjh(), notVar.a(), false);
        this.o = d;
        View c = d.c();
        kxn k2 = kxo.k();
        k2.k();
        this.p = new kxs(c, k2, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.o.e(this.d);
        this.e.d().d(this.j, this.q);
    }

    @Override // defpackage.non
    public final noq b() {
        s(l);
        this.g = true;
        kxn kxnVar = this.p.b;
        kxnVar.g(true);
        kxnVar.e(true);
        kxnVar.c();
        kxnVar.h();
        this.p.a();
        k();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.o.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.p.b();
        this.n.q();
        this.g = false;
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.a.c();
        this.d.i();
        this.r.b(new Runnable(this) { // from class: mhp
            private final mht a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mht mhtVar = this.a;
                mhtVar.e.d().c(mhtVar.j);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.non
    public final String g() {
        return "HomeWorkEditOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.m.b(noeVar, this.o.c());
    }

    public final void k() {
        akqq o = this.f.o();
        if (o != null) {
            this.n.p(Collections.singletonList(akra.f(o)), false, false, 1, false);
        }
    }

    public final void l() {
        cqkx.p(this.d);
    }
}
