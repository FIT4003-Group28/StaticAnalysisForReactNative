package defpackage;
/* compiled from: PG */
/* renamed from: eaqe  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqe implements Comparable<eapt>, eapt {
    public final eaol A(eapr eaprVar) {
        eaok c = eaor.c(eaprVar);
        return new eaol(c.h(this, eaor.b(eaprVar)), c);
    }

    public final String E(eatp eatpVar) {
        return eatpVar.h(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eapt)) {
            return false;
        }
        eapt eaptVar = (eapt) obj;
        if (e() != eaptVar.e()) {
            return false;
        }
        int e = e();
        for (int i = 0; i < e; i++) {
            if (g(i) != eaptVar.g(i) || x(i) != eaptVar.x(i)) {
                return false;
            }
        }
        return easy.g(j(), eaptVar.j());
    }

    protected abstract eaon f(int i, eaok eaokVar);

    public int h(eaop eaopVar) {
        int z = z(eaopVar);
        if (z != -1) {
            return g(z);
        }
        String valueOf = String.valueOf(eaopVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Field '");
        sb.append(valueOf);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int e = e();
        int i = 157;
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 23) + g(i2)) * 23) + x(i2).hashCode();
        }
        return i + j().hashCode();
    }

    public boolean i(eaop eaopVar) {
        return z(eaopVar) != -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public int compareTo(eapt eaptVar) {
        if (this == eaptVar) {
            return 0;
        }
        if (e() == eaptVar.e()) {
            int e = e();
            for (int i = 0; i < e; i++) {
                if (x(i) != eaptVar.x(i)) {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                if (g(i2) > eaptVar.g(i2)) {
                    return 1;
                }
                if (g(i2) < eaptVar.g(i2)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }

    public eaop x(int i) {
        return f(i, j()).a();
    }

    @Override // defpackage.eapt
    public final eaon y(int i) {
        return f(i, j());
    }

    public final int z(eaop eaopVar) {
        int e = e();
        for (int i = 0; i < e; i++) {
            if (x(i) == eaopVar) {
                return i;
            }
        }
        return -1;
    }

    public final boolean B(eapt eaptVar) {
        if (eaptVar != null) {
            return compareTo(eaptVar) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public final boolean C(eapt eaptVar) {
        if (eaptVar != null) {
            return compareTo(eaptVar) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public final boolean D(eapt eaptVar) {
        if (eaptVar != null) {
            return compareTo(eaptVar) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }
}
