package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: iq  reason: default package */
/* loaded from: classes3.dex */
final class iq extends Handler {
    final /* synthetic */ is a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(is isVar, Looper looper) {
        super(looper);
        this.a = isVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        it itVar;
        iq iqVar;
        if (message.what == 1) {
            synchronized (this.a.a) {
                itVar = (it) this.a.c.get();
                iqVar = this.a.d;
            }
            if (itVar == null || this.a != itVar.a() || iqVar == null) {
                return;
            }
            itVar.i((ary) message.obj);
            this.a.a(itVar, iqVar);
            itVar.i(null);
        }
    }
}
