package defpackage;

import android.content.Context;
/* renamed from: aspc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aspc implements cqjb {
    static final cqjb a = new aspc();

    private aspc() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjb<asuq, Boolean> cqjbVar = aspn.a;
        boolean z = false;
        if (((asuq) cqkpVar).y().booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
