package c.e.a.a;
/* loaded from: classes.dex */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f3667a;

    /* renamed from: b  reason: collision with root package name */
    private final T f3668b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3669c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t, d dVar) {
        this.f3667a = num;
        if (t != null) {
            this.f3668b = t;
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f3669c = dVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    @Override // c.e.a.a.c
    public Integer a() {
        return this.f3667a;
    }

    @Override // c.e.a.a.c
    public T b() {
        return this.f3668b;
    }

    @Override // c.e.a.a.c
    public d c() {
        return this.f3669c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f3667a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f3668b.equals(cVar.b()) && this.f3669c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f3667a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f3668b.hashCode()) * 1000003) ^ this.f3669c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f3667a + ", payload=" + this.f3668b + ", priority=" + this.f3669c + "}";
    }
}
