package defpackage;

import android.content.Context;
/* renamed from: mds  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mds implements cqjb {
    static final cqjb a = new mds();

    private mds() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mfd mfdVar = (mfd) cqkpVar;
        boolean z = false;
        if (((Boolean) mdi.a.a(mfdVar, context)).booleanValue() && !mfdVar.n().booleanValue() && !mfdVar.w().booleanValue() && !mfdVar.p().booleanValue() && !mfdVar.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
