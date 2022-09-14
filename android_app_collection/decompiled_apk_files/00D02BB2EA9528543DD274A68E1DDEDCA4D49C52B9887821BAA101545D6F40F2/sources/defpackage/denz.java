package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: denz  reason: default package */
/* loaded from: classes6.dex */
public final class denz implements Executor, cpcf {
    public final cnof<?> a;
    public final Queue<deny> b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public denz(cnof<?> cnofVar) {
        this.a = cnofVar;
        this.d = new cojb(cnofVar.g);
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Void> cpcqVar) {
        deny denyVar;
        synchronized (this.b) {
            if (this.c == 2) {
                denyVar = this.b.peek();
                cnwc.b(denyVar != null);
            } else {
                denyVar = null;
            }
            this.c = 0;
        }
        if (denyVar != null) {
            denyVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
