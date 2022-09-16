package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjs  reason: default package */
/* loaded from: classes.dex */
public final class anjs extends AtomicReference implements Executor, Runnable {
    anju a;
    Executor b;
    Runnable c;
    Thread d;

    public anjs(Executor executor, anju anjuVar) {
        super(anjr.NOT_RUN);
        this.b = executor;
        this.a = anjuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == anjr.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            anju anjuVar = this.a;
            anjuVar.getClass();
            anjt anjtVar = anjuVar.a;
            if (anjtVar.a == this.d) {
                this.a = null;
                aqxo.y(anjtVar.b == null);
                anjtVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                anjtVar.c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
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
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        anjt anjtVar = new anjt();
        anjtVar.a = currentThread;
        anju anjuVar = this.a;
        anjuVar.getClass();
        anjuVar.a = anjtVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = anjtVar.b;
                boolean z = true;
                boolean z2 = runnable3 != null;
                Executor executor = anjtVar.c;
                if (executor == null) {
                    z = false;
                }
                if (!z || !z2) {
                    return;
                }
                anjtVar.b = null;
                anjtVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            anjtVar.a = null;
        }
    }
}
