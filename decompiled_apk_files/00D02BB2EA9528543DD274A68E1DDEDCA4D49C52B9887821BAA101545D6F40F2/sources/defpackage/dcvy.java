package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dcvy  reason: default package */
/* loaded from: classes5.dex */
public final class dcvy implements Comparable<dcvy>, Serializable, dcxa, dcxj {
    transient dcyn a;
    public final int b;
    public dcvu c;
    public int d;
    private final AtomicInteger e = new AtomicInteger();
    private final dcwa[] f;
    private boolean g;

    public dcvy(List<dcwa> list) {
        dcvs dcvsVar;
        int i;
        dcwa dcwaVar;
        double d;
        dcwa dcwaVar2;
        b();
        int size = list.size();
        this.b = size;
        dcwa[] dcwaVarArr = new dcwa[size];
        this.f = dcwaVarArr;
        list.toArray(dcwaVarArr);
        int i2 = 0;
        this.d = 0;
        double d2 = dcyn.a;
        boolean z = true;
        if (size >= 3) {
            this.g = false;
            if (dcwk.b(dcvc.e(c(1)), c(0), c(2), c(1)) != h(c(1))) {
                this.g = true;
            }
        } else if (d()) {
            this.g = c(0).j >= dcyn.a ? false : z;
        } else {
            this.g = false;
        }
        if (size < 3) {
            if (!d() || !this.g) {
                this.c = dcvu.c();
                return;
            } else {
                this.c = dcvu.d();
                return;
            }
        }
        dcvn dcvnVar = new dcvn();
        while (i2 <= this.b) {
            dcwa c = c(i2);
            dcvs dcvsVar2 = new dcvs(c);
            if (dcvnVar.a.q()) {
                dcvnVar.a.e(dcvsVar2);
            } else {
                dcwa e = dcwa.e(dcwa.b(dcvnVar.b, c), dcwa.a(dcvnVar.b, c));
                double g = e.g();
                if (g < 1.91346E-15d) {
                    if (dcvnVar.b.d(c) < d2) {
                        dcvt dcvtVar = dcvnVar.a;
                        dcvtVar.a.f(-1.5707963267948966d, 1.5707963267948966d);
                        dcvtVar.b.c();
                    } else {
                        dcvnVar.a.f(dcvu.f(dcvnVar.c, dcvsVar2));
                    }
                } else {
                    dcvnVar.d.g(dcvnVar.c.h().b, dcvsVar2.h().b);
                    double k = dcvnVar.d.k();
                    double d3 = dcvc.c;
                    if (k >= 3.141592653589793d - (d3 + d3)) {
                        dcvnVar.d.c();
                    }
                    dcvnVar.e.c(dcvnVar.c.f().b, dcvsVar2.f().b);
                    dcwa e2 = dcwa.e(e, dcwa.f);
                    double d4 = e2.d(dcvnVar.b);
                    double d5 = e2.d(c);
                    double d6 = (g * 6.06638E-16d) + 6.83174E-31d;
                    if (d4 * d5 < d2 || Math.abs(d4) <= d6 || Math.abs(d5) <= d6) {
                        double d7 = dcvc.c;
                        double d8 = e.h;
                        dcvsVar = dcvsVar2;
                        double d9 = e.i;
                        double min = Math.min(1.5707963267948966d, (d7 * 3.0d) + Math.atan2(Math.sqrt((d8 * d8) + (d9 * d9)), Math.abs(e.j)));
                        double asin = Math.asin(dcwa.b(dcvnVar.b, c).g() * 0.5d * Math.sin(min));
                        dcuu dcuuVar = dcvnVar.e;
                        i = i2;
                        dcwaVar = c;
                        double d10 = (((asin + asin) - (dcuuVar.b - dcuuVar.a)) * 0.5d) + dcvc.c;
                        if (d4 > d6 || d5 < (-d6)) {
                            d = min;
                        } else {
                            dcuu dcuuVar2 = dcvnVar.e;
                            d = min;
                            dcuuVar2.b = Math.min(d, dcuuVar2.b + d10);
                        }
                        if (d5 <= d6 && d4 >= (-d6)) {
                            dcuu dcuuVar3 = dcvnVar.e;
                            dcuuVar3.a = Math.max(-d, dcuuVar3.a - d10);
                        }
                    } else {
                        i = i2;
                        dcwaVar = c;
                        dcvsVar = dcvsVar2;
                    }
                    dcvnVar.a.f(new dcvu(dcvnVar.e, dcvnVar.d));
                    dcwaVar2 = dcwaVar;
                    dcvnVar.b = dcwaVar2;
                    dcvnVar.c = dcvsVar;
                    i2 = i + 1;
                    d2 = dcyn.a;
                }
            }
            i = i2;
            dcwaVar2 = c;
            dcvsVar = dcvsVar2;
            dcvnVar.b = dcwaVar2;
            dcvnVar.c = dcvsVar;
            i2 = i + 1;
            d2 = dcyn.a;
        }
        double d11 = dcvc.c;
        dcvu i3 = dcvnVar.a.c().g(dcvs.a(d11 + d11, dcyn.a)).i();
        i3 = h(dcwa.f) ? new dcvu(new dcuu(i3.a.a, 1.5707963267948966d), dcva.e()) : i3;
        if (i3.b.h() && h(dcwa.g)) {
            i3 = new dcvu(new dcuu(-1.5707963267948966d, i3.a.b), i3.b);
        }
        this.c = i3;
        dcvn.a(i3);
    }

