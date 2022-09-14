package b.a.a.a.a.a;

import android.content.Context;
/* compiled from: MemoryValueCache.java */
/* loaded from: classes.dex */
public class b<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f1051a;

    public b() {
        this(null);
    }

    public b(c<T> cVar) {
        super(cVar);
    }

    @Override // b.a.a.a.a.a.a
    protected T a(Context context) {
        return this.f1051a;
    }

    @Override // b.a.a.a.a.a.a
    protected void a(Context context, T t) {
        this.f1051a = t;
    }
}
