package defpackage;

import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pgp  reason: default package */
/* loaded from: classes7.dex */
public final class pgp {
    public static final bbl a;
    public final btvo b;
    public final bcl c;
    public final isa d;

    static {
        bbk bbkVar = new bbk();
        bbkVar.c = 2;
        bbkVar.a = false;
        a = bbkVar.a();
    }

    public pgp(btvo btvoVar, bcl bclVar, isa isaVar) {
        this.b = btvoVar;
        this.c = bclVar;
        this.d = isaVar;
    }

    public final dcep<dsyl> a() {
        dcen N = dcep.N();
        N.b(dsyl.GELLER_CONFIG);
        N.b(dsyl.MAPS_SEARCH_CLICK);
        if (this.b.getGellerParameters().g) {
            N.b(dsyl.PRIVACY_SETTINGS);
        }
        return N.f();
    }

    public final void b() {
        long j = this.b.getGellerParameters().e;
        try {
            if (!this.b.getGellerParameters().a) {
                deha.c();
                return;
            }
            bbo bboVar = new bbo();
            bboVar.e("worker_name_key", "GellerSyncWorker");
            pgv bZ = pgw.e.bZ();
            bZ.a(a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            pgw pgwVar = (pgw) bZ.b;
            pgwVar.d = 4;
            pgwVar.a |= 1;
            bboVar.c("GellerSyncWorkerParams", bZ.bK().bS());
            final bcb f = new bca(GmmWorkerWrapper.class).d("GellerOnDemandSync").c(bboVar.a()).b(a).e(j, TimeUnit.SECONDS).f();
            deew.h(this.c.d("GellerOnDemandSync", 1, f).a(), new dbrn(this, f) { // from class: pgm
                private final pgp a;
                private final bcb b;

                {
                    this.a = this;
                    this.b = f;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    pgp pgpVar = this.a;
                    try {
                        return this.b.a;
                    } catch (RuntimeException e) {
                        pgpVar.d.c(7, e);
                        return bbx.c();
                    }
                }
            }, dege.a);
        } catch (RuntimeException e) {
            this.d.c(7, e);
            deha.a(bbx.c());
        }
    }
}
