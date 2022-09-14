package defpackage;

import android.content.Context;
/* renamed from: asri  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asri implements cqjb {
    static final cqjb a = new asri();

    private asri() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        float f;
        asuq asuqVar = (asuq) cqkpVar;
        if (asuqVar.i().booleanValue()) {
            f = asrt.a.a(asuqVar, context).booleanValue() ? 0.3f : 0.5f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
