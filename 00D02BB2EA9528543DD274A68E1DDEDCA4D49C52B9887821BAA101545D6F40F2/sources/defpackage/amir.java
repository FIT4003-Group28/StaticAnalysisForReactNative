package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amir  reason: default package */
/* loaded from: classes.dex */
public final class amir implements Callable<Void> {
    public final dehq c;
    public final deig<Void> d;
    private final amiu f;
    private final amjn g;
    volatile boolean a = false;
    boolean b = false;
    private final Semaphore e = new Semaphore(1);

    public amir(amiu amiuVar, amjn amjnVar, dehq dehqVar, Executor executor) {
        this.f = amiuVar;
        this.g = amjnVar;
        this.c = dehqVar;
        deig<Void> d = deig.d();
        this.d = d;
        bvqd.a(d, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.g.b();
        this.b = true;
        notifyAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.g.b();
        this.a = true;
        notifyAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a8, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
        throw null;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Void call() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amir.call():java.lang.Object");
    }
}
