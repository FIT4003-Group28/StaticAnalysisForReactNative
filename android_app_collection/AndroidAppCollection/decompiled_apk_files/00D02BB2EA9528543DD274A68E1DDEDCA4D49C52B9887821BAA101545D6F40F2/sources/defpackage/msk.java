package defpackage;

import android.content.Context;
/* renamed from: msk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class msk implements cqjb {
    static final cqjb a = new msk();

    private msk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        mtg mtgVar = (mtg) cqkpVar;
        boolean z = false;
        if (cqsz.d().a(context) < cqrp.d(445.0d).a(context) && mtgVar.b(mtf.DESTINATIONS_LIST).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
