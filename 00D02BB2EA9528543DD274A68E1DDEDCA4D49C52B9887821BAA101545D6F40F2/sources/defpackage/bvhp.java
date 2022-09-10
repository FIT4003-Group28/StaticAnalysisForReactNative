package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bvhp  reason: default package */
/* loaded from: classes4.dex */
public final class bvhp extends cqiw<bvhu> {
    private final bvho a;

    public bvhp(bvho bvhoVar) {
        super(bvhoVar);
        this.a = bvhoVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bvhu bvhuVar, Context context, cqiv cqivVar) {
        for (bvhv bvhvVar : bvhuVar.j()) {
            cqivVar.e(bvhvVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bvhu> a() {
        cqnf bq;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.cd(-1);
        if (this.a.b()) {
            bq = cqgr.bp(-1);
        } else {
            bq = cqgr.bq(this.a.a());
        }
        cqmpVarArr[1] = bq;
        cqmpVarArr[2] = cqgr.dk(bvgw.a);
        cqmpVarArr[3] = cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.aA(bvha.a), cqgr.V(bvhb.a), cqgr.fY(cqgr.bp(-1), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.V(bvhc.a), iue.c(bvhd.a), cqgr.cW(cqgr.q(bvhe.a)), cqgr.K(bvhf.a)), cqgr.fY(cqgr.bp(-1), cqgr.cd(0), cqgr.ca(Float.valueOf(2.0f)), cqgr.V(bvhg.a), iue.c(bvhh.a), cqgr.cW(cqgr.q(bvhi.a)), cqgr.K(bvgx.a)));
        cqmpVarArr[4] = jnq.y(cqgr.cd(-1), cqgr.bp(-1), cqgr.az(false), jnq.C((Boolean) false), jnq.A(false), cqgr.dc(bvgy.a), cqgr.fA(2), cqgr.ck(C()), cqgr.fx(bvgz.a));
        return cqgr.fY(cqmpVarArr);
    }
}
