package defpackage;
/* compiled from: PG */
/* renamed from: kek  reason: default package */
/* loaded from: classes3.dex */
public final class kek extends fev {
    private final kej e;
    private final ffo f;

    public kek(ffo ffoVar, kej kejVar) {
        super(ffoVar, kejVar);
        this.f = ffoVar;
        this.e = kejVar;
    }

    @Override // defpackage.fev
    public final void nS(long j, long j2, long j3, long j4) {
        super.nS(j, j2, j3, j4);
        long j5 = j3 - j;
        this.e.e(a(j5), a(j5), a(j3));
    }

    @Override // defpackage.fev
    public final void nT(boolean z) {
        super.nT(false);
        this.f.x(false, false);
    }

    @Override // defpackage.fev
    public final void nX(boolean z) {
        super.nX(true);
        this.f.x(true, true);
        this.f.p(false);
    }
}
