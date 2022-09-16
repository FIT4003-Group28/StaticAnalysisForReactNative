package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: peh  reason: default package */
/* loaded from: classes4.dex */
public final class peh extends Handler {
    final /* synthetic */ pej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peh(pej pejVar, Looper looper) {
        super(looper);
        this.a = pejVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Message a(int i, Object obj, boolean z) {
        return obtainMessage(i, z ? 1 : 0, 0, obj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr;
        try {
            int i = message.what;
            if (i == 0) {
                bArr = this.a.m.b((pnv) message.obj);
            } else if (i == 1) {
                bArr = this.a.m.a((pnu) message.obj);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            if (message.arg1 == 1) {
                int i2 = message.arg2 + 1;
                if ((this.a.l < 0 || message.what != 1 || i2 <= this.a.l) && i2 <= this.a.e) {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i2;
                    sendMessageDelayed(obtain, Math.min((i2 - 1) * 1000, 5000));
                    return;
                }
            }
            bArr = e;
        }
        this.a.h.obtainMessage(message.what, bArr).sendToTarget();
    }
}
