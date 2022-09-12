package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: cllt  reason: default package */
/* loaded from: classes5.dex */
public final class cllt {
    public static final UUID a = new UUID(0, 0);
    public static final UUID b;

    static {
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-2129748144642739255L, 8654423357094679310L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        b = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }
}
