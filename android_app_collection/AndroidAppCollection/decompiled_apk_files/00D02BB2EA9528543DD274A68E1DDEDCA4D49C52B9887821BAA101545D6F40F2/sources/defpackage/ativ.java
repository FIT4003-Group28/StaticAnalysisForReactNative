package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ativ  reason: default package */
/* loaded from: classes2.dex */
final class ativ implements cqjb<atnf, jcm> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ jcm a(atnf atnfVar, Context context) {
        atnf atnfVar2 = atnfVar;
        boolean z = true;
        if (!cqhl.a(context) && !cqhl.c(context)) {
            z = false;
        }
        int x = atnfVar2.x(48, false, z);
        if (atnfVar2.k().booleanValue()) {
            if (atnfVar2.b() != null) {
                if (!atnfVar2.w().equals(atnfVar2.b().w())) {
                    if (!atnfVar2.w().booleanValue()) {
                        return atnfVar2.Q().booleanValue() ? atje.f(x, 0) : atje.f(x, 500);
                    }
                }
            }
            return atje.i(x);
        }
        return atje.k;
    }
}
