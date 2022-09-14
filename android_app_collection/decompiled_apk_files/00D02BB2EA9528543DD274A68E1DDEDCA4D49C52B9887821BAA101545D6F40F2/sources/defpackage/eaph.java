package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaph  reason: default package */
/* loaded from: classes6.dex */
public final class eaph extends eaqj implements Serializable, eapt {
    private static final long serialVersionUID = -268716875315837168L;
    public final long a;
    public final eaok b;

    public eaph() {
        this(eaor.a(), earp.W());
    }

    private Object readResolve() {
        if (this.b == null) {
            return new eaph(this.a, earp.E);
        }
        return !eaou.b.equals(this.b.a()) ? new eaph(this.a, this.b.b()) : this;
    }

    public final eaol a(eaou eaouVar) {
        return new eaol(m(), n(), o(), q(), r(), s(), this.b.m().d(this.a), this.b.c(eaor.e(eaouVar)));
    }

    public final eapg b() {
        return new eapg(this.a, this.b);
    }

    public final eapi c() {
        return new eapi(this.a, this.b);
    }

    @Override // defpackage.eaqe, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eapt eaptVar) {
        return compareTo(eaptVar);
    }

    public final eaph d(long j) {
        return j == this.a ? this : new eaph(j, this.b);
    }

    @Override // defpackage.eapt
    public final int e() {
        return 4;
    }

    @Override // defpackage.eaqe
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eaph) {
            eaph eaphVar = (eaph) obj;
            if (this.b.equals(eaphVar.b)) {
                return this.a == eaphVar.a;
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.eaqe
    protected final eaon f(int i, eaok eaokVar) {
        if (i != 0) {
            if (i == 1) {
                return eaokVar.L();
            }
            if (i == 2) {
                return eaokVar.D();
            }
            if (i == 3) {
                return eaokVar.n();
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return eaokVar.N();
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final int h(eaop eaopVar) {
        if (eaopVar == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        return eaopVar.c(this.b).d(this.a);
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final boolean i(eaop eaopVar) {
        return eaopVar.c(this.b).c();
    }

    @Override // defpackage.eapt
    public final eaok j() {
        return this.b;
    }

    @Override // defpackage.eaqe
    public final int k(eapt eaptVar) {
        if (this == eaptVar) {
            return 0;
        }
        if (eaptVar instanceof eaph) {
            eaph eaphVar = (eaph) eaptVar;
            if (this.b.equals(eaphVar.b)) {
                long j = this.a;
                long j2 = eaphVar.a;
                if (j < j2) {
                    return -1;
                }
                return j != j2 ? 1 : 0;
            }
        }
        return super.compareTo(eaptVar);
    }

    public final eaph l(int i) {
        return d(this.b.K().e(this.a, i));
    }

    public final int m() {
        return this.b.N().d(this.a);
    }

    public final int n() {
        return this.b.L().d(this.a);
    }

    public final int o() {
        return this.b.D().d(this.a);
    }

    public final int p() {
        return this.b.C().d(this.a);
    }

    public final int q() {
        return this.b.v().d(this.a);
    }

    public final int r() {
        return this.b.s().d(this.a);
    }

    public final int s() {
        return this.b.p().d(this.a);
    }

    public final eaph t(int i) {
        return d(this.b.C().p(this.a, i));
    }

    public final String toString() {
        return eaul.g.h(this);
    }

    public final eaph u(int i, int i2, int i3) {
        eaok eaokVar = this.b;
        return d(eaokVar.m().p(eaokVar.p().p(eaokVar.s().p(eaokVar.v().p(this.a, i), i2), i3), 0));
    }

    public eaph(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, earp.E);
    }

    @Override // defpackage.eapt
    public final int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.b.L().d(this.a);
            }
            if (i == 2) {
                return this.b.D().d(this.a);
            }
            if (i == 3) {
                return this.b.n().d(this.a);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.b.N().d(this.a);
    }

    public eaph(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, earp.E);
    }

    public eaph(int i, int i2, int i3, int i4, int i5, int i6, eaok eaokVar) {
        eaok b = eaor.d(eaokVar).b();
        long e = b.e(i, i2, i3, i4, i5, i6, 0);
        this.b = b;
        this.a = e;
    }

    public eaph(long j) {
        this(j, earp.W());
    }

    public eaph(long j, eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        this.a = d.a().r(eaou.b, j);
        this.b = d.b();
    }

    public eaph(long j, eaou eaouVar) {
        this(j, earp.X(eaouVar));
    }
}
