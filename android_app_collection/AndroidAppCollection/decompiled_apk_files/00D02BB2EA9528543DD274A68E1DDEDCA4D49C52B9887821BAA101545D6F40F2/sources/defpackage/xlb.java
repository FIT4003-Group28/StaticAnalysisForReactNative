package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xlb  reason: default package */
/* loaded from: classes7.dex */
public final class xlb implements aiex {
    private final xlc a;
    private final boolean b;
    private final dcdc<dpce> c;
    @dzsi
    private final dpce d;
    @dzsi
    private final String e;
    private final String f;
    @dzsi
    private final donz g;
    @dzsi
    private final dpyy h;
    @dzsi
    private final cqtd i;
    private final String j;
    @dzsi
    private dmpn k;

    public xlb(Application application, xlc xlcVar, cqat cqatVar, long j, xmx xmxVar, boolean z) {
        this.a = xlcVar;
        this.b = z;
        this.c = dcdc.q(alcf.o(xmxVar.b().c()));
        this.d = xmxVar.c();
        this.e = xmxVar.d();
        this.f = xmxVar.h().toString();
        this.g = xmxVar.j();
        this.h = xmxVar.e();
        this.i = xmxVar.f();
        eaow e = eaow.e(cqatVar.b() - j);
        if (e.q(eaow.c(1L))) {
            this.j = application.getString(R.string.TRANSIT_VEHICLE_CALLOUT_FRESHNESS_NOW);
        } else {
            this.j = application.getString(R.string.TRANSIT_VEHICLE_CALLOUT_FRESHNESS_MIN_AGO, new Object[]{bvtb.e(application.getResources(), (int) e.g(), bvsz.ABBREVIATED)});
        }
    }

    @Override // defpackage.aiex
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.aiex
    public final boolean b(aiex aiexVar) {
        if (!(aiexVar instanceof xlb)) {
            return false;
        }
        xlb xlbVar = (xlb) aiexVar;
        return dbsd.a(this.c, xlbVar.c) && dbsd.a(this.d, xlbVar.d) && dbsd.a(this.e, xlbVar.e) && dbsd.a(this.f, xlbVar.f) && dbsd.a(this.g, xlbVar.g) && dbsd.a(this.j, xlbVar.j) && dbsd.a(this.i, xlbVar.i);
    }

