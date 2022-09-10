package defpackage;

import android.content.Context;
/* renamed from: asoy  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asoy implements cqjb {
    static final cqjb a = new asoy();

    private asoy() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asuq asuqVar = (asuq) cqkpVar;
        cqjb<asuq, Boolean> cqjbVar = aspn.a;
        boolean z = true;
        if (asuqVar.i().booleanValue() && !aspn.a.a(asuqVar, context).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
