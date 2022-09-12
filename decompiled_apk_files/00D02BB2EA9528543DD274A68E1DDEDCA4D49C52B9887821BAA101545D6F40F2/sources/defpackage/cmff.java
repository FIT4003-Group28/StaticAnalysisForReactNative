package defpackage;
/* compiled from: PG */
/* renamed from: cmff  reason: default package */
/* loaded from: classes5.dex */
final class cmff {
    public final long a;
    public final long b;
    public boolean c;
    public cmjs d;
    public cmff e;

    public cmff(long j) {
        this.a = j;
        this.b = j + 65536;
    }

    public final int a(long j) {
        long j2 = this.a;
        int i = this.d.b;
        return (int) (j - j2);
    }

    public final cmff b() {
        this.d = null;
        cmff cmffVar = this.e;
        this.e = null;
        return cmffVar;
    }
}
