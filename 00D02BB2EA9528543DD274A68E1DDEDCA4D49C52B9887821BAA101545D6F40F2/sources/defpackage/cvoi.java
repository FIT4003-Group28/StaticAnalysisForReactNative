package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvoi  reason: default package */
/* loaded from: classes5.dex */
public final class cvoi implements cvnq {
    private final cvmf a;
    private final cvkf b;
    private final cqat c;
    private final cvlr d;

    public cvoi(cvmf cvmfVar, cvkf cvkfVar, cvlr cvlrVar, cqat cqatVar) {
        this.a = cvmfVar;
        this.b = cvkfVar;
        this.d = cvlrVar;
        this.c = cqatVar;
    }

    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        drzg drzgVar = (drzg) dssjVar2;
        cvlw.a("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", str, Integer.valueOf(drzgVar.a.size()));
        try {
            cvkc b = this.b.b(str);
            if (drzgVar.b > b.d().longValue()) {
                cvju j = b.j();
                j.c = Long.valueOf(drzgVar.b);
                b = j.a();
                this.b.e(b);
            }
            if (drzgVar.a.size() <= 0) {
                return;
            }
            long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            cvlp a = this.d.a(drwv.FETCHED_UPDATED_THREADS);
            a.i(b);
            a.l(drzgVar.a);
            a.o(micros);
            a.a();
            this.a.a(b, drzgVar.a, cvix.d(), new cvlq(Long.valueOf(micros), drvb.FETCHED_UPDATED_THREADS));
        } catch (cvke unused) {
            cvlw.e("FetchUpdatedThreadsCallback", "Account not found in scheduled callback.", new Object[0]);
        }
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s (FAILURE)", str);
    }
}
