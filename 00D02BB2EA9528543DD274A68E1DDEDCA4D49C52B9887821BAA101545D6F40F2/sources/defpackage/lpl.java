package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lpl  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lpl implements cqjb {
    static final cqjb a = new lpl();

    private lpl() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = lqi.a;
        boolean z = false;
        if (((lwp) cqkpVar).i().booleanValue() && npv.d(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
