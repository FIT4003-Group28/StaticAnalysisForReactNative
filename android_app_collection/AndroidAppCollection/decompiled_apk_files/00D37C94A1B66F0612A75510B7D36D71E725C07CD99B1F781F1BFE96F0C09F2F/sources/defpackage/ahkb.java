package defpackage;

import com.google.vr.sdk.base.GvrView;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: ahkb  reason: default package */
/* loaded from: classes.dex */
final class ahkb implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ ahke b;

    public ahkb(ahke ahkeVar, CountDownLatch countDownLatch) {
        this.b = ahkeVar;
        this.a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GvrView.StereoRenderer stereoRenderer;
        ahkd ahkdVar = this.b.b;
        if (ahkdVar.b && (stereoRenderer = ahkdVar.a) != null) {
            stereoRenderer.onRendererShutdown();
        }
        this.b.a.onDestroy();
        this.a.countDown();
    }
}
