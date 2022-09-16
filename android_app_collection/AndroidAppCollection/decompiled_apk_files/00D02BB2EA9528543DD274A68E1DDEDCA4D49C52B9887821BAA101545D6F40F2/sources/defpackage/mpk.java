package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mpk  reason: default package */
/* loaded from: classes7.dex */
public class mpk implements mot {
    private final mpj a;
    private final dndr b;
    private final kdi c;
    private final nop d;
    private final nov e;
    private final kpj f;
    private final btpc g;
    private final kcv h;
    private final btvo i;
    private final mph j;
    private final String k;
    private kpg l;
    private final crzp<kpg> m;

    public mpk(cqkj cqkjVar, mpj mpjVar, dndr dndrVar, kdi kdiVar, nop nopVar, nov novVar, kpj kpjVar, btpc btpcVar, kcv kcvVar, Executor executor, btvo btvoVar) {
        mpi mpiVar = new mpi(this);
        this.m = mpiVar;
        dbsk.s(mpjVar);
        this.a = mpjVar;
        this.b = dndrVar;
        dbsk.s(kdiVar);
        this.c = kdiVar;
        dbsk.s(nopVar);
        this.d = nopVar;
        dbsk.s(novVar);
        this.e = novVar;
        dbsk.s(kpjVar);
        this.f = kpjVar;
        dbsk.s(btpcVar);
        this.g = btpcVar;
        dbsk.s(kcvVar);
        this.h = kcvVar;
        this.i = btvoVar;
        ldm l = kpjVar.d().l();
        dbsk.s(l);
        this.j = new mph(cqkjVar.d, l, dndrVar);
        this.k = cqkjVar.d.getResources().getString(jvn.CAR_ERROR_HOME_WORK_UPDATE_FAILED);
        kpg l2 = kpjVar.c().l();
        dbsk.s(l2);
        this.l = l2;
        kpjVar.c().a(mpiVar, executor);
    }

    @Override // defpackage.mot
    public mos a() {
        return this.j;
    }

    @Override // defpackage.mot
    public cqkl b() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.mot
    public cqkl c() {
        ((mhr) this.a).a.b.a();
        return cqkl.a;
    }

    @Override // defpackage.mot
    public cqkl d() {
        this.a.a();
        boolean z = true;
        if (!this.g.i()) {
            this.h.k(this.k, 1);
        } else {
            kpj kpjVar = this.f;
            if (kpjVar.e.a.l() != kpg.SET) {
                z = false;
            }
            dbsk.l(z);
            kpjVar.e.b(kpg.DELETING);
            kpjVar.f.b(null);
            azva g = kpj.g(kpjVar.c.a(), kpjVar.b);
            if (g == null) {
                dndr dndrVar = kpjVar.b;
                dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
                kpjVar.e.b(kpg.SET);
            } else {
                kpjVar.h(baaq.c(kpjVar.b, g.b, kpjVar.c.a().b(), new kpe(kpjVar.c.a(), kpjVar.d, kpjVar.b, null, null, null, azvb.DELETE)));
            }
        }
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.mot
    public cqkl e() {
        this.e.a();
        if (!this.i.getCarParameters().j) {
            this.d.k(this.c.l(this.b));
        } else {
            this.d.k(this.c.h(this.b));
        }
        this.e.b();
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.mot
    public Boolean f(kpg kpgVar) {
        return Boolean.valueOf(this.l == kpgVar);
    }

    public void g(ldm ldmVar) {
        this.j.d(ldmVar);
    }

    public void h(kpg kpgVar) {
        this.l = kpgVar;
        cqkx.p(this);
    }

    public void i() {
        this.f.c().c(this.m);
    }
}
