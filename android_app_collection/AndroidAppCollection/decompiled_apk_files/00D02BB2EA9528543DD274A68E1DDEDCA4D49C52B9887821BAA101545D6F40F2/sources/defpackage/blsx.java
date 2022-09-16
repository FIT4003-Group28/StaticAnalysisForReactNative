package defpackage;

import android.content.Context;
/* renamed from: blsx  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blsx implements cqjb {
    static final cqjb a = new blsx();

    private blsx() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        blwp blwpVar = (blwp) cqkpVar;
        cqjg cqjgVar = bltv.a;
        boolean z = false;
        if ((blwpVar.K().booleanValue() || blwpVar.R().booleanValue() || blwpVar.S().booleanValue()) && cqhl.b(context)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
