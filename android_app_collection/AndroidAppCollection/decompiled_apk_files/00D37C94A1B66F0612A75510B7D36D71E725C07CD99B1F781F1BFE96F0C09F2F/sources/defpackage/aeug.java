package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aeug  reason: default package */
/* loaded from: classes.dex */
public final class aeug extends IOException {
    private final Handler a;
    private boolean b;
    private final Set c;
    private final Runnable d;

    public aeug(int i) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        this.b = true;
        this.c = new HashSet();
        Runnable runnable = new Runnable() { // from class: aeuf
            @Override // java.lang.Runnable
            public final void run() {
                aeug.this.b();
            }
        };
        this.d = runnable;
        handler.postDelayed(runnable, i);
    }

    public final synchronized void a(Runnable runnable) {
        if (this.b) {
            this.c.add(runnable);
        } else {
            this.a.post(runnable);
        }
    }

    public final synchronized void b() {
        this.b = false;
        this.a.removeCallbacks(this.d);
        for (Runnable runnable : this.c) {
            this.a.post(runnable);
        }
    }

    public final synchronized boolean c() {
        return this.b;
    }
}
