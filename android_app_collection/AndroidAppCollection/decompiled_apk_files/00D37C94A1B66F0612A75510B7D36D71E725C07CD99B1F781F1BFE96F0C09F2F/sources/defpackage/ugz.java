package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ugz  reason: default package */
/* loaded from: classes4.dex */
public final class ugz implements ugk {
    private final ufe a;
    private final ucs b;
    private final snc c;
    private final ues d;

    public ugz(ufe ufeVar, ucs ucsVar, ues uesVar, snc sncVar) {
        this.a = ufeVar;
        this.b = ucsVar;
        this.d = uesVar;
        this.c = sncVar;
    }

    @Override // defpackage.ugk
    public final void a(String str, aoqu aoquVar, Throwable th) {
        uev.g("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.ugk
    public final void b(String str, aoqu aoquVar, aoqu aoquVar2) {
        aokw aokwVar = (aokw) aoquVar2;
        uev.e("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", str, Integer.valueOf(aokwVar.b.size()));
        try {
            ucp b = this.b.b(str);
            if (aokwVar.c > b.d.longValue()) {
                ucl b2 = b.b();
                b2.c = Long.valueOf(aokwVar.c);
                b = b2.a();
                this.b.e(b);
            }
            ucp ucpVar = b;
            if (aokwVar.b.size() <= 0) {
                return;
            }
            long micros = TimeUnit.MILLISECONDS.toMicros(this.c.c());
            uep a = this.d.a(aojw.FETCHED_UPDATED_THREADS);
            a.d(ucpVar);
            a.f(aokwVar.b);
            a.g(micros);
            a.i();
            this.a.a(ucpVar, aokwVar.b, ubz.b(), new uer(Long.valueOf(micros), Long.valueOf(this.c.d()), aojh.FETCHED_UPDATED_THREADS), false);
        } catch (ucr e) {
            uev.c("FetchUpdatedThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
