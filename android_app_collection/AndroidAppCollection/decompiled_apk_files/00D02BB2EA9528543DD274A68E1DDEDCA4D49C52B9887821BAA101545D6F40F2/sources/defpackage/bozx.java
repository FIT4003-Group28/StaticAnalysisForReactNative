package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bozx  reason: default package */
/* loaded from: classes3.dex */
public final class bozx implements bozs {
    private static final AtomicInteger k = new AtomicInteger();
    private final Map<bozq, akte> a = new HashMap();
    private final Map<bozq, aktd> b = new HashMap();
    private final akoq c;
    private final akuh d;
    private final akuh e;
    private final ff f;
    private final akox g;
    private final Resources h;
    private final gll i;
    @dzsi
    private Long j;

    public bozx(dxio<akox> dxioVar, Resources resources, ff ffVar, gll gllVar) {
        akoq aj = dxioVar.a().aj();
        this.c = aj;
        this.g = dxioVar.a();
        this.f = ffVar;
        this.h = resources;
        this.i = gllVar;
        this.d = aj.aE().d(((BitmapDrawable) resources.getDrawable(2131233031)).getBitmap());
        this.e = aj.aE().d(((BitmapDrawable) resources.getDrawable(2131233032)).getBitmap());
    }

    private static String j(Long l) {
        String valueOf = String.valueOf(l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("hl_raprp_");
        sb.append(valueOf);
        return sb.toString();
    }

    private final akte k(bozq bozqVar, dmqc dmqcVar, int i) {
        akte c = this.c.aj().c(bozqVar.d().q(), this.c.aE().a(dmqcVar), 0, i, 2, 2, 3);
        this.c.aF().c().f(c);
        this.a.put(bozqVar, c);
        return c;
    }

    private static dmpk l(akra akraVar, akuh akuhVar) {
        dmpk g = akuhVar.g();
        dmlp bZ = dmlq.e.bZ();
        dmls a = akxh.a(akraVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a.getClass();
        dmlqVar.b = a;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.CENTER;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
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
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar3 = (dmpn) g.b;
        int i = dmpnVar3.a | 128;
        dmpnVar3.a = i;
        dmpnVar3.i = 0;
        dmpnVar3.a = i | 256;
        dmpnVar3.j = 248;
        int andIncrement = k.getAndIncrement();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar4 = (dmpn) g.b;
        int i2 = dmpnVar4.a | 64;
        dmpnVar4.a = i2;
        dmpnVar4.h = andIncrement;
        dmpnVar4.a = i2 | 32;
        dmpnVar4.g = 3;
        return g;
    }

    private static dmpc m(akuh akuhVar) {
        return akuhVar.e();
    }

    @Override // defpackage.bozs
    public final void a(bozq bozqVar, bozr bozrVar) {
        k(bozqVar, dmqc.LEGEND_STYLE_REPORT_A_PROBLEM_ROAD_SELECT_STATE, 1).Pt(new bozt(bozrVar));
    }

    @Override // defpackage.bozs
    public final void b(bozq bozqVar, bozr bozrVar) {
        akty aC = this.c.aC();
        akra e = akra.e(dcyn.a, dcyn.a);
        bozqVar.d().t(0.5f, e);
        dmpk l = l(e, this.e);
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(m(this.e));
        if (l.c) {
            l.bF();
            l.c = false;
        }
        dmpn dmpnVar = (dmpn) l.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmpn dmpnVar2 = dmpn.r;
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        if (l.c) {
            l.bF();
            l.c = false;
        }
        dmpn dmpnVar3 = (dmpn) l.b;
        dmpnVar3.a |= 16384;
        dmpnVar3.n = 0;
        aktd b = aC.b((dmpn) l.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        aC.f(b);
        b.Pt(new bozu(bozrVar));
        this.b.put(bozqVar, b);
    }

    @Override // defpackage.bozs
    public final void c(bozq... bozqVarArr) {
        for (int i = 0; i < 2; i++) {
            aktd remove = this.b.remove(bozqVarArr[i]);
            if (remove != null) {
                this.c.aC().g(remove);
                this.c.aC().e(remove);
            }
        }
    }

    @Override // defpackage.bozs
    public final void d(bozq bozqVar, bozr bozrVar) {
        k(bozqVar, dmqc.LEGEND_STYLE_REPORT_A_PROBLEM_ROAD_SELECTABLE_STATE, 0).Pt(new bozv(bozrVar));
        akty aC = this.c.aC();
        akra akraVar = new akra();
        bozqVar.d().t(0.5f, akraVar);
        dmpk l = l(akraVar, this.d);
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(m(this.d));
        if (l.c) {
            l.bF();
            l.c = false;
        }
        dmpn dmpnVar = (dmpn) l.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmpn dmpnVar2 = dmpn.r;
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        if (l.c) {
            l.bF();
            l.c = false;
        }
        dmpn dmpnVar3 = (dmpn) l.b;
        dmpnVar3.a |= 16384;
        dmpnVar3.n = 1;
        aktd b = aC.b((dmpn) l.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        aC.f(b);
        b.Pt(new bozw(bozrVar));
        this.b.put(bozqVar, b);
    }

    @Override // defpackage.bozs
    public final void e() {
        for (akte akteVar : this.a.values()) {
            this.c.aB().h(akteVar);
            this.c.aB().a(akteVar);
        }
        this.a.clear();
        for (aktd aktdVar : this.b.values()) {
            this.c.aC().g(aktdVar);
            this.c.aC().e(aktdVar);
        }
        this.b.clear();
    }

    @Override // defpackage.bozs
    public final void f(bozq bozqVar) {
        akte remove = this.a.remove(bozqVar);
        if (remove != null) {
            this.c.aB().h(remove);
            this.c.aB().a(remove);
        }
        aktd remove2 = this.b.remove(bozqVar);
        if (remove2 != null) {
            this.c.aC().g(remove2);
            this.c.aC().e(remove2);
        }
    }

    @Override // defpackage.bozs
    public final void g(Long l, akqs akqsVar, boolean z) {
        if (this.j != null) {
            h();
        }
        this.j = l;
        akqi akqiVar = new akqi(l.longValue());
        akox akoxVar = this.g;
        Resources resources = this.f.getResources();
        akrw e = akrw.e(akqiVar);
        alyk q = alyl.q();
        ((alvg) q).b = akqiVar;
        this.c.L(j(l), akoxVar.M(resources, e, q.b()), false);
        i(akqsVar, z);
    }

    @Override // defpackage.bozs
    public final void h() {
        Long l = this.j;
        if (l != null) {
            this.g.Q(j(l));
            this.j = null;
        }
    }

    @Override // defpackage.bozs
    public final void i(akqs akqsVar, boolean z) {
        akyc o = akyt.o(akqsVar, bpup.b(this.i.b(), this.h.getDimensionPixelSize(R.dimen.min_viewport_bounds_for_map_pins)));
        if (!z) {
            o.b = 0;
        }
        this.g.p(o);
    }
}
