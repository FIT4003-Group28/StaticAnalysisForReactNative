package defpackage;

import android.content.Context;
/* renamed from: aelc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aelc implements cqjb {
    static final cqjb a = new aelc();

    private aelc() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = aelf.a;
        boolean z = false;
        if (((aeni) cqkpVar).e().booleanValue() && !cqhl.c(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}