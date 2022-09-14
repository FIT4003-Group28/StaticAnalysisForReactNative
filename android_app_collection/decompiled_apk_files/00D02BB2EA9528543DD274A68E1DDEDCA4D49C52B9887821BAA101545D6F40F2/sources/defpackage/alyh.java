package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alyh  reason: default package */
/* loaded from: classes.dex */
public final class alyh implements Comparable<alyh> {
    public final int a;
    public final int b;
    public final int c;
    @dzsi
    public final altv d;
    public final int e;
    public final int f;
    public final int g;
    @dzsi
    private akrp h;
    @dzsi
    private akra i;
    @dzsi
    private akra j;

    public alyh(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public alyh(int i, int i2, int i3, @dzsi altv altvVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = altvVar;
        this.g = 18 - i;
        int i4 = 1073741824 >> i;
        this.e = (i2 * i4) - 536870912;
        this.f = -((i4 * (i3 + 1)) - 536870912);
        this.h = null;
        this.j = null;
        this.i = null;
    }

    @dzsi
    public static alyh a(int i, akra akraVar) {
        int i2 = akraVar.a;
        int i3 = akraVar.b;
        if (i3 <= -536870912 || i3 > 536870912) {
            return null;
        }
        int i4 = 30 - i;
        int i5 = (i2 + 536870912) >> i4;
        int i6 = ((-i3) + 536870912) >> i4;
        int i7 = 1 << i;
        if (i5 < 0) {
            i5 += i7;
        } else if (i5 >= i7) {
            i5 -= i7;
        }
        return new alyh(i, i5, i6);
    }

    public static alyh b(int i, int i2, int i3) {
        int i4 = 0;
        if (i <= 0) {
            return new alyh(0, 0, 0);
        }
        if (i > 30) {
            i = 30;
        }
        int i5 = 30 - i;
        int i6 = (i2 + 536870912) >> i5;
        int i7 = ((-i3) + 536870912) >> i5;
        int i8 = 1 << i;
        if (i6 < 0) {
            i6 += i8;
        } else if (i6 >= i8) {
            i6 -= i8;
        }
        if (i7 >= 0) {
            i4 = i7 >= i8 ? i8 - 1 : i7;
        }
        return new alyh(i, i6, i4);
    }

    public static alyh c(int i, akra akraVar) {
        return b(i, akraVar.a, akraVar.b);
    }

    public static void k(aksj aksjVar, int i, List<alyh> list, @dzsi aksj aksjVar2) {
        if (i < 0) {
            return;
        }
        alyh b = b(i, aksjVar.b.a, aksjVar.c.b);
        alyh b2 = b(i, aksjVar.c.a - 1, aksjVar.b.b + 1);
        int i2 = b.b;
        int i3 = b.c;
        int i4 = b2.b;
        int i5 = b2.c;
        int i6 = 1 << i;
        int i7 = ((i2 > i4 ? (i6 - i2) + i4 : i4 - i2) + 1) * ((i5 - i3) + 1);
        if (i7 < 0) {
            return;
        }
        if (i7 <= 2) {
            list.add(b);
            if (i7 == 2) {
                list.add(b2);
            }
        } else {
            int i8 = 0;
            if (i2 > i4) {
                for (int i9 = i2; i9 < i6; i9++) {
                    for (int i10 = i3; i10 <= i5; i10++) {
                        list.add(new alyh(i, i9, i10));
                    }
                }
                while (i8 <= i4) {
                    for (int i11 = i3; i11 <= i5; i11++) {
                        list.add(new alyh(i, i8, i11));
                    }
                    i8++;
                }
            } else if (i2 != i4 || (aksjVar.e() <= 536870912 && aksjVar.d() <= 536870912)) {
                for (int i12 = i2; i12 <= i4; i12++) {
                    for (int i13 = i3; i13 <= i5; i13++) {
                        list.add(new alyh(i, i12, i13));
                    }
                }
            } else {
                while (i8 < i6) {
                    for (int i14 = i3; i14 <= i5; i14++) {
                        list.add(new alyh(i, i8, i14));
                    }
                    i8++;
                }
            }
        }
        if (aksjVar2 == null) {
            return;
        }
        int i15 = 30 - i;
        int i16 = 1073741824 >> i;
        aksjVar2.a.r((i2 << i15) - 536870912, ((-(i5 << i15)) + 536870912) - i16, ((i4 << i15) - 536870912) + i16, (-(i3 << i15)) + 536870912);
        aksjVar2.a(aksjVar2.a);
    }

    public static int m(int i) {
        dbsk.a(i >= 0);
        return 1073741824 >> i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(alyh alyhVar) {
        alyh alyhVar2 = alyhVar;
        return dbzx.b.c(this.a, alyhVar2.a).c(this.b, alyhVar2.b).c(this.c, alyhVar2.c).b(this.d, alyhVar2.d, dcln.a.St()).i();
    }

    public final synchronized akra d() {
        akra akraVar = this.i;
        if (akraVar == null) {
            akra akraVar2 = new akra();
            int i = (1073741824 >> this.a) >> 1;
            akraVar2.t(this.e + i, this.f + i);
            this.i = akraVar2;
            return akraVar2;
        }
        return akraVar;
    }

    public final synchronized akra e() {
        akra akraVar = this.j;
        if (akraVar == null) {
            akra E = g().a.E(d());
            this.j = E;
            return E;
        }
        return akraVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alyh)) {
            return false;
        }
        alyh alyhVar = (alyh) obj;
        if (this.b != alyhVar.b || this.c != alyhVar.c || this.a != alyhVar.a) {
            return false;
        }
        return dbsd.a(this.d, alyhVar.d);
    }

    public final akrp f() {
        int i = 1073741824 >> this.a;
        return new akrp(new akra(this.e, this.f), new akra(this.e + i, this.f + i));
    }

    public final synchronized akrp g() {
        akrp akrpVar = this.h;
        if (akrpVar == null) {
            akrp f = f();
            this.h = f;
            return f;
        }
        return akrpVar;
    }

    public final int h() {
        return 1073741824 >> this.a;
    }

    public final int hashCode() {
        int i = (((this.a * 31) + this.b) * 31) + this.c;
        altv altvVar = this.d;
        return altvVar != null ? (i * 31) + altvVar.hashCode() : i;
    }

    public final void i(akrp akrpVar) {
        int i = 1073741824 >> this.a;
        int i2 = this.e;
        int i3 = this.f;
        akrpVar.r(i2, i3, i2 + i, i + i3);
    }

    public final alyh j(int i) {
        int i2 = this.a - i;
        return i2 <= 0 ? this : new alyh(i, this.b >> i2, this.c >> i2, this.d);
    }

    public final alyh l(altv altvVar) {
        return new alyh(this.a, this.b, this.c, altvVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(",");
        sb.append(this.c);
        sb.append(",");
        Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
