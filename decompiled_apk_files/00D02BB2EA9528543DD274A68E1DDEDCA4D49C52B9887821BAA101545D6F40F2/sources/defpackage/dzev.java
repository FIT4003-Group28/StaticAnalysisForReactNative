package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzev  reason: default package */
/* loaded from: classes6.dex */
public final class dzev extends dzeb implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public dzev(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }
}
