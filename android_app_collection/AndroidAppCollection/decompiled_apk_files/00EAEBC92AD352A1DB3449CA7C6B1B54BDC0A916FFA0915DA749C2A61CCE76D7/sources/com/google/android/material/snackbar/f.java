package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class f {

    /* renamed from: e  reason: collision with root package name */
    private static f f8164e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f8165a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f8166b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f8167c;

    /* renamed from: d  reason: collision with root package name */
    private c f8168d;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            f.this.a((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f8170a;

        /* renamed from: b  reason: collision with root package name */
        int f8171b;

        /* renamed from: c  reason: collision with root package name */
        boolean f8172c;

        boolean a(b bVar) {
            return bVar != null && this.f8170a.get() == bVar;
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a() {
        if (f8164e == null) {
            f8164e = new f();
        }
        return f8164e;
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.f8170a.get();
        if (bVar != null) {
            this.f8166b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    private void b(c cVar) {
        int i = cVar.f8171b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f8166b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f8166b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private boolean c(b bVar) {
        c cVar = this.f8167c;
        return cVar != null && cVar.a(bVar);
    }

    public void a(b bVar) {
        synchronized (this.f8165a) {
            if (c(bVar) && !this.f8167c.f8172c) {
                this.f8167c.f8172c = true;
                this.f8166b.removeCallbacksAndMessages(this.f8167c);
            }
        }
    }

    void a(c cVar) {
        synchronized (this.f8165a) {
            if (this.f8167c == cVar || this.f8168d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void b(b bVar) {
        synchronized (this.f8165a) {
            if (c(bVar) && this.f8167c.f8172c) {
                this.f8167c.f8172c = false;
                b(this.f8167c);
            }
        }
    }
}
