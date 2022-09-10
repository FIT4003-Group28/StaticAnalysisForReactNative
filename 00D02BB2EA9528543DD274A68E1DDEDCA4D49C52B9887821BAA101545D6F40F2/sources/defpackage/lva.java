package defpackage;

import android.content.Context;
/* renamed from: lva  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lva implements cqjb {
    static final cqjb a = new lva();

    private lva() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        lvw lvwVar = (lvw) cqkpVar;
        boolean z = true;
        if (!npv.b(620, 1, context) && !lvwVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
