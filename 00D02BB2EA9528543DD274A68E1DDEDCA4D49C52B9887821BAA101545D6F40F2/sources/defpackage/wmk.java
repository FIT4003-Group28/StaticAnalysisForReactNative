package defpackage;

import android.content.Context;
/* renamed from: wmk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wmk implements cqjb {
    static final cqjb a = new wmk();

    private wmk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        float a2;
        wpv wpvVar = (wpv) cqkpVar;
        eapq af = wpvVar.af();
        if (af == null || !wpvVar.ag().booleanValue() || wpvVar.Z(donz.CANCELED).booleanValue()) {
            a2 = xjz.a(true);
        } else {
            xjy f = xjz.f(af);
            a2 = f != null ? f.c() : 1.0f;
        }
        return Float.valueOf(((a2 / xjz.a(false)) / 2.0f) + 0.5f);
    }
}
