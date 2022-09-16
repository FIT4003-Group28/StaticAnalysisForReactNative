package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: yrq  reason: default package */
/* loaded from: classes4.dex */
final class yrq {
    private static final Object a = new Object();
    private final ExecutorService b;
    private boolean c;
    private boolean d;
    private Future e = anlz.q(false);

    public yrq(ExecutorService executorService) {
        this.b = executorService;
    }

    final void a() {
        synchronized (yrq.class) {
            if (this.e.isDone() || this.d) {
                return;
            }
            try {
                this.e.get(300L, TimeUnit.MILLISECONDS);
                this.d = true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                this.d = true;
            } catch (TimeoutException e) {
                zep.n("Timeout of 300 ms reached when loading GMS Cronet", e);
                this.d = true;
            }
        }
    }

    final void b(Throwable th) {
        synchronized (a) {
            if (this.c) {
                return;
            }
            this.c = true;
            zep.d("Unexpected error when loading Cronet from GMS Core", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Context context) {
        try {
            this.e = this.b.submit(new slg(context, 4));
        } catch (RejectedExecutionException e) {
            zep.d("Unable to schedule GMS Core Cronet loading task", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.e.isDone() && !this.d) {
            a();
        }
        try {
            if (!this.e.isDone()) {
                return false;
            }
            return ((Boolean) anlz.y(this.e)).booleanValue();
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }
}
