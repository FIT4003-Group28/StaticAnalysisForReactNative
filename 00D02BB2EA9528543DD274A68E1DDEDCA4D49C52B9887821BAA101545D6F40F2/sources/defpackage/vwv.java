package defpackage;
/* compiled from: PG */
/* renamed from: vwv  reason: default package */
/* loaded from: classes7.dex */
public class vwv {
    @dzsi
    public final duov a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    private final boolean o;

    public vwv() {
        duov duovVar = duov.K;
        throw null;
    }

    public final boolean a() {
        duov duovVar = this.a;
        return duovVar != null && duovVar.x;
    }

    public final boolean b() {
        duov duovVar = this.a;
        return duovVar != null && duovVar.z;
    }

    public final boolean c() {
        duov duovVar = this.a;
        return duovVar != null && duovVar.y;
    }

    public final boolean d() {
        return this.o;
    }

    public vwv(btvo btvoVar) {
        duov directionsPageParameters = btvoVar.getDirectionsPageParameters();
        this.a = directionsPageParameters;
        dkrv dkrvVar = btvoVar.getOfflineMapsParameters().t;
        this.b = (dkrvVar == null ? dkrv.f : dkrvVar).b;
        dkrv dkrvVar2 = btvoVar.getOfflineMapsParameters().t;
        this.c = (dkrvVar2 == null ? dkrv.f : dkrvVar2).c;
        dkrv dkrvVar3 = btvoVar.getOfflineMapsParameters().t;
        this.d = (dkrvVar3 == null ? dkrv.f : dkrvVar3).d;
        boolean z = true;
        this.e = directionsPageParameters != null && directionsPageParameters.c;
        int i = btvoVar.getDirectionsExperimentsParameters().c;
        this.f = btvoVar.getDirectionsExperimentsParameters().d;
        this.g = btvoVar.getDirectionsExperimentsParameters().e;
        this.h = btvoVar.getDirectionsExperimentsParameters().j;
        this.i = btvoVar.getDirectionsExperimentsParameters().k;
        this.j = btvoVar.getDirectionsExperimentsParameters().m;
        this.k = btvoVar.getBikesharingDirectionsParameters().b;
        this.l = directionsPageParameters != null && directionsPageParameters.i;
        this.m = (directionsPageParameters == null || !directionsPageParameters.f) ? false : z;
        this.n = btvoVar.getMultimodalDirectionsParameters().e;
        boolean z2 = btvoVar.getFlightDirectionsParameters().a;
        boolean z3 = btvoVar.getTaxiParameters().c;
        this.o = btvoVar.getTransitPagesParameters().d;
        boolean z4 = btvoVar.getDirectionsExperimentsParameters().o;
        boolean z5 = btvoVar.getDirectionsExperimentsParameters().p;
    }
}
