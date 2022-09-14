package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
/* compiled from: PG */
/* renamed from: aln  reason: default package */
/* loaded from: classes2.dex */
public final class aln {
    public HandlerThread b;
    public Handler c;
    public final Object a = new Object();
    private final Handler.Callback f = new ali(this);
    private final String h = "fonts";
    private final int g = 10;
    public final int d = 10000;
    private int e = 0;

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
