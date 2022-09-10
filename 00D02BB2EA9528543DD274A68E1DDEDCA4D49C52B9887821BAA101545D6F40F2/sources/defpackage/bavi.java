package defpackage;

import android.content.Context;
/* renamed from: bavi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bavi implements cqjb {
    static final cqjb a = new bavi();

    private bavi() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        baye bayeVar = (baye) cqkpVar;
        float f = context.getResources().getConfiguration().fontScale;
        return f <= 1.0f ? cqrp.d(48.0d) : cqsg.f(cqrp.d(48.0d), Float.valueOf(1.0f / (f * f)));
    }
}
