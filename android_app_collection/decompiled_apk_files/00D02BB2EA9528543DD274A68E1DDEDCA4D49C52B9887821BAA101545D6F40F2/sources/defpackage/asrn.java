package defpackage;

import android.content.Context;
/* renamed from: asrn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asrn implements cqjb {
    static final cqjb a = new asrn();

    private asrn() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        float f;
        asuq asuqVar = (asuq) cqkpVar;
        if (asuqVar.h().booleanValue()) {
            f = asrt.a.a(asuqVar, context).booleanValue() ? 0.7f : 0.5f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
