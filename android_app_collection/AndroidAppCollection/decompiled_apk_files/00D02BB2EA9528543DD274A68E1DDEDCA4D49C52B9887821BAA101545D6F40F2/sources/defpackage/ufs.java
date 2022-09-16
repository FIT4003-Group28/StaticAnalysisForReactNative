package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ufs  reason: default package */
/* loaded from: classes7.dex */
final class ufs implements cqjb<uhc, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(uhc uhcVar, Context context) {
        cqrp d = cqrp.d(dcyn.a);
        float size = uhcVar.a().size();
        float f = 4.5f;
        if (cqhl.a(context) && cqhl.d(context)) {
            f = 2.5f;
        }
        if (size > f) {
            size = f;
        }
        return Integer.valueOf(cqsg.d(d, cqsg.f(ibn.a(), Float.valueOf(size))).e(context));
    }
}
