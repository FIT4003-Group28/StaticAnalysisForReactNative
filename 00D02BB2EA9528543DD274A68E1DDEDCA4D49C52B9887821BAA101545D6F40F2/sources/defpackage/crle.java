package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: crle  reason: default package */
/* loaded from: classes5.dex */
public final class crle {
    static final dwbm a;
    static final dwbm b;
    private static final dwbm o;
    public final btrm c;
    public final dxio<avnr> d;
    public final dxio<avnr> e;
    public final crkw f;
    public final bttf g;
    public final bvrb h;
    public final crrj i;
    public final vva j;
    public final ckcq k;
    public final ckcq l;
    public final ckcq m;
    public final boolean n;
    private final bvjj p;

    static {
        dwbl bZ = dwbm.c.bZ();
        dore doreVar = dore.REROUTE_AND_ALTERNATES_FROM_NEW_LOCATION;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbm dwbmVar = (dwbm) bZ.b;
        dwbmVar.b = doreVar.i;
        dwbmVar.a |= 1;
        o = bZ.bK();
        dwbl bZ2 = dwbm.c.bZ();
        dore doreVar2 = dore.TRIP_UPDATE_AND_ALTERNATES;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwbm dwbmVar2 = (dwbm) bZ2.b;
        dwbmVar2.b = doreVar2.i;
        dwbmVar2.a |= 1;
        a = bZ2.bK();
        dwbl bZ3 = dwbm.c.bZ();
        dore doreVar3 = dore.OFFLINE_TRIP_UPDATE_AND_ALTERNATES;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwbm dwbmVar3 = (dwbm) bZ3.b;
        dwbmVar3.b = doreVar3.i;
        dwbmVar3.a |= 1;
        b = bZ3.bK();
    }

    public crle(ckcw ckcwVar, btrm btrmVar, dxio<avnr> dxioVar, dxio<avnr> dxioVar2, crrj crrjVar, crkw crkwVar, bvjj bvjjVar, bttf bttfVar, bvrb bvrbVar, duov duovVar, vva vvaVar) {
        this.c = btrmVar;
        this.e = dxioVar;
        this.d = dxioVar2;
        this.i = crrjVar;
        this.f = crkwVar;
        this.p = bvjjVar;
        this.g = bttfVar;
        this.h = bvrbVar;
        this.j = vvaVar;
        this.n = duovVar.h;
        this.k = ((ckcr) ckcwVar.a(ckhi.c)).a();
        this.l = ((ckcr) ckcwVar.a(ckhi.b)).a();
        this.m = ((ckcr) ckcwVar.a(ckhi.l)).a();
    }

    public static dwaw c(vun vunVar, @dzsi dwbm dwbmVar, @dzsi dwaq dwaqVar) {
        return vnw.a(vunVar, dwbmVar, dcdc.f(dvxj.SVG_INCIDENT_LIGHT), null, dwaqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(@dzsi GmmLocation gmmLocation) {
        if (gmmLocation != null) {
            if (gmmLocation.i()) {
                return false;
            }
            if (gmmLocation.hasAccuracy() && gmmLocation.getAccuracy() <= 50.0f) {
                return false;
            }
        }
        return true;
    }

    public final crkv a(@dzsi GmmLocation gmmLocation, dcdc<amvh> dcdcVar, dqvj dqvjVar, dwao dwaoVar, @dzsi dspd dspdVar, boolean z, @dzsi dwaq dwaqVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(amvh.h(null, gmmLocation == null ? null : gmmLocation.B()));
        arrayList.addAll(dcdcVar);
        vum vumVar = new vum();
        vumVar.e = crsr.a(gmmLocation);
        vumVar.f = gmmLocation == null ? null : gmmLocation.a();
        vumVar.p = z;
        vumVar.g = d();
        vuz a2 = this.j.a(dwaoVar, dqvjVar);
        a2.b = dspdVar;
        vumVar.a = a2.a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vumVar.b((amvh) arrayList.get(i));
        }
        dwaw c = c(vumVar.a(), null, dwaqVar);
        crkv a3 = this.f.a(null, null, null);
        a3.h(c, e(gmmLocation), true);
        return a3;
    }

    public final vum b(GmmLocation gmmLocation, amub amubVar, dwao dwaoVar, boolean z, @dzsi dowa dowaVar, boolean z2) {
        amvh h = amvh.h(null, gmmLocation.B());
        vum vumVar = new vum();
        vumVar.e = crsr.a(gmmLocation);
        vumVar.f = gmmLocation.a();
        vumVar.p = z;
        vumVar.g = dowaVar;
        vva vvaVar = this.j;
        dphq dphqVar = dwaoVar.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dqvj c = dqvj.c(dphqVar.b);
        if (c == null) {
            c = dqvj.MIXED;
        }
        vumVar.a = vvaVar.a(dwaoVar, c).a();
        vumVar.b(h);
        vumVar.r = z2;
        amvh[] a2 = amuc.a(amubVar.o);
        for (int i = 1; i < a2.length; i++) {
            vumVar.b(a2[i]);
        }
        return vumVar;
    }

    @dzsi
    public final dowa d() {
        return bvsl.a(this.p);
    }

    public final dwaw f(GmmLocation gmmLocation, amub amubVar, @dzsi dspd dspdVar, @dzsi dspd dspdVar2, boolean z, @dzsi dqvj dqvjVar, @dzsi EnumMap<vux, Integer> enumMap, @dzsi dwaq dwaqVar) {
        vuz a2 = this.j.a(amubVar.J, amubVar.h);
        a2.c(dspdVar);
        a2.b = dspdVar2;
        a2.a = dqvjVar;
        a2.d = enumMap;
        vum b2 = b(gmmLocation, amubVar, a2.a(), z, d(), this.n);
        amubVar.ae().size();
        return c(b2.a(), o, dwaqVar);
    }
}
