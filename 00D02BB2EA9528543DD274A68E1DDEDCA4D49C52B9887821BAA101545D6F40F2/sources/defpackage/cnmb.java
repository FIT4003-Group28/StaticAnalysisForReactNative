package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: cnmb  reason: default package */
/* loaded from: classes5.dex */
public final class cnmb {
    private static cnmb c;
    public final Context a;
    public final ScheduledExecutorService b;
    private cnlv d = new cnlv(this);
    private int e = 1;

    public cnmb(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized cnmb a(Context context) {
        cnmb cnmbVar;
        synchronized (cnmb.class) {
            if (c == null) {
                coiz coizVar = coja.a;
                c = new cnmb(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new cnxx("MessengerIpcClient"))));
            }
            cnmbVar = c;
        }
        return cnmbVar;
    }

    public final synchronized <T> cpcq<T> b(cnly<T> cnlyVar) {
        if (!this.d.a(cnlyVar)) {
            cnlv cnlvVar = new cnlv(this);
            this.d = cnlvVar;
            cnlvVar.a(cnlyVar);
        }
        return cnlyVar.b.a;
    }

    public final synchronized int c() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
