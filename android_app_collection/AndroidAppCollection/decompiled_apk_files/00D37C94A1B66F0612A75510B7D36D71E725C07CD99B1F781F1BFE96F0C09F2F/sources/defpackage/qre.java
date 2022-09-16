package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: qre  reason: default package */
/* loaded from: classes4.dex */
public final class qre {
    private static qre c;
    public final Context a;
    public final ScheduledExecutorService b;
    private qqy d = new qqy(this);
    private int e = 1;

    public qre(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized qre b(Context context) {
        qre qreVar;
        synchronized (qre.class) {
            if (c == null) {
                rqt rqtVar = rfl.a;
                c = new qre(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new qyo("MessengerIpcClient"))));
            }
            qreVar = c;
        }
        return qreVar;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    public final synchronized rve c(qrb qrbVar) {
        if (!this.d.e(qrbVar)) {
            qqy qqyVar = new qqy(this);
            this.d = qqyVar;
            qqyVar.e(qrbVar);
        }
        return qrbVar.b.a;
    }
}
