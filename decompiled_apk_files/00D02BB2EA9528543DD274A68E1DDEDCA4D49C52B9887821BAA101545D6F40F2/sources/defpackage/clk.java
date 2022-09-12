package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: clk  reason: default package */
/* loaded from: classes5.dex */
public final class clk extends Handler {
    private final Handler a;
    private final int b;
    private final int c;

    public clk(Handler handler, int i, int i2) {
        this.a = handler;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == this.b) {
            message.obj = null;
            final Message obtainMessage = this.a.obtainMessage(this.c);
            obtainMessage.getClass();
            postDelayed(new Runnable(obtainMessage) { // from class: clj
                private final Message a;

                {
                    this.a = obtainMessage;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.sendToTarget();
                }
            }, 5000L);
        }
        try {
            this.a.handleMessage(message);
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
