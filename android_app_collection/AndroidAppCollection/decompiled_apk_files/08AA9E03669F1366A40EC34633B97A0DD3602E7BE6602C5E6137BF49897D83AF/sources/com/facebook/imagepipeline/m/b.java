package com.facebook.imagepipeline.m;
/* compiled from: BaseConsumer.java */
/* loaded from: classes.dex */
public abstract class b<T> implements j<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2836a = false;

    protected abstract void a();

    protected void a(float f) {
    }

    protected abstract void a(T t, boolean z);

    protected abstract void a(Throwable th);

    @Override // com.facebook.imagepipeline.m.j
    public synchronized void b(T t, boolean z) {
        if (this.f2836a) {
            return;
        }
        this.f2836a = z;
        try {
            a(t, z);
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.facebook.imagepipeline.m.j
    public synchronized void b(Throwable th) {
        if (this.f2836a) {
            return;
        }
        this.f2836a = true;
        try {
            a(th);
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.facebook.imagepipeline.m.j
    public synchronized void b() {
        if (this.f2836a) {
            return;
        }
        this.f2836a = true;
        try {
            a();
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.facebook.imagepipeline.m.j
    public synchronized void b(float f) {
        if (this.f2836a) {
            return;
        }
        try {
            a(f);
        } catch (Exception e) {
            a(e);
        }
    }

    protected void a(Exception exc) {
        com.facebook.common.e.a.c(getClass(), "unhandled exception", exc);
    }
}
