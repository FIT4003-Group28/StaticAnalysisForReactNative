package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hpj  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class hpj implements cqjb {
    static final cqjb a = new hpj();

    private hpj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        izs izsVar = (izs) cqkpVar;
        boolean z = false;
        if (cqhl.a(context) && izsVar.z().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
