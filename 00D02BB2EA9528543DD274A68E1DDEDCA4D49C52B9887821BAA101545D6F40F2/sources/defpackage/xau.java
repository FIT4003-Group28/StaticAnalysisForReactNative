package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xau  reason: default package */
/* loaded from: classes7.dex */
public class xau implements xar {
    @dzsi
    public cqtd a;
    @dzsi
    public final cqhn b;
    private final String c;
    private final xaq d;
    private final djws e;
    @dzsi
    private final drhn f;
    private final boolean g;
    @dzsi
    private final xaz h;
    private final boolean i;
    private final wvw j;
    private final qbt k;
    private final Context l;
    private final btvo m;

    public xau(Application application, qbt qbtVar, wvj wvjVar, btvo btvoVar, wvw wvwVar) {
        this.l = application;
        this.k = qbtVar;
        this.g = wvjVar.a();
        this.m = btvoVar;
        this.a = null;
        this.c = application.getString(R.string.TRANSIT_TRIP_ATTRIBUTES_VIEW_ALL);
        this.d = xaq.VIEW_ALL;
        this.e = djws.g;
        this.f = null;
        this.j = wvwVar;
        this.b = null;
        this.h = null;
        this.i = false;
    }

    private static ddho i(drhl drhlVar) {
        return drhlVar.equals(drhl.REALTIME_FROM_AGENCY) ? dtyc.ek : drhlVar.equals(drhl.REALTIME_FROM_UGC) ? dtyc.el : drhlVar.equals(drhl.PREDICTED_BY_HULK) ? dtyc.ei : drhlVar.equals(drhl.PREDICTED_BY_AGENCY_HISTORICAL_REALTIME) ? dtyc.eh : dtyc.ej;
    }

    @Override // defpackage.xar
    public String a() {
        return this.c;
    }

    @Override // defpackage.xar
    @dzsi
    public cqtd b() {
        return this.a;
    }

    @Override // defpackage.xar
    public xaq c() {
        return this.d;
    }

