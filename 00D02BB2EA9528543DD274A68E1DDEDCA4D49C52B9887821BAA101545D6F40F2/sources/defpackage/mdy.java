package defpackage;

import android.content.Context;
/* renamed from: mdy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mdy implements cqjb {
    static final cqjb a = new mdy();

    private mdy() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mfd mfdVar = (mfd) cqkpVar;
        boolean z = false;
        if (((Boolean) mdi.a.a(mfdVar, context)).booleanValue() && ((Boolean) mef.a.a(mfdVar, context)).booleanValue() && mfdVar.B().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
