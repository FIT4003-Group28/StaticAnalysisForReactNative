package defpackage;

import android.content.Context;
/* renamed from: asei  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asei implements cqjb {
    static final cqjb a = new asei();

    private asei() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        asha ashaVar = (asha) cqkpVar;
        boolean z = false;
        if (cqhl.b(context) && !ashaVar.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
