package defpackage;

import android.content.Context;
/* renamed from: atrq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atrq implements cqjb {
    static final cqjb a = new atrq();

    private atrq() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        atyf atyfVar = (atyf) cqkpVar;
        boolean z = false;
        if (cqhl.a(context) && !atyfVar.ak().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
