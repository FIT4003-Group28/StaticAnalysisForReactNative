package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class a3<T> extends y2<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f4040b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(T t) {
        this.f4040b = t;
    }

    @Override // c.e.a.b.d.g.y2
    public final boolean a() {
        return true;
    }

    @Override // c.e.a.b.d.g.y2
    public final T b() {
        return this.f4040b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a3) {
            return this.f4040b.equals(((a3) obj).f4040b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4040b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4040b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
