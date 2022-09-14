package com.facebook.f.b;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.d.i;
import java.util.HashSet;
import java.util.Set;
/* compiled from: DeferredReleaser.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f2366a;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f2369d = new Runnable() { // from class: com.facebook.f.b.a.1
        @Override // java.lang.Runnable
        public void run() {
            a.c();
            for (InterfaceC0053a interfaceC0053a : a.this.f2367b) {
                interfaceC0053a.d();
            }
            a.this.f2367b.clear();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final Set<InterfaceC0053a> f2367b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f2368c = new Handler(Looper.getMainLooper());

    /* compiled from: DeferredReleaser.java */
    /* renamed from: com.facebook.f.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053a {
        void d();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f2366a == null) {
                f2366a = new a();
            }
            aVar = f2366a;
        }
        return aVar;
    }

    public void a(InterfaceC0053a interfaceC0053a) {
        c();
        if (this.f2367b.add(interfaceC0053a) && this.f2367b.size() == 1) {
            this.f2368c.post(this.f2369d);
        }
    }

    public void b(InterfaceC0053a interfaceC0053a) {
        c();
        this.f2367b.remove(interfaceC0053a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        i.b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }
}
