package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: bhmz  reason: default package */
/* loaded from: classes3.dex */
public class bhmz implements bhmj {
    public static final dcqe a;
    private static final ddho f = dtxy.kk;
    private static final dcdn<dqvh, dddv> g;
    private static final dcdn<dqvh, Integer> h;
    public iib b;
    public cjta c;
    @dzsi
    bwrs<ilo> d;
    public int e;
    private final bhmq i;
    private final Activity j;
    private final btvo k;
    private final cqhn l;
    private final iic m;
    private final vtn n;
    private LinkedHashMap<dqvh, xii> o;
    private dcdc<bhmi> p;
    private final hub q;
    private final cqkn<qjc> r = new bhmy(this);

    static {
        dcdg p = dcdn.p();
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_BUS, dddv.KL);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAIN, dddv.KQ);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY, dddv.KP);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAM, dddv.KR);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_RAIL, dddv.KO);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_FERRY, dddv.KM);
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN, dddv.KN);
        g = p.b();
        dcdg p2 = dcdn.p();
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_BUS, Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_BUS));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAIN, Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_TRAIN));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY, Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_SUBWAY));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAM, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_PREFERRED_TRAM_LIGHT_RAIL_TRANSIT_MODE_TEXT));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_RAIL, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_PREFERRED_RAIL_TRANSIT_MODE_TEXT));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_FERRY, Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_FERRY));
        p2.f(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN, Integer.valueOf((int) R.string.NEARBY_TRANSIT_MODE_FILTER_OTHER_OPTION));
        h = p2.b();
        a = dcqe.c("bhmz");
    }

    public bhmz(bvpe bvpeVar, huc hucVar, bhmq bhmqVar, Activity activity, btvo btvoVar, cqhn cqhnVar, vtn vtnVar, cqhu cqhuVar) {
        this.i = bhmqVar;
        this.j = activity;
        this.k = btvoVar;
        this.l = cqhnVar;
        this.n = vtnVar;
        cjta b = cjtd.b();
        b.d = f;
        this.c = b;
        hub a2 = hucVar.a(new htz(this) { // from class: bhms
            private final bhmz a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.c.a();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
        this.q = a2;
        iic j = iid.j();
        View.OnAttachStateChangeListener[] onAttachStateChangeListenerArr = {bvpeVar.b, a2};
        ifj ifjVar = (ifj) j;
        ifjVar.e = new bvob(onAttachStateChangeListenerArr);
        ifjVar.f = this.c.a();
        this.m = j;
        j.e(dcdc.e());
        this.b = j.f();
        this.o = new LinkedHashMap<>();
        this.p = dcdc.e();
        this.d = null;
        this.e = 0;
    }

    @Override // defpackage.acto
    public iib a() {
        return this.b;
    }

    @Override // defpackage.acto
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bhmj
    public cjtd d() {
        ddhj ddhjVar;
        cjta b = cjtd.b();
        b.d = dddv.KK;
        if (this.k.getPlaceSheetParameters().r()) {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        } else {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        b.w(ddhjVar);
        return b.a();
    }

    @Override // defpackage.bhmj
    @dzsi
    /* renamed from: e */
    public bhmr c() {
        if (this.o.size() < 2 || !this.k.getPlaceSheetParameters().r()) {
            return null;
        }
        if (this.o.containsKey(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN)) {
            this.o.remove(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN);
            this.o.put(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN, this.o.get(dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN));
        }
        return new bhmr(dcdc.r(this.o.values()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dcdc<bhmi> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bhma(), dcdcVar.get(i)));
        }
        bhmx bhmxVar = new bhmx(this);
        iic iicVar = this.m;
        iicVar.e(F.f());
        ifj ifjVar = (ifj) iicVar;
        ifjVar.f = this.c.a();
        ifjVar.e = new bvob(bhmxVar, this.q);
        this.b = iicVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<bhmi> g() {
        dcdc<bhmi> z = dcbg.b(this.p).o(bhmu.a).z();
        return z.isEmpty() ? this.p : z;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187 A[SYNTHETIC] */
    @Override // defpackage.bega
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.bwrs<defpackage.ilo> r31) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhmz.t(bwrs):void");
    }

    @Override // defpackage.bega
    public void u() {
        cjta b = cjtd.b();
        b.d = f;
        this.c = b;
        iic iicVar = this.m;
        iicVar.e(dcdc.e());
        ((ifj) iicVar).f = this.c.a();
        this.b = iicVar.f();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.b.a().isEmpty());
    }
}
