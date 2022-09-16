package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avn  reason: default package */
/* loaded from: classes2.dex */
public final class avn extends Handler {
    final /* synthetic */ avp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avn(avp avpVar, Looper looper) {
        super(looper);
        this.a = avpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        avp avpVar = this.a;
        int i = message.what;
        avo avoVar = null;
        if (i == 0) {
            avoVar = (avo) message.obj;
            int i2 = avoVar.a;
            int i3 = avoVar.b;
            try {
                avpVar.c.queueInputBuffer(i2, 0, avoVar.c, avoVar.e, avoVar.f);
            } catch (RuntimeException e) {
                avpVar.e(e);
            }
        } else if (i == 1) {
            avoVar = (avo) message.obj;
            int i4 = avoVar.a;
            int i5 = avoVar.b;
            MediaCodec.CryptoInfo cryptoInfo = avoVar.d;
            long j = avoVar.e;
            int i6 = avoVar.f;
            try {
                if (avpVar.g) {
                    synchronized (avp.b) {
                        avpVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                    }
                } else {
                    avpVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e2) {
                avpVar.e(e2);
            }
        } else if (i == 2) {
            avpVar.f.e();
        } else {
            avpVar.e(new IllegalStateException(String.valueOf(message.what)));
        }
        if (avoVar != null) {
            synchronized (avp.a) {
                avp.a.add(avoVar);
            }
        }
    }
}
