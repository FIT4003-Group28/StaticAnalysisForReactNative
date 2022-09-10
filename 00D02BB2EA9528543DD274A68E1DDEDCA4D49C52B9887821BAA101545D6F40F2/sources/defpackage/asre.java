package defpackage;

import android.content.Context;
/* renamed from: asre  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asre implements cqjb {
    static final cqjb a = new asre();

    private asre() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = asrf.a;
        boolean z = false;
        if (((asuq) cqkpVar).y().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
