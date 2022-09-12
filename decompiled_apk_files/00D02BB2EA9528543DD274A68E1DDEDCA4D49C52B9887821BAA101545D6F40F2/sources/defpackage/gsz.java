package defpackage;

import android.content.Context;
/* renamed from: gsz  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gsz implements cqjb {
    static final cqjb a = new gsz();

    private gsz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        jbn jbnVar = (jbn) cqkpVar;
        boolean z = true;
        if (!cqhl.a(context) && !jbnVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
