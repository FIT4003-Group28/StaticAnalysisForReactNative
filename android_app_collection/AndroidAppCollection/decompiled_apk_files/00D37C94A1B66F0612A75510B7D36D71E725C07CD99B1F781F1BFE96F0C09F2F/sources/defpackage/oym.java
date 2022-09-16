package defpackage;
/* compiled from: PG */
/* renamed from: oym  reason: default package */
/* loaded from: classes4.dex */
final class oym implements oyo {
    private final long a;
    private final int b;
    private final long c;

    public oym(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2 != -1 ? d(j2) : -1L;
    }

    @Override // defpackage.oyo
    public final long a() {
        return this.c;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        if (this.c == -1) {
            return 0L;
        }
        return this.a + ((j * this.b) / 8000000);
    }

    @Override // defpackage.oye
    public final boolean c() {
        return this.c != -1;
    }

    @Override // defpackage.oyo
    public final long d(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / this.b;
    }
}
