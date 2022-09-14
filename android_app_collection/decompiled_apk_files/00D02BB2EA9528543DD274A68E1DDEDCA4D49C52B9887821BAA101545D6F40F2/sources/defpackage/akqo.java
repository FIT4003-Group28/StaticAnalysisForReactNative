package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akqo  reason: default package */
/* loaded from: classes.dex */
public final class akqo {
    private static final dcqe a = dcqe.c("akqo");
    private static final double b = Math.log(2.0d);

    public static double a(akqs akqsVar) {
        return akqsVar.b.a - akqsVar.a.a;
    }

    public static double b(akqs akqsVar) {
        return ((akqsVar.b.b - akqsVar.a.b) + 360.0d) % 360.0d;
    }

    public static boolean c(akqq akqqVar, akqq akqqVar2, double d) {
        return d(akqqVar, akqqVar2) <= d;
    }

    public static double d(akqq akqqVar, akqq akqqVar2) {
        return Math.max(Math.abs(akqqVar.a - akqqVar2.a), f(akqqVar.b, akqqVar2.b));
    }

    public static double e(akqq akqqVar, akqq akqqVar2) {
        double radians = Math.toRadians(akqqVar.a);
        double radians2 = Math.toRadians(akqqVar.b);
        double radians3 = Math.toRadians(akqqVar2.a);
        double abs = Math.abs(radians2 - Math.toRadians(akqqVar2.b));
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double sin2 = Math.sin(radians3);
        double cos2 = Math.cos(radians3);
        double cos3 = Math.cos(abs);
        return Math.atan2(Math.hypot(Math.sin(abs) * cos2, (cos * sin2) - ((sin * cos2) * cos3)), (sin * sin2) + (cos * cos2 * cos3)) * 6371010.0d;
    }

    public static double f(double d, double d2) {
        double abs = Math.abs(d - d2);
        return Math.min(abs, 360.0d - abs);
    }

