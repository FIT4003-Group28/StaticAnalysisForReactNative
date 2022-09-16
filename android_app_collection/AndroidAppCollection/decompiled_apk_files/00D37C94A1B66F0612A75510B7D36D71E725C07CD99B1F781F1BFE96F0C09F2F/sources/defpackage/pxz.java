package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pxz  reason: default package */
/* loaded from: classes4.dex */
public final class pxz implements Choreographer.FrameCallback, Handler.Callback {
    public static final pxz a = new pxz();
    public volatile long b = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private pxz() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.d = handlerThread;
        handlerThread.start();
        Handler r = pxi.r(handlerThread.getLooper(), this);
        this.c = r;
        r.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        Choreographer choreographer = this.e;
        ptx.a(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
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
                Choreographer choreographer = this.e;
                ptx.a(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.e;
                ptx.a(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.b = -9223372036854775807L;
            }
            return true;
        }
    }
}
