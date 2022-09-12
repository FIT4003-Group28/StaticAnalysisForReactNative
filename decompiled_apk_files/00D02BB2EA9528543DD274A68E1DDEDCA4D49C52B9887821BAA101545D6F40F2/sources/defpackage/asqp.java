package defpackage;

import android.content.Context;
/* renamed from: asqp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asqp implements cqjb {
    static final cqjb a = new asqp();

    private asqp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asut asutVar = (asut) cqkpVar;
        int i = 8388629;
        if (asutVar.d().booleanValue()) {
            if (asutVar.e().booleanValue() && cqhl.a(context)) {
                i = 8388661;
            }
        } else {
            i = (!asutVar.e().booleanValue() || !cqhl.a(context)) ? 17 : 49;
        }
        return Integer.valueOf(i);
    }
}