    @Override // defpackage.xar
    public cqkl d() {
        if (!this.g) {
            return cqkl.a;
        }
        if (this.d == xaq.VIEW_ALL) {
            this.k.O(this.j);
        } else {
            qbt qbtVar = this.k;
            wvw wvwVar = this.j;
            wvv k = wvw.k();
            k.g(wvwVar.e());
            k.f(wvwVar.d());
            k.i(wvwVar.a());
            k.e(wvwVar.b());
            k.d(wvwVar.c());
            k.h(wvwVar.g());
            k.c(wvwVar.h());
            k.b(wvwVar.i());
            wvk wvkVar = (wvk) k;
            wvkVar.b = wvwVar.j();
            drhj drhjVar = this.e.c;
            if (drhjVar == null) {
                drhjVar = drhj.c;
            }
            wvkVar.a = drhjVar;
            qbtVar.O(k.a());
        }
        return cqkl.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.equals(defpackage.drhl.REALTIME_FROM_UGC) != false) goto L17;
     */
    @Override // defpackage.xar
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String e() {
        /*
            r3 = this;
            btvo r0 = r3.m
            dwnv r0 = r0.getTransitPagesParameters()
            boolean r0 = r0.K
            r1 = 0
            if (r0 == 0) goto L45
            drhn r0 = r3.f
            if (r0 == 0) goto L45
            int r2 = r0.a
            r2 = r2 & 8
            if (r2 == 0) goto L45
            int r0 = r0.c
            drhl r0 = defpackage.drhl.b(r0)
            if (r0 != 0) goto L1f
            drhl r0 = defpackage.drhl.UNKNOWN_ATTRIBUTE_SOURCE
        L1f:
            drhl r2 = defpackage.drhl.REALTIME_FROM_AGENCY
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            drhn r0 = r3.f
            int r0 = r0.c
            drhl r0 = defpackage.drhl.b(r0)
            if (r0 != 0) goto L33
            drhl r0 = defpackage.drhl.UNKNOWN_ATTRIBUTE_SOURCE
        L33:
            drhl r2 = defpackage.drhl.REALTIME_FROM_UGC
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L45
        L3b:
            android.content.Context r0 = r3.l
            r1 = 2131958028(0x7f13190c, float:1.9552657E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xau.e():java.lang.String");
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof xau)) {
            return false;
        }
        xau xauVar = (xau) obj;
        drhj drhjVar = this.e.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        drhj drhjVar2 = xauVar.e.c;
        if (drhjVar2 == null) {
            drhjVar2 = drhj.c;
        }
        return drhjVar.equals(drhjVar2) && dbsd.a(this.f, xauVar.f) && this.j.equals(xauVar.j);
    }

    @Override // defpackage.xar
    public Boolean f() {
        boolean z = true;
        if (this.g || (this.d != xaq.VIEW_ALL && this.d != xaq.NEW_ATTRIBUTE)) {
            if (this.d == xaq.VIEW_ALL || this.a != null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return true;
    }

    @Override // defpackage.xar
    public Boolean g() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.xar
    public cjtd h() {
        if (this.d == xaq.VIEW_ALL) {
            return cjtd.a(dtyc.ev);
        }
        drhj drhjVar = this.e.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        if (drhjVar.b.equals("crowdedness")) {
            if (this.d == xaq.NEW_ATTRIBUTE) {
                return cjtd.a(dtyc.em);
            }
            if (this.i) {
                return cjtd.a(dtyc.en);
            }
            drhn drhnVar = this.f;
            if (drhnVar != null && (drhnVar.a & 8) != 0) {
                drhl b = drhl.b(drhnVar.c);
                if (b == null) {
                    b = drhl.UNKNOWN_ATTRIBUTE_SOURCE;
                }
                ddho i = i(b);
                ddho ddhoVar = null;
                if (this.m.getTransitPagesParameters().L) {
                    drhn drhnVar2 = this.f;
                    if ((drhnVar2.a & 4) != 0) {
                        drhl b2 = drhl.b(drhnVar2.d);
                        if (b2 == null) {
                            b2 = drhl.UNKNOWN_ATTRIBUTE_SOURCE;
                        }
                        ddhoVar = i(b2);
                    }
                }
                if (ddhoVar != null) {
                    cjta b3 = cjtd.b();
                    b3.d = ddhoVar;
                    b3.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                    return b3.a();
                }
                return cjtd.a(i);
            }
        }
        return cjtd.a(dtyc.eq);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        drhj drhjVar = this.e.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        objArr[0] = drhjVar;
        objArr[1] = this.f;
        objArr[2] = this.j;
        return Arrays.hashCode(objArr);
    }

    public xau(Application application, qbt qbtVar, wvj wvjVar, btvo btvoVar, wvw wvwVar, cqhn cqhnVar, xaz xazVar, djws djwsVar, drhn drhnVar, boolean z) {
        xaq xaqVar;
        this.l = application;
        this.k = qbtVar;
        this.g = wvjVar.a();
        this.m = btvoVar;
        this.b = cqhnVar;
        this.h = xazVar;
        this.e = djwsVar;
        this.f = drhnVar;
        this.j = wvwVar;
        this.i = z;
        drhj drhjVar = djwsVar.c;
        String str = (drhjVar == null ? drhj.c : drhjVar).b;
        if ((drhnVar.a & 8) == 0) {
            this.a = cqrt.i(cqrt.f(2131232137), ibm.x());
            this.c = djwsVar.d;
            this.d = xaq.NEW_ATTRIBUTE;
            return;
        }
        drhh g = xaz.g(drhnVar, djwsVar);
        cqtd cqtdVar = null;
        if (g == null) {
            drhj drhjVar2 = djwsVar.c;
            String str2 = (drhjVar2 == null ? drhj.c : drhjVar2).b;
            this.a = null;
            this.c = "";
            this.d = xaq.STANDARD_ATTRIBUTE;
            return;
        }
        this.c = g.c;
        drhg b = drhg.b(g.b);
        if ((b == null ? drhg.UNKNOWN_STATE : b) == drhg.NEGATIVE) {
            xaqVar = xaq.NEGATIVE_ATTRIBUTE;
        } else {
            xaqVar = xaq.STANDARD_ATTRIBUTE;
        }
        this.d = xaqVar;
        boolean z2 = false;
        if (btvoVar.getTransitPagesParameters().K && xaz.h(drhnVar) && !z) {
            z2 = true;
        }
        this.a = xazVar != null ? xazVar.c(g, z2, true, new vtk(this) { // from class: xat
            private final xau a;

            {
                this.a = this;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar2) {
                xau xauVar = this.a;
                xauVar.a = cqtdVar2;
                if (xauVar.b != null) {
                    cqkx.p(xauVar);
                }
            }
        }) : cqtdVar;
    }
}
