package defpackage;
/* compiled from: PG */
/* renamed from: clue  reason: default package */
/* loaded from: classes5.dex */
public final class clue {
    public static final clue a = new clue(-3, -9223372036854775807L, -1);
    public final int b;
    public final long c;
    public final long d;

    private clue(int i, long j, long j2) {
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static clue a(long j, long j2) {
        return new clue(-1, j, j2);
    }

    public static clue b(long j, long j2) {
        return new clue(-2, j, j2);
    }

    public static clue c(long j) {
        return new clue(0, -9223372036854775807L, j);
    }
}
