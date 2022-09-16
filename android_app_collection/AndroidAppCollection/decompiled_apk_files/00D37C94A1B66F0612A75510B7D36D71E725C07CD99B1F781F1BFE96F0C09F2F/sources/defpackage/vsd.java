package defpackage;
/* compiled from: PG */
/* renamed from: vsd  reason: default package */
/* loaded from: classes4.dex */
public final class vsd extends otk {
    private long i;

    public vsd(oui ouiVar) {
        super(ouiVar, otm.a);
        this.i = 0L;
    }

    @Override // defpackage.ouj
    protected final long K(long j) {
        return Math.max(0L, j - this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final long b() {
        return super.b() + this.i;
    }

    @Override // defpackage.otk, defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        if (i == 1001) {
            this.i = ((Long) obj).longValue();
        } else {
            super.k(i, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ouo
    public final otg m() {
        return null;
    }
}
