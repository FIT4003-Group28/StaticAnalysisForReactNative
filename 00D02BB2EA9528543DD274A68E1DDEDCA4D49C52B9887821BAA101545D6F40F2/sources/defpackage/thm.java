package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: thm  reason: default package */
/* loaded from: classes7.dex */
public final class thm implements tgw {
    static final long a = eaow.d(2).b;
    public final tgy b;
    public final btrm c;
    public final thg d;
    public final Executor e;
    @dzsi
    public thl f = null;
    private final dzsj<srv> g;
    private final crzb h;

    public thm(tgy tgyVar, thg thgVar, dzsj<srv> dzsjVar, btrm btrmVar, crzb crzbVar, Executor executor) {
        this.b = tgyVar;
        this.d = thgVar;
        this.g = dzsjVar;
        this.c = btrmVar;
        this.h = crzbVar;
        this.e = executor;
    }

    @Override // defpackage.tgw
    public final void a(tgv tgvVar, vun vunVar) {
        this.h.a();
        c();
        srv a2 = this.g.a();
        thl thlVar = new thl(this, a2, tgvVar);
        this.f = thlVar;
        thn.c(this.c, thlVar);
        a2.o(vunVar, false, Long.valueOf(a), dcdc.e(), null);
    }

    @Override // defpackage.tgw
    public final void b(tgv tgvVar, qbn qbnVar) {
        c();
        qbm a2 = qbnVar.a();
        thl thlVar = new thl(this, qbnVar, tgvVar);
        if (a2.b()) {
            this.d.b(FetchState.Fetch.c(tgk.IN_PROGRESS));
            this.f = thlVar;
            thn.c(this.c, thlVar);
            return;
        }
        thlVar.a(a2);
    }

    @Override // defpackage.tgw
    public final void c() {
        this.h.a();
        thl thlVar = this.f;
        if (thlVar != null) {
            thn.b(this.c, thlVar);
            this.f = null;
        }
    }
}
