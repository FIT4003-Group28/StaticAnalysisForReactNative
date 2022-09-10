package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwtk  reason: default package */
/* loaded from: classes.dex */
final class cwtk implements Executor, cwqt {
    private final cwrb a;
    private Runnable b;
    private boolean c;
    private boolean d;

    public cwtk(cwrb cwrbVar) {
        this.a = cwrbVar;
    }

    private final void a(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }

    @Override // defpackage.cwqt
    public final void b(Activity activity) {
        this.a.b(this);
        synchronized (this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                a(runnable);
                this.b = null;
            } else {
                this.c = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.c && this.a.a.a.b.get() <= 0) {
                this.b = runnable;
            }
            a(runnable);
        }
    }
}
