package defpackage;
/* compiled from: PG */
/* renamed from: haj  reason: default package */
/* loaded from: classes3.dex */
public final class haj {
    private long b = 0;
    private long c = -1;
    final pxf a = new pxf();

    public final synchronized long a(long j) {
        long j2 = this.c;
        if (j2 != -1) {
            return j2;
        }
        Long l = (Long) this.a.b(j);
        if (l != null) {
            this.b = l.longValue();
        }
        return this.b;
    }

    public final synchronized void b() {
        this.c = -1L;
    }

    public final synchronized void c(long j, long j2) {
        if (this.b == j) {
            this.b = j2;
        }
    }

    public final synchronized void d() {
        this.c = 0L;
    }
}
