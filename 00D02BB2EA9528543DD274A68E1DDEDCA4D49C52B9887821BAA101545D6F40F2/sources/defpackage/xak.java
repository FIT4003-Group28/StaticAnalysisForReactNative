package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: xak  reason: default package */
/* loaded from: classes7.dex */
final class xak implements cqjb<xar, cqtd> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ cqtd a(xar xarVar, Context context) {
        cqss v;
        cqss u;
        xar xarVar2 = xarVar;
        xaq xaqVar = xaq.STANDARD_ATTRIBUTE;
        int ordinal = xarVar2.c().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (xarVar2.g().booleanValue()) {
                v = ibm.v();
                u = ibm.u();
                return new xaj(new Object[0], cqui.c(cquh.a(0), cquh.g(xan.a), cquh.e(xan.b, v), cquh.f(u)));
            }
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                cqtv cqtvVar = xan.a;
                xarVar2.c();
            }
            v = ibm.b();
            u = ibm.b();
            return new xaj(new Object[0], cqui.c(cquh.a(0), cquh.g(xan.a), cquh.e(xan.b, v), cquh.f(u)));
        }
        v = ibm.j();
        u = ibm.b();
        return new xaj(new Object[0], cqui.c(cquh.a(0), cquh.g(xan.a), cquh.e(xan.b, v), cquh.f(u)));
    }
}
