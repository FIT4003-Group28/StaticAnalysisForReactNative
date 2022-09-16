package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defr  reason: default package */
/* loaded from: classes6.dex */
public final class defr extends IdentityHashMap<Closeable, Executor> implements Closeable {
    public final defu a = new defu(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <V, U> dehn<U> a(deft<? super V, U> deftVar, V v) {
        defr defrVar = new defr();
        try {
            return deha.a(deftVar.a(defrVar.a, v));
        } finally {
            c(defrVar, dege.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <V, U> degp<U> b(defq<V, U> defqVar, V v) {
        defr defrVar = new defr();
        try {
            defw<U> a = defqVar.a(defrVar.a, v);
            Logger logger = defw.a;
            a.h(defrVar);
            return a.c;
        } finally {
            c(defrVar, dege.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Closeable closeable, Executor executor) {
        dbsk.s(executor);
        if (closeable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                put(closeable, executor);
            } else {
                defw.i(closeable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                defw.i(entry.getKey(), entry.getValue());
            }
            clear();
        }
    }
}
