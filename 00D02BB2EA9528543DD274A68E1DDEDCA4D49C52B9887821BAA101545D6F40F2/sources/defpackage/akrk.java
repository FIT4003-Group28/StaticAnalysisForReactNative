package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: akrk  reason: default package */
/* loaded from: classes.dex */
public final class akrk {
    public static final akrk a = new akrk(new int[0]);
    private static final ThreadLocal<akra[]> d = new akri();
    public final int[] b;
    public float c;
    @dzsi
    private List<akra> e;
    @dzsi
    private volatile akrp f;
    private volatile float g;

    public akrk(int[] iArr) {
        this.c = 0.0f;
        this.b = iArr;
        this.g = -1.0f;
    }

    public akrk(int[] iArr, float f) {
        this(iArr);
        this.c = f;
    }

    public static akrk c(int[] iArr) {
        return new akrk(iArr);
    }

    public static akrk d(akra akraVar, akra akraVar2) {
        return new akrk(new int[]{akraVar.a, akraVar.b, akraVar2.a, akraVar2.b});
    }

    public static akrk e(List<akra> list) {
        int size = list.size();
        int[] iArr = new int[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            iArr[i2] = list.get(i).a;
            iArr[i2 + 1] = list.get(i).b;
        }
        return new akrk(iArr);
    }

    public static akrk f(akrk akrkVar, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 + i3;
        int[] iArr = new int[i4];
        System.arraycopy(akrkVar.b, i + i, iArr, 0, i4);
        return new akrk(iArr, akrkVar.c);
    }

    public static akrk g(doud doudVar) {
        return c(akqf.a(doudVar));
    }

