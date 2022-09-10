package defpackage;

import android.content.Context;
/* renamed from: qlm  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class qlm implements cqjb {
    static final cqjb a = new qlm();

    private qlm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = qlo.a;
        boolean z = false;
        if (((qng) cqkpVar).g().booleanValue() && cqhl.a(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
