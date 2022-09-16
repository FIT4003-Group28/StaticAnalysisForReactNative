package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: akwh  reason: default package */
/* loaded from: classes.dex */
public final class akwh {
    public final ScheduledExecutorService a;
    public final Context b;
    public final long c;
    public final snc d;
    public final yxk e;
    public final ywk f;
    public final ywr g;
    public final yxf h = new yxf();

    public akwh(Context context, snc sncVar, ScheduledExecutorService scheduledExecutorService, ywr ywrVar, ywk ywkVar, Optional optional) {
        this.b = context;
        this.d = sncVar;
        this.c = sncVar.c();
        this.a = scheduledExecutorService;
        this.f = ywkVar;
        this.g = ywrVar;
        zds zdsVar = (zds) optional.orElse(null);
        this.e = new yxk(ywkVar.c(ywk.L));
    }
}
