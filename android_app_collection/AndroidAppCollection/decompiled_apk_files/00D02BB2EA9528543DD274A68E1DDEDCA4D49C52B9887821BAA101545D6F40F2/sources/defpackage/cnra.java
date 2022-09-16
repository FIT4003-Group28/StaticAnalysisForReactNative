package defpackage;

import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnra  reason: default package */
/* loaded from: classes.dex */
public final class cnra extends cojb {
    final /* synthetic */ cnrb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnra(cnrb cnrbVar, Looper looper) {
        super(looper);
        this.a = cnrbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            sb.toString();
            return;
        }
        cnqz cnqzVar = (cnqz) message.obj;
        cnrb cnrbVar = this.a;
        cnrbVar.a.lock();
        try {
            if (cnrbVar.k != cnqzVar.c) {
                return;
            }
            cnqzVar.a();
        } finally {
            cnrbVar.a.unlock();
        }
    }
}
