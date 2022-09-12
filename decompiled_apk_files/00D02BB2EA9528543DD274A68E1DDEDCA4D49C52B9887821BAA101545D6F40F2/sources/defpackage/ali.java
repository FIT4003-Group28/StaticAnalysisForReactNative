package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: ali  reason: default package */
/* loaded from: classes2.dex */
final class ali implements Handler.Callback {
    final /* synthetic */ aln a;

    public ali(aln alnVar) {
        this.a = alnVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            aln alnVar = this.a;
            synchronized (alnVar.a) {
                if (!alnVar.c.hasMessages(1)) {
                    alnVar.b.quit();
                    alnVar.b = null;
                    alnVar.c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            aln alnVar2 = this.a;
            ((Runnable) message.obj).run();
            synchronized (alnVar2.a) {
                alnVar2.c.removeMessages(0);
                Handler handler = alnVar2.c;
                handler.sendMessageDelayed(handler.obtainMessage(0), alnVar2.d);
            }
            return true;
        }
    }
}
