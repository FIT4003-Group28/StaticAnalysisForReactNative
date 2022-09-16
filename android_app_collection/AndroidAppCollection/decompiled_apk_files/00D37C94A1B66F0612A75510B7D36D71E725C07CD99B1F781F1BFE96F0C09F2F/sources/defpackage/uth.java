package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uth  reason: default package */
/* loaded from: classes4.dex */
final class uth implements Executor, uua {
    private final uui a;
    private Runnable b;
    private boolean c;
    private boolean d;

    public uth(uui uuiVar) {
        this.a = uuiVar;
    }

    private final void b(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }

    @Override // defpackage.uua
    public final void a(Activity activity) {
        this.a.b(this);
        synchronized (this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                b(runnable);
                this.b = null;
            } else {
                this.c = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.c) {
                uuj uujVar = this.a.a.b;
                int i = uuj.c;
                if (uujVar.b.get() <= 0) {
                    this.b = runnable;
                }
            }
            b(runnable);
        }
    }
}
