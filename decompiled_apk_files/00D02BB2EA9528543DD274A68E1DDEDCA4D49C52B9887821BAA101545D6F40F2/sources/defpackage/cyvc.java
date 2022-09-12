package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: cyvc  reason: default package */
/* loaded from: classes5.dex */
public final class cyvc {
    private boolean a = false;
    private final List<cyvb> b = new ArrayList();

    public final synchronized void a() {
        this.a = true;
        for (cyvb cyvbVar : this.b) {
            if (!cyvbVar.a.isDone()) {
                cyvbVar.a.cancel(true);
            }
        }
        this.b.clear();
    }

    public final synchronized boolean b() {
        return this.a;
    }

    public final synchronized void c(Future<?> future) {
        if (b()) {
            future.cancel(true);
        } else {
            this.b.add(new cyvb(future));
        }
    }

    public final synchronized void d(Runnable runnable) {
        if (b()) {
            runnable.run();
        }
    }

    public final synchronized void e(Runnable runnable) {
        if (!b()) {
            runnable.run();
        }
    }
}
