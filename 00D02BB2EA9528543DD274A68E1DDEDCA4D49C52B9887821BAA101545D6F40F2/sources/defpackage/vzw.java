package defpackage;

import android.content.Context;
/* renamed from: vzw  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vzw implements cqjb {
    static final cqjb a = new vzw();

    private vzw() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zdo zdoVar = (zdo) cqkpVar;
        boolean z = true;
        if ((cqhl.c(context) || !cqhl.a(context)) && !cqjv.v(zdoVar.i()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
