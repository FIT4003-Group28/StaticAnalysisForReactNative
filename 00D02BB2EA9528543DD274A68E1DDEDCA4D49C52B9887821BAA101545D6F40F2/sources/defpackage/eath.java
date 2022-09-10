package defpackage;
/* compiled from: PG */
/* renamed from: eath  reason: default package */
/* loaded from: classes6.dex */
public final class eath extends easv {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int a;

    public eath(eaox eaoxVar, eaoz eaozVar) {
        super(eaoxVar, eaozVar);
        this.a = 100;
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long d() {
        return this.b.d() * 100;
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long e(long j, int i) {
        return this.b.f(j, i * 100);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eath) {
            eath eathVar = (eath) obj;
            if (this.b.equals(eathVar.b) && this.d == eathVar.d) {
                int i = eathVar.a;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long f(long j, long j2) {
        return this.b.f(j, easy.c(j2, 100));
    }

    @Override // defpackage.east, defpackage.eaox
    public final int h(long j, long j2) {
        return this.b.h(j, j2) / 100;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.b.hashCode();
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long i(long j, long j2) {
        return this.b.i(j, j2) / 100;
    }
}
