package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: anpa  reason: default package */
/* loaded from: classes2.dex */
public class anpa extends anrr {
    public final angp a;
    private final anqx o;
    private final dpop p;

    public anpa(dvay dvayVar, dpop dpopVar, aoge aogeVar, boolean z, gga ggaVar, cqat cqatVar, angp angpVar, anhg anhgVar, bbut bbutVar, anqx anqxVar, anru anruVar, aoiw aoiwVar, aogw aogwVar, aokw aokwVar, aojq aojqVar) {
        super(dvayVar, aogeVar, z, ggaVar, cqatVar, anhgVar, bbutVar, anruVar, aoiwVar, aogwVar, aokwVar, aojqVar);
        dbsk.a(dvayVar.b == 9);
        this.p = dpopVar;
        this.a = angpVar;
        this.o = anqxVar;
    }

    private final jic W() {
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        dqjl p = p();
        aofn aofnVar = this.i.d;
        cqss a = irg.a();
        return new jic((String) null, ckqcVar, iup.g(cqrt.h(anpd.a(p), a), 0.5f, iva.b(aofnVar.b(p), cqrt.c(R.color.qu_grey_white_1000))), 250);
    }

    @Override // defpackage.anrr
    public final void a() {
        dvay dvayVar = this.g;
        dwyn dwynVar = dvayVar.f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        eaol a = aogc.a(dwynVar);
        dwyn dwynVar2 = this.g.g;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        this.c.D(aodr.g(aoeb.c(aogy.c(u(), U())), I(), new anoz(dvayVar, a, aogc.a(dwynVar2), o())));
    }

    @Override // defpackage.anrr
    public final boolean c() {
        return false;
    }

    @Override // defpackage.anrr
    public final boolean d() {
        return false;
    }

    @Override // defpackage.anrr
    public final boolean e() {
        dvak dvakVar;
        dvay dvayVar = this.g;
        if (dvayVar.b == 9) {
            dvakVar = (dvak) dvayVar.c;
        } else {
            dvakVar = dvak.e;
        }
        int a = dqkj.a(dvakVar.d);
        return a != 0 && a == 4;
    }

    @Override // defpackage.anrr
    public final String f() {
        return this.i.d.c(p());
    }

    @Override // defpackage.anrr
    public final String g() {
        return "";
    }

    @Override // defpackage.anrr
    public final cqsn h() {
        return cqrt.l(true != H() ? R.string.MAPS_ACTIVITY_YOU_WERE : R.string.MAPS_ACTIVITY_YOU_ARE);
    }

    @Override // defpackage.anrr
    public final cqsn i() {
        return cqrt.l(R.string.MAPS_ACTIVITY_MISSING_ACTIVITY);
    }

    @Override // defpackage.anrr
    public final cqsn j() {
        if (e()) {
            return cqrt.l(R.string.MAPS_ACTIVITY_ADD_ACTIVITY);
        }
        return cqrt.l(true != H() ? R.string.MAPS_ACTIVITY_WERE_YOU : R.string.MAPS_ACTIVITY_ARE_YOU);
    }

    @Override // defpackage.anrr
    protected final jic k() {
        return W();
    }

    @Override // defpackage.anrr
    protected final jic l() {
        return W();
    }

    @Override // defpackage.anrr
    protected final aogm m() {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        aogu e = this.i.e();
        aogh i = aogm.i();
        i.g(true);
        i.i(Float.valueOf(14.0f));
        ((aofq) i).d = this.o.a(e, dbsg.i(this.g), this.i.d);
        i.f(this.i.f());
        dbsg<aogt> b = e.b(this.h);
        if (b.a()) {
            i.b(b.b().a());
        } else {
            aoge aogeVar = this.i;
            aoha aohaVar = this.h;
            dcdc<dvay> b2 = aogeVar.b();
            dbsg<Integer> i2 = aogeVar.i(aohaVar);
            if (i2.a() && i2.b().intValue() > 0) {
                dvap dvapVar = b2.get(i2.b().intValue() - 1).e;
                if (dvapVar == null) {
                    dvapVar = dvap.d;
                }
                dbsgVar = dbsg.i(aoha.d(dvapVar));
            } else {
                dbsgVar = dbpy.a;
            }
            aoge aogeVar2 = this.i;
            aoha aohaVar2 = this.h;
            dcdc<dvay> b3 = aogeVar2.b();
            dbsg<Integer> i3 = aogeVar2.i(aohaVar2);
            if (i3.a() && i3.b().intValue() + 1 < b3.size()) {
                dvap dvapVar2 = b3.get(i3.b().intValue() + 1).e;
                if (dvapVar2 == null) {
                    dvapVar2 = dvap.d;
                }
                dbsgVar2 = dbsg.i(aoha.d(dvapVar2));
            } else {
                dbsgVar2 = dbpy.a;
            }
            ArrayList arrayList = new ArrayList();
            if (dbsgVar.a() && e.b((aoha) dbsgVar.b()).a()) {
                arrayList.add(e.b((aoha) dbsgVar.b()).b().e());
            }
            if (dbsgVar2.a() && e.b((aoha) dbsgVar2.b()).a()) {
                arrayList.add(e.b((aoha) dbsgVar2.b()).b().d());
            }
            i.b(dcdc.r(arrayList));
        }
        return i.a();
    }

    @Override // defpackage.anrr
    protected final anro n() {
        return anro.e(iva.b(this.i.d.b(p()), ibl.t()), cqrt.c(R.color.qu_white_alpha_87), cqrt.c(R.color.qu_white_alpha_54), cqrt.c(R.color.qu_white_alpha_54));
    }

    public final dnsf o() {
        dnse bZ = dnsf.c.bZ();
        int i = e() ? 4 : 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnsf dnsfVar = (dnsf) bZ.b;
        dnsfVar.b = Integer.valueOf(i - 1);
        dnsfVar.a = 2;
        return bZ.bK();
    }

    final dqjl p() {
        dvak dvakVar;
        if (!e()) {
            dvay dvayVar = this.g;
            if (dvayVar.b == 9) {
                dvakVar = (dvak) dvayVar.c;
            } else {
                dvakVar = dvak.e;
            }
            dqjl b = dqjl.b(dvakVar.b);
            return b == null ? dqjl.UNKNOWN_ACTIVITY_TYPE : b;
        }
        return dqjl.UNKNOWN_ACTIVITY_TYPE;
    }

    @Override // defpackage.anrr
    protected final anrp q() {
        int V = V();
        int i = V - 1;
        if (V != 0) {
            if (i == 0 || i == 1 || i == 2) {
                return anrp.a(R.string.MAPS_ACTIVITY_START_AND_END_TIME, O(), P());
            }
            if (i == 3) {
                return anrp.a(R.string.MAPS_ACTIVITY_ALL_DAY, new Object[0]);
            }
            if (i == 4) {
                return anrp.a(R.string.MAPS_ACTIVITY_START_AND_END_TIME, O(), this.c.getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW));
            }
            if (i == 5) {
                return anrp.a(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW, new Object[0]);
            }
            String a = anrq.a(V());
            StringBuilder sb = new StringBuilder(a.length() + 17);
            sb.append("unsupported type ");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }

    public final void r(dbsg<dvay> dbsgVar, dbsg<gfw> dbsgVar2) {
        this.d.k(dbsgVar, this.i.g(), dbsg.i(anho.c(this.p, T())), dbsg.i(this.g.s), dbsgVar2);
    }

    @Override // defpackage.anrr
    public final boolean s() {
        return false;
    }

    @Override // defpackage.anrr
    @dzsi
    public final aofb t() {
        return null;
    }
}
