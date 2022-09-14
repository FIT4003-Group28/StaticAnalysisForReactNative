package defpackage;

import android.content.Context;
/* renamed from: asqy  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asqy implements cqjb {
    static final cqjb a = new asqy();

    private asqy() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asuu asuuVar = (asuu) cqkpVar;
        int i = asra.a;
        boolean z = false;
        if (asuuVar.e().booleanValue() && asuuVar.g().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
