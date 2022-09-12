package defpackage;
/* compiled from: PG */
/* renamed from: eatf  reason: default package */
/* loaded from: classes6.dex */
public final class eatf extends east {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public eatf(eaoz eaozVar, long j) {
        super(eaozVar);
        this.a = j;
    }

    @Override // defpackage.eaox
    public final boolean c() {
        return true;
    }

    @Override // defpackage.eaox
    public final long d() {
        return this.a;
    }

    @Override // defpackage.eaox
    public final long e(long j, int i) {
        return easy.a(j, i * this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eatf) {
            eatf eatfVar = (eatf) obj;
            if (this.d == eatfVar.d && this.a == eatfVar.a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eaox
    public final long f(long j, long j2) {
        long j3 = this.a;
        long j4 = 0;
        if (j2 != 1) {
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Multiplication overflows a long: ");
                    sb.append(j2);
                    sb.append(" * ");
                    sb.append(j3);
                    throw new ArithmeticException(sb.toString());
                }
            }
            j3 = j4;
        }
        return easy.a(j, j3);
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }

    @Override // defpackage.eaox
    public final long i(long j, long j2) {
        return easy.b(j, j2) / this.a;
    }
}
