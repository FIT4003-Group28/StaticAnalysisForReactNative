package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dsf  reason: default package */
/* loaded from: classes6.dex */
public final class dsf implements dms, aa, dfeq {
    public static final dbsl<dmpn> a;
    public static final dcep<dye> b;
    private static final dcdn<dmq, dsm> n;
    public final dsd c;
    public final dyq d;
    public final Map<dmr, dsj> e;
    public final Resources f;
    public final akty g;
    public final akvz h;
    public final boolean i;
    public final Map<dmr, dse> j;
    public final btrm k;
    public dye l;
    public String m;
    private final dsk o;
    private final Executor p;
    private final czz q;
    private final ViewGroup r;
    private final dxio<akxn> s;
    private final akpn t;
    private final SparseArray<Bitmap> u;
    private final bvsl v;
    private final int w;
    private final int x;
    private float y;
    @dzsi
    private dmr z;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dmq.PRIMARY_PIN, dsm.PRIMARY_PIN);
        dcdgVar.f(dmq.VENUE_LEVEL_CHANGE, dsm.LEVEL_CHANGE);
        dcdgVar.f(dmq.ANNOTATION, dsm.SECONDARY_PIN);
        dcdgVar.f(dmq.ICONIC_LANDMARK, dsm.SECONDARY_PIN);
        dcdgVar.f(dmq.ORIENTATION_CUE, dsm.SECONDARY_PIN);
        dcdgVar.f(dmq.PERSONAL_PLACE, dsm.SECONDARY_PIN);
        n = dcdgVar.b();
        a = dsb.a;
        b = dcep.C(dye.UP, dye.DOWN);
    }

    public dsf(dsk dskVar, Executor executor, dyq dyqVar, akpn akpnVar, Activity activity, akox akoxVar, btvo btvoVar, btrm btrmVar, bvsl bvslVar, czz czzVar, ViewGroup viewGroup) {
        akty aC = akoxVar.aj().aC();
        akvz aE = akoxVar.aj().aE();
        dsd dsdVar = new dsd(this);
        this.c = dsdVar;
        this.e = new HashMap();
        this.u = new SparseArray<>();
        this.l = dye.NONE;
        this.m = "";
        this.y = 0.0f;
        this.o = dskVar;
        this.r = viewGroup;
        this.p = executor;
        this.d = dyqVar;
        this.q = czzVar;
        this.t = akpnVar;
        this.k = btrmVar;
        this.v = bvslVar;
        Resources resources = activity.getResources();
        this.f = resources;
        this.h = aE;
        this.g = aC;
        this.s = new dxio(this) { // from class: dsa
            private final dsf a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return new akxn(this.a.h);
            }
        };
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        dkgv dkgvVar = (dknvVar == null ? dknv.v : dknvVar).q;
        this.i = (dkgvVar == null ? dkgv.d : dkgvVar).b;
        this.j = new HashMap();
        this.w = resources.getDimensionPixelSize(R.dimen.map_offscreen_indicator_vertical_bounds_inset_level_transition);
        this.x = resources.getDimensionPixelSize(R.dimen.map_offscreen_indicator_vertical_bounds_top_inset_primary);
        dceq a2 = dcet.a();
        a2.b(amqo.class, new dsh(amqo.class, dsdVar, bvrj.UI_THREAD));
        btrmVar.g(dsdVar, a2.a());
    }

    private final void g(dmr dmrVar) {
        dse remove = this.j.remove(dmrVar);
        if (remove != null) {
            remove.d.g(remove.c);
            remove.d.e(remove.c);
        }
    }

    @Override // defpackage.dms
    public final void a(dmv dmvVar) {
        bvrj.UI_THREAD.c();
        if (!dmvVar.g().a()) {
            return;
        }
        dmr a2 = dmvVar.a();
        dsm dsmVar = n.get(a2.a());
        dbsk.s(dsmVar);
        ilo b2 = dmvVar.c().a() ? dmvVar.c().b() : null;
        dye dyeVar = dye.NONE;
        int ordinal = dsmVar.ordinal();
        if (ordinal == 0) {
            this.z = a2;
            ilo b3 = dmvVar.c().b();
            dsza b4 = dmvVar.g().b();
            dhjy bZ = dhjz.e.bZ();
            double d = b4.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            int i = 2 | dhjzVar.a;
            dhjzVar.a = i;
            dhjzVar.c = d;
            double d2 = b4.c;
            dhjzVar.a = i | 1;
            dhjzVar.b = d2;
            d(new dsu(akqq.j(bZ.bK()), akps.NORMAL, b3.ai().c, true, dsm.PRIMARY_PIN, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e(), b3.q()), dmvVar);
            e(dmvVar);
        } else if (ordinal == 1) {
            dsza b5 = dmvVar.g().b();
            dfmf b6 = dfmf.b(dmvVar.e().b().b);
            if (b6 == null) {
                b6 = dfmf.TYPE_UNSPECIFIED;
            }
            deha.q(this.d.a(b6), new dsc(this, b5, b6, dmvVar), this.p);
        } else if (ordinal != 2 || b2 == null) {
        } else {
            akqq aj = b2.aj();
            dbsk.s(aj);
            akps akpsVar = akps.NAMED_STYLE;
            long j = b2.ai().c;
            dsm dsmVar2 = dsm.SECONDARY_PIN;
            dpxe dpxeVar = b2.cz().d;
            if (dpxeVar == null) {
                dpxeVar = dpxe.g;
            }
            Integer valueOf = Integer.valueOf(dpxeVar.d);
            dpxe dpxeVar2 = b2.cz().d;
            if (dpxeVar2 == null) {
                dpxeVar2 = dpxe.g;
            }
            Integer valueOf2 = Integer.valueOf(dpxeVar2.c);
            dpxe dpxeVar3 = b2.cz().d;
            if (dpxeVar3 == null) {
                dpxeVar3 = dpxe.g;
            }
            d(new dsu(aj, akpsVar, j, true, dsmVar2, null, valueOf, valueOf2, Integer.valueOf(dpxeVar3.f), dcdc.e(), b2.q()), dmvVar);
        }
    }

    @Override // defpackage.dms
    public final void b(dmr dmrVar) {
        bvrj.UI_THREAD.c();
        g(dmrVar);
        dsj remove = this.e.remove(dmrVar);
        if (remove == null || remove.h) {
            return;
        }
        remove.h = true;
        remove.b.a();
        synchronized (remove.e) {
            if (remove.f != null) {
                remove.c.a(remove);
                dbsk.s(remove.g);
                remove.a.ac(remove.g);
            }
        }
    }

    @Override // defpackage.dms
    public final void c() {
        bvrj.UI_THREAD.c();
        for (dmr dmrVar : new HashSet(this.j.keySet())) {
            b(dmrVar);
        }
        this.j.clear();
        this.e.clear();
    }

    public final void d(dsn dsnVar, dmv dmvVar) {
        int a2;
        akxi a3;
        akxi b2;
        GmmLocation gmmLocation;
        akxi c;
        dmqc dmqcVar;
        dmr a4 = dmvVar.a();
        dsu dsuVar = (dsu) dsnVar;
        if (dsuVar.b == akps.NORMAL && dsuVar.e == dsm.PRIMARY_PIN) {
            dye dyeVar = dye.NONE;
            int ordinal = this.l.ordinal();
            if (ordinal == 1) {
                dmqcVar = dmqc.LEGEND_STYLE_AR_MAP_SPOTLIGHT_PIN_UP;
            } else if (ordinal == 2) {
                dmqcVar = dmqc.LEGEND_STYLE_AR_MAP_SPOTLIGHT_PIN_DOWN;
            } else {
                dmqcVar = dmqc.LEGEND_STYLE_SPOTLIGHT_PIN;
            }
            a3 = this.s.a().c(dmqcVar);
        } else if (dsuVar.e != dsm.SECONDARY_PIN) {
            akps akpsVar = dsuVar.b;
            Bitmap bitmap = dsuVar.f;
            if ((akpsVar != akps.CUSTOM_ICON || bitmap == null) && (bitmap = this.u.get((a2 = this.t.a(akpsVar, Integer.MIN_VALUE)))) == null) {
                bitmap = BitmapFactory.decodeResource(this.f, a2);
                this.u.put(a2, bitmap);
            }
            a3 = this.s.a().a(bitmap);
        } else {
            a3 = this.s.a().d(dsuVar.h.intValue());
        }
        if (dsuVar.b == akps.NAMED_STYLE) {
            b2 = this.s.a().d(dsuVar.i.intValue());
        } else {
            b2 = this.s.a().b(dsuVar.d ? dmlo.TOP : dmlo.CENTER);
        }
        akra f = akra.f(dsuVar.a);
        if (this.j.containsKey(a4)) {
            return;
        }
        dmpk g = b2.a().g();
        dmlp bZ = dmlq.e.bZ();
        dmls a5 = akxh.a(f);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a5.getClass();
        dmlqVar.b = a5;
        dmlqVar.a |= 1;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar = (dmpn) g.b;
        dmlq bK = bZ.bK();
        dmpn dmpnVar2 = dmpn.r;
        bK.getClass();
        dmpnVar.d = bK;
        dmpnVar.a |= 4;
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(a3.a().e());
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar3 = (dmpn) g.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar3.b = dmphVar;
        dmpnVar3.a |= 1;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar4 = (dmpn) g.b;
        int i = dmpnVar4.a | 64;
        dmpnVar4.a = i;
        dmpnVar4.h = Integer.MAX_VALUE;
        dmpnVar4.a = i | 32;
        dmpnVar4.g = 1;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        akvb bZ3 = akvc.c.bZ();
        boolean z = dsuVar.e == dsm.PRIMARY_PIN;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        akvc akvcVar = (akvc) bZ3.b;
        akvcVar.a |= 1;
        akvcVar.b = z;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus akusVar = (akus) bZ2.b;
        akvc bK2 = bZ3.bK();
        bK2.getClass();
        akusVar.c = bK2;
        akusVar.b = 2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.c((akus) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.b((akus) bZ2.b);
        g.k(dsqvVar, bZ2.bK());
        int c2 = bntn.AR_MAPS_LABELS.c();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar5 = (dmpn) g.b;
        dmpnVar5.a |= 8192;
        dmpnVar5.m = c2;
        int ordinal2 = dsuVar.e.ordinal();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar6 = (dmpn) g.b;
        dmpnVar6.a |= 16384;
        dmpnVar6.n = ordinal2;
        String str = dsuVar.j;
        dsm dsmVar = n.get(a4.a());
        dbsk.s(dsmVar);
        dye dyeVar2 = dye.NONE;
        akuh a6 = this.h.a(dmqc.LEGEND_STYLE_PROMOTED_PLACES_TEXT_SUBTITLE);
        String str2 = "";
        if (dsmVar != dsm.PRIMARY_PIN) {
            if (dsmVar == dsm.LEVEL_CHANGE && (gmmLocation = this.c.a) != null) {
                float F = gmmLocation.F(dsuVar.a);
                if (F > 20.0f) {
                    str2 = this.v.c((int) F, null, false, true);
                }
                a6 = this.h.a(dmqc.LEGEND_STYLE_PROMOTED_PLACES_TEXT_SUBTITLE);
            }
        } else {
            if (this.l == dye.NONE) {
                float f2 = this.y;
                if (f2 > 20.0f) {
                    str2 = this.v.c((int) f2, null, false, true);
                }
            } else if (this.z != null) {
                str2 = this.m;
                dyeVar2 = this.l;
            }
            a6 = this.h.a(dmqc.LEGEND_STYLE_SPOTLIGHT_PIN_TEXT_SUBTITLE);
        }
        if (dsuVar.b == akps.NORMAL && dsuVar.e == dsm.PRIMARY_PIN) {
            c = this.s.a().c(dmqc.LEGEND_STYLE_SPOTLIGHT_PIN_TEXT_TITLE);
        } else if (dsuVar.e == dsm.SECONDARY_PIN) {
            c = this.s.a().d(dsuVar.g.intValue());
        } else {
            c = this.s.a().c(dmqc.LEGEND_STYLE_PROMOTED_PLACES_TEXT_TITLE);
        }
        akuh akuhVar = ((akxj) c).a;
        dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
        dmpc e = a6.e();
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        int i2 = dmpdVar.a | 16;
        dmpdVar.a = i2;
        dmpdVar.f = true;
        dmpdVar.a = i2 | 1;
        dmpdVar.b = "\n";
        dmpd dmpdVar3 = (dmpd) e.bK();
        if (dyeVar2 == dye.DOWN) {
            dmpeVar2.c(dmpdVar3);
            dmpeVar2.c(dmpdVar3);
            dmpeVar2.c(dmpdVar3);
        }
        akxg.b(dfyn.a(str, 20, 1, 50), akuhVar, dmpeVar2);
        if (!dbsj.d(str2)) {
            dmpc e2 = a6.e();
            if (e2.c) {
                e2.bF();
                e2.c = false;
            }
            dmpd dmpdVar4 = (dmpd) e2.b;
            int i3 = dmpdVar4.a | 16;
            dmpdVar4.a = i3;
            dmpdVar4.f = true;
            str2.getClass();
            dmpdVar4.a = i3 | 1;
            dmpdVar4.b = str2;
            dmpeVar2.b(e2);
        }
        if (dyeVar2 == dye.UP) {
            dmpeVar2.c(dmpdVar3);
            dmpeVar2.c(dmpdVar3);
            dmpeVar2.c(dmpdVar3);
        }
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar7 = (dmpn) g.b;
        dmph dmphVar2 = (dmph) dmpeVar2.bK();
        dmphVar2.getClass();
        dmpnVar7.c = dmphVar2;
        dmpnVar7.a |= 2;
        akxf.M(g);
        if (dsuVar.c != 0) {
            dsqv<dmpn, dmol> dsqvVar2 = dmnl.L;
            dmoi bZ4 = dmol.n.bZ();
            long j = dsuVar.c;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dmol dmolVar = (dmol) bZ4.b;
            dmolVar.a |= 16;
            dmolVar.f = j;
            g.k(dsqvVar2, bZ4.bK());
            dsqv<dmpn, dnbc> dsqvVar3 = dmnl.F;
            dnbb bZ5 = dnbc.c.bZ();
            dnox bZ6 = dnpo.t.bZ();
            bZ6.b(dnow.SPOTLIT_PIN);
            dnpo bK3 = bZ6.bK();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnbc dnbcVar = (dnbc) bZ5.b;
            bK3.getClass();
            dnbcVar.b = bK3;
            dnbcVar.a |= 1;
            g.k(dsqvVar3, bZ5.bK());
        }
        akti c3 = this.g.c((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        this.g.f(c3);
        synchronized (this) {
            this.j.put(a4, new dse(dsnVar, dmvVar, c3, this.g));
        }
    }

    public final void e(dmv dmvVar) {
        if (!this.e.containsKey(dmvVar.a())) {
            if (dmvVar.a().a() != dmq.PRIMARY_PIN && dmvVar.a().a() != dmq.VENUE_LEVEL_CHANGE) {
                return;
            }
            dsk dskVar = this.o;
            ViewGroup a2 = this.q.a();
            ViewGroup viewGroup = this.r;
            dbpy<Object> dbpyVar = dbpy.a;
            dsk.a((Activity) ((dxjd) dskVar.a).a, 1);
            cqat a3 = dskVar.b.a();
            dsk.a(a3, 2);
            akox a4 = dskVar.c.a();
            dsk.a(a4, 3);
            dgc a5 = dskVar.d.a();
            dsk.a(a5, 4);
            btrm a6 = dskVar.e.a();
            dsk.a(a6, 5);
            araj a7 = dskVar.f.a();
            dsk.a(a7, 6);
            dsk.a(a2, 7);
            dsk.a(viewGroup, 8);
            dsk.a(dbpyVar, 9);
            dsk.a(dmvVar, 10);
            final dsj dsjVar = new dsj(a3, a4, a5, a6, a7, a2, viewGroup, dbpyVar, dmvVar);
            this.e.put(dmvVar.a(), dsjVar);
            dsza b2 = dmvVar.g().b();
            dhjy bZ = dhjz.e.bZ();
            double d = b2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            int i = dhjzVar.a | 2;
            dhjzVar.a = i;
            dhjzVar.c = d;
            double d2 = b2.c;
            dhjzVar.a = i | 1;
            dhjzVar.b = d2;
            akqq j = akqq.j(bZ.bK());
            if (dsjVar.h) {
                return;
            }
            synchronized (dsjVar.e) {
                if (dsjVar.f == null) {
                    btrm btrmVar = dsjVar.c;
                    dceq a8 = dcet.a();
                    a8.b(alhl.class, new dsl(0, alhl.class, dsjVar, bvrj.UI_THREAD));
                    a8.b(ahld.class, new dsl(1, ahld.class, dsjVar, bvrj.UI_THREAD));
                    btrmVar.g(dsjVar, a8.a());
                    if (dsjVar.g == null) {
                        dsjVar.g = new akzy(dsjVar) { // from class: dsi
                            private final dsj a;

                            {
                                this.a = dsjVar;
                            }

                            @Override // defpackage.akzy
                            public final void a(alad aladVar) {
                                this.a.c();
                            }
                        };
                    }
                    dsjVar.a.ab(dsjVar.g);
                }
                dsjVar.f = j;
            }
        }
    }

    public final void f(@dzsi dmr dmrVar) {
        dse dseVar;
        if (dmrVar == null || (dseVar = this.j.get(dmrVar)) == null) {
            return;
        }
        dsn dsnVar = dseVar.a;
        dmv dmvVar = dseVar.b;
        g(dmrVar);
        d(dsnVar, dmvVar);
        if (!this.e.containsKey(dmvVar.a()) || ((dsu) dsnVar).e != dsm.PRIMARY_PIN) {
            return;
        }
        dsj dsjVar = this.e.get(dmvVar.a());
        dye dyeVar = dye.NONE;
        int ordinal = this.l.ordinal();
        if (ordinal == 1) {
            dbsk.s(dsjVar);
            dsjVar.a(this.w, 0);
        } else if (ordinal == 2) {
            dbsk.s(dsjVar);
            dsjVar.a(this.x, this.w);
        } else {
            dbsk.s(dsjVar);
            dsjVar.a(this.x, 0);
        }
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(@dzsi Object obj) {
        dyf dyfVar = (dyf) obj;
        if (dyfVar != null) {
            this.m = dbsj.e(dyfVar.b().g());
            dye c = dyfVar.c();
            dbsk.s(c);
            this.l = c;
            f(this.z);
        }
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi Object obj) {
        dfhp dfhpVar = (dfhp) obj;
        dmr dmrVar = this.z;
        if (dmrVar == null || dfhpVar == null) {
            return;
        }
        this.y = dfhpVar.a;
        f(dmrVar);
    }
}
