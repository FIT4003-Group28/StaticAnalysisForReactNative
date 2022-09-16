package defpackage;

import android.content.Context;
/* renamed from: bgbe  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgbe implements cqjb {
    static final cqjb a = new bgbe();

    private bgbe() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqtv cqtvVar = bgdg.a;
        boolean z = false;
        if (((bnih) cqkpVar).ah().booleanValue() && !cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
