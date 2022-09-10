package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crog  reason: default package */
/* loaded from: classes5.dex */
final class crog {
    public cjse a = new cjse();
    public final cjse b = new cjse();
    public final cjse c = new cjse();
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    @dzsi
    private amub k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(amub amubVar) {
        this.k = amubVar;
        this.a = new cjse();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.j++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(GmmLocation gmmLocation) {
        if (gmmLocation.h()) {
            amub amubVar = this.k;
            if (amubVar != null) {
                long j = amubVar.W;
                if (gmmLocation.y(j)) {
                    this.a.a((float) gmmLocation.z(j));
                }
            }
            cjse cjseVar = this.b;
            amvu amvuVar = gmmLocation.l;
            cjseVar.a((float) (amvuVar != null ? amvuVar.u : dcyn.a));
            this.c.a((float) gmmLocation.m());
            if (gmmLocation.n()) {
                this.e++;
            }
            if (gmmLocation.p()) {
                this.d++;
            }
            amvu amvuVar2 = gmmLocation.l;
            if (amvuVar2 != null && amvuVar2.q) {
                this.f++;
            }
            if (gmmLocation.o()) {
                this.h++;
            }
            if (!gmmLocation.e()) {
                this.g++;
            }
            this.i++;
        }
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("onRouteConfidence", this.a);
        b.b("lnObservationProbabilities", this.b);
        b.b("routeSnappingPerformance", this.c);
        b.f("jumpingTransitions", this.d);
        b.f("spinningTransitions", this.e);
        b.f("onToOffRoadTransitions", this.f);
        b.f("failsafes", this.h);
        b.f("unsnappedLocations", this.g);
        b.f("totalProcessedLocations", this.i);
        b.f("offRouteReroutes", this.j);
        b.c();
        return b.toString();
    }
}
