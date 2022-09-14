package com.google.firebase.components;
/* loaded from: classes.dex */
public class s<T> implements c.e.b.n.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8562c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f8563a = f8562c;

    /* renamed from: b  reason: collision with root package name */
    private volatile c.e.b.n.a<T> f8564b;

    public s(c.e.b.n.a<T> aVar) {
        this.f8564b = aVar;
    }

    @Override // c.e.b.n.a
    public T get() {
        T t = (T) this.f8563a;
        if (t == f8562c) {
            synchronized (this) {
                t = this.f8563a;
                if (t == f8562c) {
                    t = this.f8564b.get();
                    this.f8563a = t;
                    this.f8564b = null;
                }
            }
        }
        return t;
    }
}
