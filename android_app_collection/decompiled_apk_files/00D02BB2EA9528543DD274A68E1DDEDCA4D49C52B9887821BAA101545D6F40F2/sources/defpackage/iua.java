package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
/* compiled from: PG */
/* renamed from: iua  reason: default package */
/* loaded from: classes.dex */
final class iua extends Handler {
    public iua(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.obj instanceof View) {
            View view = (View) message.obj;
            view.cancelPendingInputEvents();
            cqkc.a(view).onClick(view);
        }
    }
}
