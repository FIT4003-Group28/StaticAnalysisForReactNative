package defpackage;

import android.content.Context;
/* renamed from: asov  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asov implements cqjb {
    static final cqjb a = new asov();

    private asov() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asuq asuqVar = (asuq) cqkpVar;
        cqjb<asuq, Boolean> cqjbVar = aspn.a;
        boolean z = false;
        if ((!asuqVar.o().booleanValue() && !asuqVar.q().booleanValue()) || ((cqhl.b(context) || (cqhl.a(context) && !asuqVar.y().booleanValue())) && (asuqVar.h().booleanValue() || asuqVar.i().booleanValue()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
