package defpackage;

import android.content.Context;
/* renamed from: asqz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asqz implements cqjb {
    static final cqjb a = new asqz();

    private asqz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = asra.a;
        boolean z = false;
        if (((asuu) cqkpVar).g().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
