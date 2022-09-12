package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cojb  reason: default package */
/* loaded from: classes.dex */
public class cojb extends Handler {
    public cojb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        b(message);
    }

    public cojb(Looper looper) {
        super(looper);
    }

    public cojb(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
