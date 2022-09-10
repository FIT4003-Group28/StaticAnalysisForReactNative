package defpackage;

import android.content.Context;
/* renamed from: blsp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blsp implements cqjb {
    static final cqjb a = new blsp();

    private blsp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        blwp blwpVar = (blwp) cqkpVar;
        if (!cqhl.d(context) || !cqhl.a(context) || (!blwpVar.R().booleanValue() && !blwpVar.S().booleanValue())) {
            return cqrp.d(10.0d);
        }
        return cqrp.d(6.0d);
    }
}
