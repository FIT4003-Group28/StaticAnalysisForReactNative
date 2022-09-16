package defpackage;
/* compiled from: PG */
/* renamed from: aznp  reason: default package */
/* loaded from: classes2.dex */
final class aznp implements Comparable {
    final Runnable a;
    final long b;
    final int c;
    volatile boolean d;

    public aznp(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aznp aznpVar = (aznp) obj;
        long j = this.b;
        long j2 = aznpVar.b;
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i == 0) {
            int i2 = this.c;
            int i3 = aznpVar.c;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
        return i;
    }
}
