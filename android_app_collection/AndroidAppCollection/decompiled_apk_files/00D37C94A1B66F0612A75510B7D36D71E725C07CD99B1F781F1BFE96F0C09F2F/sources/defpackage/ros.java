package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ros  reason: default package */
/* loaded from: classes4.dex */
public final class ros {
    public final Context a;

    public ros(Context context) {
        this.a = context;
    }

    public final rks a() {
        return rlx.j(this.a).aG();
    }

    public final void b() {
        rlx j = rlx.j(this.a);
        rks aG = j.aG();
        rjm rjmVar = j.f;
        aG.k.a("Local AppMeasurementService is starting up");
    }

    public final void c() {
        rlx j = rlx.j(this.a);
        rks aG = j.aG();
        rjm rjmVar = j.f;
        aG.k.a("Local AppMeasurementService is shutting down");
    }

    public final void d(Intent intent) {
        if (intent == null) {
            a().c.a("onRebind called with null intent");
            return;
        }
        a().k.b("onRebind called. action", intent.getAction());
    }

    public final void e(Runnable runnable) {
        rpn q = rpn.q(this.a);
        q.aH().g(new roq(q, runnable));
    }

    public final void f(Intent intent) {
        if (intent == null) {
            a().c.a("onUnbind called with null intent");
            return;
        }
        a().k.b("onUnbind called for intent. action", intent.getAction());
    }
}
