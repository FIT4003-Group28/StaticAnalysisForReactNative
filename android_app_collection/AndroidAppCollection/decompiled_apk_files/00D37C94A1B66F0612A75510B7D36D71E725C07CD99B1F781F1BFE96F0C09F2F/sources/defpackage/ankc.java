package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ankc  reason: default package */
/* loaded from: classes.dex */
public final class ankc implements Runnable {
    final /* synthetic */ Future a;

    public ankc(Future future) {
        this.a = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(false);
    }
}
