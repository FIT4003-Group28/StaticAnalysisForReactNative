package defpackage;

import android.content.Context;
/* renamed from: lvj  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lvj implements cqjb {
    static final cqjb a = new lvj();

    private lvj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        lvw lvwVar = (lvw) cqkpVar;
        boolean z = true;
        if (!lvwVar.o().booleanValue() || !npv.b(441, 1, context) || lvk.a(lvwVar.h()) + lvk.a(lvwVar.f()) <= 15) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
