package defpackage;

import android.content.Context;
/* renamed from: asps  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asps implements cqjb {
    static final cqjb a = new asps();

    private asps() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqtv cqtvVar = asqh.a;
        boolean z = false;
        if (((asus) cqkpVar).s().booleanValue() && !cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
