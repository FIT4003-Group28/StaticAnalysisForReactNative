package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: udu  reason: default package */
/* loaded from: classes7.dex */
final class udu extends Handler {
    private final Runnable a;
    private long b;

    public udu(Runnable runnable, long j) {
        super(Looper.getMainLooper());
        this.a = runnable;
        this.b = j;
    }

    private final synchronized void d() {
        long j = this.b;
        if (j != 0) {
            sendEmptyMessageDelayed(1, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        removeMessages(1);
        sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(long j) {
        this.b = j;
        if (hasMessages(1)) {
            removeMessages(1);
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.run();
        removeMessages(1);
        d();
    }
}
