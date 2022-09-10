package defpackage;

import android.content.Context;
/* renamed from: aygl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class aygl implements cqjb {
    static final cqjb a = new aygl();

    private aygl() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        aymm aymmVar = (aymm) cqkpVar;
        cqjg cqjgVar = aygu.a;
        boolean z = true;
        if ((!aymmVar.p().booleanValue() || cqhl.c(context)) && !aymmVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
