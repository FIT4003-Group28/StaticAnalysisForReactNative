package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvp  reason: default package */
/* loaded from: classes.dex */
public final class amvp {
    public final List<amvo> a = new ArrayList();
    public akra b;

    public amvp(akra akraVar) {
        this.b = akraVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akra c(akra akraVar, akra akraVar2, akra akraVar3, double d, @dzsi akra akraVar4) {
        if (akraVar4 == null) {
            akraVar4 = new akra();
        }
        double d2 = 1.0d - d;
        double d3 = d2 * d2;
        double d4 = (d + d) * d2;
        double d5 = d * d;
        double d6 = akraVar.a;
        Double.isNaN(d6);
        double d7 = akraVar2.a;
        Double.isNaN(d7);
        double d8 = (d6 * d3) + (d7 * d4);
        double d9 = akraVar3.a;
        Double.isNaN(d9);
        double d10 = akraVar.b;
        Double.isNaN(d10);
        double d11 = akraVar2.b;
        Double.isNaN(d11);
        double d12 = akraVar3.b;
        Double.isNaN(d12);
        akraVar4.t((int) (d8 + (d9 * d5)), (int) ((d3 * d10) + (d4 * d11) + (d5 * d12)));
        return akraVar4;
    }

    public final double a(double d, akra akraVar) {
        for (int i = 0; i < this.a.size(); i++) {
            amvo amvoVar = this.a.get(i);
            if (d >= amvoVar.c()) {
                d -= amvoVar.c();
            } else {
                amvoVar.b(d, akraVar);
                return amvoVar.a(d);
            }
        }
        amvo amvoVar2 = (amvo) dcft.s(this.a);
        amvoVar2.b(amvoVar2.c(), akraVar);
        return amvoVar2.a(amvoVar2.c());
    }

    public final double b(akra akraVar) {
        akra akraVar2 = new akra();
        double d = dcyn.a;
        double d2 = 3.4028234663852886E38d;
        double d3 = 0.0d;
        for (amvo amvoVar : this.a) {
            double L = akra.L(amvoVar.a, amvoVar.b, akraVar, akraVar2);
            double r = amvoVar.a.r();
            Double.isNaN(L);
            double d4 = L / r;
            if (d4 < d2) {
                double J = akra.J(amvoVar.a, amvoVar.b, akraVar);
                double c = amvoVar.c();
                Double.isNaN(J);
                d = (J * c) + d3;
                d2 = d4;
            }
            d3 += amvoVar.c();
        }
        return d;
    }

    public final void d(akra akraVar, akra akraVar2) {
        akra akraVar3 = this.b;
        double d = akraVar3.a;
        Double.isNaN(d);
        double d2 = akraVar2.a;
        Double.isNaN(d2);
        double d3 = (d * 0.25d) + (d2 * 0.25d);
        double d4 = akraVar.a;
        Double.isNaN(d4);
        double d5 = d3 - (d4 * 0.5d);
        double d6 = akraVar3.b;
        Double.isNaN(d6);
        double d7 = akraVar2.b;
        Double.isNaN(d7);
        double d8 = akraVar.b;
        Double.isNaN(d8);
        double d9 = ((d6 * 0.25d) + (d7 * 0.25d)) - (d8 * 0.5d);
        if ((d5 * d5) + (d9 * d9) < 400.0d) {
            this.a.add(new amvm(akraVar3, akraVar, akraVar2));
            this.b = akraVar2;
            return;
        }
        akra c = c(akraVar3, akraVar, akraVar2, 0.5d, null);
        akra akraVar4 = new akra();
        akra akraVar5 = new akra();
        akra.H(this.b, akraVar, 0.5f, akraVar4);
        akra.H(akraVar, akraVar2, 0.5f, akraVar5);
        d(akraVar4, c);
        d(akraVar5, akraVar2);
    }
}
