package defpackage;
/* compiled from: PG */
/* renamed from: aesq  reason: default package */
/* loaded from: classes.dex */
public final class aesq {
    public final long a;
    public final int b;

    private aesq(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public aesq(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static aesq a(long j, long j2, int i) {
        return new aesq(Math.max(0L, j - j2), i);
    }

    public static aesq b(azf azfVar, pwu pwuVar) {
        azfVar.j(pwuVar.a, 0, 8);
        pwuVar.G(0);
        return new aesq(pwuVar.d(), pwuVar.n());
    }
}
