package defpackage;

import android.content.Context;
/* renamed from: blsz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blsz implements cqjb {
    static final cqjb a = new blsz();

    private blsz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        blwp blwpVar = (blwp) cqkpVar;
        boolean z = true;
        if (!cqhl.d(context) || !cqhl.a(context) || (!blwpVar.R().booleanValue() && !blwpVar.S().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
