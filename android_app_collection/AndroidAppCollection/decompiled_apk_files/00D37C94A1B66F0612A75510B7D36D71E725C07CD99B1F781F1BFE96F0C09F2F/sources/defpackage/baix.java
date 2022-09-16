package defpackage;
/* compiled from: PG */
/* renamed from: baix  reason: default package */
/* loaded from: classes2.dex */
final class baix extends bakc {
    private final baiw b;

    public baix(baiw baiwVar, bahv bahvVar) {
        super(bahp.j, bahvVar);
        this.b = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        baiw baiwVar = this.b;
        int Z = baiwVar.Z(j);
        return baiwVar.O(j, Z, baiwVar.U(j, Z));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 31;
    }

    @Override // defpackage.bakc, defpackage.bahn
    public final int d() {
        return 1;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.b.f;
    }

    @Override // defpackage.bajr
    public final int u(long j) {
        return this.b.R(j);
    }

    @Override // defpackage.bakc
    protected final int v(long j, int i) {
        baiw baiwVar = this.b;
        if (i > 28 || i <= 0) {
            return baiwVar.R(j);
        }
        return 28;
    }
}
