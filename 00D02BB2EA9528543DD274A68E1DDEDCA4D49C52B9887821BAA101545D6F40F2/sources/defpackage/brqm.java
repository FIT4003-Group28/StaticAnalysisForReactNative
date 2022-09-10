package defpackage;

import android.content.Context;
/* renamed from: brqm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brqm implements cqjb {
    static final cqjb a = new brqm();

    private brqm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqiv cqivVar = new cqiv();
        for (cqkp cqkpVar2 : ((brqu) cqkpVar).b()) {
            if (cqkpVar2 instanceof brrk) {
                cqivVar.a(new brrj(), (brrk) cqkpVar2);
            } else if (cqkpVar2 instanceof bssi) {
                cqivVar.a(new brqg(), (bssi) cqkpVar2);
            }
        }
        return cqivVar;
    }
}
