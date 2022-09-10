package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: amks  reason: default package */
/* loaded from: classes.dex */
public final class amks implements amha {
    private final amla b = new amla();
    private final akse c = new akse();
    private final float[] d = new float[8];
    private final btnc<dmpn, amkr> e = new btnc<>(20);
    public dzjj<amkt> a = new dzjs();

    public static int d(dmpn dmpnVar) {
        Object b;
        Object b2;
        Object b3;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        dmpnVar.f(dsqvVar);
        Object l = dmpnVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        if ((((akus) b).a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            dsqv<dmpn, akus> dsqvVar2 = akvj.a;
            dmpnVar.f(dsqvVar2);
            Object l2 = dmpnVar.V.l(dsqvVar2.d);
            if (l2 == null) {
                b2 = dsqvVar2.b;
            } else {
                b2 = dsqvVar2.b(l2);
            }
            akup akupVar = ((akus) b2).h;
            if (akupVar == null) {
                akupVar = akup.c;
            }
            if ((akupVar.a & 2) == 0) {
                return 0;
            }
            dsqv<dmpn, akus> dsqvVar3 = akvj.a;
            dmpnVar.f(dsqvVar3);
            Object l3 = dmpnVar.V.l(dsqvVar3.d);
            if (l3 == null) {
                b3 = dsqvVar3.b;
            } else {
                b3 = dsqvVar3.b(l3);
            }
            akup akupVar2 = ((akus) b3).h;
            if (akupVar2 == null) {
                akupVar2 = akup.c;
            }
            return akupVar2.b;
        }
        return 0;
    }

    @Override // defpackage.amha
    public final void a(amkk amkkVar) {
        amkr b;
        int d = d(amkkVar.a());
        if (d == 0 || !this.a.d(d) || (b = b(amkkVar)) == null) {
            return;
        }
        b.a = eaol.a();
        amkt i = this.a.i(d);
        if (!i.c.contains(b)) {
            i.b++;
        }
        i.d.add(b);
    }

    @dzsi
    public final amkr b(amkk amkkVar) {
        amkr a = this.e.a(amkkVar.a());
        if (a != null) {
            return a;
        }
        if (!amkkVar.i().f()) {
            return null;
        }
        akqi e = amkkVar.e();
        alvi a2 = amkkVar.i().a();
        dbsk.s(a2);
        akra akraVar = a2.a;
        akxf.J(amkkVar.a());
        amkr amkrVar = new amkr(e, akraVar);
        this.e.Pz(amkkVar.a(), amkrVar);
        return amkrVar;
    }

    public final boolean c(akra akraVar, amkz amkzVar, akzh akzhVar, int i) {
        if (!akyx.p(akzhVar, akraVar, this.c, this.d)) {
            return false;
        }
        amla amlaVar = this.b;
        akse akseVar = this.c;
        float f = i / 2;
        amlaVar.h(akseVar.b, akseVar.c, dcyn.a, f, f);
        return this.b.g(amkzVar);
    }
}
