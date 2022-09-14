package com.facebook.common.b;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: StatefulRunnable.java */
/* loaded from: classes.dex */
public abstract class e<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f2264a = new AtomicInteger(0);

    protected void a(Exception exc) {
    }

    protected void a(T t) {
    }

    protected void b() {
    }

    protected void b(T t) {
    }

    protected abstract T c();

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2264a.compareAndSet(0, 1)) {
            return;
        }
        try {
            T c2 = c();
            this.f2264a.set(3);
            try {
                a((e<T>) c2);
            } finally {
                b(c2);
            }
        } catch (Exception e) {
            this.f2264a.set(4);
            a(e);
        }
    }

    public void a() {
        if (this.f2264a.compareAndSet(0, 2)) {
            b();
        }
    }
}
