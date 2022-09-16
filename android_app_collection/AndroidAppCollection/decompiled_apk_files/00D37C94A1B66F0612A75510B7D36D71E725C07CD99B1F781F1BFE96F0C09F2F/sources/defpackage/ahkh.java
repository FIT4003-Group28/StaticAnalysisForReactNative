package defpackage;

import com.google.vr.sdk.base.GvrView;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: ahkh  reason: default package */
/* loaded from: classes.dex */
final class ahkh implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ ahkj b;

    public ahkh(ahkj ahkjVar, CountDownLatch countDownLatch) {
        this.b = ahkjVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GvrView.Renderer renderer = this.b.d;
        if (renderer != null) {
            renderer.onRendererShutdown();
        }
        this.a.countDown();
    }
}
