package defpackage;

import android.content.Context;
/* renamed from: med  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class med implements cqjb {
    static final cqjb a = new med();

    private med() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mfd mfdVar = (mfd) cqkpVar;
        boolean z = false;
        if (((Boolean) mdi.a.a(mfdVar, context)).booleanValue() && mfdVar.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
