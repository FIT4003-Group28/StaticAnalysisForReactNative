package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsi  reason: default package */
/* loaded from: classes2.dex */
public final class bsi implements bqv {
    public static final String a = bqf.b("SystemAlarmDispatcher");
    final Context b;
    public final bwa c;
    public final bqy d;
    public final brq e;
    final brz f;
    final List g;
    Intent h;
    public bsg i;
    public final bwn j;
    private final Handler k;

    public bsi(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f = new brz(applicationContext);
        this.c = new bwa();
        brq h = brq.h(context);
        this.e = h;
        bqy bqyVar = h.f;
        this.d = bqyVar;
        this.j = h.j;
        bqyVar.b(this);
        this.g = new ArrayList();
        this.h = null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        d(new bsf(this, brz.d(this.b, str, z), 0));
    }

    public final void b() {
        if (this.k.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final void c() {
        bqf.a().d(new Throwable[0]);
        this.d.c(this);
        bwa bwaVar = this.c;
        if (!bwaVar.a.isShutdown()) {
            bwaVar.a.shutdownNow();
        }
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Runnable runnable) {
        this.k.post(runnable);
    }

    public final void e() {
        b();
        PowerManager.WakeLock a2 = bvq.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.e.j.a(new bse(this));
        } finally {
            a2.release();
        }
    }

    public final void f(Intent intent, int i) {
        bqf a2 = bqf.a();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        a2.d(new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            bqf.a();
            bqf.g(a, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.g) {
                for (Intent intent2 : this.g) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(intent2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean z = !this.g.isEmpty();
            this.g.add(intent);
            if (!z) {
                e();
            }
        }
    }
}
