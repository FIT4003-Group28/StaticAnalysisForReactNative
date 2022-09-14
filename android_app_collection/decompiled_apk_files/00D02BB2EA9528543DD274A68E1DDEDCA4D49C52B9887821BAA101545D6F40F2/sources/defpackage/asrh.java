package defpackage;

import android.content.Context;
/* renamed from: asrh  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asrh implements cqjb {
    static final cqjb a = new asrh();

    private asrh() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjb<asuq, Boolean> cqjbVar = asrt.a;
        boolean z = false;
        if (((asuq) cqkpVar).h().booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
