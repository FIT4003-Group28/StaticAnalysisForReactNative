package defpackage;
/* compiled from: PG */
/* renamed from: eaox  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaox implements Comparable<eaox> {
    public abstract eaoz a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract long d();

    public abstract long e(long j, int i);

    public abstract long f(long j, long j2);

    public final long g(long j, int i) {
        if (i == Integer.MIN_VALUE) {
            return f(j, 2147483648L);
        }
        return e(j, -i);
    }

    public abstract int h(long j, long j2);

    public abstract long i(long j, long j2);
}
