package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atjb  reason: default package */
/* loaded from: classes2.dex */
final class atjb implements cqjb<atnf, cqtd> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ cqtd a(atnf atnfVar, Context context) {
        boolean z;
        atnf atnfVar2 = atnfVar;
        boolean z2 = false;
        if (!atnfVar2.Q().booleanValue()) {
            boolean z3 = !atnfVar2.J().booleanValue();
            if (!atnfVar2.w().booleanValue()) {
                z2 = z3;
            } else if (cqhl.d(context)) {
                z = false;
            }
            z = true;
        } else {
            z = true;
            z2 = true;
        }
        boolean b = bvox.b(context);
        cqss g = atje.g(atnfVar2, true);
        if (g == null) {
            g = atnfVar2.k().booleanValue() ? ire.m() : atnfVar2.D().booleanValue() ? ibl.q() : ibl.o();
        }
        boolean z4 = true != b ? z : z2;
        if (true == b) {
            z2 = z;
        }
        return atje.e(g, true, true, z4, z2);
    }
}
