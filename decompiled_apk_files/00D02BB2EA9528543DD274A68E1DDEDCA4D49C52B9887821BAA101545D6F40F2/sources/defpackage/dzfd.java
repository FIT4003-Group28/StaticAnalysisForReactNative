package defpackage;
/* compiled from: PG */
/* renamed from: dzfd  reason: default package */
/* loaded from: classes6.dex */
final class dzfd implements Comparable<dzfd> {
    final Runnable a;
    final long b;
    final int c;
    volatile boolean d;

    public dzfd(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dzfd dzfdVar) {
        dzfd dzfdVar2 = dzfdVar;
        long j = this.b;
        long j2 = dzfdVar2.b;
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i == 0) {
            int i2 = this.c;
            int i3 = dzfdVar2.c;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
        return i;
    }
}
