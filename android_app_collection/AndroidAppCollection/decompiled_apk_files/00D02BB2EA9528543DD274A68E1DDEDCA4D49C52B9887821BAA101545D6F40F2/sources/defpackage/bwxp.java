package defpackage;

import android.content.Context;
/* renamed from: bwxp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwxp implements cqjb {
    static final cqjb a = new bwxp();

    private bwxp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bxcc bxccVar = (bxcc) cqkpVar;
        if (!cqhl.a(context) || !bxccVar.x().booleanValue()) {
            return cqrp.c(dcyn.a);
        }
        double F = bxccVar.F();
        Double.isNaN(F);
        double d = context.getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        return cqrp.c(F * 0.5d * d);
    }
}
