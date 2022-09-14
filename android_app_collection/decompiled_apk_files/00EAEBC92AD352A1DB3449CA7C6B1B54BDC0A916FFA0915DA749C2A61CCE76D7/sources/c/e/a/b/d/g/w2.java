package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class w2<T> extends y2<T> {

    /* renamed from: b  reason: collision with root package name */
    static final w2<Object> f4495b = new w2<>();

    private w2() {
    }

    @Override // c.e.a.b.d.g.y2
    public final boolean a() {
        return false;
    }

    @Override // c.e.a.b.d.g.y2
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
