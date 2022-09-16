package defpackage;
/* compiled from: PG */
/* renamed from: prc  reason: default package */
/* loaded from: classes4.dex */
final class prc {
    public final long a;
    public final long b;
    public boolean c;
    public prc d;
    public ozi e;

    public prc(long j, int i) {
        this.a = j;
        this.b = j + i;
    }

    public final int a(long j) {
        long j2 = this.a;
        int i = this.e.a;
        return (int) (j - j2);
    }

    public final prc b() {
        this.e = null;
        prc prcVar = this.d;
        this.d = null;
        return prcVar;
    }
}
