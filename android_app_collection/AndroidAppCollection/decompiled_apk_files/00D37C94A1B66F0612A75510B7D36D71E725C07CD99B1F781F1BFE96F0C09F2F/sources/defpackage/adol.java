package defpackage;

import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adol  reason: default package */
/* loaded from: classes.dex */
public final class adol extends adnb {
    public static final String a = zep.a("MDX.ShortLivedLoungeTokenProvider");
    public final adon b;
    public final Duration c;
    public adis d;
    public ampq e;
    public boolean f;
    private final ScheduledExecutorService g;
    private ankt h;
    private final int i;

    public adol(adis adisVar, adon adonVar, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        super(adisVar);
        this.e = amon.a;
        this.d = adisVar;
        this.b = adonVar;
        this.g = scheduledExecutorService;
        this.i = i;
        this.c = Duration.ofSeconds(i2);
        this.f = true;
    }

    @Override // defpackage.adnb
    public final adhy a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @Override // defpackage.adnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            ampq r2 = r6.e
            boolean r2 = r2.h()
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L36
            adom r2 = defpackage.adom.APP_NOT_RUNNING
            ampq r2 = r6.e
            java.lang.Object r2 = r2.c()
            adom r2 = (defpackage.adom) r2
            int r2 = r2.ordinal()
            if (r2 == 0) goto L33
            if (r2 == r4) goto L30
            if (r2 == r5) goto L2d
            if (r2 == r3) goto L2a
            if (r2 == r0) goto L27
            goto L36
        L27:
            java.lang.String r0 = "NO_LOUNGE_TOKEN_RESPONSE"
            goto L38
        L2a:
            java.lang.String r0 = "STALE_LOUNGE_TOKEN"
            goto L38
        L2d:
            java.lang.String r0 = "MISSING_LOUNGE_TOKEN"
            goto L38
        L30:
            java.lang.String r0 = "DIAL_HTTP_ERROR"
            goto L38
        L33:
            java.lang.String r0 = "APP_NOT_RUNNING"
            goto L38
        L36:
            java.lang.String r0 = "NONE"
        L38:
            r2 = 0
            r1[r2] = r0
            adis r0 = r6.d
            java.lang.String r0 = r0.c
            r1[r4] = r0
            boolean r0 = r6.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r5] = r0
            int r0 = r6.i
            java.lang.String r2 = defpackage.almu.U(r0)
            if (r0 == 0) goto L64
            r1[r3] = r2
            java.lang.String r0 = "Failed to refresh MDx LoungeToken and received 401 Error. error_type: %s, staled_lounge_token_value: %s, current_is_initial_lounge_token: %s, pairing_type: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = defpackage.adol.a
            defpackage.zep.c(r1, r0)
            r1 = 21
            defpackage.afus.b(r5, r1, r0)
            return
        L64:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adol.b():void");
    }

    @Override // defpackage.adnb
    public final void c() {
        e(this.d.b.toMillis());
    }

    @Override // defpackage.adnb
    public final void d() {
        ankt anktVar = this.h;
        if (anktVar != null) {
            anktVar.cancel(true);
        }
    }

    public final void e(long j) {
        zep.h(a, String.format("Starting a poll for a new short lived lounge token in %s ms.", Long.valueOf(this.d.b.toMillis())));
        this.h = anlz.s(new aniq() { // from class: adoj
            @Override // defpackage.aniq
            public final ankt a() {
                adol adolVar = adol.this;
                adolVar.b.a(new adok(adolVar));
                return ankq.a;
            }
        }, j, TimeUnit.MILLISECONDS, this.g);
    }
}