    public static akrk h(dvzn dvznVar) {
        int min = Math.min(dvznVar.b.size(), dvznVar.c.size());
        int[] iArr = new int[min + min];
        akra akraVar = new akra();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            i += dvznVar.b.f(i3);
            i2 = akqf.b(i2, dvznVar.c.f(i3));
            akraVar.v(i, i2);
            int i4 = i3 + i3;
            iArr[i4] = akraVar.a;
            iArr[i4 + 1] = akraVar.b;
        }
        return c(iArr);
    }

    public static akrk i(List<doud> list) {
        int i = 0;
        for (Integer num : dchl.k(list, akrh.a)) {
            i += num.intValue();
        }
        int[] iArr = new int[i + i];
        int i2 = 0;
        for (doud doudVar : list) {
            int[] a2 = akqf.a(doudVar);
            int length = a2.length;
            System.arraycopy(a2, 0, iArr, i2, length);
            i2 += length;
        }
        return c(iArr);
    }

    public static akrk k(akrk akrkVar, float f, float f2) {
        boolean z = true;
        dbsk.a(f <= akrkVar.r());
        float f3 = f2 + f;
        if (f3 > akrkVar.r()) {
            z = false;
        }
        dbsk.a(z);
        akra akraVar = new akra(0, 0);
        akra akraVar2 = new akra(0, 0);
        int t = akrkVar.t(f / akrkVar.r(), akraVar);
        int t2 = akrkVar.t(f3 / akrkVar.r(), akraVar2);
        if (t2 < t) {
            t2 = t;
        }
        ArrayList f4 = dchl.f((t2 + 2) - t);
        f4.add(akraVar);
        while (t < t2) {
            t++;
            f4.add(akrkVar.m(t));
        }
        f4.add(akraVar2);
        return e(f4);
    }

    public final akrp a() {
        if (this.f == null) {
            if (l() > 0) {
                akrp a2 = akrp.a(this);
                dbsk.s(a2);
                this.f = a2;
            } else {
                this.f = new akrp(new akra(), new akra());
            }
        }
        return this.f;
    }

    public final akqs b() {
        return akqg.d(aksj.c(a()));
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akrk)) {
            return false;
        }
        return Arrays.equals(this.b, ((akrk) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final dvzn j() {
        dvzm bZ = dvzn.e.bZ();
        List<akra> q = q();
        int size = q.size();
        double d2 = dcyn.a;
        double d3 = 0.0d;
        int i = 0;
        while (i < size) {
            akra akraVar = q.get(i);
            double k = akraVar.k() * 1.0E7d;
            double o = 1.0E7d * akraVar.o();
            bZ.c((int) Math.round(k - d2));
            bZ.d((int) Math.round(o - d3));
            i++;
            d2 = k;
            d3 = o;
        }
        return bZ.bK();
    }

    public final int l() {
        return this.b.length >> 1;
    }

    public final akra m(int i) {
        int i2 = i + i;
        int[] iArr = this.b;
        return new akra(iArr[i2], iArr[i2 + 1], 0);
    }

    public final void n(int i, akra akraVar) {
        int i2 = i + i;
        int[] iArr = this.b;
        akraVar.a = iArr[i2];
        akraVar.b = iArr[i2 + 1];
        akraVar.c = 0;
    }

    public final int o(int i) {
        return this.b[i + i + 1];
    }

    public final akra p() {
        int[] iArr = this.b;
        int length = iArr.length - 2;
        return new akra(iArr[length], iArr[length + 1], 0);
    }

    public final synchronized List<akra> q() {
        if (this.e == null) {
            ArrayList f = dchl.f(l());
            for (int i = 0; i < l(); i++) {
                f.add(m(i));
            }
            this.e = f;
        }
        return this.e;
    }

    public final float r() {
        float f = 0.0f;
        if (this.g < 0.0f) {
            int l = l() - 1;
            for (int i = 0; i < l; i++) {
                f += s(i);
            }
            this.g = f;
        }
        return this.g;
    }

    public final float s(int i) {
        int i2 = i + i;
        int i3 = i2 + 2;
        int[] iArr = this.b;
        return (float) Math.hypot(iArr[i2] - iArr[i3], iArr[i2 + 1] - iArr[i3 + 1]);
    }

    public final int t(float f, akra akraVar) {
        if (f <= 0.0f) {
            n(0, akraVar);
            return 0;
        }
        int l = l() - 1;
        if (f >= 1.0f) {
            n(l, akraVar);
        } else {
            float r = r() * f;
            akra[] akraVarArr = (akra[]) dbsk.s(d.get());
            for (int i = 0; i < l; i++) {
                float s = s(i);
                if (s >= r) {
                    akra akraVar2 = akraVarArr[0];
                    akra akraVar3 = akraVarArr[1];
                    n(i, akraVar2);
                    n(i + 1, akraVar3);
                    akra.H(akraVar2, akraVar3, r / s, akraVar);
                    return i;
                }
                r -= s;
            }
            n(l, akraVar);
        }
        return l - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polyline{");
        for (int i = 0; i < this.b.length; i += 2) {
            if (i > 0) {
                sb.append(", ");
            }
            v(sb, i);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int u(float f, int i, int i2, akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4, boolean[] zArr) {
        int i3;
        n(i, akraVar);
        n(i2, akraVar2);
        int i4 = i + 1;
        float f2 = f;
        int i5 = i4;
        int i6 = -1;
        while (true) {
            i3 = i2 - 1;
            if (i5 > i3) {
                break;
            }
            n(i5, akraVar4);
            float M = akra.M(akraVar, akraVar2, akraVar4, akraVar3);
            float f3 = M > f2 ? M : f2;
            if (M > f2) {
                i6 = i5;
            }
            i5++;
            f2 = f3;
        }
        if (i6 >= 0) {
            int i7 = 1;
            zArr[i6] = true;
            if (i6 > i4) {
                i7 = u(f, i, i6, akraVar, akraVar2, akraVar3, akraVar4, zArr) + 1;
            }
            return i6 >= i3 ? i7 : i7 + u(f, i6, i2, akraVar, akraVar2, akraVar3, akraVar4, zArr);
        }
        return 0;
    }

    public final void v(StringBuilder sb, int i) {
        sb.append("(");
        sb.append(this.b[i]);
        sb.append(", ");
        sb.append(this.b[i + 1]);
        sb.append(")");
    }

    public final float w(int i) {
        int i2 = i + i;
        int[] iArr = this.b;
        return akrb.f(iArr[i2 + 2] - iArr[i2], iArr[i2 + 3] - iArr[i2 + 1]);
    }

    public final List<akrk> x(int i) {
        int i2;
        boolean z;
        int i3 = 1073741824;
        dbsk.b(i <= a().a.a && i + 1073741824 >= a().b.a, "The entire polyline's x coordinates should lie in [splitX, splitX + Model.WORLD_WIDTH]");
        if (l() < 2) {
            return dchl.b(this);
        }
        ArrayList a2 = dchl.a();
        akrj akrjVar = new akrj(l());
        akra m = m(0);
        akrjVar.a(m);
        akra akraVar = new akra();
        akrjVar.b = this.c;
        double d2 = dcyn.a;
        int i4 = 1;
        while (i4 < l()) {
            n(i4, akraVar);
            int i5 = akraVar.a;
            int i6 = m.a;
            if (i5 < i6) {
                int i7 = (i5 - i6) + i3;
                if (i7 < i6 - i5) {
                    int i8 = akraVar.b;
                    int i9 = m.b;
                    double d3 = i8 - i9;
                    double d4 = (i + i3) - i6;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    double d5 = d3 * d4;
                    double d6 = i7;
                    Double.isNaN(d6);
                    int round = i9 + ((int) Math.round(d5 / d6));
                    akra akraVar2 = new akra(i + 1073741823, round);
                    akrjVar = akrjVar;
                    akrjVar.a(akraVar2);
                    double y = m.y(akraVar2);
                    Double.isNaN(y);
                    double d7 = d2 + y;
                    a2.add(akrjVar.c());
                    akrjVar.b();
                    akrjVar.b = (float) d7;
                    akra akraVar3 = new akra(i, round);
                    akrjVar.a(akraVar3);
                    double y2 = akraVar3.y(akraVar);
                    Double.isNaN(y2);
                    d2 = d7 + y2;
                    z = true;
                }
                z = false;
            } else {
                if (i5 > i6 && (i2 = (i6 - i5) + i3) < i5 - i6) {
                    int i10 = akraVar.b;
                    int i11 = m.b;
                    double d8 = i10 - i11;
                    double d9 = i6 - i;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    double d10 = d8 * d9;
                    double d11 = i2;
                    Double.isNaN(d11);
                    int round2 = i11 + ((int) Math.round(d10 / d11));
                    akra akraVar4 = new akra(i, round2);
                    akrjVar.a(akraVar4);
                    double y3 = m.y(akraVar4);
                    Double.isNaN(y3);
                    double d12 = d2 + y3;
                    a2.add(akrjVar.c());
                    akrjVar.b();
                    akrjVar.b = (float) d12;
                    akra akraVar5 = new akra(1073741823 + i, round2);
                    akrjVar.a(akraVar5);
                    double y4 = akraVar5.y(akraVar);
                    Double.isNaN(y4);
                    d2 = d12 + y4;
                    z = true;
                }
                z = false;
            }
            if (!z) {
                double y5 = m.y(akraVar);
                Double.isNaN(y5);
                d2 += y5;
            }
            m.aa(akraVar);
            akrjVar.a(akraVar);
            i4++;
            i3 = 1073741824;
        }
        a2.add(akrjVar.c());
        return a2;
    }
}
