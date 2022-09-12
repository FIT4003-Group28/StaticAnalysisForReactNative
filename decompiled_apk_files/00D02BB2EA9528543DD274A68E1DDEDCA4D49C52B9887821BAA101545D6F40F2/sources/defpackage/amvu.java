package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amvu  reason: default package */
/* loaded from: classes.dex */
public final class amvu {
    public boolean a;
    public boolean b;
    @dzsi
    public amvx c;
    public int d;
    @dzsi
    public akra e;
    public float f;
    public float g;
    public boolean h;
    @dzsi
    public amvw i;
    public long j;
    public final dzlf k;
    public final dzlf l;
    public dqvj m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public boolean t;
    public double u;
    @dzsi
    public amvr v;
    @dzsi
    public amvp w;
    @dzsi
    public ahna x;
    @dzsi
    public dzke y;
    @dzsi
    public ahmr z;

    public amvu() {
        this.d = 0;
        this.k = new dzlb();
        this.l = new dzlb();
        this.m = dqvj.DRIVE;
    }

    public final boolean equals(@dzsi Object obj) {
        dcqe dcqeVar = GmmLocation.g;
        bvoo.h("GmmLocation.equals is only supported for unit tests", new Object[0]);
        if (!(obj instanceof amvu)) {
            return false;
        }
        amvu amvuVar = (amvu) obj;
        return this.a == amvuVar.a && this.b == amvuVar.b && dbsd.a(this.c, amvuVar.c) && dbsd.a(this.e, amvuVar.e) && this.f == amvuVar.f && this.g == amvuVar.g && this.m == amvuVar.m && this.j == amvuVar.j && dbsd.a(this.k, amvuVar.k) && dbsd.a(this.l, amvuVar.l) && dbsd.a(this.y, amvuVar.y);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String arrays;
        dbsb b = dbsc.b(this);
        b.h("onRoad", this.a);
        b.h("inStartupConfusion", this.b);
        b.f("laneNumber", this.d);
        b.b("onRouteConfidence", this.l);
        b.b("modalDistanceAlongRouteMeters", this.k);
        b.g("timeToComputeSnapping", this.n);
        b.h("jumpedBackwardsAndSpun", this.p);
        b.h("onToOffRoadTransition", this.q);
        b.h("failsafesGenerated", this.r);
        b.h("jumpedDisconnectedSegments", this.o);
        b.g("selectedRouteId", this.j);
        b.g("snappingTileDataVersion", this.s);
        b.h("isCarTileVersion", this.t);
        b.b("mostLikelyFuturePath", this.w);
        b.d("lnObservationProbability", this.u);
        b.d("lnExpectedDensity", dcyn.a);
        b.h("singleModeAltitude", this.h);
        dzke dzkeVar = this.y;
        if (dzkeVar == null) {
            arrays = null;
        } else {
            dzjw dzjwVar = (dzjw) dzkeVar;
            int i = dzjwVar.b;
            int[] iArr = new int[i];
            System.arraycopy(dzjwVar.a, 0, iArr, 0, i);
            arrays = Arrays.toString(iArr);
        }
        b.b("connectedNonBranchingSegmentIds", arrays);
        return b.toString();
    }

    public amvu(amvu amvuVar) {
        this.d = 0;
        dzlb dzlbVar = new dzlb();
        this.k = dzlbVar;
        dzlb dzlbVar2 = new dzlb();
        this.l = dzlbVar2;
        this.m = dqvj.DRIVE;
        this.a = amvuVar.a;
        this.b = amvuVar.b;
        this.d = amvuVar.d;
        this.c = amvuVar.c;
        this.e = amvuVar.e;
        this.f = amvuVar.f;
        this.g = amvuVar.g;
        this.h = amvuVar.h;
        this.i = amvuVar.i;
        this.m = amvuVar.m;
        this.j = amvuVar.j;
        dzlbVar.putAll(amvuVar.k);
        dzlbVar2.putAll(amvuVar.l);
        this.n = amvuVar.n;
        this.o = amvuVar.o;
        this.p = amvuVar.p;
        this.q = amvuVar.q;
        this.r = amvuVar.r;
        this.s = amvuVar.s;
        this.t = amvuVar.t;
        this.w = amvuVar.w;
        this.x = amvuVar.x;
        this.y = amvuVar.y;
        this.u = amvuVar.u;
        this.v = amvuVar.v;
        this.z = amvuVar.z;
    }
}
