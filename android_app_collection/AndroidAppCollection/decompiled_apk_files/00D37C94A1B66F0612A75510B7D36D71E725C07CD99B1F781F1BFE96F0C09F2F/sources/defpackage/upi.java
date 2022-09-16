package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: upi  reason: default package */
/* loaded from: classes4.dex */
public final class upi {
    public final vpl a;
    public final amqo b;
    public final amqo c;
    public final amqo d;
    public final amqo e;
    public final amqo f;
    private final vpj g;

    public upi(ScheduledExecutorService scheduledExecutorService, vpm vpmVar, Application application) {
        aqxo.i(new uph(this, 1));
        aqxo.i(new uph(this, 2));
        this.b = aqxo.i(new uph(this, 4));
        aqxo.i(new uph(this, 5));
        aqxo.i(new uph(this, 6));
        this.c = aqxo.i(new uph(this, 7));
        this.d = aqxo.i(new uph(this, 8));
        this.e = aqxo.i(new uph(this, 9));
        this.f = aqxo.i(new uph(this, 10));
        aqxo.i(new uph(this));
        aqxo.i(new uph(this, 3));
        vpl c = vpl.c("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = c;
        vpj vpjVar = c.a;
        if (vpjVar == null) {
            this.g = vpq.a(vpmVar, scheduledExecutorService, c, application);
            return;
        }
        this.g = vpjVar;
        ((vpq) vpjVar).b = vpmVar;
    }
}
