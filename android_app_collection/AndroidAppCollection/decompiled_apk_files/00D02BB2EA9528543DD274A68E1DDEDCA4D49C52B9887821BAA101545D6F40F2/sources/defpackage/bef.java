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
/* renamed from: bef  reason: default package */
/* loaded from: classes3.dex */
public final class bef implements bct {
    final Context a;
    public final bhr b;
    public final bcw c;
    public final bdn d;
    final bdw e;
    final List<Intent> f;
    Intent g;
    public bed h;
    public final bif i;
    private final Handler j;

    static {
        bbz.f("SystemAlarmDispatcher");
    }

    public bef(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.e = new bdw(applicationContext);
        this.b = new bhr();
        bdn g = bdn.g(context);
        this.d = g;
        bcw bcwVar = g.e;
        this.c = bcwVar;
        this.i = g.k;
        bcwVar.d(this);
        this.f = new ArrayList();
        this.g = null;
        this.j = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        c(new bec(this, bdw.g(this.a, str, z), 0));
    }

    public final void b() {
        bbz.e().a(new Throwable[0]);
        this.c.e(this);
        bhr bhrVar = this.b;
        if (!bhrVar.a.isShutdown()) {
            bhrVar.a.shutdownNow();
        }
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        this.j.post(runnable);
    }

    public final void d() {
        e();
        PowerManager.WakeLock a = bhl.a(this.a, "ProcessCommand");
        try {
            a.acquire();
            this.d.k.a(new beb(this));
        } finally {
            a.release();
        }
    }

    public final void e() {
        if (this.j.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final void f(Intent intent, int i) {
        bbz.e().a(new Throwable[0]);
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            bbz.e();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            synchronized (this.f) {
                for (Intent intent2 : this.f) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(intent2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f) {
            boolean z = !this.f.isEmpty();
            this.f.add(intent);
            if (!z) {
                d();
            }
        }
    }
}
