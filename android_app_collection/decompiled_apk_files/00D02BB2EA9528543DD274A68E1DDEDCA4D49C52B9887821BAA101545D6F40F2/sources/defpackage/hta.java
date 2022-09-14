package defpackage;

import android.content.Context;
/* renamed from: hta  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hta implements cqjb {
    static final cqjb a = new hta();

    private hta() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        izu izuVar = (izu) cqkpVar;
        boolean z = false;
        if (cqhl.d(context) && cqhl.a(context) && izuVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
