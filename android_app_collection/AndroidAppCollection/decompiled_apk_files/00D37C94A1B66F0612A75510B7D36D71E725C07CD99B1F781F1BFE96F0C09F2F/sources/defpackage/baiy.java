package defpackage;
/* compiled from: PG */
/* renamed from: baiy  reason: default package */
/* loaded from: classes2.dex */
final class baiy extends bakc {
    private final baiw b;

    public baiy(baiw baiwVar, bahv bahvVar) {
        super(bahp.h, bahvVar);
        this.b = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        baiw baiwVar = this.b;
        return baiwVar.Q(j, baiwVar.Z(j));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 366;
    }

    @Override // defpackage.bakc, defpackage.bahn
    public final int d() {
        return 1;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.b.g;
    }

    @Override // defpackage.bajr
    public final int u(long j) {
        return this.b.ai(this.b.Z(j)) ? 366 : 365;
    }

    @Override // defpackage.bakc
    protected final int v(long j, int i) {
        if (i > 365 || i <= 0) {
            return u(j);
        }
        return 365;
    }
}
