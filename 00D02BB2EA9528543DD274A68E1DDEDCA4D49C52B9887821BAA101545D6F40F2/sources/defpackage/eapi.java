package defpackage;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eapi  reason: default package */
/* loaded from: classes6.dex */
public final class eapi extends eaqj implements Serializable, eapt {
    public static final eapi a = new eapi(0, 0, 0, earp.E);
    private static final Set<eaoz> d;
    private static final long serialVersionUID = -12873158713873L;
    public final long b;
    public final eaok c;

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add(eaoz.l);
        hashSet.add(eaoz.k);
        hashSet.add(eaoz.j);
        hashSet.add(eaoz.i);
    }

    public eapi() {
        this(eaor.a(), earp.W());
    }

    private Object readResolve() {
        if (this.c == null) {
            return new eapi(this.b, earp.E);
        }
        return !eaou.b.equals(this.c.a()) ? new eapi(this.b, this.c.b()) : this;
    }

    public final boolean a(eaoz eaozVar) {
        if (eaozVar == null) {
            return false;
        }
        eaox a2 = eaozVar.a(this.c);
        if (!d.contains(eaozVar) && a2.d() >= this.c.B().d()) {
            return false;
        }
        return a2.b();
    }

    public final eapi b(long j) {
        return j == this.b ? this : new eapi(j, this.c);
    }

    public final int c() {
        return this.c.v().d(this.b);
    }

    @Override // defpackage.eaqe, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eapt eaptVar) {
        return compareTo(eaptVar);
    }

    public final int d() {
        return this.c.s().d(this.b);
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
        if (obj instanceof eapi) {
            eapi eapiVar = (eapi) obj;
            if (this.c.equals(eapiVar.c)) {
                return this.b == eapiVar.b;
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.eaqe
    protected final eaon f(int i, eaok eaokVar) {
        if (i != 0) {
            if (i == 1) {
                return eaokVar.s();
            }
            if (i == 2) {
                return eaokVar.p();
            }
            if (i == 3) {
                return eaokVar.m();
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return eaokVar.v();
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final boolean i(eaop eaopVar) {
        if (!a(eaopVar.a())) {
            return false;
        }
        eaoz b = eaopVar.b();
        return a(b) || b == eaoz.g;
    }

    @Override // defpackage.eapt
    public final eaok j() {
        return this.c;
    }

    @Override // defpackage.eaqe
    public final int k(eapt eaptVar) {
        if (this == eaptVar) {
            return 0;
        }
        if (eaptVar instanceof eapi) {
            eapi eapiVar = (eapi) eaptVar;
            if (this.c.equals(eapiVar.c)) {
                long j = this.b;
                long j2 = eapiVar.b;
                if (j < j2) {
                    return -1;
                }
                return j != j2 ? 1 : 0;
            }
        }
        return super.compareTo(eaptVar);
    }

    public final String toString() {
        return eaul.f.h(this);
    }

    public eapi(int i, int i2) {
        this(i, i2, 0, earp.E);
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final int h(eaop eaopVar) {
        if (eaopVar == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (i(eaopVar)) {
            return eaopVar.c(this.c).d(this.b);
        }
        String valueOf = String.valueOf(eaopVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Field '");
        sb.append(valueOf);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }

    public eapi(int i, int i2, int i3) {
        this(i, i2, i3, earp.E);
    }

    @Override // defpackage.eapt
    public final int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.c.s().d(this.b);
            }
            if (i == 2) {
                return this.c.p().d(this.b);
            }
            if (i == 3) {
                return this.c.m().d(this.b);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.c.v().d(this.b);
    }

    public eapi(int i, int i2, int i3, eaok eaokVar) {
        eaok b = eaor.d(eaokVar).b();
        long U = b.U(0L, i, i2, i3);
        this.c = b;
        this.b = U;
    }

    public eapi(long j, eaok eaokVar) {
        eaok d2 = eaor.d(eaokVar);
        long r = d2.a().r(eaou.b, j);
        eaok b = d2.b();
        this.b = b.n().d(r);
        this.c = b;
    }

    public eapi(long j, eaou eaouVar) {
        this(j, earp.X(eaouVar));
    }
}
