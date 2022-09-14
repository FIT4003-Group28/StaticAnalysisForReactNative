package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class t<T> implements d0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f5269a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final g<T> f5270b = new g<>();

    private T c(T t) {
        if (t != null) {
            synchronized (this) {
                this.f5269a.remove(t);
            }
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.d0
    public T a() {
        T a2 = this.f5270b.a();
        c(a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.d0
    public void b(T t) {
        boolean add;
        synchronized (this) {
            add = this.f5269a.add(t);
        }
        if (add) {
            this.f5270b.a(a(t), t);
        }
    }

    @Override // com.facebook.imagepipeline.memory.d0
    /* renamed from: get */
    public T mo179get(int i) {
        T a2 = this.f5270b.a(i);
        c(a2);
        return a2;
    }
}
