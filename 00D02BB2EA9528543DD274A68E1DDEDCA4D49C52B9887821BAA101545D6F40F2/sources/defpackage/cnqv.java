package defpackage;

import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnqv  reason: default package */
/* loaded from: classes.dex */
public final class cnqv extends cojb {
    final /* synthetic */ cnqx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqv(cnqx cnqxVar, Looper looper) {
        super(looper);
        this.a = cnqxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            cnqx cnqxVar = this.a;
            cnqxVar.a.lock();
            try {
                if (cnqxVar.g()) {
                    cnqxVar.e();
                }
            } finally {
                cnqxVar.a.unlock();
            }
        } else if (i == 2) {
            this.a.f();
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            sb.toString();
        }
    }
}
