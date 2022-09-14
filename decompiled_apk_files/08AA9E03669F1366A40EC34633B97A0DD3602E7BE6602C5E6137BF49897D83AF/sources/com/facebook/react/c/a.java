package com.facebook.react.c;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.ap;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: HeadlessJsTaskContext.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<aj, a> f3299a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<aj> f3300b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b> f3301c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f3302d = new AtomicInteger(0);
    private final Handler e = new Handler();
    private final Set<Integer> f = new CopyOnWriteArraySet();
    private final SparseArray<Runnable> g = new SparseArray<>();

    public static a a(aj ajVar) {
        a aVar = f3299a.get(ajVar);
        if (aVar == null) {
            a aVar2 = new a(ajVar);
            f3299a.put(ajVar, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private a(aj ajVar) {
        this.f3300b = new WeakReference<>(ajVar);
    }

    public void a(b bVar) {
        this.f3301c.add(bVar);
    }

    public void b(b bVar) {
        this.f3301c.remove(bVar);
    }

    public boolean a() {
        return this.f.size() > 0;
    }

    public synchronized void a(final int i) {
        boolean remove = this.f.remove(Integer.valueOf(i));
        com.facebook.j.a.a.a(remove, "Tried to finish non-existent task with id " + i + ".");
        Runnable runnable = this.g.get(i);
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
            this.g.remove(i);
        }
        ap.a(new Runnable() { // from class: com.facebook.react.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                for (b bVar : a.this.f3301c) {
                    bVar.onHeadlessJsTaskFinish(i);
                }
            }
        });
    }

    public synchronized boolean b(int i) {
        return this.f.contains(Integer.valueOf(i));
    }
}
