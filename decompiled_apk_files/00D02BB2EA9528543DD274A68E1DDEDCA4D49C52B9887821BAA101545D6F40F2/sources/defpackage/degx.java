package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: degx  reason: default package */
/* loaded from: classes6.dex */
final class degx implements Callable<Void> {
    final /* synthetic */ Runnable a;

    public degx(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        this.a.run();
        return null;
    }
}
