package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: baoy  reason: default package */
/* loaded from: classes2.dex */
public final class baoy implements Callable {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public baoy(Runnable runnable) {
        this.a = runnable;
    }

    public baoy(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.b == 0) {
            this.a.run();
            return null;
        }
        this.a.run();
        return null;
    }
}
