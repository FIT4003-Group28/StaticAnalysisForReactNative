package defpackage;

import android.content.Context;
/* renamed from: cjlo  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cjlo implements cqjb {
    static final cqjb a = new cjlo();

    private cjlo() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cjme cjmeVar = (cjme) cqkpVar;
        boolean z = true;
        if (!cqhl.a(context) && !cqjv.v(cjmeVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
