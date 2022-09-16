package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: iqt  reason: default package */
/* loaded from: classes6.dex */
public final class iqt {
    public final hwe a;
    public final iqo b;
    public final iql c;
    public final boolean d;
    public final jkj e;
    public final Activity f;
    public final btvo g;
    public final akwu h;
    @dzsi
    public ilo i;
    public boolean j = false;
    @dzsi
    public hwb k;
    private final akox l;

    public iqt(iqo iqoVar, iql iqlVar, boolean z, akox akoxVar, hwe hweVar, Activity activity, jkj jkjVar, btvo btvoVar, akwu akwuVar) {
        this.b = iqoVar;
        this.c = iqlVar;
        this.d = z;
        this.l = akoxVar;
        this.a = hweVar;
        this.f = activity;
        this.e = jkjVar;
        this.g = btvoVar;
        this.h = akwuVar;
    }

    public final void a(ilo iloVar, akqq akqqVar) {
        aktx q;
        alvj bL = iloVar.bL();
        akqi ai = iloVar.ai();
        akty aC = this.l.aj().aC();
        if (bL != null) {
            dnbv b = bL.b();
            double d = akqqVar.a;
            double d2 = akqqVar.b;
            int a = dujv.a(this.g.getAdsParameters().b);
            q = aC.t(b, d, d2, a == 0 ? 1 : a);
        } else if (iloVar.cE()) {
            q = aC.r(ai.c, akqqVar.a, akqqVar.b);
        } else if (akqi.d(ai)) {
            q = aC.p(ai.c, akqqVar.a, akqqVar.b);
        } else {
            q = aC.q(akra.f(akqqVar));
        }
        aC.o(q);
    }

    public final void b() {
        if (this.j) {
            this.c.c();
            this.j = false;
        }
        hwb hwbVar = this.k;
        if (hwbVar != null) {
            this.a.j(hwbVar);
            this.k = null;
            this.l.aj().aC().o(null);
        } else {
            this.a.c();
        }
        this.i = null;
    }
}
