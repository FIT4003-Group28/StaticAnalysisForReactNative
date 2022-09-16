package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqn  reason: default package */
/* loaded from: classes2.dex */
public final class aqn extends aqp {
    public volatile aqm a;
    public volatile aqm b;
    public List c;
    private Executor k;

    public aqn(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        aqm aqmVar = this.a;
        Executor executor = this.k;
        if (aqmVar.f == 1) {
            aqmVar.f = 2;
            executor.execute(aqmVar.c);
            return;
        }
        int i = aqmVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void b(List list) {
        this.c = list;
        aqo aqoVar = this.e;
        if (aqoVar != null) {
            if (aqh.b(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(aqoVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ((t) aqoVar).k(list);
            } else {
                ((t) aqoVar).i(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aqm aqmVar) {
        if (this.b == aqmVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.aqp
    public final void d() {
        if (this.a != null) {
            if (!this.g) {
                this.j = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
                this.a = null;
                return;
            }
            boolean z2 = this.a.a;
            aqm aqmVar = this.a;
            aqmVar.d.set(true);
            if (aqmVar.c.cancel(false)) {
                this.b = this.a;
            }
            this.a = null;
        }
    }
}
