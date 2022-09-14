package com.facebook.imagepipeline.m;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
/* compiled from: ThreadHandoffProducerQueue.java */
/* loaded from: classes.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2813a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f2814b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2815c;

    public at(Executor executor) {
        this.f2815c = (Executor) com.facebook.common.d.i.a(executor);
    }

    public synchronized void a(Runnable runnable) {
        if (this.f2813a) {
            this.f2814b.add(runnable);
        } else {
            this.f2815c.execute(runnable);
        }
    }

    public synchronized void b(Runnable runnable) {
        this.f2814b.remove(runnable);
    }
}
