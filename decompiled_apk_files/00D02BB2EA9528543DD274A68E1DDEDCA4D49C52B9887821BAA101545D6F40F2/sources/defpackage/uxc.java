package defpackage;

import android.content.Context;
/* renamed from: uxc  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uxc implements cqjb {
    static final cqjb a = new uxc();

    private uxc() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zct zctVar = (zct) cqkpVar;
        cqlc<zct, Boolean> cqlcVar = uxj.a;
        boolean z = false;
        if (zctVar.e().booleanValue() || zctVar.r().booleanValue() || !zctVar.g().booleanValue() || !zctVar.j().booleanValue()) {
            return false;
        }
        if (zctVar.H().booleanValue()) {
            return true;
        }
        if (zctVar.I().booleanValue()) {
            return false;
        }
        if (context.getResources().getConfiguration().fontScale <= 1.0f) {
            return true;
        }
        if (!zctVar.s().booleanValue() && !zctVar.z().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
