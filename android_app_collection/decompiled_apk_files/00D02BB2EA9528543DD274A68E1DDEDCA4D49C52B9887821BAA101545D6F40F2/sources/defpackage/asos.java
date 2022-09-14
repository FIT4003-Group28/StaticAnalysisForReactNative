package defpackage;

import android.content.Context;
/* renamed from: asos  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asos implements cqjb {
    static final cqjb a = new asos();

    private asos() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        cqss b;
        asuq asuqVar = (asuq) cqkpVar;
        cqjb<asuq, Boolean> cqjbVar = asou.a;
        if (asuqVar.l() == asup.CROSS) {
            i = 2131232205;
        } else {
            i = asuqVar.l() == asup.REFRESH ? 2131232872 : 2131231736;
        }
        if (asuqVar.j().booleanValue()) {
            b = ibl.b();
        } else {
            b = iva.b(ibl.H(), ibl.b());
        }
        return cqrt.h(i, b);
    }
}
