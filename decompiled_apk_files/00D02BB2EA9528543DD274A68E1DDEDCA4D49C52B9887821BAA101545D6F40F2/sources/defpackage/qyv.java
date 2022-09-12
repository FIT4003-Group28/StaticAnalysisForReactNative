package defpackage;

import android.content.Context;
/* renamed from: qyv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class qyv implements cqjb {
    static final cqjb a = new qyv();

    private qyv() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        qvn qvnVar = (qvn) cqkpVar;
        boolean z = false;
        if (cqhl.b(context) && qvnVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
