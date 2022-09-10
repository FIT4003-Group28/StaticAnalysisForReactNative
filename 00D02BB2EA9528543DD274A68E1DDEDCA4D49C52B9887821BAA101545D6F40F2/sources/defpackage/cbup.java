package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbup  reason: default package */
/* loaded from: classes4.dex */
public class cbup implements cbuo, crzp {
    private final cbrx a;
    private final cbss b;
    private cbuf c = cbuf.UNKNOWN;
    private final cbvn d;
    private final cbvy e;
    @dzsi
    private cqix<? extends cqkp> f;

    public cbup(cbrx cbrxVar, cbss cbssVar, cbvn cbvnVar, cbvy cbvyVar, Executor executor, cqhn cqhnVar) {
        this.a = cbrxVar;
        this.b = cbssVar;
        this.d = cbvnVar;
        this.e = cbvyVar;
        ((cbsb) cbssVar).a.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<cbuf> crzmVar) {
        cbuf l = crzmVar.l();
        if (l == null || this.c.equals(l)) {
            return;
        }
        int ordinal = l.ordinal();
        if (ordinal == 0) {
            this.f = null;
        } else if (ordinal == 1) {
            cbvv cbvvVar = new cbvv();
            cbvy cbvyVar = this.e;
            cbrx cbrxVar = this.a;
            cbss cbssVar = this.b;
            cbvy.a(cbrxVar, 1);
            cbvy.a(cbssVar, 2);
            cqhn a = cbvyVar.a.a();
            cbvy.a(a, 3);
            cbyi a2 = cbvyVar.b.a();
            cbvy.a(a2, 4);
            cbxa a3 = cbvyVar.c.a();
            cbvy.a(a3, 5);
            cbxu a4 = cbvyVar.d.a();
            cbvy.a(a4, 6);
            Executor a5 = cbvyVar.e.a();
            cbvy.a(a5, 7);
            this.f = cqgr.fT(cbvvVar, new cbvx(cbrxVar, cbssVar, a, a2, a3, a4, a5));
        } else if (ordinal == 2) {
            cbvj cbvjVar = new cbvj();
            cbvn cbvnVar = this.d;
            cbrx cbrxVar2 = this.a;
            cbss cbssVar2 = this.b;
            cbvn.a(cbrxVar2, 1);
            cbvn.a(cbssVar2, 2);
            gga a6 = cbvnVar.a.a();
            cbvn.a(a6, 3);
            cbuw a7 = cbvnVar.b.a();
            cbvn.a(a7, 4);
            cbvt a8 = cbvnVar.c.a();
            cbvn.a(a8, 5);
            Executor a9 = cbvnVar.d.a();
            cbvn.a(a9, 6);
            cqhn a10 = cbvnVar.e.a();
            cbvn.a(a10, 7);
            this.f = cqgr.fT(cbvjVar, new cbvm(cbrxVar2, cbssVar2, a6, a7, a8, a9, a10));
        }
        this.c = l;
        cqkx.p(this);
    }

    @Override // defpackage.cbuo
    @dzsi
    public cqix<? extends cqkp> b() {
        return this.f;
    }
}
