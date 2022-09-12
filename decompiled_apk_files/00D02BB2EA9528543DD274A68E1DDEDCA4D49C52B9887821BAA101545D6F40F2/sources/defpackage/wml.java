package defpackage;

import android.content.Context;
/* renamed from: wml  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wml implements cqjb {
    static final cqjb a = new wml();

    private wml() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        String a2;
        int indexOf;
        wpv wpvVar = (wpv) cqkpVar;
        eapq af = wpvVar.af();
        boolean z = true;
        if (af == null || !wpvVar.ag().booleanValue() || wpvVar.Z(donz.CANCELED).booleanValue()) {
            return true;
        }
        if (xjz.f(af) == xjz.b) {
            return false;
        }
        Integer valueOf = Integer.valueOf(xjz.m(context, af));
        xjy f = xjz.f(af);
        Integer valueOf2 = Integer.valueOf((f == null || (indexOf = (a2 = f.a(context, (int) af.h().f())).indexOf("{0}")) == -1) ? 0 : dbrb.n('\n').r(a2.substring(indexOf)));
        Integer valueOf3 = Integer.valueOf(xjz.p(context));
        int indexOf2 = xjz.n(context).indexOf(97);
        Integer valueOf4 = Integer.valueOf((indexOf2 == -1 || indexOf2 == 0) ? 0 : 1);
        boolean z2 = valueOf.intValue() > valueOf3.intValue() && valueOf2.intValue() < valueOf4.intValue();
        boolean z3 = valueOf.intValue() < valueOf3.intValue() && valueOf2.intValue() > valueOf4.intValue();
        if (z2 || z3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
