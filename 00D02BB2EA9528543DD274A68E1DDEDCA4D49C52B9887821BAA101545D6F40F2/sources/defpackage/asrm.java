package defpackage;

import android.content.Context;
/* renamed from: asrm  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asrm implements cqjb {
    static final cqjb a = new asrm();

    private asrm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjb<asuq, Boolean> cqjbVar = asrt.a;
        boolean z = false;
        if (((asuq) cqkpVar).i().booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
