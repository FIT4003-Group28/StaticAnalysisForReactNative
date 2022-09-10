package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vjl  reason: default package */
/* loaded from: classes7.dex */
final class vjl implements cqjb<zby, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(zby zbyVar, Context context) {
        cqtv d = cqrp.d(dcyn.a);
        float size = zbyVar.o().size();
        float f = 4.5f;
        if (cqhl.a(context) && cqhl.d(context)) {
            f = 2.5f;
        }
        if (size > f) {
            size = f;
        } else {
            d = cqsg.f(vjo.b, Float.valueOf(2.0f));
        }
        return Integer.valueOf(cqsg.d(d, cqsg.f(vjn.a, Float.valueOf(size))).e(context));
    }
}
