package defpackage;

import J.N;
import org.chromium.base.JavaHandlerThread;
/* compiled from: PG */
/* renamed from: babz  reason: default package */
/* loaded from: classes2.dex */
public final class babz implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ JavaHandlerThread b;

    public babz(JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.quit();
        N.MYwg$x8E(this.a);
    }
}
