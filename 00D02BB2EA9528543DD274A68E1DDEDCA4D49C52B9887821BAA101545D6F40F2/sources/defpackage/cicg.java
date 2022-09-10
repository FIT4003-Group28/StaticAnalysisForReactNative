package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cicg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cicg implements cqjb {
    static final cqjb a = new cicg();

    private cicg() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cict cictVar = (cict) cqkpVar;
        int i = cics.a;
        if (!cictVar.t()) {
            return null;
        }
        return new jic(cictVar.q(), ckqc.FULLY_QUALIFIED, 0, cictVar.u());
    }
}
