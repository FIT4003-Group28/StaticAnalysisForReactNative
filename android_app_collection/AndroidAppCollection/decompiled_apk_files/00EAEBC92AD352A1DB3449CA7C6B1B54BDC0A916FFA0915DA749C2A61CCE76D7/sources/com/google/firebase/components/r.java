package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r implements c.e.b.l.d, c.e.b.l.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<c.e.b.l.b<Object>, Executor>> f8559a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<c.e.b.l.a<?>> f8560b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f8561c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Executor executor) {
        this.f8561c = executor;
    }

    private synchronized Set<Map.Entry<c.e.b.l.b<Object>, Executor>> b(c.e.b.l.a<?> aVar) {
        ConcurrentHashMap<c.e.b.l.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f8559a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Queue<c.e.b.l.a<?>> queue;
        synchronized (this) {
            if (this.f8560b != null) {
                queue = this.f8560b;
                this.f8560b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (c.e.b.l.a<?> aVar : queue) {
                a(aVar);
            }
        }
    }

    @Override // c.e.b.l.c
    public void a(c.e.b.l.a<?> aVar) {
        u.a(aVar);
        synchronized (this) {
            if (this.f8560b != null) {
                this.f8560b.add(aVar);
                return;
            }
            for (Map.Entry<c.e.b.l.b<Object>, Executor> entry : b(aVar)) {
                entry.getValue().execute(q.a(entry, aVar));
            }
        }
    }

    @Override // c.e.b.l.d
    public <T> void a(Class<T> cls, c.e.b.l.b<? super T> bVar) {
        a(cls, this.f8561c, bVar);
    }

    @Override // c.e.b.l.d
    public synchronized <T> void a(Class<T> cls, Executor executor, c.e.b.l.b<? super T> bVar) {
        u.a(cls);
        u.a(bVar);
        u.a(executor);
        if (!this.f8559a.containsKey(cls)) {
            this.f8559a.put(cls, new ConcurrentHashMap<>());
        }
        this.f8559a.get(cls).put(bVar, executor);
    }

    @Override // c.e.b.l.d
    public synchronized <T> void b(Class<T> cls, c.e.b.l.b<? super T> bVar) {
        u.a(cls);
        u.a(bVar);
        if (!this.f8559a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap<c.e.b.l.b<Object>, Executor> concurrentHashMap = this.f8559a.get(cls);
        concurrentHashMap.remove(bVar);
        if (concurrentHashMap.isEmpty()) {
            this.f8559a.remove(cls);
        }
    }
}
