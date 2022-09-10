package defpackage;
/* compiled from: PG */
/* renamed from: anaq  reason: default package */
/* loaded from: classes2.dex */
final class anaq {
    static final ddho a = cjth.d(-1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(dmpn dmpnVar) {
        dmph dmphVar = dmpnVar.c;
        if (dmphVar == null) {
            dmphVar = dmph.f;
        }
        return dmphVar.b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anap b(dmpn dmpnVar) {
        Object b;
        Object b2;
        boolean a2 = a(dmpnVar);
        ddho ddhoVar = dtxx.bZ;
        ddho ddhoVar2 = dtxx.bZ;
        dsqv<dmpn, alwt> dsqvVar = alwu.c;
        dmpnVar.f(dsqvVar);
        if (dmpnVar.V.k(dsqvVar.d)) {
            dsqv<dmpn, dnbc> dsqvVar2 = dmnl.F;
            dmpnVar.f(dsqvVar2);
            Object l = dmpnVar.V.l(dsqvVar2.d);
            if (l == null) {
                b = dsqvVar2.b;
            } else {
                b = dsqvVar2.b(l);
            }
            dnpo dnpoVar = ((dnbc) b).b;
            if (dnpoVar == null) {
                dnpoVar = dnpo.t;
            }
            if (new dsrh(dnpoVar.d, dnpo.e).contains(dnow.GENERIC_INTERACTIVE)) {
                ddhoVar = dtyi.cm;
                ddhoVar2 = dtyi.cr;
            }
            dsqv<dmpn, dnay> dsqvVar3 = dmnl.z;
            dmpnVar.f(dsqvVar3);
            Object l2 = dmpnVar.V.l(dsqvVar3.d);
            if (l2 == null) {
                b2 = dsqvVar3.b;
            } else {
                b2 = dsqvVar3.b(l2);
            }
            dniu dniuVar = ((dnay) b2).b;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
            int a3 = dnir.a(dniuVar.h);
            if (a3 != 0 && a3 == 2) {
                ddhoVar = dtyi.ce;
            }
        }
        dmlm x = akxf.x(dmpnVar);
        if (x == null) {
            if (!a2) {
                ddhoVar2 = a;
            }
            return anap.c(ddhoVar, ddhoVar2);
        }
        int i = x.e;
        int i2 = x.f;
        if (i != 0) {
            ddhoVar = cjth.d(i);
        }
        if (i2 != 0) {
            ddhoVar2 = cjth.d(i2);
        }
        if (!a2) {
            ddhoVar2 = a;
        }
        return anap.c(ddhoVar, ddhoVar2);
    }
}
