package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sso  reason: default package */
/* loaded from: classes7.dex */
public final class sso {
    private static final dcqe g = dcqe.c("sso");
    public final Executor a;
    public final tgi b;
    public final gn c;
    public final ufg d;
    @dzsi
    public crzp<FetchState> e;
    @dzsi
    public crzp<uff> f;

    public sso(tgi tgiVar, Executor executor, ufg ufgVar, gn gnVar) {
        this.b = tgiVar;
        this.c = gnVar;
        this.d = ufgVar;
        this.a = executor;
    }

    private final void k(fd fdVar, ssq ssqVar) {
        if (!this.c.J() && !h(ssqVar)) {
            this.c.aq();
            gz b = this.c.b();
            dbsg<fd> l = l();
            if (l.a()) {
                b.u(l.b());
            }
            b.z(ssqVar.name());
            b.y(fdVar, ssqVar.name());
            b.f();
            this.c.aq();
        }
    }

    private final dbsg<fd> l() {
        if (this.c.j() == 0) {
            return dbpy.a;
        }
        gn gnVar = this.c;
        return dbsg.j(this.c.H(gnVar.k(gnVar.j() - 1).p()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        k(new tsa(), ssq.RESULT_LIST);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        k(new uig(), ssq.ZERO_STATE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        k(new ueg(), ssq.WAYPOINT_EDITOR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<uig> d() {
        return !h(ssq.ZERO_STATE) ? dbpy.a : dbsg.j((uig) j(ssq.ZERO_STATE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(boolean z) {
        tnr tnrVar = new tnr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("route_options_scroll", z);
        tnrVar.B(bundle);
        k(tnrVar, ssq.PREFERENCES);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(TripDetailsContext tripDetailsContext) {
        svo svoVar = new svo();
        Bundle bundle = new Bundle();
        bundle.putParcelable("trip_details_context", tripDetailsContext);
        svoVar.B(bundle);
        k(svoVar, ssq.DETAILS);
    }

    public final void g() {
        int j = this.c.j();
        for (int i = 0; i < j; i++) {
            this.c.f();
        }
    }

    public final boolean h(ssq ssqVar) {
        return i().a() && i().b() == ssqVar;
    }

    public final dbsg<ssq> i() {
        dbsg<fd> l = l();
        if (!l.a()) {
            return dbpy.a;
        }
        fd b = l.b();
        if (!(b instanceof ssr)) {
            bvoo.h("Current Directions framework screen does implement ActiveScreenFragment.", new Object[0]);
            return dbpy.a;
        }
        return dbsg.i(((ssr) b).b());
    }

    @dzsi
    public final fd j(ssq ssqVar) {
        return this.c.H(ssqVar.name());
    }
}
