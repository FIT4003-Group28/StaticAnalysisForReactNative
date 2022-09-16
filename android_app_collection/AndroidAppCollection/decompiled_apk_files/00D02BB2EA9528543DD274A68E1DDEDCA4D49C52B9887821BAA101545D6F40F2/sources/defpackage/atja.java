package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atja  reason: default package */
/* loaded from: classes2.dex */
final class atja implements cqjb<atnf, jcm> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ jcm a(atnf atnfVar, Context context) {
        atnf atnfVar2 = atnfVar;
        int x = atnfVar2.x(48, false, true);
        if (atnfVar2.k().booleanValue()) {
            if (atnfVar2.b() != null) {
                if (!atnfVar2.J().equals(atnfVar2.b().J())) {
                    if (!atnfVar2.J().booleanValue()) {
                        return atnfVar2.Q().booleanValue() ? atje.f(x, 0) : atje.f(x, 500);
                    }
                }
            }
            return atje.i(x);
        }
        return atje.k;
    }
}
