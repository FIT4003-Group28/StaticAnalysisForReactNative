package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cmoh  reason: default package */
/* loaded from: classes5.dex */
public final class cmoh implements Handler.Callback {
    public final Handler a;
    final /* synthetic */ cmoi b;

    public cmoh(cmoi cmoiVar, cmbr cmbrVar) {
        this.b = cmoiVar;
        Handler h = cmny.h(this);
        this.a = h;
        cmbrVar.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: cmbq
            private final cmoh a;

            {
                this.a = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                cmoh cmohVar = this.a;
                if (cmny.a < 30) {
                    cmohVar.a.sendMessageAtFrontOfQueue(Message.obtain(cmohVar.a, 0, (int) (j >> 32), (int) j));
                    return;
                }
                cmohVar.a(j);
            }
        }, h);
    }

    public final void a(long j) {
        cmoi cmoiVar = this.b;
        if (this != cmoiVar.d) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            cmoiVar.m = true;
            return;
        }
        try {
            cmoiVar.ap(j);
        } catch (cllz e) {
            this.b.n = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        a(cmny.I(message.arg1, message.arg2));
        return true;
    }
}
