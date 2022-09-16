package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: bana  reason: default package */
/* loaded from: classes2.dex */
final class bana extends Handler {
    private final Runnable a;

    public bana(Looper looper, Runnable runnable) {
        super(looper);
        this.a = runnable;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Logging.c("EglRenderer", "Exception on EglRenderer thread", e);
            this.a.run();
            throw e;
        }
    }
}
