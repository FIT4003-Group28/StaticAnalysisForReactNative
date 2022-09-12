package defpackage;
/* compiled from: PG */
/* renamed from: crqd  reason: default package */
/* loaded from: classes5.dex */
public final class crqd extends crpx {
    public final dqvj f;
    public final dcdc<crqg> g;
    public final dcdc<crqg> h;

    public crqd(crqc crqcVar) {
        super(crqcVar);
        dqvj dqvjVar = crqcVar.f;
        dbsk.s(dqvjVar);
        this.f = dqvjVar;
        dcdc<crqg> dcdcVar = crqcVar.g;
        dbsk.s(dcdcVar);
        this.g = dcdcVar;
        dcdc<crqg> dcdcVar2 = crqcVar.h;
        dbsk.s(dcdcVar2);
        this.h = dcdcVar2;
        dbsk.s(crqcVar.i);
        if (dcdcVar.isEmpty()) {
            amuh amuhVar = amuh.b;
            return;
        }
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dccxVar.g(dcdcVar.get(i).b.a);
        }
        amuh.f(0, dccxVar.f());
    }

    @Override // defpackage.crpx
    public final String toString() {
        dbsb a = a();
        a.b("requestedTravelMode", this.f);
        a.f("numImplicitDestinations", this.g.size());
        a.f("numOverviewImplicitDestinations", this.h.size());
        return a.toString();
    }
}
