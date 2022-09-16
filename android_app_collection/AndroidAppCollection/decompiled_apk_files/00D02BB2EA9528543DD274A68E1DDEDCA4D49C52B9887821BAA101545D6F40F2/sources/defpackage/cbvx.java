package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbvx  reason: default package */
/* loaded from: classes4.dex */
public class cbvx implements cbvw, crzp {
    private final cbrx a;
    private final cbss b;
    private final cbyi c;
    private final cbxa d;
    private final cbxu e;
    @dzsi
    private cqix<? extends cqkp> f;

    public cbvx(cbrx cbrxVar, cbss cbssVar, cqhn cqhnVar, cbyi cbyiVar, cbxa cbxaVar, cbxu cbxuVar, Executor executor) {
        this.a = cbrxVar;
        this.b = cbssVar;
        this.c = cbyiVar;
        this.d = cbxaVar;
        this.e = cbxuVar;
        ((cbsb) cbssVar).c.e(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<cbtv> crzmVar) {
        cbuj cbujVar;
        cqix<? extends cqkp> fT;
        cbub cbubVar;
        cqix<? extends cqkp> fT2;
        cbtv l = crzmVar.l();
        if (l == null) {
            return;
        }
        int a = cbtu.a(l.a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        if (i == 0) {
            if (l.a == 2) {
                cbujVar = (cbuj) l.b;
            } else {
                cbujVar = cbuj.d;
            }
            if (cbujVar.c == cbujVar.b.size()) {
                fT = cqgr.fT(new cbxn(), this.e.a(this.a, this.b));
            } else {
                cbye cbyeVar = new cbye();
                cbyi cbyiVar = this.c;
                cbrx cbrxVar = this.a;
                cbss cbssVar = this.b;
                cbyi.a(cbrxVar, 1);
                cbyi.a(cbssVar, 2);
                cbyx a2 = cbyiVar.a.a();
                cbyi.a(a2, 3);
                cqhn a3 = cbyiVar.b.a();
                cbyi.a(a3, 4);
                gga a4 = cbyiVar.c.a();
                cbyi.a(a4, 5);
                fT = cqgr.fT(cbyeVar, new cbyh(cbrxVar, cbssVar, a2, a3, a4));
            }
            this.f = fT;
        } else if (i == 1) {
            if (l.a == 6) {
                cbubVar = (cbub) l.b;
            } else {
                cbubVar = cbub.e;
            }
            if (cbubVar.c == cbubVar.b.size()) {
                fT2 = cqgr.fT(new cbxn(), this.e.a(this.a, this.b));
            } else {
                cbws cbwsVar = new cbws();
                cbxa cbxaVar = this.d;
                cbrx cbrxVar2 = this.a;
                cbss cbssVar2 = this.b;
                cbxa.a(cbrxVar2, 1);
                cbxa.a(cbssVar2, 2);
                cqhn a5 = cbxaVar.a.a();
                cbxa.a(a5, 3);
                gga a6 = cbxaVar.b.a();
                cbxa.a(a6, 4);
                isd a7 = cbxaVar.c.a();
                cbxa.a(a7, 5);
                fT2 = cqgr.fT(cbwsVar, new cbwz(cbrxVar2, cbssVar2, a5, a6, a7));
            }
            this.f = fT2;
        }
        cqkx.p(this);
    }

    @Override // defpackage.cbvw
    @dzsi
    public cqix<? extends cqkp> b() {
        return this.f;
    }
}
