package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vdu  reason: default package */
/* loaded from: classes7.dex */
public final class vdu extends cqiw<zbv> {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ cqiw a;
    final /* synthetic */ cqiw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdu(Object[] objArr, cqiw cqiwVar, cqiw cqiwVar2) {
        super(objArr);
        this.a = cqiwVar;
        this.b = cqiwVar2;
    }

    private static final cqnf<zbv> e() {
        return cqgr.dW(vdk.a);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zbv zbvVar, Context context, cqiv cqivVar) {
        zbz i2 = zbvVar.i();
        if (i2 != null) {
            cqivVar.a(i2.k().a() == dqvj.TRANSIT ? this.a : this.b, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbv> a() {
        return cqqx.E(cqqx.h(vde.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.P(false), vei.d(cqgr.aF(vdl.a), cqgr.x(irg.a())), vei.d(cqgr.aI(vdm.a), e(), cqgr.x(irg.a()), cqgr.fR(new bxka(), vdn.a, new cqmp[0])), vei.d(cqgr.aI(vdo.a), e(), cqgr.aT(vei.a), cqgr.ck(C())), vei.d(cqgr.aI(vdp.a), e(), cqgr.x(irg.a()), cqgr.aT(zbx.a), cqgr.fR(new vjc(), vdq.a, new cqmp[0])), vei.d(cqgr.aI(vdr.a), e(), cqgr.x(irg.a()), cqgr.L(false), cqgr.fR(new vha(), vds.a, new cqmp[0])), vei.d(cqgr.aI(vdt.a), e(), cqgr.x(irg.a()), cqgr.aT(zbx.a), cqgr.L(false), cqgr.fR(new vbt(), vdf.a, new cqmp[0])), vei.d(cqgr.aI(vdg.a), e(), cqgr.x(irg.a()), cqgr.L(false), cqgr.fR(new vbr(), vdh.a, new cqmp[0])), vei.d(cqgr.aI(vdi.a), vil.e(vdj.a)));
    }
}
