package com.facebook.react.modules.core;

import com.facebook.react.bridge.ap;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
/* compiled from: ReactChoreographer.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f3524a;
    private int e = 0;
    private boolean f = false;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.a f3525b = com.facebook.react.modules.core.a.a();

    /* renamed from: c  reason: collision with root package name */
    private final b f3526c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<a.AbstractC0069a>[] f3527d = new ArrayDeque[a.values().length];

    static /* synthetic */ int b(e eVar) {
        int i = eVar.e;
        eVar.e = i - 1;
        return i;
    }

    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int f;

        a(int i) {
            this.f = i;
        }

        int a() {
            return this.f;
        }
    }

    public static void a() {
        if (f3524a == null) {
            ap.b();
            f3524a = new e();
        }
    }

    public static e b() {
        com.facebook.j.a.a.a(f3524a, "ReactChoreographer needs to be initialized.");
        return f3524a;
    }

    private e() {
        for (int i = 0; i < this.f3527d.length; i++) {
            this.f3527d[i] = new ArrayDeque<>();
        }
    }

    public synchronized void a(a aVar, a.AbstractC0069a abstractC0069a) {
        this.f3527d[aVar.a()].addLast(abstractC0069a);
        this.e++;
        com.facebook.j.a.a.a(this.e > 0);
        if (!this.f) {
            this.f3525b.a(this.f3526c);
            this.f = true;
        }
    }

    public synchronized void b(a aVar, a.AbstractC0069a abstractC0069a) {
        if (this.f3527d[aVar.a()].removeFirstOccurrence(abstractC0069a)) {
            this.e--;
            c();
        } else {
            com.facebook.common.e.a.d("ReactNative", "Tried to remove non-existent frame callback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.facebook.j.a.a.a(this.e >= 0);
        if (this.e != 0 || !this.f) {
            return;
        }
        this.f3525b.b(this.f3526c);
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0069a {
        private b() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0069a
        public void b(long j) {
            synchronized (e.this) {
                e.this.f = false;
                for (int i = 0; i < e.this.f3527d.length; i++) {
                    int size = e.this.f3527d[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((a.AbstractC0069a) e.this.f3527d[i].removeFirst()).b(j);
                        e.b(e.this);
                    }
                }
                e.this.c();
            }
        }
    }
}
