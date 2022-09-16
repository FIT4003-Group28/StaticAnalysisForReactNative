package defpackage;

import android.content.Context;
/* renamed from: brxd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brxd implements cqjb {
    static final cqjb a = new brxd();

    private brxd() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = brxo.a;
        boolean z = false;
        if (((bryd) cqkpVar).a().booleanValue() && cqhl.b(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
