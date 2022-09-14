package defpackage;

import android.content.Context;
/* renamed from: cdtl  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdtl implements cqjb {
    static final cqjb a = new cdtl();

    private cdtl() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = cdtt.a;
        boolean z = false;
        if (((cdtu) cqkpVar).k().booleanValue() && cqhl.b(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
