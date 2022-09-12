package defpackage;
/* compiled from: PG */
/* renamed from: arlb  reason: default package */
/* loaded from: classes2.dex */
public final class arlb {
    private final doxf a;
    private final akrk b;
    private final alxh c;

    public arlb(doxf doxfVar, akrk akrkVar) {
        this.a = doxfVar;
        this.b = akrkVar;
        this.c = new alxh(akrkVar);
    }

    public final float a(akqq akqqVar) {
        int i;
        double d;
        int b;
        akra e = akra.e(akqqVar.a, akqqVar.b);
        double r = e.r();
        akrn b2 = this.c.b(e, 200.0d * r);
        if (b2 == null) {
            dowb dowbVar = this.a.c;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            int i2 = dowbVar.b;
            dowb dowbVar2 = this.a.b;
            if (dowbVar2 == null) {
                dowbVar2 = dowb.d;
            }
            b = (i2 + dowbVar2.b) / 2;
        } else {
            if (b2.d < this.b.l() - 1) {
                double d2 = dcyn.a;
                int i3 = 0;
                while (true) {
                    i = b2.d;
                    if (i3 >= i) {
                        break;
                    }
                    double s = this.b.s(i3);
                    Double.isNaN(s);
                    d2 += s;
                    i3++;
                }
                double y = this.b.m(i).y(b2.a);
                Double.isNaN(y);
                d = d2 + y;
            } else {
                d = (int) this.b.r();
            }
            b = amtg.b(this.a, (int) (d / r));
        }
        return b;
    }
}
