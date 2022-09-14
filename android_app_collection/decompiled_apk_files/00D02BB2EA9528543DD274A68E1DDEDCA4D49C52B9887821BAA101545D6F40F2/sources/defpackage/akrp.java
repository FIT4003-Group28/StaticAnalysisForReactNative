package defpackage;
/* compiled from: PG */
/* renamed from: akrp  reason: default package */
/* loaded from: classes.dex */
public final class akrp extends akrq {
    public final akra a;
    public final akra b;
    @dzsi
    public volatile akra c;
    @dzsi
    public volatile akra d;

    public akrp(akra akraVar, akra akraVar2) {
        this.a = akraVar;
        this.b = akraVar2;
    }

    @dzsi
    public static akrp a(akrk akrkVar) {
        if (akrkVar.l() <= 0) {
            return null;
        }
        akra m = akrkVar.m(0);
        int i = m.a;
        int i2 = m.b;
        int i3 = i2;
        int i4 = i;
        for (int i5 = 1; i5 < akrkVar.l(); i5++) {
            akrkVar.n(i5, m);
            int i6 = m.a;
            if (i6 < i) {
                i = i6;
            }
            if (i6 > i4) {
                i4 = i6;
            }
            int i7 = m.b;
            if (i7 < i2) {
                i2 = i7;
            }
            if (i7 > i3) {
                i3 = i7;
            }
        }
        m.t(i, i2);
        return new akrp(m, new akra(i4, i3));
    }

    public static akrp f(akra[] akraVarArr) {
        akrp akrpVar = new akrp(new akra(), new akra());
        akrpVar.e(akraVarArr);
        return akrpVar;
    }

    public static akrp g(akra akraVar, akra akraVar2) {
        int i = akraVar.a;
        int i2 = akraVar2.a;
        int i3 = i < i2 ? i2 : i;
        if (i >= i2) {
            i = i2;
        }
        int i4 = akraVar.b;
        int i5 = akraVar2.b;
        int i6 = i4 < i5 ? i5 : i4;
        if (i4 >= i5) {
            i4 = i5;
        }
        return new akrp(new akra(i, i4), new akra(i3, i6));
    }

    public static akrp h(akra akraVar, int i) {
        return new akrp(new akra(akraVar.a - i, akraVar.b - i), new akra(akraVar.a + i, akraVar.b + i));
    }

    public final void e(akra[] akraVarArr) {
        akra akraVar = akraVarArr[0];
        int i = akraVar.a;
        int i2 = akraVar.b;
        int i3 = i;
        int i4 = i3;
        int i5 = i2;
        for (int i6 = 1; i6 < akraVarArr.length; i6++) {
            akra akraVar2 = akraVarArr[i6];
            int i7 = akraVar2.a;
            if (i7 < i3) {
                i3 = i7;
            }
            if (i7 > i4) {
                i4 = i7;
            }
            int i8 = akraVar2.b;
            if (i8 < i2) {
                i2 = i8;
            }
            if (i8 > i5) {
                i5 = i8;
            }
        }
        r(i3, i2, i4, i5);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrp) {
            akrp akrpVar = (akrp) obj;
            if (akrpVar.b.equals(this.b) && akrpVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.a.hashCode();
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final akrp i() {
        return this;
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean j(akra akraVar) {
        int i;
        int i2 = akraVar.a;
        akra akraVar2 = this.a;
        if (i2 >= akraVar2.a) {
            akra akraVar3 = this.b;
            return i2 <= akraVar3.a && (i = akraVar.b) >= akraVar2.b && i <= akraVar3.b;
        }
        return false;
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean k(akrq akrqVar) {
        if (akrqVar instanceof akrp) {
            akrp akrpVar = (akrp) akrqVar;
            akra akraVar = this.a;
            int i = akraVar.a;
            akra akraVar2 = akrpVar.b;
            if (i > akraVar2.a || akraVar.b > akraVar2.b) {
                return false;
            }
            akra akraVar3 = this.b;
            int i2 = akraVar3.a;
            akra akraVar4 = akrpVar.a;
            return i2 >= akraVar4.a && akraVar3.b >= akraVar4.b;
        }
        return super.k(akrqVar);
    }

    @Override // defpackage.akrq
    public final boolean l(akrq akrqVar) {
        akrp i = akrqVar.i();
        akra akraVar = this.a;
        int i2 = akraVar.a;
        akra akraVar2 = i.a;
        if (i2 > akraVar2.a || akraVar.b > akraVar2.b) {
            return false;
        }
        akra akraVar3 = this.b;
        int i3 = akraVar3.a;
        akra akraVar4 = i.b;
        return i3 >= akraVar4.a && akraVar3.b >= akraVar4.b;
    }

    public final int m() {
        return this.b.a - this.a.a;
    }

    public final int n() {
        return this.b.b - this.a.b;
    }

    public final akrp o(akrp akrpVar) {
        return new akrp(new akra(Math.min(this.a.a, akrpVar.a.a), Math.min(this.a.b, akrpVar.a.b)), new akra(Math.max(this.b.a, akrpVar.b.a), Math.max(this.b.b, akrpVar.b.b)));
    }

    public final akrp p(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("distance cannot be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        akra akraVar = this.a;
        akra akraVar2 = new akra(akraVar.a - i, akraVar.b - i);
        akra akraVar3 = this.b;
        return new akrp(akraVar2, new akra(akraVar3.a + i, akraVar3.b + i));
    }

    public final void q(akra akraVar, int i) {
        akra akraVar2 = this.a;
        akraVar2.a = Math.min(akraVar2.a, akraVar.a - i);
        akra akraVar3 = this.a;
        akraVar3.b = Math.min(akraVar3.b, akraVar.b - i);
        akra akraVar4 = this.b;
        akraVar4.a = Math.max(akraVar4.a, akraVar.a + i);
        akra akraVar5 = this.b;
        akraVar5.b = Math.max(akraVar5.b, akraVar.b + i);
        this.c = null;
        this.d = null;
    }

    public final void r(int i, int i2, int i3, int i4) {
        akra akraVar = this.a;
        akraVar.a = i;
        akraVar.b = i2;
        akra akraVar2 = this.b;
        akraVar2.a = i3;
        akraVar2.b = i4;
        if (this.c != null) {
            this.c.a = i3;
            this.c.b = i2;
        }
        if (this.d != null) {
            this.d.a = i;
            this.d.b = i4;
        }
    }

    public final void s(akra akraVar, akra akraVar2) {
        r(akraVar.a, akraVar.b, akraVar2.a, akraVar2.b);
    }

    public final void t(akra akraVar) {
        akra akraVar2 = this.a;
        int i = akraVar2.a;
        akra akraVar3 = this.b;
        akraVar.t((i + akraVar3.a) / 2, (akraVar2.b + akraVar3.b) / 2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.akrq
    public final int w() {
        return 4;
    }

    @Override // defpackage.akrq
    public final akra y() {
        return this.a;
    }

    @Override // defpackage.akrq
    public final akra x(int i) {
        if (i == 0) {
            if (this.c == null) {
                this.c = new akra(this.b.a, this.a.b);
            }
            return this.c;
        } else if (i == 1) {
            return this.b;
        } else {
            if (i != 2) {
                if (i == 3) {
                    return this.a;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            if (this.d == null) {
                this.d = new akra(this.a.a, this.b.b);
            }
            return this.d;
        }
    }
}
