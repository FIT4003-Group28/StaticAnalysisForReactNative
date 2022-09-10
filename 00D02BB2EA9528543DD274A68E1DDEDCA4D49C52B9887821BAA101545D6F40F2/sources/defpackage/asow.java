package defpackage;

import android.content.Context;
/* renamed from: asow  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asow implements cqjb {
    static final cqjb a = new asow();

    private asow() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asuq asuqVar = (asuq) cqkpVar;
        cqjb<asuq, Boolean> cqjbVar = aspn.a;
        boolean z = true;
        if (asuqVar.h().booleanValue() && !aspn.a.a(asuqVar, context).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
