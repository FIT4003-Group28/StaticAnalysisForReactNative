package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wyv  reason: default package */
/* loaded from: classes7.dex */
public class wyv implements wyi {
    private static final dcep<drhl> b = dcep.C(drhl.REALTIME_FROM_UGC, drhl.REALTIME_FROM_AGENCY);
    public cqtd a;
    private final Activity c;
    private final btvo d;
    private final wyu e;
    private final drhj f;
    private final vtn g;
    private final String h;
    private final String i;
    private final boolean j;
    private final drhn k;

    public wyv(Activity activity, cqhn cqhnVar, vtn vtnVar, btvo btvoVar, gce gceVar, wyu wyuVar, djws djwsVar, drhn drhnVar) {
        drhw drhwVar;
        drhh drhhVar;
        drhw drhwVar2;
        drhw drhwVar3;
        String g;
        djwq j;
        cqtd k;
        this.c = activity;
        this.e = wyuVar;
        this.d = btvoVar;
        this.k = drhnVar;
        this.g = vtnVar;
        this.j = (drhnVar.a & 8) != 0;
        drhj drhjVar = djwsVar.c;
        drhjVar = drhjVar == null ? drhj.c : drhjVar;
        this.f = drhjVar;
        int i = drhnVar.a;
        if ((i & 8) == 0) {
            this.a = cqrt.i(cqrt.f(2131232137), ibm.p());
            this.h = djwsVar.d;
            this.i = djwsVar.f;
            return;
        }
        cqtd cqtdVar = null;
        if ((i & 16) != 0) {
            drhhVar = drhnVar.f;
            if (drhhVar == null) {
                drhhVar = drhh.k;
            }
        } else {
            drhx drhxVar = drhnVar.e;
            drhxVar = drhxVar == null ? drhx.c : drhxVar;
            if (drhxVar.a == 1) {
                drhwVar = (drhw) drhxVar.b;
            } else {
                drhwVar = drhw.b;
            }
            if (drhwVar.a.size() == 1) {
                drhx drhxVar2 = drhnVar.e;
                drhxVar2 = drhxVar2 == null ? drhx.c : drhxVar2;
                if (drhxVar2.a == 1) {
                    drhwVar2 = (drhw) drhxVar2.b;
                } else {
                    drhwVar2 = drhw.b;
                }
                djwq j2 = j(drhwVar2.a.get(0), djwsVar);
                if (j2 != null) {
                    drhhVar = j2.b;
                    if (drhhVar == null) {
                        drhhVar = drhh.k;
                    }
                }
            }
            drhhVar = null;
        }
        if (drhhVar == null) {
            String str = drhjVar.b;
            this.a = null;
            this.h = "";
            this.i = "";
            return;
        }
        this.h = drhhVar.c;
        if ((drhhVar.a & 8) != 0) {
            g = drhhVar.d;
        } else {
            ArrayList arrayList = new ArrayList();
            drhx drhxVar3 = drhnVar.e;
            drhxVar3 = drhxVar3 == null ? drhx.c : drhxVar3;
            if (drhxVar3.a == 1) {
                drhwVar3 = (drhw) drhxVar3.b;
            } else {
                drhwVar3 = drhw.b;
            }
            for (drhu drhuVar : drhwVar3.a) {
                if (drhuVar.c && (j = j(drhuVar, djwsVar)) != null) {
                    drhh drhhVar2 = j.b;
                    arrayList.add((drhhVar2 == null ? drhh.k : drhhVar2).c);
                }
            }
            g = dbrz.e(activity.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_OPTION_SEPARATOR)).g(arrayList);
        }
        this.i = g;
        this.a = null;
        if (gceVar.h() && (drhhVar.a & 512) != 0) {
            k = k(drhhVar.j);
        } else if (!gceVar.h() || (drhhVar.a & 32) == 0) {
            int i2 = drhhVar.a;
            if ((i2 & 256) != 0) {
                k = k(drhhVar.i);
            } else {
                k = (i2 & 16) != 0 ? k(drhhVar.e) : null;
            }
        } else {
            k = k(drhhVar.f);
        }
        this.a = k != null ? iut.a(k) : cqtdVar;
    }

    private static djwq j(drhu drhuVar, djws djwsVar) {
        djwr djwrVar;
        String str = drhuVar.b;
        if (djwsVar.a == 5) {
            djwrVar = (djwr) djwsVar.b;
        } else {
            djwrVar = djwr.b;
        }
        for (djwq djwqVar : djwrVar.a) {
            if (djwqVar.a.equals(str)) {
                return djwqVar;
            }
        }
        return null;
    }

    private final cqtd k(String str) {
        return this.g.f(str, bvlw.a, new vtk(this) { // from class: wyt
            private final wyv a;

            {
                this.a = this;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar) {
                wyv wyvVar = this.a;
                wyvVar.a = iut.a(cqtdVar);
                cqkx.p(wyvVar);
            }
        });
    }

    @Override // defpackage.wyi
    public String a() {
        return this.h;
    }

    @Override // defpackage.wyi
    public String b() {
        return this.i;
    }

    @Override // defpackage.wyi
    public Boolean c() {
        if (!this.d.getTransitPagesParameters().K) {
            return false;
        }
        dcep<drhl> dcepVar = b;
        drhl b2 = drhl.b(this.k.c);
        if (b2 == null) {
            b2 = drhl.UNKNOWN_ATTRIBUTE_SOURCE;
        }
        return Boolean.valueOf(dcepVar.contains(b2));
    }

    @Override // defpackage.wyi
    public String d() {
        if (c().booleanValue()) {
            return this.c.getResources().getString(R.string.TRANSIT_ATTRIBUTE_REALTIME);
        }
        return null;
    }

    @Override // defpackage.wyi
    public String e() {
        if (c().booleanValue()) {
            return this.c.getResources().getString(R.string.TRANSIT_ATTRIBUTE_REALTIME_RECENTLY_UPDATED);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wyv)) {
            return false;
        }
        wyv wyvVar = (wyv) obj;
        return this.e.equals(wyvVar.e) && this.f.equals(wyvVar.f) && dbsd.a(this.a, wyvVar.a) && this.h.equals(wyvVar.h) && this.i.equals(wyvVar.i) && this.j != wyvVar.j;
    }

    @Override // defpackage.wyi
    public cqkl f() {
        drhj drhjVar = this.f;
        String str = drhjVar.b;
        this.e.a(drhjVar);
        return cqkl.a;
    }

    @Override // defpackage.wyi
    public cjtd g() {
        return cjtd.a(dtyc.eo);
    }

    @Override // defpackage.wyi
    public cqtd h() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.a, this.h, this.i, Boolean.valueOf(this.j)});
    }

    @Override // defpackage.wyi
    public Boolean i() {
        return Boolean.valueOf(!this.j);
    }
}
