package com.facebook.common.h;

import com.facebook.common.d.i;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: SharedReference.java */
/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Object, Integer> f2306a = new IdentityHashMap();

    /* renamed from: b  reason: collision with root package name */
    private T f2307b;

    /* renamed from: c  reason: collision with root package name */
    private int f2308c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final c<T> f2309d;

    public d(T t, c<T> cVar) {
        this.f2307b = (T) i.a(t);
        this.f2309d = (c) i.a(cVar);
        a(t);
    }

    private static void a(Object obj) {
        synchronized (f2306a) {
            Integer num = f2306a.get(obj);
            if (num == null) {
                f2306a.put(obj, 1);
            } else {
                f2306a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private static void b(Object obj) {
        synchronized (f2306a) {
            Integer num = f2306a.get(obj);
            if (num == null) {
                com.facebook.common.e.a.c("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f2306a.remove(obj);
            } else {
                f2306a.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized T a() {
        return this.f2307b;
    }

    public synchronized boolean b() {
        return this.f2308c > 0;
    }

    public static boolean a(d<?> dVar) {
        return dVar != null && dVar.b();
    }

    public synchronized void c() {
        f();
        this.f2308c++;
    }

    public void d() {
        T t;
        if (e() == 0) {
            synchronized (this) {
                t = this.f2307b;
                this.f2307b = null;
            }
            this.f2309d.a(t);
            b(t);
        }
    }

    private synchronized int e() {
        f();
        i.a(this.f2308c > 0);
        this.f2308c--;
        return this.f2308c;
    }

    private void f() {
        if (!a((d<?>) this)) {
            throw new a();
        }
    }

    /* compiled from: SharedReference.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }
}
