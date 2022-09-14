package defpackage;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akra  reason: default package */
/* loaded from: classes.dex */
public class akra implements Comparable<akra>, Serializable {
    public int a;
    public int b;
    public int c;

    public akra() {
    }

    public akra(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public akra(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public akra(akra akraVar) {
        this.a = akraVar.a;
        this.b = akraVar.b;
        this.c = akraVar.c;
    }

    public static void B(akra akraVar, akra akraVar2, akra akraVar3) {
        akraVar3.a = akraVar.a + akraVar2.a;
        akraVar3.b = akraVar.b + akraVar2.b;
        akraVar3.c = akraVar.c + akraVar2.c;
    }

    public static void D(akra akraVar, akra akraVar2, akra akraVar3) {
        akraVar3.a = akraVar.a - akraVar2.a;
        akraVar3.b = akraVar.b - akraVar2.b;
        akraVar3.c = akraVar.c - akraVar2.c;
    }

    public static void F(akra akraVar, float f, akra akraVar2) {
        float x = akraVar.x();
        akraVar2.a = (int) ((akraVar.a * f) / x);
        akraVar2.b = (int) ((akraVar.b * f) / x);
        akraVar2.c = (int) ((akraVar.c * f) / x);
    }

    public static double G(akra akraVar, akra akraVar2) {
        akra E = akraVar2.E(akraVar);
        double atan2 = Math.atan2(E.a, E.b) * 57.29577951308232d;
        return atan2 < dcyn.a ? atan2 + 360.0d : atan2;
    }

    public static void H(akra akraVar, akra akraVar2, float f, akra akraVar3) {
        int i = akraVar2.a;
        int i2 = akraVar.a;
        akraVar3.a = ((int) ((i - i2) * f)) + i2;
        int i3 = akraVar2.b;
        int i4 = akraVar.b;
        akraVar3.b = ((int) ((i3 - i4) * f)) + i4;
        int i5 = akraVar2.c;
        int i6 = akraVar.c;
        akraVar3.c = ((int) (f * (i5 - i6))) + i6;
    }

    public static float J(akra akraVar, akra akraVar2, akra akraVar3) {
        int i;
        int i2;
        int i3;
        float f = akraVar2.a - akraVar.a;
        float f2 = akraVar2.b - akraVar.b;
        float f3 = akraVar2.c - akraVar.c;
        return ((((akraVar3.a - i) * f) + ((akraVar3.b - i2) * f2)) + ((akraVar3.c - i3) * f3)) / (((f * f) + (f2 * f2)) + (f3 * f3));
    }

    public static void K(akra akraVar, akra akraVar2, akra akraVar3, boolean z, akra akraVar4) {
        float J = J(akraVar, akraVar2, akraVar3);
        if (!z) {
            H(akraVar, akraVar2, J, akraVar4);
        } else if (J <= 0.0f) {
            akraVar4.aa(akraVar);
        } else if (J >= 1.0f) {
            akraVar4.aa(akraVar2);
        } else {
            H(akraVar, akraVar2, J, akraVar4);
        }
    }

    public static float L(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        K(akraVar, akraVar2, akraVar3, true, akraVar4);
        return akraVar3.y(akraVar4);
    }

    public static float M(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        K(akraVar, akraVar2, akraVar3, true, akraVar4);
        return akraVar3.A(akraVar4);
    }

    public static int N(int i) {
        while (i < -536870912) {
            i += 1073741824;
        }
        while (i >= 536870912) {
            i -= 1073741824;
        }
        return i;
    }

    public static int O(int i) {
        if (i < -536870912) {
            return -536870912;
        }
        if (i < 536870912) {
            return i;
        }
        return 536870911;
    }

    public static int V(String str) {
        String trim = str.trim();
        int i = -1;
        if (trim.indexOf(46) != -1) {
            String[] split = trim.split(Pattern.quote("."), -1);
            if (split.length > 2) {
                String valueOf = String.valueOf(trim);
                throw new NumberFormatException(valueOf.length() != 0 ? "Coordinate has more than one decimal point: ".concat(valueOf) : new String("Coordinate has more than one decimal point: "));
            }
            int parseInt = Integer.parseInt(split[0]);
            boolean contains = split[0].contains("-");
            String str2 = split[1];
            String substring = str2.substring(0, Math.min(6, str2.length()));
            if (substring.length() == 0 || substring.charAt(0) < '0' || substring.charAt(0) > '9') {
                StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 29);
                sb.append("Invalid fractional part in \"");
                sb.append(trim);
                sb.append("\"");
                throw new NumberFormatException(sb.toString());
            }
            dbsk.s(substring);
            if (substring.length() < 6) {
                StringBuilder sb2 = new StringBuilder(6);
                sb2.append(substring);
                for (int length = substring.length(); length < 6; length++) {
                    sb2.append('0');
                }
                substring = sb2.toString();
            }
            int parseInt2 = Integer.parseInt(substring);
            int i2 = parseInt * 1000000;
            if (true != contains) {
                i = 1;
            }
            return i2 + (parseInt2 * i);
        }
        return Integer.parseInt(trim) * 1000000;
    }

    public static akra b(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return e(d * 1.0E-7d, d2 * 1.0E-7d);
    }

    public static akra c(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return e(d * 1.0E-6d, d2 * 1.0E-6d);
    }

    public static akra d(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return e(d * 1.0E-5d, d2 * 1.0E-5d);
    }

    public static akra e(double d, double d2) {
        akra akraVar = new akra();
        akraVar.u(d, d2);
        return akraVar;
    }

    public static akra f(akqq akqqVar) {
        if (akqqVar == null) {
            return null;
        }
        return e(akqqVar.a, akqqVar.b);
    }

    public static akra g(akql akqlVar) {
        return c(akqlVar.a, akqlVar.b);
    }

    public static akra h(float f, float f2) {
        double d = f2;
        double d2 = (f * 3.1415927f) / 180.0f;
        double sin = Math.sin(d2);
        Double.isNaN(d);
        double cos = Math.cos(d2);
        Double.isNaN(d);
        return new akra((int) (sin * d), (int) (d * cos));
    }

    public static double l(int i) {
        double d = i;
        Double.isNaN(d);
        double atan = Math.atan(Math.exp(d * 5.8516723170686385E-9d)) - 0.7853981633974483d;
        return (atan + atan) * 57.29577951308232d;
    }

    public static double p(int i) {
        double d = i;
        Double.isNaN(d);
        double d2 = d * 5.8516723170686385E-9d * 57.29577951308232d;
        while (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        while (d2 < -180.0d) {
            d2 += 360.0d;
        }
        return d2;
    }

    public static double q(double d) {
        return 5.36870912E8d / (Math.cos(d * 0.017453292519943295d) * 2.0015115070354454E7d);
    }

    public static akra s(akra akraVar) {
        return new akra(akraVar.a, akraVar.b, akraVar.c);
    }

    public static int[] w(double d, double d2) {
        return new int[]{(int) Math.round(d2 * 0.017453292519943295d * 1.708913188941079E8d), (int) Math.min(Math.max(Math.round(Math.log(Math.tan((d * 0.017453292519943295d * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d), -2147483648L), 2147483647L)};
    }

    public final float A(akra akraVar) {
        float f = this.a - akraVar.a;
        float f2 = this.b - akraVar.b;
        float f3 = this.c - akraVar.c;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final akra C(akra akraVar) {
        return new akra(this.a + akraVar.a, this.b + akraVar.b, this.c + akraVar.c);
    }

    public final akra E(akra akraVar) {
        return new akra(this.a - akraVar.a, this.b - akraVar.b, this.c - akraVar.c);
    }

    public final akra I(akra akraVar, float f) {
        akra akraVar2 = new akra();
        H(this, akraVar, f, akraVar2);
        return akraVar2;
    }

    public final void P(akra akraVar) {
        akraVar.a = N(this.a);
        akraVar.b = this.b;
        akraVar.c = this.c;
    }

    public final akra Q(akra akraVar) {
        int i = this.a;
        int i2 = i - akraVar.a;
        if (i2 > 536870912) {
            return new akra(i - 1073741824, this.b);
        }
        return i2 < -536870912 ? new akra(i + 1073741824, this.b) : this;
    }

    public final void R(akra akraVar) {
        akraVar.a = O(this.a);
        akraVar.b = O(this.b);
        akraVar.c = this.c;
    }

    public final akqq S() {
        return new akqq(k(), o());
    }

    public final String T() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        return String.format(Locale.US, "%s,%s", decimalFormat.format(k()), decimalFormat.format(o()));
    }

    public final dwzq U() {
        dwzp bZ = dwzq.d.bZ();
        int i = i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwzq dwzqVar = (dwzq) bZ.b;
        dwzqVar.a |= 1;
        dwzqVar.b = i;
        int m = m();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwzq dwzqVar2 = (dwzq) bZ.b;
        dwzqVar2.a |= 2;
        dwzqVar2.c = m;
        return bZ.bK();
    }

    @Override // java.lang.Comparable
    /* renamed from: W */
    public final int compareTo(akra akraVar) {
        int i = this.a;
        int i2 = akraVar.a;
        if (i == i2) {
            int i3 = this.b;
            int i4 = akraVar.b;
            return i3 == i4 ? this.c - akraVar.c : i3 - i4;
        }
        return i - i2;
    }

    public final void X(akra akraVar) {
        this.a += akraVar.a;
        this.b += akraVar.b;
        this.c += akraVar.c;
    }

    public final void Y(double d) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double d2 = this.a;
        double d3 = this.b;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.a = (int) Math.round((d2 * cos) - (d3 * sin));
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.b = (int) Math.round((d2 * sin) + (d3 * cos));
    }

    public final void Z(float f) {
        this.a = (int) (this.a * f);
        this.b = (int) (this.b * f);
        this.c = (int) (this.c * f);
    }

    public final akqp a() {
        return new akqp(this);
    }

    public final void aa(akra akraVar) {
        this.a = akraVar.a;
        this.b = akraVar.b;
        this.c = akraVar.c;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof akra) {
            akra akraVar = (akra) obj;
            if (this.a == akraVar.a && this.b == akraVar.b && this.c == akraVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = ((i - i2) - i3) ^ (i3 >> 13);
        int i5 = ((i2 - i3) - i4) ^ (i4 << 8);
        int i6 = ((i3 - i4) - i5) ^ (i5 >> 13);
        int i7 = ((i4 - i5) - i6) ^ (i6 >> 12);
        int i8 = ((i5 - i6) - i7) ^ (i7 << 16);
        int i9 = ((i6 - i7) - i8) ^ (i8 >> 5);
        int i10 = ((i7 - i8) - i9) ^ (i9 >> 3);
        int i11 = ((i8 - i9) - i10) ^ (i10 << 10);
        return (i11 >> 15) ^ ((i9 - i10) - i11);
    }

    public final int i() {
        return (int) Math.round(k() * 1000000.0d);
    }

    public final int j() {
        return (int) Math.round(k() * 1.0E7d);
    }

    public final double k() {
        return l(this.b);
    }

    public final int m() {
        return (int) Math.round(o() * 1000000.0d);
    }

    public final int n() {
        return (int) Math.round(o() * 1.0E7d);
    }

    public final double o() {
        return p(this.a);
    }

    public final double r() {
        return q(k());
    }

    public final void t(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(37);
        sb.append("(");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final void u(double d, double d2) {
        int[] w = w(d, d2);
        t(w[0], w[1]);
    }

    public final void v(int i, int i2) {
        double d = i;
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        u(d * 1.0E-7d, d2 * 1.0E-7d);
    }

    public final float x() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public final float y(akra akraVar) {
        return (float) Math.sqrt(A(akraVar));
    }

    public final float z(akra akraVar) {
        double y = y(akraVar);
        double q = q(l((this.b + akraVar.b) / 2));
        Double.isNaN(y);
        return (float) (y / q);
    }
}
