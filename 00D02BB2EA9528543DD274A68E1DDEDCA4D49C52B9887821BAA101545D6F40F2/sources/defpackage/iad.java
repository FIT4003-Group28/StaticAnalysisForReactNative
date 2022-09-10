package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: iad  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class iad implements cqjb {
    static final cqjb a = new iad();

    private iad() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        Integer d = iam.d((iao) cqkpVar);
        if (d == null) {
            return cqrp.c(dcyn.a);
        }
        int e = cqrp.d(3.0d).e(context);
        int intValue = d.intValue() - cqrp.d(16.0d).e(context);
        if (intValue >= e) {
            e = intValue;
        }
        return cqrp.c(-e);
    }
}
