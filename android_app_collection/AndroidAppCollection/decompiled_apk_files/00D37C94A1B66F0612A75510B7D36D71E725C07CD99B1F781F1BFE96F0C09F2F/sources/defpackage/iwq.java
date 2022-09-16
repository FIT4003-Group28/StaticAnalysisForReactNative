package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iwq  reason: default package */
/* loaded from: classes3.dex */
public final class iwq implements iws {
    final /* synthetic */ apzg a;
    final /* synthetic */ Instant b;
    final /* synthetic */ iwt c;

    public iwq(iwt iwtVar, apzg apzgVar, Instant instant) {
        this.c = iwtVar;
        this.a = apzgVar;
        this.b = instant;
    }

    @Override // defpackage.iws
    public final void a() {
        if (this.c.e.c() - this.b.toEpochMilli() >= TimeUnit.SECONDS.toMillis(3L)) {
            zep.m(iwt.a, "Timed out searching for devices.");
            this.c.c(this.a.c, false, Optional.empty());
            return;
        }
        this.c.g.schedule(new Runnable() { // from class: iwp
            @Override // java.lang.Runnable
            public final void run() {
                iwq iwqVar = iwq.this;
                iwqVar.c.e(iwqVar);
            }
        }, 300L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.iws
    public final void b(Optional optional) {
        this.c.c(this.a.c, true, optional);
    }
}
