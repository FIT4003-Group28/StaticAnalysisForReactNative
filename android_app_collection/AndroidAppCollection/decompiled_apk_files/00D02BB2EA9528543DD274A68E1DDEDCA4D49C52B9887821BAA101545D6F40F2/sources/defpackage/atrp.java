package defpackage;

import android.content.Context;
/* renamed from: atrp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atrp implements cqjb {
    static final cqjb a = new atrp();

    private atrp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        atyf atyfVar = (atyf) cqkpVar;
        boolean z = false;
        if (cqhl.a(context) && atyfVar.ak().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
