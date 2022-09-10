package defpackage;

import android.content.Context;
/* renamed from: mzz  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mzz implements cqjb {
    static final cqjb a = new mzz();

    private mzz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int e;
        nap napVar = (nap) cqkpVar;
        if (nao.d(napVar, context) || napVar.s().booleanValue()) {
            e = nqo.aq.e(context);
        } else {
            e = nao.d.e(context);
        }
        return Integer.valueOf(e);
    }
}
