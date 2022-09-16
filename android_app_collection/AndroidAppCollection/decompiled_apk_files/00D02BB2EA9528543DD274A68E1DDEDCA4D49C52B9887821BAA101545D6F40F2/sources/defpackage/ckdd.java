package defpackage;
/* compiled from: PG */
/* renamed from: ckdd  reason: default package */
/* loaded from: classes.dex */
final class ckdd implements cnkc {
    private final long a;

    public ckdd(long j) {
        this.a = j;
    }

    @Override // defpackage.cnkc
    public final long a(long j) {
        if (j < 0) {
            return 0L;
        }
        if (j < 128) {
            return j;
        }
        long j2 = this.a;
        if (j >= j2) {
            return j2;
        }
        int i = (int) j;
        return ((-1) << (25 - Integer.numberOfLeadingZeros(i))) & i;
    }
}
