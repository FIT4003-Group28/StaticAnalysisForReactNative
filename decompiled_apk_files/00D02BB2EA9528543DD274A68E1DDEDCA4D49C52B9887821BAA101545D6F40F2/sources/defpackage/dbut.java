package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbut  reason: default package */
/* loaded from: classes.dex */
public final class dbut {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public dbut() {
        dbsk.a(true);
        dbsk.a(true);
        dbsk.a(true);
        dbsk.a(true);
        dbsk.a(true);
        dbsk.a(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbut) {
            dbut dbutVar = (dbut) obj;
            long j = dbutVar.a;
            long j2 = dbutVar.b;
            long j3 = dbutVar.c;
            long j4 = dbutVar.d;
            long j5 = dbutVar.e;
            long j6 = dbutVar.f;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("hitCount", 0L);
        b.g("missCount", 0L);
        b.g("loadSuccessCount", 0L);
        b.g("loadExceptionCount", 0L);
        b.g("totalLoadTime", 0L);
        b.g("evictionCount", 0L);
        return b.toString();
    }
}
