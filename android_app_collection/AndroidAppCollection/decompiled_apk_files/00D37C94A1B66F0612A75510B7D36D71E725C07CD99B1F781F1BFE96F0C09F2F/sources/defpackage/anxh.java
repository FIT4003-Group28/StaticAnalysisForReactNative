package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anxh  reason: default package */
/* loaded from: classes.dex */
public final class anxh implements Executor, rut {
    public final qst a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public anxh(qst qstVar) {
        this.a = qstVar;
        this.d = new rfm(qstVar.B);
    }

    @Override // defpackage.rut
    public final void a(rve rveVar) {
        anxg anxgVar;
        synchronized (this.b) {
            if (this.c == 2) {
                anxgVar = (anxg) this.b.peek();
                qnm.j(anxgVar != null);
            } else {
                anxgVar = null;
            }
            this.c = 0;
        }
        if (anxgVar != null) {
            anxgVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
