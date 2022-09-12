package defpackage;
/* compiled from: PG */
/* renamed from: amsa  reason: default package */
/* loaded from: classes2.dex */
public final class amsa {
    private final float[] a = new float[8];

    public static final float b(amkz amkzVar, amkz amkzVar2) {
        if (amkzVar.d(amkzVar2)) {
            float f = amkzVar.a;
            float f2 = amkzVar2.a;
            if (f <= f2 && amkzVar.b <= amkzVar2.b && amkzVar.c >= amkzVar2.c && amkzVar.d >= amkzVar2.d) {
                return 1.0f;
            }
            float max = Math.max(f2, f);
            float min = Math.min(amkzVar2.c, amkzVar.c);
            float f3 = min - max;
            float min2 = Math.min(amkzVar2.d, amkzVar.d) - Math.max(amkzVar2.b, amkzVar.b);
            if (f3 >= 0.0f && min2 >= 0.0f) {
                return (min2 * f3) / (amkzVar2.c() * amkzVar2.b());
            }
        }
        return 0.0f;
    }

    public final boolean a(aktc aktcVar, amrk amrkVar, amri amriVar, akra akraVar, amrj amrjVar) {
        dcdc<dmlo> dcdcVar = amrkVar.g;
        int size = dcdcVar.size();
        dmlo dmloVar = null;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            dmlo dmloVar2 = dcdcVar.get(i);
            float a = amriVar.a(aktcVar, amrkVar, akraVar, dmloVar2);
            if (a > f) {
                dmloVar = dmloVar2;
            }
            if (a > f) {
                f = a;
            }
        }
        if (f <= 0.0f || dmloVar == null) {
            return false;
        }
        amkz amkzVar = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!c(akzhVar, aktcVar, akraVar, dmloVar, amkzVar)) {
            return false;
        }
        amrkVar.f.a(amrkVar.a, amkzVar);
        amrjVar.a(akraVar);
        amrjVar.b = dmloVar;
        return true;
    }

    public final boolean c(akzh akzhVar, aktc aktcVar, akra akraVar, dmlo dmloVar, amkz amkzVar) {
        Object b;
        amku amkuVar;
        if (!akyx.o(akzhVar, akraVar, this.a)) {
            return false;
        }
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        dmpn k = aktcVar.k();
        dsqv<dmpn, akuj> dsqvVar = akvj.b;
        k.f(dsqvVar);
        Object l = k.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        akwy.a(f, f2, ((akuj) b).b, dmloVar, this.a);
        float[] fArr2 = this.a;
        float f3 = fArr2[0];
        float f4 = fArr2[1];
        amhf amhfVar = ((alks) aktcVar).c;
        amkzVar.a(0.0f, 0.0f, 0.0f, 0.0f);
        synchronized (amhfVar.b) {
            amhg amhgVar = amhfVar.a;
            if (amhgVar == null || (amkuVar = amhgVar.d) == null) {
                return false;
            }
            amkuVar.d(f3, f4, 1.0f, dmloVar, amku.a(amkuVar.a, dmloVar, amkuVar.b), amkzVar);
            return true;
        }
    }
}
