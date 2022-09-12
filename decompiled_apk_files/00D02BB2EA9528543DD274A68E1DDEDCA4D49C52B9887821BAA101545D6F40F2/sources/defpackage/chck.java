package defpackage;

import android.content.Context;
/* renamed from: chck  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chck implements cqjb {
    static final cqjb a = new chck();

    private chck() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqiv cqivVar = new cqiv();
        chmg d = ((chmb) cqkpVar).d();
        if (d instanceof chms) {
            cqivVar.a(new chfv(), (chms) d);
        } else if (d instanceof chma) {
            cqivVar.a(new chch(), (chma) d);
        }
        return cqivVar;
    }
}
