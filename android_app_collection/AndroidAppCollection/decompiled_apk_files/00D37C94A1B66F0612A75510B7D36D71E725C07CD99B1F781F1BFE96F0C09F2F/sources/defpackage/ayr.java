package defpackage;
/* compiled from: PG */
/* renamed from: ayr  reason: default package */
/* loaded from: classes2.dex */
public final class ayr implements azy {
    public final ayu a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public ayr(ayu ayuVar, long j, long j2, long j3, long j4, long j5) {
        this.a = ayuVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.azy
    public final long a() {
        return this.f;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        azz azzVar = new azz(j, ayt.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new azw(azzVar, azzVar);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }
}
