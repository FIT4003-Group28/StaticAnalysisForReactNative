package defpackage;
/* compiled from: PG */
/* renamed from: aov  reason: default package */
/* loaded from: classes.dex */
final class aov {
    public final long a;
    public final long b;

    public aov(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
