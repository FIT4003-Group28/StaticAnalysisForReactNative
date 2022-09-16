package defpackage;
/* compiled from: PG */
/* renamed from: bakf  reason: default package */
/* loaded from: classes2.dex */
public final class bakf extends baju {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public bakf(bahv bahvVar, bahx bahxVar) {
        super(bahvVar, bahxVar);
        this.b = 100;
    }

    @Override // defpackage.bajs, defpackage.bahv
    public final int a(long j, long j2) {
        return this.a.a(j, j2) / 100;
    }

    @Override // defpackage.baju, defpackage.bahv
    public final long b(long j, int i) {
        return this.a.c(j, i * 100);
    }

    @Override // defpackage.baju, defpackage.bahv
    public final long c(long j, long j2) {
        return this.a.c(j, bajw.c(j2, 100));
    }

    @Override // defpackage.baju, defpackage.bahv
    public final long d(long j, long j2) {
        return this.a.d(j, j2) / 100;
    }

    @Override // defpackage.baju, defpackage.bahv
    public final long e() {
        return this.a.e() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bakf) {
            bakf bakfVar = (bakf) obj;
            if (this.a.equals(bakfVar.a) && this.d == bakfVar.d) {
                int i = bakfVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
