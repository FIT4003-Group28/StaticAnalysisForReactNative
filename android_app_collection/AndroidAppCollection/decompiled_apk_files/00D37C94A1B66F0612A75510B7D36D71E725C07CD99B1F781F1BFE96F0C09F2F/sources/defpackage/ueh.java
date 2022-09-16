package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ueh  reason: default package */
/* loaded from: classes4.dex */
public final class ueh implements uee {
    private static final AtomicInteger c = new AtomicInteger();
    public Context a;
    public ExecutorService b;

    @Override // defpackage.uee
    public final Future a(Callable callable) {
        return this.b.submit(callable);
    }

    @Override // defpackage.uee
    public final void b(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.uee
    public final void c(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, ubz ubzVar) {
        int incrementAndGet = c.incrementAndGet();
        boolean b = axpy.b();
        final ued uedVar = new ued(pendingResult, z, incrementAndGet);
        if (b && !ubzVar.d()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: uef
                @Override // java.lang.Runnable
                public final void run() {
                    ued.this.a();
                }
            }, ubzVar.a());
        }
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        String valueOf = String.valueOf(this.a.getPackageName());
        this.b.execute(new ueg(incrementAndGet, powerManager.newWakeLock(1, valueOf.length() != 0 ? "ChimeExecutorApi::".concat(valueOf) : new String("ChimeExecutorApi::")), runnable, b, uedVar, z, pendingResult));
    }

    @Override // defpackage.uee
    public final void d(Runnable runnable) {
        ChimeExecutorApiService.b(this.a, runnable);
    }
}
