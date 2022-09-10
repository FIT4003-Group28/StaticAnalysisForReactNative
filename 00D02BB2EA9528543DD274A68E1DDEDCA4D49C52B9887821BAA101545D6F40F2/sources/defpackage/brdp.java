package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: brdp  reason: default package */
/* loaded from: classes4.dex */
public final class brdp extends cqiw<brgo> {
    public static final /* synthetic */ int a = 0;

    private static cqjb<brgo, Boolean> e(final brgn brgnVar) {
        return new cqjb(brgnVar) { // from class: brdo
            private final brgn a;

            {
                this.a = brgnVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                brgn brgnVar2 = this.a;
                int i = brdp.a;
                return Boolean.valueOf(((brgo) cqkpVar).b() == brgnVar2);
            }
        };
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, brgo brgoVar, Context context, cqiv cqivVar) {
        cqivVar.f(new brdy(), brgoVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brgo> a() {
        cqmp[] cqmpVarArr = {hxc.b(brdm.a)};
        cqmp[] cqmpVarArr2 = {cqic.e(e(brgn.PROGRESS_SPINNER), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17)};
        cqmp[] cqmpVarArr3 = {cqic.e(e(brgn.NETWORK_ERROR), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17), cqgr.fP(new brex(), brdn.a, new cqmp[0])};
        cqmp[] cqmpVarArr4 = {cqic.e(e(brgn.OPTIONS_LIST), new cqmp[0])};
        cqmj a2 = acnp.a(cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(8388611), cqgr.eN(5), cqgr.ck(C())));
        a2.f(cqmpVarArr4);
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.z(ibm.b()), hxc.a(cqmpVarArr), cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), itj.s(cqmpVarArr2), cqgr.fY(cqmpVarArr3), a2));
    }
}
