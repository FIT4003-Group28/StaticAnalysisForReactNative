package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: croi  reason: default package */
/* loaded from: classes5.dex */
public final class croi {
    public final long a;
    public final dqvj b;
    public final amvh[] c;
    public final akra d;
    @dzsi
    public amtz e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    @dzsi
    public ddqq n;

    public croi(long j, dqvj dqvjVar, amvh[] amvhVarArr, akra akraVar) {
        this.a = j;
        this.b = dqvjVar;
        this.c = amvhVarArr;
        this.d = akraVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dbsb dbsbVar) {
        dbsbVar.b("TRAVEL_MODE", this.b);
        dbsbVar.f("BASE_ESTIMATE_SECONDS", this.i);
        if (this.f) {
            dbsbVar.f("TRAFFIC_ESTIMATE_SECONDS", this.h);
        }
        int i = this.j;
        if (i > 0) {
            dbsbVar.f("OPTIMISTIC_TRAFFIC_ESTIMATE_SECONDS", i);
        }
        int i2 = this.k;
        if (i2 > 0) {
            dbsbVar.f("PESSIMISTIC_TRAFFIC_ESTIMATE_SECONDS", i2);
        }
        int i3 = this.l;
        if (i3 > 0) {
            dbsbVar.f("HISTORICAL_TRAFFIC_ESTIMATE_SECONDS", i3);
        }
        dbsbVar.f("LENGTH_METERS", this.g);
        dbsbVar.f("NUM_DESTINATIONS", this.c.length - 1);
        int i4 = this.m;
        if (i4 != 0) {
            dbsbVar.f("TRAFFIC_ROUTING_EXPERIMENT_BACKEND_CLASS", i4);
        }
        ddqq ddqqVar = this.n;
        if (ddqqVar != null) {
            dbsbVar.b("ROAD_TRAFFIC_EXPERIMENTAL_DATA", ddqqVar.toString());
        }
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        a(b);
        return b.toString();
    }
}
