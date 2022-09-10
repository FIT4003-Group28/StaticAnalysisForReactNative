package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degl  reason: default package */
/* loaded from: classes6.dex */
public final class degl extends AtomicReference<degk> implements Executor, Runnable {
    degn a;
    Executor b;
    Runnable c;
    Thread d;

    public degl(Executor executor, degn degnVar) {
        super(degk.NOT_RUN);
        this.b = executor;
        this.a = degnVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == degk.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            degm degmVar = this.a.a;
            if (degmVar.a == this.d) {
                this.a = null;
                dbsk.l(degmVar.b == null);
                degmVar.b = runnable;
                degmVar.c = this.b;
                this.b = null;
            } else {
                Executor executor = this.b;
                this.b = null;
                this.c = runnable;
                executor.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            this.c = null;
            runnable.run();
            return;
        }
        degm degmVar = new degm();
        degmVar.a = currentThread;
        this.a.a = degmVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = degmVar.b;
                boolean z = true;
                boolean z2 = runnable3 != null;
                Executor executor = degmVar.c;
                if (executor == null) {
                    z = false;
                }
                if (!z || !z2) {
                    return;
                }
                degmVar.b = null;
                degmVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            degmVar.a = null;
        }
    }
}
