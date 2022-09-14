package defpackage;

import android.content.Context;
/* renamed from: aygd  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aygd implements cqjb {
    static final cqjb a = new aygd();

    private aygd() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjg cqjgVar = aygu.a;
        boolean z = true;
        if (((aymm) cqkpVar).p().booleanValue() && !cqhl.c(context)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
