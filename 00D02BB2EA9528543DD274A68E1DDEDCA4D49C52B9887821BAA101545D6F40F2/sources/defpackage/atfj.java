package defpackage;

import android.content.Context;
/* renamed from: atfj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atfj implements cqjb {
    static final cqjb a = new atfj();

    private atfj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        atna atnaVar = (atna) cqkpVar;
        if (athe.i.a(atnaVar, context).booleanValue()) {
            atnj w = atnaVar.w();
            dbsk.s(w);
            i = w.h().intValue();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
