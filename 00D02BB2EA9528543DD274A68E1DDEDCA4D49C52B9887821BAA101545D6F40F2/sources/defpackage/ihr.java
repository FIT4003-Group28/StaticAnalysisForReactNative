package defpackage;

import defpackage.igw;
/* compiled from: PG */
/* renamed from: ihr  reason: default package */
/* loaded from: classes.dex */
final class ihr<T extends igw> extends cqiw<T> {
    public static final /* synthetic */ int b = 0;
    public final iif a;
    private final cqiw<T> c;

    public ihr(cqiw<T> cqiwVar, iif iifVar) {
        super(cqiwVar, iifVar);
        this.c = cqiwVar;
        this.a = iifVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        cqnf bp;
        cqmp[] cqmpVarArr = new cqmp[11];
        cqmpVarArr[0] = cqgr.aI(ihn.a);
        cqmpVarArr[1] = cqgr.cg(new cqlc(this) { // from class: iho
            private final ihr a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((igw) cqkpVar).a().booleanValue() ? this.a.a.f() : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqlc cqlcVar = ihp.a;
        cqtv g = this.a.g();
        if (g != null) {
            bp = cqgr.bq(g);
        } else {
            bp = cqgr.bp(-1);
        }
        cqmpVarArr[2] = cqjv.l(cqlcVar, bp, cqgr.bq(cqrp.d(dcyn.a)));
        cqmpVarArr[3] = cqqx.k(this.a.n());
        cqmpVarArr[4] = cqqx.i(this.a.h());
        cqmpVarArr[5] = cqqx.g(this.a.j());
        cqmpVarArr[6] = cqqx.d(this.a.o());
        cqmpVarArr[7] = cqqx.B(Boolean.valueOf(this.a.l()));
        cqmpVarArr[8] = cqqx.y(Boolean.valueOf(this.a.m()));
        cqmpVarArr[9] = hye.f(cqrp.d(dcyn.a));
        cqmpVarArr[10] = cqgr.fP(this.c, ihq.a, new cqmp[0]);
        return hye.b(cqmpVarArr);
    }
}
