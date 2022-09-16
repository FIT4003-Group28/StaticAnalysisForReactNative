package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uic  reason: default package */
/* loaded from: classes7.dex */
public final class uic {
    private static final dcqe f = dcqe.c("uic");
    public final ufg a;
    public final Executor b;
    public final tnd c;
    public final crzd<uid> d = new crzd<>();
    public crzp<uff> e;
    private final tmz g;
    private final tmw h;
    private tmy i;

    public uic(tmw tmwVar, tmz tmzVar, tnd tndVar, ufg ufgVar, Executor executor) {
        this.a = ufgVar;
        this.b = executor;
        this.g = tmzVar;
        this.c = tndVar;
        this.h = tmwVar;
    }

    public final tmy a() {
        if (this.i == null) {
            this.i = this.g.a(this.h);
            uff l = this.a.a().l();
            dbsk.s(l);
            if (!ufe.a(l.a())) {
                uff l2 = this.a.a().l();
                dbsk.s(l2);
                dcdc<amvh> a = l2.a();
                dbsg<Integer> d = l.d();
                if (d.a()) {
                    this.i.a(this.c.a(a, d.b().intValue(), false));
                } else {
                    bvoo.h("Could not find the first empty waypoint index in the current waypoints state: %s", a);
                }
            } else {
                uff l3 = this.a.a().l();
                dbsk.s(l3);
                bvoo.h("Found waypoints were valid for query while initializing the DirectionsOdelayManager: %s", l3.a());
            }
        }
        tmy tmyVar = this.i;
        dbsk.s(tmyVar);
        return tmyVar;
    }

    public final bwpn b() {
        return a().e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crzm<Boolean> c() {
        return a().e().B();
    }
}
