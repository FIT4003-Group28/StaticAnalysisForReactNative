package defpackage;

import android.content.Context;
/* renamed from: vdk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vdk implements cqjb {
    static final cqjb a = new vdk();

    private vdk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zbv zbvVar = (zbv) cqkpVar;
        int i = vdu.c;
        if ((!zbvVar.d().booleanValue() && !zbvVar.f().booleanValue()) || (cqhl.a(context) && cqhl.c(context))) {
            return cqrp.d(dcyn.a);
        }
        return ird.b();
    }
}
