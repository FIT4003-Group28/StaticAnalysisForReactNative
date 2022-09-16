package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lpi  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lpi implements cqjb {
    static final cqjb a = new lpi();

    private lpi() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = lqi.a;
        boolean z = false;
        if (((lwp) cqkpVar).j().booleanValue() && npv.d(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
