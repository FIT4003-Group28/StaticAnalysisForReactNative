package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: aert  reason: default package */
/* loaded from: classes.dex */
final class aert extends Handler {
    final /* synthetic */ aerv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aert(aerv aervVar, Looper looper) {
        super(looper);
        this.a = aervVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                aesk aeskVar = this.a.d;
                UUID uuid = aeqw.a;
                e = aeskVar.b((oxd) message.obj);
            } else if (i != 1) {
                throw new RuntimeException();
            } else {
                aesk aeskVar2 = this.a.d;
                UUID uuid2 = aeqw.a;
                e = aeskVar2.a((oxc) message.obj);
            }
        } catch (Exception e) {
            e = e;
        }
        this.a.e.obtainMessage(message.what, e).sendToTarget();
    }
}
