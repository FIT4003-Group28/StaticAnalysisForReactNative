package defpackage;

import android.content.Context;
/* renamed from: blur  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blur implements cqjb {
    static final cqjb a = new blur();

    private blur() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        blwt blwtVar = (blwt) cqkpVar;
        float f = 0.0f;
        if (cqhl.d(context) && cqhl.a(context)) {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
