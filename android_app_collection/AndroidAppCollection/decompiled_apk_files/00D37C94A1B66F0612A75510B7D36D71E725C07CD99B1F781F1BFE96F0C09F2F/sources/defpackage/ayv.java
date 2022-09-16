package defpackage;
/* compiled from: PG */
/* renamed from: ayv  reason: default package */
/* loaded from: classes2.dex */
public final class ayv {
    public static final ayv a = new ayv(-3, -9223372036854775807L, -1);
    public final int b;
    public final long c;
    public final long d;

    private ayv(int i, long j, long j2) {
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static ayv a(long j, long j2) {
        return new ayv(-1, j, j2);
    }

    public static ayv b(long j) {
        return new ayv(0, -9223372036854775807L, j);
    }

    public static ayv c(long j, long j2) {
        return new ayv(-2, j, j2);
    }
}
