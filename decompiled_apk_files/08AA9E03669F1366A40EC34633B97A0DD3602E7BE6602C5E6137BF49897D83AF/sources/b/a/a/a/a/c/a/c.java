package b.a.a.a.a.c.a;
/* compiled from: ExponentialBackoff.java */
/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final long f1126a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1127b;

    public c(long j, int i) {
        this.f1126a = j;
        this.f1127b = i;
    }

    @Override // b.a.a.a.a.c.a.a
    public long getDelayMillis(int i) {
        return (long) (this.f1126a * Math.pow(this.f1127b, i));
    }
}
