package defpackage;

import android.content.Context;
/* renamed from: blqm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blqm implements cqjb {
    static final cqjb a = new blqm();

    private blqm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        blwr blwrVar = (blwr) cqkpVar;
        boolean z = false;
        if (cqhl.d(context) && cqhl.a(context) && blwrVar.b().booleanValue() && blwrVar.s().K().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
