package defpackage;

import android.content.Context;
/* renamed from: vbl  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vbl implements cqjb {
    static final cqjb a = new vbl();

    private vbl() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        boolean z = false;
        if (vbn.a.a((zcl) cqkpVar).booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
