package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ugy  reason: default package */
/* loaded from: classes4.dex */
public final class ugy implements ugk {
    private final ufe a;
    private final ucs b;
    private final ufc c;
    private final Set d;
    private final snc e;
    private final udc f;
    private final ues g;

    public ugy(ufe ufeVar, ucs ucsVar, udc udcVar, ufc ufcVar, ues uesVar, Set set, snc sncVar) {
        this.a = ufeVar;
        this.b = ucsVar;
        this.f = udcVar;
        this.c = ufcVar;
        this.g = uesVar;
        this.d = set;
        this.e = sncVar;
    }

    @Override // defpackage.ugk
    public final void a(String str, aoqu aoquVar, Throwable th) {
        uev.g("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.ugk
    public final void b(String str, aoqu aoquVar, aoqu aoquVar2) {
        uev.e("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", str);
        aokt aoktVar = (aokt) aoquVar;
        aoku aokuVar = (aoku) aoquVar2;
        try {
            ucp b = this.b.b(str);
            ucl b2 = b.b();
            b2.c = Long.valueOf(aokuVar.d);
            b2.d = Long.valueOf(aokuVar.c);
            aomb a = aomb.a(aoktVar.g);
            if (a == null) {
                a = aomb.FETCH_REASON_UNSPECIFIED;
            }
            if (a == aomb.GUNS_MIGRATION && b.i.longValue() == 0) {
                b2.f = Long.valueOf(aokuVar.d);
            }
            ucp a2 = b2.a();
            this.b.e(a2);
            amzs it = ((amyg) this.d).iterator();
            while (it.hasNext()) {
                ((uih) it.next()).e();
            }
            ArrayList arrayList = new ArrayList();
            udc udcVar = this.f;
            vfm b3 = vfm.b();
            b3.c("1");
            amzt listIterator = udcVar.a.a(str, amuk.r(b3.a())).listIterator();
            while (listIterator.hasNext()) {
                ucw ucwVar = (ucw) listIterator.next();
                if (ucwVar.s != 2) {
                    arrayList.add(ucwVar.a);
                }
            }
            ufc ufcVar = this.c;
            aopa createBuilder = aomr.a.createBuilder();
            createBuilder.copyOnWrite();
            aomr aomrVar = (aomr) createBuilder.instance;
            aomrVar.d = 2;
            aomrVar.b = 2 | aomrVar.b;
            ufcVar.b(a2, arrayList, (aomr) createBuilder.mo39build(), uec.SERVER, aojl.DISMISSED_REMOTE);
            this.f.a.e(str, uid.g(vfm.b().a(), "thread_id", (String[]) arrayList.toArray(new String[0])));
            if (aokuVar.b.size() <= 0) {
                return;
            }
            long micros = TimeUnit.MILLISECONDS.toMicros(this.e.c());
            uep a3 = this.g.a(aojw.FETCHED_LATEST_THREADS);
            a3.d(a2);
            a3.f(aokuVar.b);
            a3.g(micros);
            a3.i();
            ufe ufeVar = this.a;
            aopu aopuVar = aokuVar.b;
            ubz b4 = ubz.b();
            uer uerVar = new uer(Long.valueOf(micros), Long.valueOf(this.e.d()), aojh.FETCHED_LATEST_THREADS);
            aomb a4 = aomb.a(aoktVar.g);
            if (a4 == null) {
                a4 = aomb.FETCH_REASON_UNSPECIFIED;
            }
            ufeVar.a(a2, aopuVar, b4, uerVar, a4 == aomb.INBOX);
        } catch (ucr e) {
            uev.c("FetchLatestThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