    public static double g(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public static float h(akqq akqqVar, akqq akqqVar2) {
        if (akqqVar.equals(akqqVar2)) {
            return 0.0f;
        }
        double d = akqqVar.a;
        if (d == 90.0d) {
            return 180.0f;
        }
        if (d == -90.0d || i(akqqVar, akqqVar2)) {
            return 0.0f;
        }
        double radians = Math.toRadians(akqqVar2.b - akqqVar.b);
        double radians2 = Math.toRadians(akqqVar.a);
        double radians3 = Math.toRadians(akqqVar2.a);
        return bvop.a((float) Math.toDegrees(Math.atan2(Math.sin(radians) * Math.cos(radians3), (Math.cos(radians2) * Math.sin(radians3)) - ((Math.sin(radians2) * Math.cos(radians3)) * Math.cos(radians)))));
    }

    public static boolean i(akqq akqqVar, akqq akqqVar2) {
        return akqqVar.a == (-akqqVar2.a) && Math.abs(akqqVar.b - akqqVar2.b) == 180.0d;
    }

    public static List<akqq> j(List<akqq> list) {
        akqq akqqVar;
        akqq akqqVar2;
        ArrayList a2 = dchl.a();
        LinkedList i = dchl.i(list);
        if (i.isEmpty()) {
            return a2;
        }
        akqq akqqVar3 = (akqq) i.removeFirst();
        while (!i.isEmpty()) {
            akqq akqqVar4 = (akqq) i.getFirst();
            if (d(akqqVar3, akqqVar4) >= 4.0d) {
                if (i(akqqVar3, akqqVar4)) {
                    akqqVar2 = new akqq(dcyn.a, (akqqVar3.b + akqqVar4.b) / 2.0d);
                    akqqVar = akqqVar3;
                } else {
                    double radians = Math.toRadians(akqqVar3.a);
                    double radians2 = Math.toRadians(akqqVar3.b);
                    double cos = Math.cos(radians2);
                    double cos2 = Math.cos(radians);
                    double sin = Math.sin(radians2);
                    double cos3 = Math.cos(radians);
                    double sin2 = Math.sin(radians);
                    double radians3 = Math.toRadians(akqqVar4.a);
                    akqqVar = akqqVar3;
                    double radians4 = Math.toRadians(akqqVar4.b);
                    double cos4 = Math.cos(radians4);
                    double cos5 = Math.cos(radians3);
                    double sin3 = Math.sin(radians4);
                    double cos6 = Math.cos(radians3);
                    double d = ((cos * cos2) + (cos4 * cos5)) / 2.0d;
                    double d2 = ((sin * cos3) + (sin3 * cos6)) / 2.0d;
                    akqqVar2 = new akqq(Math.toDegrees(Math.atan2((sin2 + Math.sin(radians3)) / 2.0d, Math.hypot(d, d2))), Math.toDegrees(Math.atan2(d2, d)));
                }
                i.addFirst(akqqVar2);
                akqqVar3 = akqqVar;
            } else {
                a2.add(akqqVar3);
                akqqVar3 = (akqq) i.removeFirst();
            }
        }
        a2.add(akqqVar3);
        return a2;
    }

    public static akqs k(akqq akqqVar, double d) {
        dbsk.a(d > dcyn.a);
        dcvs b2 = dcvs.b(akqqVar.a, akqqVar.b);
        dcuy h = dcuy.h(d / 2.0d);
        dcvt dcvtVar = new dcvt(new dcvu(b2, b2));
        dcuz a2 = dcuz.a(h);
        dcuu dcuuVar = dcvtVar.a;
        double d2 = dcuuVar.a;
        double d3 = dcuuVar.b;
        dcva dcvaVar = dcvtVar.b;
        double d4 = dcvaVar.a;
        double d5 = dcvaVar.b;
        dcvtVar.f(dcvd.a(dcvs.a(d2, d4).k(), a2).g());
        dcvtVar.f(dcvd.a(dcvs.a(d2, d5).k(), a2).g());
        dcvtVar.f(dcvd.a(dcvs.a(d3, d4).k(), a2).g());
        dcvtVar.f(dcvd.a(dcvs.a(d3, d5).k(), a2).g());
        dcvu c = dcvtVar.c();
        dcvs r = c.r(0);
        dcvs r2 = c.r(2);
        akqr akqrVar = new akqr();
        akqrVar.d(new akqq(r.g(), r.i()));
        akqrVar.d(new akqq(r2.g(), r2.i()));
        return akqrVar.b();
    }

    public static double l(akqs akqsVar, int i, int i2, double d) {
        boolean z = true;
        dbsk.e(i > 0, "mapHeightPx must be positive, but %s is given.", i);
        if (i2 <= 0) {
            z = false;
        }
        dbsk.e(z, "mapWidthPx must be positive, but %s is given.", i2);
        akra a2 = akqg.a(akqsVar.b);
        akra a3 = akqg.a(akqsVar.a);
        int i3 = a2.a - a3.a;
        if (i3 < 0) {
            i3 += 1073741824;
        }
        double d2 = i3;
        double d3 = i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = a2.b - a3.b;
        double d5 = i;
        Double.isNaN(d4);
        Double.isNaN(d5);
        return Math.max(-1.0d, 30.0d - (Math.log(Math.max(d2 / d3, d4 / d5) * (d * 256.0d)) / b));
    }

    public static double m(double d, double d2, double d3, int i) {
        double radians = Math.toRadians(d3);
        double radians2 = Math.toRadians(d2);
        double d4 = i;
        Double.isNaN(d4);
        return ((((1.0d / Math.tan(radians / 2.0d)) * (6.283185307179586d / (Math.pow(2.0d, d) * 256.0d))) * d4) / 2.0d) * 6371010.0d * Math.cos(radians2);
    }

    public static double n(double d, double d2, double d3, int i) {
        if (d2 < -90.0d || d2 > 90.0d) {
            bvoo.h("invalid latitude %s", Double.valueOf(d2));
        }
        double radians = Math.toRadians(d3);
        double cos = Math.cos(Math.toRadians(d2));
        double tan = 1.0d / Math.tan(radians / 2.0d);
        double d4 = i;
        Double.isNaN(d4);
        return Math.max((double) dcyn.a, Math.log(((tan * (d4 / 2.0d)) * 6.283185307179586d) / ((d / (cos * 6371010.0d)) * 256.0d)) / b);
    }
}
