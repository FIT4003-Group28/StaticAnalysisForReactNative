package defpackage;

import android.content.Context;
/* renamed from: asor  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asor implements cqjb {
    static final cqjb a = new asor();

    private asor() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asuq asuqVar = (asuq) cqkpVar;
        cqjb<asuq, Boolean> cqjbVar = asou.a;
        boolean z = true;
        if (context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && ((context.getResources().getConfiguration().orientation != 2 || asuqVar.y().booleanValue()) && asuqVar.h().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
