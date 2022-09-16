package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
@Deprecated
/* renamed from: ylg  reason: default package */
/* loaded from: classes4.dex */
public final class ylg implements MessageQueue.IdleHandler {
    public final ScheduledExecutorService b;
    public final boolean d;
    public final int e;
    public final AtomicBoolean f;
    private final boolean g;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Queue c = new LinkedList();

    public ylg(ScheduledExecutorService scheduledExecutorService, apga apgaVar) {
        this.b = scheduledExecutorService;
        boolean z = false;
        if (apgaVar == null) {
            this.e = 0;
            this.d = false;
            this.g = false;
        } else {
            int i = apgaVar.e;
            this.e = i;
            if (apgaVar.d && i > 0) {
                z = true;
            }
            this.d = z;
            this.g = apgaVar.h;
        }
        this.f = new AtomicBoolean(true);
    }

    public final void a(Runnable runnable, boolean z) {
        if (this.d && this.f.get()) {
            synchronized (this.f) {
                if (this.f.get()) {
                    this.c.add(new ylf(runnable, z));
                    if (this.g && this.c.size() == 1) {
                        Looper.myQueue().addIdleHandler(this);
                    }
                    return;
                }
            }
        }
        if (z) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        synchronized (this.f) {
            if (this.d && this.f.get() && !this.c.isEmpty()) {
                ylf ylfVar = (ylf) this.c.poll();
                if (ylfVar.b) {
                    ylfVar.a.run();
                } else {
                    this.b.execute(ylfVar.a);
                }
                return !this.c.isEmpty();
            }
            return false;
        }
    }
}
