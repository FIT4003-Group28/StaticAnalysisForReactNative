package defpackage;
/* compiled from: PG */
/* renamed from: akru  reason: default package */
/* loaded from: classes2.dex */
public final class akru {
    private final akrk a;
    private final int b;
    private final int c;

    public akru(akrk akrkVar, int i) {
        this.a = akrkVar;
        this.b = i;
        this.c = akrkVar.l();
    }

    public akru(akrk akrkVar, int i, int i2) {
        this.a = akrkVar;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final akra b(int i) {
        return this.a.m(this.b + i);
    }

    public final void c(int i, akra akraVar) {
        this.a.n(this.b + i, akraVar);
    }

    public final akrk d() {
        return akrk.f(this.a, this.b, this.c);
    }

    public final akrp e() {
        akra m = this.a.m(this.b);
        int i = m.a;
        int i2 = m.b;
        int i3 = i;
        int i4 = i2;
        for (int i5 = this.b + 1; i5 < this.c; i5++) {
            this.a.n(i5, m);
            int i6 = m.a;
            if (i6 < i) {
                i = i6;
            }
            if (i6 > i3) {
                i3 = i6;
            }
            int i7 = m.b;
            if (i7 < i4) {
                i4 = i7;
            }
            if (i7 > i2) {
                i2 = i7;
            }
        }
        m.t(i, i4);
        return new akrp(m, new akra(i3, i2));
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akru) {
            akru akruVar = (akru) obj;
            if (akruVar.b == this.b && akruVar.c == this.c && akruVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 31) * 31) + this.c) * 31) + this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("[(");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
