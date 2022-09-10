package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvoh  reason: default package */
/* loaded from: classes5.dex */
public final class cvoh implements cvnq {
    private final cvmf a;
    private final cvkf b;
    private final cvkk c;
    private final cvmd d;
    private final cqat e;
    private final cvlr f;

    public cvoh(cvmf cvmfVar, cvkf cvkfVar, cvkk cvkkVar, cvmd cvmdVar, cvlr cvlrVar, cqat cqatVar) {
        this.a = cvmfVar;
        this.b = cvkfVar;
        this.c = cvkkVar;
        this.d = cvmdVar;
        this.f = cvlrVar;
        this.e = cqatVar;
    }

    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        cvlw.a("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", str);
        dryv dryvVar = (dryv) dssjVar;
        dryx dryxVar = (dryx) dssjVar2;
        try {
            cvkc b = this.b.b(str);
            cvju j = b.j();
            j.c = Long.valueOf(dryxVar.c);
            j.d = Long.valueOf(dryxVar.b);
            int a = dscn.a(dryvVar.f);
            if (a != 0 && a == 5 && b.i().longValue() == 0) {
                j.f = Long.valueOf(dryxVar.c);
            }
            cvkc a2 = j.a();
            this.b.e(a2);
            HashSet hashSet = new HashSet();
            for (dscr dscrVar : dryxVar.a) {
                hashSet.add(dscrVar.c);
            }
            ArrayList arrayList = new ArrayList();
            for (cvkj cvkjVar : this.c.c(str)) {
                if (cvkjVar.t() != 2 && !hashSet.contains(cvkjVar.a())) {
                    arrayList.add(cvkjVar.a());
                }
            }
            cvmd cvmdVar = this.d;
            dsee bZ = dsef.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsef dsefVar = (dsef) bZ.b;
            dsefVar.c = 2;
            dsefVar.a |= 2;
            cvmdVar.b(a2, arrayList, bZ.bK(), 4, 8);
            if (dryxVar.a.size() <= 0) {
                return;
            }
            long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            cvlp a3 = this.f.a(drwv.FETCHED_LATEST_THREADS);
            a3.i(a2);
            a3.l(dryxVar.a);
            a3.o(micros);
            a3.a();
            this.a.a(a2, dryxVar.a, cvix.d(), new cvlq(Long.valueOf(micros), drvb.FETCHED_LATEST_THREADS));
        } catch (cvke unused) {
            cvlw.e("FetchLatestThreadsCallback", "Account not found in scheduled callback.", new Object[0]);
        }
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (FAILURE)", str);
    }
}
