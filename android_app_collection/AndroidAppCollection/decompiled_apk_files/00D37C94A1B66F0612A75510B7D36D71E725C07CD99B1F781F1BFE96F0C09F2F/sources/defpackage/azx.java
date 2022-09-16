package defpackage;
/* compiled from: PG */
/* renamed from: azx  reason: default package */
/* loaded from: classes2.dex */
public final class azx implements azy, bbg {
    private final long a;
    private final azw b;

    public azx(long j) {
        this(j, 0L);
    }

    @Override // defpackage.azy
    public final long a() {
        return this.a;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        return this.b;
    }

    @Override // defpackage.azy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bbg
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bbg
    public final long f(long j) {
        return 0L;
    }

    public azx(long j, long j2) {
        this.a = j;
        azz azzVar = j2 == 0 ? azz.a : new azz(0L, j2);
        this.b = new azw(azzVar, azzVar);
    }

    public azx() {
        this(-9223372036854775807L);
    }
}
