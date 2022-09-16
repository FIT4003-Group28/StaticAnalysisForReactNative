package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aczg  reason: default package */
/* loaded from: classes.dex */
public final class aczg implements adon {
    public static final String a = zep.a("MDX.CastShortLivedLoungeTokenRefresher");
    public final adhz b;
    public ScheduledFuture c;
    final aczf d;
    public adok e;
    private final aczb f;
    private final int g;
    private final ScheduledExecutorService h;

    public aczg(adhz adhzVar, aczb aczbVar, int i, ScheduledExecutorService scheduledExecutorService) {
        aczf aczfVar = new aczf(this);
        this.d = aczfVar;
        this.b = adhzVar;
        this.f = aczbVar;
        this.g = i;
        this.h = scheduledExecutorService;
        ((adoy) aczbVar).a.m.add(aczfVar);
    }

    @Override // defpackage.adon
    public final void a(final adok adokVar) {
        zep.h(a, String.format("Attempting to get a new lounge token for Cast screen %s", this.b.b()));
        this.e = adokVar;
        ((adoy) this.f).e("getLoungeToken");
        this.c = this.h.schedule(new Runnable() { // from class: acze
            @Override // java.lang.Runnable
            public final void run() {
                aczg aczgVar = aczg.this;
                adok adokVar2 = adokVar;
                zep.m(aczg.a, String.format("Never received LoungeToken message back from Cast SDK for screen %s.", aczgVar.b.b()));
                adokVar2.a(adom.NO_LOUNGE_TOKEN_RESPONSE);
                aczgVar.c = null;
            }
        }, this.g, TimeUnit.SECONDS);
    }
}
