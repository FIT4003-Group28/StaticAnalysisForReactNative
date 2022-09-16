package defpackage;
/* compiled from: PG */
/* renamed from: nrj  reason: default package */
/* loaded from: classes3.dex */
public final class nrj implements nsw {
    private final nsk a;

    public nrj(nsk nskVar) {
        this.a = nskVar;
    }

    @Override // defpackage.nsw
    public final nsr a(ntd ntdVar, int i) {
        ntd ntdVar2 = ntd.NO_FLING;
        int ordinal = ntdVar.ordinal();
        if (ordinal == 0) {
            return i < this.a.b().centerY() ? nsr.FULL_BLEED : nsr.HIDDEN;
        } else if (ordinal == 1) {
            return nsr.FULL_BLEED;
        } else {
            if (ordinal == 2) {
                return nsr.HIDDEN;
            }
            throw new AssertionError(ntdVar);
        }
    }

    @Override // defpackage.nsw
    public final nsr b(boolean z, amvn amvnVar) {
        return nsr.FULL_BLEED;
    }

    @Override // defpackage.nsw
    public final nsr c(nsr nsrVar) {
        return nsr.HIDDEN;
    }

    @Override // defpackage.nsw
    public final ampq d(boolean z, amvn amvnVar) {
        return ampq.j(nsr.FULL_BLEED);
    }
}
