package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aksj  reason: default package */
/* loaded from: classes.dex */
public final class aksj extends aksk {
    public akrp a;
    public final akra b;
    public final akra c;
    private int d;
    private int f;
    private int g;
    @dzsi
    private volatile akra h;
    @dzsi
    private volatile akra i;
    @dzsi
    private volatile akra j;
    @dzsi
    private volatile akra k;
    @dzsi
    private volatile akra l;
    @dzsi
    private volatile akra m;

    private aksj(akrp akrpVar) {
        akra akraVar = new akra();
        this.b = akraVar;
        akra akraVar2 = new akra();
        this.c = akraVar2;
        n(akraVar, akraVar2, akrpVar);
    }

    public static aksj c(akrp akrpVar) {
        return new aksj(akrpVar);
    }

    public static int[] k(aksj aksjVar, aksj aksjVar2) {
        dbsk.a(aksjVar.e);
        dbsk.a(!aksjVar2.e);
        int[] iArr = {0, 0};
        int i = aksjVar.c.a;
        int i2 = aksjVar2.b.a;
        if (i >= i2) {
            iArr[0] = i2;
            iArr[1] = Math.min(i, aksjVar2.c.a);
        } else {
            int i3 = aksjVar.b.a;
            if (i3 <= aksjVar2.c.a) {
                iArr[0] = Math.max(i3, i2);
                iArr[1] = aksjVar2.c.a;
            }
        }
        return iArr;
    }

    private final void n(akra akraVar, akra akraVar2, akrp akrpVar) {
        this.a = akrpVar;
        akra akraVar3 = akrpVar.a;
        akra akraVar4 = akrpVar.b;
        int i = akraVar3.a;
        if (i < 0) {
            this.d = -i;
        } else {
            int i2 = akraVar4.a;
            if (i2 > 1073741824) {
                this.d = 1073741824 - i2;
            }
        }
        akraVar3.P(akraVar);
        akraVar4.P(akraVar2);
        this.e = akraVar.a > akraVar2.a;
        int i3 = akraVar3.a;
        int i4 = this.d;
        this.f = i3 + i4;
        this.g = akraVar4.a + i4;
    }

    public final void a(akrp akrpVar) {
        n(this.b, this.c, akrpVar);
    }

    @Override // defpackage.aksk
    public final aksj b() {
        return this;
    }

    public final int d() {
        return this.a.m();
    }

    public final int e() {
        return this.c.b - this.b.b;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aksj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        aksj aksjVar = (aksj) obj;
        return this.b.equals(aksjVar.b) && this.c.equals(aksjVar.c) && this.a.equals(aksjVar.a);
    }

    @Override // defpackage.aksk
    public final int h() {
        return this.e ? 6 : 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    @Override // defpackage.aksk
    public final boolean j(akra akraVar) {
        int i;
        int i2 = (akraVar.a + this.d) & 1073741823;
        return i2 >= this.f && i2 <= this.g && (i = akraVar.b) >= this.b.b && i <= this.c.b;
    }

    public final aksj l(double d, double d2) {
        boolean z = false;
        if (d > dcyn.a && d2 > dcyn.a) {
            z = true;
        }
        dbsk.b(z, "Expand factors cannot be negative or zero");
        double d3 = d();
        Double.isNaN(d3);
        int round = (int) Math.round((d * d3) / 2.0d);
        double e = e();
        Double.isNaN(e);
        return m(round, (int) Math.round((d2 * e) / 2.0d));
    }

    public final aksj m(int i, int i2) {
        boolean z = false;
        if (i > 0 && i2 > 0) {
            z = true;
        }
        dbsk.b(z, "new size cannot be negative or zero");
        akra akraVar = new akra();
        this.a.t(akraVar);
        return c(new akrp(new akra(akraVar.a - i, akraVar.b - i2), new akra(akraVar.a + i, akraVar.b + i2)));
    }

    @Override // defpackage.aksk
    public final boolean o(akrq akrqVar) {
        if (!this.e) {
            return this.a.k(akrqVar);
        }
        if (akrqVar instanceof akrp) {
            akra akraVar = this.b;
            int i = akraVar.b;
            akrp akrpVar = (akrp) akrqVar;
            akra akraVar2 = akrpVar.b;
            if (i > akraVar2.b) {
                return false;
            }
            akra akraVar3 = this.c;
            int i2 = akraVar3.b;
            akra akraVar4 = akrpVar.a;
            if (i2 < akraVar4.b) {
                return false;
            }
            int i3 = akraVar.a;
            int i4 = akraVar2.a;
            return (i3 <= i4 && akraVar4.a < 536870912) || (i4 >= -536870912 && akraVar3.a >= akraVar4.a);
        }
        return super.o(akrqVar);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.aksk
    public final akra f(int i) {
        if (i == 0) {
            if (this.h == null) {
                this.h = new akra(this.c.a, this.b.b);
            }
            return this.h;
        } else if (i == 1) {
            return this.c;
        } else {
            if (i != 2) {
                if (i == 3) {
                    return this.b;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            if (this.i == null) {
                this.i = new akra(this.b.a, this.c.b);
            }
            return this.i;
        }
    }

    @Override // defpackage.aksk
    public final void i(int i, akra[] akraVarArr) {
        if (!this.e) {
            akraVarArr[0] = f(i);
            akraVarArr[1] = f((i + 1) % 4);
        } else if (i == 0) {
            akraVarArr[0] = f(0);
            akraVarArr[1] = f(1);
        } else if (i == 1) {
            akraVarArr[0] = f(1);
            if (this.j == null) {
                this.j = new akra(-536870913, this.c.b);
            }
            akraVarArr[1] = this.j;
        } else if (i == 2) {
            if (this.k == null) {
                this.k = new akra(536870912, this.c.b);
            }
            akraVarArr[0] = this.k;
            akraVarArr[1] = f(2);
        } else if (i == 3) {
            akraVarArr[0] = f(2);
            akraVarArr[1] = f(3);
        } else if (i == 4) {
            akraVarArr[0] = f(3);
            if (this.l == null) {
                this.l = new akra(536870912, this.b.b);
            }
            akraVarArr[1] = this.l;
        } else if (i != 5) {
        } else {
            if (this.m == null) {
                this.m = new akra(-536870913, this.b.b);
            }
            akraVarArr[0] = this.m;
            akraVarArr[1] = f(0);
        }
    }
}
