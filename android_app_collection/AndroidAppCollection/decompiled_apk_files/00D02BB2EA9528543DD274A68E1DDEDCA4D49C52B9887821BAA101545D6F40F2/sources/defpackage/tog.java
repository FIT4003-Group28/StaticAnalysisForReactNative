package defpackage;
/* compiled from: PG */
/* renamed from: tog  reason: default package */
/* loaded from: classes7.dex */
public abstract class tog {
    public static final dcdn<tnz, dqvj> d;
    public static final dcco<tnz, dqvh> e;

    static {
        dcdg p = dcdn.p();
        p.f(tnz.DRIVE, dqvj.DRIVE);
        p.f(tnz.TWO_WHEELER, dqvj.TWO_WHEELER);
        p.f(tnz.BICYCLE, dqvj.BICYCLE);
        p.f(tnz.RAIL, dqvj.TRANSIT);
        p.f(tnz.TRAIN, dqvj.TRANSIT);
        p.f(tnz.TRAM, dqvj.TRANSIT);
        p.f(tnz.SUBWAY, dqvj.TRANSIT);
        p.f(tnz.BUS, dqvj.TRANSIT);
        p.f(tnz.FERRY, dqvj.TRANSIT);
        p.f(tnz.TAXI, dqvj.TAXI);
        p.f(tnz.BIKESHARING, dqvj.BIKESHARING);
        p.f(tnz.FLY, dqvj.FLY);
        p.f(tnz.WALK, dqvj.WALK);
        d = p.b();
        dccm b = dcco.b();
        b.d(tnz.RAIL, dqvh.TRANSIT_VEHICLE_TYPE_RAIL);
        b.d(tnz.TRAIN, dqvh.TRANSIT_VEHICLE_TYPE_TRAIN);
        b.d(tnz.TRAM, dqvh.TRANSIT_VEHICLE_TYPE_TRAM);
        b.d(tnz.SUBWAY, dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY);
        b.d(tnz.BUS, dqvh.TRANSIT_VEHICLE_TYPE_BUS);
        b.d(tnz.FERRY, dqvh.TRANSIT_VEHICLE_TYPE_FERRY);
        e = b.b();
    }

    public static tof h() {
        tns tnsVar = new tns();
        tnsVar.e(dcmr.a);
        tnsVar.f(dcmr.a);
        tnsVar.g(dcmr.a);
        return tnsVar;
    }

    public abstract dcep<tnz> a();

    public abstract dcep<tob> b();

    public abstract dcep<drsm> c();

    public abstract tof d();

    public boolean e() {
        throw null;
    }

    public dcep<dqvj> f() {
        throw null;
    }

    public dcep<dqvh> g() {
        throw null;
    }
}