    public static dcvy a(List<dcwa> list, boolean z, dcvu dcvuVar) {
        return new dcvy(list, z, dcvuVar);
    }

    private final int l() {
        int i;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (c(i2).compareTo(c(i3)) < 0) {
                i3 = i2;
            }
            i2++;
        }
        return (i <= 0 || c(i3 + 1).compareTo(c((this.b + i3) + (-1))) < 0) ? i3 : i3 + this.b;
    }

    private Object readResolve() {
        b();
        return this;
    }

    public final void b() {
        int i = this.b;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.e.set(i2);
        dcyn dcynVar = new dcyn();
        this.a = dcynVar;
        dcynVar.a(this);
    }

    public final dcwa c(int i) {
        try {
            dcwa[] dcwaVarArr = this.f;
            int length = dcwaVarArr.length;
            if (i >= length) {
                i -= length;
            }
            return dcwaVarArr[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalStateException("Invalid vertex index");
        }
    }

    public final boolean d() {
        return this.b == 1;
    }

    @Override // defpackage.dcxj
    public final int e() {
        if (d()) {
            return 0;
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcvy) {
            dcvy dcvyVar = (dcvy) obj;
            if (Arrays.equals(this.f, dcvyVar.f) && dbsd.a(Boolean.valueOf(this.g), Boolean.valueOf(dcvyVar.g)) && dbsd.a(this.c, dcvyVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcxj
    public final void f(int i, dcxi dcxiVar) {
        dcxiVar.a(c(i), c(i + 1));
    }

    @Override // defpackage.dcxj
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        dcvu dcvuVar;
        if (this.a.c || (dcvuVar = this.c) == null || dcvuVar.h(dcwaVar)) {
            if (this.b > 32 && (this.a.c || this.e.decrementAndGet() <= 0)) {
                dcvr<dcxm> b = this.a.b();
                if (!b.n(dcwaVar)) {
                    return false;
                }
                dcyk c = b.g().c(0);
                boolean d = c.d();
                int e = c.e();
                if (e > 0) {
                    dcvm dcvmVar = new dcvm(b.h(), dcwaVar);
                    int i = -2;
                    int i2 = 0;
                    while (i2 < e) {
                        int f = c.f(i2);
                        if (f != i + 1) {
                            dcvmVar.a(c(f));
                        }
                        d ^= dcvmVar.c(c(f + 1));
                        i2++;
                        i = f;
                    }
                }
                return true == d;
            }
            return k(dcwaVar);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.dcxj
    public final boolean i() {
        return this.g;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public final int compareTo(dcvy dcvyVar) {
        int i = this.b;
        int i2 = dcvyVar.b;
        if (i != i2) {
            return i - i2;
        }
        if (i == 0) {
            return 0;
        }
        int l = l() % this.b;
        int l2 = dcvyVar.l() % dcvyVar.b;
        int i3 = 0;
        while (i3 < i) {
            int compareTo = c(l).compareTo(dcvyVar.c(l2));
            if (compareTo != 0) {
                return compareTo;
            }
            i3++;
            l++;
            l2++;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(dcwa dcwaVar) {
        if (this.b < 3) {
            return this.g;
        }
        dcvm dcvmVar = new dcvm(dcvc.d, dcwaVar, c(0));
        boolean z = this.g;
        for (int i = 1; i <= this.b; i++) {
            z ^= dcvmVar.c(c(i));
        }
        return true == z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Loop, ");
        sb.append(this.f.length);
        sb.append(" points. [");
        for (dcwa dcwaVar : this.f) {
            sb.append(dcwaVar.r());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    private dcvy(List<dcwa> list, boolean z, dcvu dcvuVar) {
        b();
        int size = list.size();
        this.b = size;
        dcwa[] dcwaVarArr = new dcwa[size];
        this.f = dcwaVarArr;
        this.c = dcvuVar;
        dcvn.a(dcvuVar);
        this.d = 0;
        this.g = z;
        list.toArray(dcwaVarArr);
    }
}
