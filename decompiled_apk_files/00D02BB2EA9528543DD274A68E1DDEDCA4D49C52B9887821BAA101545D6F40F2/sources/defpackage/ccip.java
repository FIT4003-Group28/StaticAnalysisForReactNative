package defpackage;

import android.content.Context;
/* renamed from: ccip  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccip implements cqjb {
    static final cqjb a = new ccip();

    private ccip() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        ccib ccibVar = (ccib) cqkpVar;
        boolean z = true;
        if (!cqhl.a(context) && ccibVar.k().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
