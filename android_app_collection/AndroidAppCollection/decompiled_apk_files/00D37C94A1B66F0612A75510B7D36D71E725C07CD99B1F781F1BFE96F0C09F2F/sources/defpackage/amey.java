package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amey  reason: default package */
/* loaded from: classes.dex */
final class amey implements Runnable {
    public aniq a;
    public Executor b;

    public amey(aniq aniqVar, Executor executor) {
        aniqVar.getClass();
        this.a = aniqVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
