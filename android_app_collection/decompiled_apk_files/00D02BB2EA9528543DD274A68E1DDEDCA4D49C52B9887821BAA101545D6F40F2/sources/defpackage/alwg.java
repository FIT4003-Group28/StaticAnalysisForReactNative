package defpackage;
/* compiled from: PG */
/* renamed from: alwg  reason: default package */
/* loaded from: classes.dex */
public final class alwg {
    public static float a(alyh alyhVar) {
        int i;
        altv altvVar = alyhVar.d;
        float f = 0.0f;
        if (altvVar != null && (i = altvVar.b) != Integer.MIN_VALUE) {
            if (i > 0) {
                f = 3.0f;
            } else if (i < 0) {
                f = -3.0f;
            }
        }
        return f * ((float) alyhVar.f().a.r());
    }

    public static void b(dmpn dmpnVar, alvi alviVar) {
        Object b;
        dsqv<dmpn, dmjo> dsqvVar = dmnl.M;
        dmpnVar.f(dsqvVar);
        if (dmpnVar.V.k(dsqvVar.d)) {
            dsqv<dmpn, dmjo> dsqvVar2 = dmnl.M;
            dmpnVar.f(dsqvVar2);
            Object l = dmpnVar.V.l(dsqvVar2.d);
            if (l == null) {
                b = dsqvVar2.b;
            } else {
                b = dsqvVar2.b(l);
            }
            dmjo dmjoVar = (dmjo) b;
            if (dmjoVar.a.size() <= 0) {
                return;
            }
            int i = dmjoVar.a.get(0).c;
            float f = i > 0 ? 3.0f : i < 0 ? -3.0f : 0.0f;
            akra akraVar = alviVar.a;
            double r = akraVar.r();
            double d = f;
            Double.isNaN(d);
            akraVar.c = (int) (r * d);
        }
    }
}
