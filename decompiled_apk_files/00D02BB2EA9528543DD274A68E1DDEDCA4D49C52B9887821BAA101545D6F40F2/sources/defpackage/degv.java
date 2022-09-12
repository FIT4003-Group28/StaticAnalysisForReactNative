package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: degv  reason: default package */
/* loaded from: classes6.dex */
final class degv implements Runnable {
    final /* synthetic */ Future a;

    public degv(Future future) {
        this.a = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(false);
    }
}
