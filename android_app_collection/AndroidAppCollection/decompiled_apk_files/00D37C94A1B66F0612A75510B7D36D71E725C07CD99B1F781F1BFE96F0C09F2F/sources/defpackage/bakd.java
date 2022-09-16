package defpackage;
/* compiled from: PG */
/* renamed from: bakd  reason: default package */
/* loaded from: classes2.dex */
public final class bakd extends bajs {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public bakd(bahx bahxVar, long j) {
        super(bahxVar);
        this.a = j;
    }

    @Override // defpackage.bahv
    public final long b(long j, int i) {
        return bajw.b(j, i * this.a);
    }

    @Override // defpackage.bahv
    public final long c(long j, long j2) {
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
        return bajw.b(j, j3);
    }

    @Override // defpackage.bahv
    public final long d(long j, long j2) {
        return bajw.d(j, j2) / this.a;
    }

    @Override // defpackage.bahv
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bakd) {
            bakd bakdVar = (bakd) obj;
            if (this.d == bakdVar.d && this.a == bakdVar.a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bahv
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
