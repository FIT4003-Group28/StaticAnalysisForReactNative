package defpackage;

import android.content.Context;
/* renamed from: asqj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asqj implements cqjb {
    static final cqjb a = new asqj();

    private asqj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asut asutVar = (asut) cqkpVar;
        int i = -2;
        if (asutVar.e().booleanValue() && cqhl.a(context)) {
            if (asutVar.d().booleanValue()) {
                i = cqrp.d(56.0d).e(context);
            } else {
                i = cqrp.d(64.0d).e(context);
            }
        }
        return Integer.valueOf(i);
    }
}
