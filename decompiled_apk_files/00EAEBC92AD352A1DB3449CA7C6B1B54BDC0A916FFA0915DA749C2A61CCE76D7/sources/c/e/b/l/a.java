package c.e.b.l;

import com.google.firebase.components.u;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f4864a;

    /* renamed from: b  reason: collision with root package name */
    private final T f4865b;

    public a(Class<T> cls, T t) {
        u.a(cls);
        this.f4864a = cls;
        u.a(t);
        this.f4865b = t;
    }

    public T a() {
        return this.f4865b;
    }

    public Class<T> b() {
        return this.f4864a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f4864a, this.f4865b);
    }
}
