package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: thl  reason: default package */
/* loaded from: classes7.dex */
final class thl {
    public final qbn a;
    final /* synthetic */ thm b;
    private final tgv c;

    public thl(thm thmVar, qbn qbnVar, tgv tgvVar) {
        this.b = thmVar;
        this.a = qbnVar;
        this.c = tgvVar;
    }

    public final void a(qbm qbmVar) {
        final dbsg dbsgVar;
        amte n = qbmVar.n();
        btzy e = qbmVar.e();
        if (e != null) {
            dbsgVar = dbsg.i(e.p);
        } else {
            dbsgVar = dbpy.a;
        }
        vun g = qbmVar.g();
        dbsk.s(g);
        Long l = g.r;
        dbsk.s(l);
        eapd eapdVar = new eapd(l);
        dwaw dwawVar = (dwaw) dbsg.j(qbmVar.h()).c(dwaw.j);
        if (n != null) {
            bvqj.c(this.b.b.a(this.c, dwawVar, eapdVar, n), new bvqg(this, dbsgVar) { // from class: thk
                private final thl a;
                private final dbsg b;

                {
                    this.a = this;
                    this.b = dbsgVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.b.d.b(FetchState.Fetch.d((tgk) obj, this.b));
                }
            }, this.b.e);
            return;
        }
        this.b.b.b(this.c.a());
        this.b.d.b(FetchState.Fetch.d(tgk.ERROR, dbsgVar));
    }
}
