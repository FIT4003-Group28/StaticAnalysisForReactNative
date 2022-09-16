package defpackage;

import android.content.Context;
/* renamed from: briw  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class briw implements cqjb {
    static final cqjb a = new briw();

    private briw() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bssp bsspVar = (bssp) cqkpVar;
        boolean z = true;
        if (!cqhl.a(context) && !bsspVar.h().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