    @Override // defpackage.aiex
    public final dmpn c() {
        xlb xlbVar;
        String str;
        akuh akuhVar;
        cqtd b;
        String str2;
        if (this.k == null) {
            xlc xlcVar = this.a;
            dcdc<dpce> dcdcVar = this.c;
            dpce dpceVar = this.d;
            String str3 = this.e;
            String str4 = this.f;
            donz donzVar = this.g;
            dpyy dpyyVar = this.h;
            cqtd cqtdVar = this.i;
            String str5 = this.j;
            if (true != xlcVar.q.getTransitPagesParameters().i) {
                dpyyVar = null;
            }
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            ArrayList arrayList = new ArrayList(5);
            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar = (dmpd) dmpcVar.b;
            dmpdVar.a |= 1;
            dmpdVar.b = " ";
            int a = xlcVar.c().a();
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar2 = (dmpd) dmpcVar.b;
            dmpdVar2.a |= 2;
            dmpdVar2.c = a;
            dmpd dmpdVar3 = (dmpd) dmpcVar.bK();
            dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
            int a2 = xlcVar.e(dcdcVar).a();
            if (dmpcVar2.c) {
                dmpcVar2.bF();
                dmpcVar2.c = false;
            }
            dmpd dmpdVar4 = (dmpd) dmpcVar2.b;
            dmpdVar4.a |= 2;
            dmpdVar4.c = a2;
            arrayList.add((dmpd) dmpcVar2.bK());
            if (dpceVar == null || (dpceVar.a & 2) == 0) {
                str = null;
            } else {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                String str6 = doulVar.b;
                if (!dbtw.a(str6)) {
                    arrayList.add(dmpdVar3);
                    dmpc dmpcVar3 = (dmpc) dmpd.h.bZ();
                    if (dmpcVar3.c) {
                        dmpcVar3.bF();
                        dmpcVar3.c = false;
                    }
                    dmpd dmpdVar5 = (dmpd) dmpcVar3.b;
                    str6.getClass();
                    dmpdVar5.a |= 1;
                    dmpdVar5.b = str6;
                    int c = bvoa.c(doulVar.e, -16777216);
                    if (xlcVar.f.get(c) == null) {
                        str2 = str6;
                        xlcVar.f.put(c, xlcVar.f(12, c));
                    } else {
                        str2 = str6;
                    }
                    int a3 = xlcVar.f.get(c).a();
                    if (dmpcVar3.c) {
                        dmpcVar3.bF();
                        dmpcVar3.c = false;
                    }
                    dmpd dmpdVar6 = (dmpd) dmpcVar3.b;
                    dmpdVar6.a |= 2;
                    dmpdVar6.c = a3;
                    arrayList.add((dmpd) dmpcVar3.bK());
                } else {
                    str2 = str6;
                }
                str = str2;
            }
            float f = 0.0f;
            float intValue = xlcVar.e.containsKey(dcdcVar) ? xlcVar.e.get(dcdcVar).intValue() : 0.0f;
            if (str != null) {
                intValue += Math.max(0.0f, xlcVar.g(str, 12.0f) - 48.0f);
            }
            boolean z = ((double) (intValue / 236.0f)) > 0.75d || (str3 != null && xlcVar.g(str3, 12.0f) + intValue > 236.0f);
            if (str3 != null) {
                if (z) {
                    xlcVar.a(dmpeVar, arrayList);
                    arrayList.clear();
                } else {
                    arrayList.add(dmpdVar3);
                    f = intValue + xlcVar.g(" ", 11.0f);
                }
                dmpc dmpcVar4 = (dmpc) dmpd.h.bZ();
                String l = xlcVar.l(str3, f);
                if (dmpcVar4.c) {
                    dmpcVar4.bF();
                    dmpcVar4.c = false;
                }
                dmpd dmpdVar7 = (dmpd) dmpcVar4.b;
                l.getClass();
                dmpdVar7.a |= 1;
                dmpdVar7.b = l;
                if (xlcVar.l == null) {
                    xlcVar.l = xlcVar.f(12, ire.s().b(xlcVar.c));
                }
                aktg aktgVar = xlcVar.l;
                dbsk.s(aktgVar);
                int a4 = aktgVar.a();
                if (dmpcVar4.c) {
                    dmpcVar4.bF();
                    dmpcVar4.c = false;
                }
                dmpd dmpdVar8 = (dmpd) dmpcVar4.b;
                dmpdVar8.a |= 2;
                dmpdVar8.c = a4;
                arrayList.add((dmpd) dmpcVar4.bK());
            }
            xlcVar.a(dmpeVar, arrayList);
            ArrayList arrayList2 = new ArrayList(3);
            dmpc dmpcVar5 = (dmpc) dmpd.h.bZ();
            if (dmpcVar5.c) {
                dmpcVar5.bF();
                dmpcVar5.c = false;
            }
            dmpd dmpdVar9 = (dmpd) dmpcVar5.b;
            str4.getClass();
            dmpdVar9.a |= 1;
            dmpdVar9.b = str4;
            Context context = xlcVar.c;
            int a5 = xlcVar.d(donzVar == donz.ON_TIME ? ire.k().b(context) : donzVar == donz.CHANGED ? ire.n().b(context) : -16777216).a();
            if (dmpcVar5.c) {
                dmpcVar5.bF();
                dmpcVar5.c = false;
            }
            dmpd dmpdVar10 = (dmpd) dmpcVar5.b;
            dmpdVar10.a |= 2;
            dmpdVar10.c = a5;
            arrayList2.add((dmpd) dmpcVar5.bK());
            if (cqtdVar != null) {
                akuhVar = xlcVar.j.get(cqtdVar);
                if (akuhVar == null) {
                    akuhVar = xlcVar.b.a().e().d(bvlf.c(cqtdVar.a(xlcVar.c), jmj.a(xlcVar.c, 16), jmj.a(xlcVar.c, 16), Bitmap.Config.ARGB_8888));
                    xlcVar.j.put(cqtdVar, akuhVar);
                }
            } else if (dpyyVar != null) {
                akuhVar = xlcVar.i.get(dpyyVar);
                if (akuhVar == null && (b = xkn.b(dpyyVar)) != null) {
                    akuhVar = xlcVar.b.a().e().d(bvlf.c(b.a(xlcVar.c), jmj.a(xlcVar.c, 22), jmj.a(xlcVar.c, 16), Bitmap.Config.ARGB_8888));
                    xlcVar.i.put(dpyyVar, akuhVar);
                }
            } else {
                akuhVar = null;
            }
            if (akuhVar != null) {
                dmpc dmpcVar6 = (dmpc) dmpd.h.bZ();
                if (dmpcVar6.c) {
                    dmpcVar6.bF();
                    dmpcVar6.c = false;
                }
                dmpd dmpdVar11 = (dmpd) dmpcVar6.b;
                dmpdVar11.a |= 1;
                dmpdVar11.b = " · ";
                int a6 = xlcVar.c().a();
                if (dmpcVar6.c) {
                    dmpcVar6.bF();
                    dmpcVar6.c = false;
                }
                dmpd dmpdVar12 = (dmpd) dmpcVar6.b;
                dmpdVar12.a |= 2;
                dmpdVar12.c = a6;
                arrayList2.add((dmpd) dmpcVar6.bK());
                dmpc dmpcVar7 = (dmpc) dmpd.h.bZ();
                int a7 = akuhVar.a();
                if (dmpcVar7.c) {
                    dmpcVar7.bF();
                    dmpcVar7.c = false;
                }
                dmpd dmpdVar13 = (dmpd) dmpcVar7.b;
                dmpdVar13.a |= 2;
                dmpdVar13.c = a7;
                arrayList2.add((dmpd) dmpcVar7.bK());
            }
            xlcVar.a(dmpeVar, arrayList2);
            ArrayList arrayList3 = new ArrayList(1);
            dmpc dmpcVar8 = (dmpc) dmpd.h.bZ();
            if (dmpcVar8.c) {
                dmpcVar8.bF();
                dmpcVar8.c = false;
            }
            dmpd dmpdVar14 = (dmpd) dmpcVar8.b;
            str5.getClass();
            dmpdVar14.a |= 1;
            dmpdVar14.b = str5;
            if (xlcVar.n == null) {
                xlcVar.n = xlcVar.f(11, ire.q().b(xlcVar.c));
            }
            aktg aktgVar2 = xlcVar.n;
            dbsk.s(aktgVar2);
            int a8 = aktgVar2.a();
            if (dmpcVar8.c) {
                dmpcVar8.bF();
                dmpcVar8.c = false;
            }
            dmpd dmpdVar15 = (dmpd) dmpcVar8.b;
            dmpdVar15.a |= 2;
            dmpdVar15.c = a8;
            arrayList3.add((dmpd) dmpcVar8.bK());
            xlcVar.a(dmpeVar, arrayList3);
            dmpn h = xlcVar.h(dmpeVar, null);
            xlbVar = this;
            xlbVar.k = h;
        } else {
            xlbVar = this;
        }
        dmpn dmpnVar = xlbVar.k;
        dbsk.s(dmpnVar);
        return dmpnVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof xlb)) {
            return false;
        }
        xlb xlbVar = (xlb) obj;
        return this.b == xlbVar.b && b(xlbVar);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }
}
