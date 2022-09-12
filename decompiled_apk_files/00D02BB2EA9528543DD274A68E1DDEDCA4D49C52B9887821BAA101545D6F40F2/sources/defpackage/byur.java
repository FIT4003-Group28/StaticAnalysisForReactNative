package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: byur  reason: default package */
/* loaded from: classes4.dex */
public final class byur {
    public final bytc a;
    private final btvo b;
    private final wkg c;
    private final Executor d;

    public byur(bytc bytcVar, btvo btvoVar, wkg wkgVar, Executor executor) {
        this.a = bytcVar;
        this.b = btvoVar;
        this.c = wkgVar;
        this.d = executor;
    }

    @dzsi
    public final dopk a(akqi akqiVar, boolean z) {
        try {
            deig d = deig.d();
            final byuq byuqVar = new byuq(this, d);
            final wkf a = this.c.a(akqiVar, dcdc.e());
            this.d.execute(new Runnable(a, byuqVar) { // from class: byup
                private final wkf a;
                private final degu b;

                {
                    this.a = a;
                    this.b = byuqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    wkf wkfVar = this.a;
                    degu<dopk> deguVar = this.b;
                    dnqg bZ = dnqh.p.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqh.b((dnqh) bZ.b);
                    wkfVar.a(bZ.bK(), false, false, deguVar);
                }
            });
            try {
                dkqz dkqzVar = this.b.getNotificationsParameters().m;
                if (dkqzVar == null) {
                    dkqzVar = dkqz.ap;
                }
                dopk dopkVar = (dopk) d.get(dkqzVar.m, TimeUnit.SECONDS);
                this.a.a(z ? 168 : 169);
                return dopkVar;
            } catch (TimeoutException unused) {
                this.a.a(z ? 170 : 171);
                return null;
            }
        } catch (Throwable th) {
            this.a.a(z ? 172 : 173);
            throw th;
        }
    }
}
