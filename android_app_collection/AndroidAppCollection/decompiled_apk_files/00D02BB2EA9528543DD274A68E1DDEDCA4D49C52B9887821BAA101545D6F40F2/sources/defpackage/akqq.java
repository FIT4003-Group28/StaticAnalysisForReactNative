package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akqq  reason: default package */
/* loaded from: classes.dex */
public final class akqq implements Serializable {
    static final long serialVersionUID = 2026947877447454771L;
    public final double a;
    public final double b;

    public akqq() {
        this(dcyn.a, dcyn.a);
    }

    public akqq(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public static akqq c(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return new akqq(d * 1.0E-6d, d2 * 1.0E-6d);
    }

    public static akqq d(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return new akqq(d * 1.0E-7d, d2 * 1.0E-7d);
    }

    public static akqq e(dnoh dnohVar) {
        return new akqq(dnohVar.b, dnohVar.c);
    }

    public static akqq f(dpum dpumVar) {
        return new akqq(dpumVar.b, dpumVar.c);
    }

    public static akqq j(dhjz dhjzVar) {
        if (dhjzVar == null) {
            return null;
        }
        return new akqq(dhjzVar.c, dhjzVar.b);
    }

    @dzsi
    public static akqq l(@dzsi dtak dtakVar) {
        if (dtakVar == null) {
            return null;
        }
        int i = dtakVar.a;
        if ((i & 1) != 0 && (i & 2) != 0) {
            return d(dtakVar.b, dtakVar.c);
        }
        return null;
    }

    public static akqq m(dgrn dgrnVar) {
        return d(dgrnVar.b, dgrnVar.c);
    }

    public static akqq p(dgbk dgbkVar) {
        return new akqq(dgbkVar.b, dgbkVar.c);
    }

    @dzsi
    public static akqq q(@dzsi dwzj dwzjVar) {
        if (dwzjVar == null) {
            return null;
        }
        return c(dwzjVar.b, dwzjVar.c);
    }

    public static akqq t(dcvs dcvsVar) {
        return new akqq(dcvsVar.g(), dcvsVar.i());
    }

    public static boolean v(@dzsi akqq akqqVar, @dzsi akqq akqqVar2, double d) {
        return (akqqVar == null || akqqVar2 == null || akqo.e(akqqVar, akqqVar2) >= d) ? false : true;
    }

    private static boolean x(double d, double d2) {
        return (Double.doubleToLongBits(d) & (-2)) == (Double.doubleToLongBits(d2) & (-2));
    }

    public final String a() {
        return String.format(Locale.US, "%.7f,%.7f", Double.valueOf(this.a), Double.valueOf(this.b));
    }

    public final String b() {
        return String.format(Locale.US, "%.7f, %.7f", Double.valueOf(this.a), Double.valueOf(this.b));
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akqq)) {
            return false;
        }
        akqq akqqVar = (akqq) obj;
        return x(this.a, akqqVar.a) && x(this.b, akqqVar.b);
    }

    public final dnoh g() {
        dnog bZ = dnoh.d.bZ();
        double d = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnoh dnohVar = (dnoh) bZ.b;
        int i = dnohVar.a | 1;
        dnohVar.a = i;
        dnohVar.b = d;
        double d2 = this.b;
        dnohVar.a = i | 2;
        dnohVar.c = d2;
        return bZ.bK();
    }

    public final dpum h() {
        dpul bZ = dpum.d.bZ();
        double d = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpum dpumVar = (dpum) bZ.b;
        int i = dpumVar.a | 1;
        dpumVar.a = i;
        dpumVar.b = d;
        double d2 = this.b;
        dpumVar.a = i | 2;
        dpumVar.c = d2;
        return bZ.bK();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(Double.doubleToLongBits(this.a)), Long.valueOf(Double.doubleToLongBits(this.b))});
    }

    public final dhjz i() {
        dhjy bZ = dhjz.e.bZ();
        double d = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d;
        double d2 = this.b;
        dhjzVar.a = i | 1;
        dhjzVar.b = d2;
        return bZ.bK();
    }

    public final dtak k() {
        dtaj bZ = dtak.d.bZ();
        int i = (int) (this.a * 1.0E7d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtak dtakVar = (dtak) bZ.b;
        int i2 = dtakVar.a | 1;
        dtakVar.a = i2;
        dtakVar.b = i;
        double d = this.b;
        dtakVar.a = i2 | 2;
        dtakVar.c = (int) (d * 1.0E7d);
        return bZ.bK();
    }

    public final dgrn n() {
        dgrm bZ = dgrn.d.bZ();
        int i = (int) (this.a * 1.0E7d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrn dgrnVar = (dgrn) bZ.b;
        int i2 = dgrnVar.a | 1;
        dgrnVar.a = i2;
        dgrnVar.b = i;
        double d = this.b;
        dgrnVar.a = i2 | 2;
        dgrnVar.c = (int) (d * 1.0E7d);
        return bZ.bK();
    }

    public final duhe o() {
        duhd bZ = duhe.c.bZ();
        double d = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duhe duheVar = (duhe) bZ.b;
        duheVar.a = d;
        duheVar.b = this.b;
        return bZ.bK();
    }

    public final dwzj r() {
        dwzi bZ = dwzj.d.bZ();
        int i = (int) (this.a * 1000000.0d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwzj dwzjVar = (dwzj) bZ.b;
        int i2 = dwzjVar.a | 1;
        dwzjVar.a = i2;
        dwzjVar.b = i;
        double d = this.b;
        dwzjVar.a = i2 | 2;
        dwzjVar.c = (int) (d * 1000000.0d);
        return bZ.bK();
    }

    public final dwzq s() {
        dwzp bZ = dwzq.d.bZ();
        int i = (int) (this.a * 1000000.0d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwzq dwzqVar = (dwzq) bZ.b;
        int i2 = dwzqVar.a | 1;
        dwzqVar.a = i2;
        dwzqVar.b = i;
        double d = this.b;
        dwzqVar.a = i2 | 2;
        dwzqVar.c = (int) (d * 1000000.0d);
        return bZ.bK();
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final dcvs u() {
        return dcvs.b(this.a, this.b);
    }

    public final akqq w(akqq akqqVar) {
        return new akqq(this.a - akqqVar.a, this.b - akqqVar.b);
    }

    public akqq(duhe duheVar) {
        this(duheVar.a, duheVar.b);
    }
}
