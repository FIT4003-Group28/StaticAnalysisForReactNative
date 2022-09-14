package b.a.a.a.a.c.a;
/* compiled from: RetryState.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f1135a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1136b;

    /* renamed from: c  reason: collision with root package name */
    private final d f1137c;

    public e(a aVar, d dVar) {
        this(0, aVar, dVar);
    }

    public e(int i, a aVar, d dVar) {
        this.f1135a = i;
        this.f1136b = aVar;
        this.f1137c = dVar;
    }

    public long a() {
        return this.f1136b.getDelayMillis(this.f1135a);
    }

    public e b() {
        return new e(this.f1135a + 1, this.f1136b, this.f1137c);
    }

    public e c() {
        return new e(this.f1136b, this.f1137c);
    }
}
