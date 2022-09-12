package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: cmol  reason: default package */
/* loaded from: classes5.dex */
final class cmol implements Choreographer.FrameCallback, Handler.Callback {
    public static final cmol b = new cmol();
    public volatile long a = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private cmol() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.d = handlerThread;
        handlerThread.start();
        Handler j = cmny.j(handlerThread.getLooper(), this);
        this.c = j;
        j.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        this.e.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
                this.e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                this.e.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
            return true;
        }
    }
}
