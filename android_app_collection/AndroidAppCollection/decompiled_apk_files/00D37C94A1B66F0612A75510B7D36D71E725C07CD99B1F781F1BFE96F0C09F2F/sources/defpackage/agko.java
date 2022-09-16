package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agko  reason: default package */
/* loaded from: classes.dex */
public final class agko implements agkp {
    private static final long a = TimeUnit.MINUTES.toSeconds(7);
    private static final long b;
    private final zen c;

    static {
        TimeUnit.HOURS.toSeconds(72L);
        b = TimeUnit.MINUTES.toSeconds(30L);
    }

    public agko(zen zenVar) {
        zenVar.getClass();
        this.c = zenVar;
    }

    @Override // defpackage.agkp
    public final int a() {
        return this.c.a("pudl_ad_frequency_cap", (int) a);
    }

    @Override // defpackage.agkp
    public final int b() {
        return this.c.a("pudl_ad_lact_nonskippable", 0);
    }

    @Override // defpackage.agkp
    public final int c() {
        return this.c.a("pudl_ad_lact_skippable", (int) b);
    }

    @Override // defpackage.agkp
    public final int d() {
        return this.c.a("offline_resync_continuation_deferred_service_threshold_seconds", 5);
    }

    @Override // defpackage.agkp
    public final boolean e() {
        return this.c.e("attempt_offline_resync_on_expired_continuation", true);
    }
}
