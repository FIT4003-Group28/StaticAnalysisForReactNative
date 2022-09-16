package defpackage;

import android.content.Context;
/* renamed from: mdv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mdv implements cqjb {
    static final cqjb a = new mdv();

    private mdv() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mfd mfdVar = (mfd) cqkpVar;
        boolean z = true;
        if (!((Boolean) mdi.a.a(mfdVar, context)).booleanValue() && mfdVar.A().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
