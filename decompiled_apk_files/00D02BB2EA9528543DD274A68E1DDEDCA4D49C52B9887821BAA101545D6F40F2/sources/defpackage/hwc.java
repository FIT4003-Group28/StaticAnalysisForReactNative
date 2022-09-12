package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hwc  reason: default package */
/* loaded from: classes.dex */
public final class hwc implements hwe {
    private static final EnumMap<akps, Float> d;
    public final dxio<akty> a;
    public final dxio<akvz> b;
    public final btrm c;
    private final Resources e;
    private final akpn f;
    private final SparseArray<Bitmap> i = new SparseArray<>();
    private final akra j = akra.e(dcyn.a, dcyn.a);
    private List<hwb> k = dcdc.e();
    private final dcka<akpp, hwb> h = dccg.O();
    private final dxio<akxn> g = new dxio(this) { // from class: hvx
        private final hwc a;

        {
            this.a = this;
        }

        @Override // defpackage.dxio
        public final Object a() {
            return new akxn(this.a.b.a());
        }
    };

    static {
        EnumMap<akps, Float> enumMap = new EnumMap<>(akps.class);
        d = enumMap;
        enumMap.put((EnumMap<akps, Float>) akps.SANTA, (akps) Float.valueOf(6.0f));
        akps akpsVar = akps.NORTH_POLE;
        Float valueOf = Float.valueOf(9.0f);
        enumMap.put((EnumMap<akps, Float>) akpsVar, (akps) valueOf);
        enumMap.put((EnumMap<akps, Float>) akps.NORTH_POLE_SANTA, (akps) valueOf);
    }

    public hwc(Resources resources, akpn akpnVar, btrm btrmVar, dxio<akty> dxioVar, dxio<akvz> dxioVar2) {
        this.e = resources;
        this.f = akpnVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = btrmVar;
    }

    private final synchronized dcdc<hwb> l(Iterable<akpp> iterable, Iterable<hwb> iterable2, boolean z, boolean z2, boolean z3) {
        dccx dccxVar;
        dcep K;
        Iterator<akpp> it;
        akxi a;
        akxi b;
        dcep dcepVar;
        Iterator<akpp> it2;
        hwb hwbVar;
        dccxVar = new dccx();
        K = dcep.K(this.h.J());
        if (z2) {
            h();
        } else {
            g(iterable2);
        }
        it = iterable.iterator();
        while (it.hasNext()) {
            akpp next = it.next();
            boolean z4 = z && !K.contains(next);
            if (next.b() != akps.NORMAL || next.d() != Integer.MIN_VALUE) {
                if (next.b() == akps.NAMED_STYLE) {
                    a = this.g.a().d(next.g().intValue());
                } else {
                    a = this.g.a().a(m(next));
                }
            } else {
                a = this.g.a().c(dmqc.LEGEND_STYLE_SPOTLIGHT_PIN);
            }
            if (next.b() == akps.NAMED_STYLE) {
                b = this.g.a().d(next.h().intValue());
            } else {
                b = this.g.a().b(next.e() ? dmlo.TOP : dmlo.CENTER);
            }
            akty a2 = this.a.a();
            akra f = akra.f(next.a());
            dmpk g = b.a().g();
            dmlp bZ = dmlq.e.bZ();
            dmls a3 = akxh.a(f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ.b;
            a3.getClass();
            dmlqVar.b = a3;
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
            dmpeVar.b(a.a().e());
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
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            akvc akvcVar = (akvc) bZ3.b;
            akvcVar.a |= 1;
            akvcVar.b = z3;
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
            akus.b((akus) bZ2.b);
            g.k(dsqvVar, bZ2.bK());
            int j = next.j();
            int i2 = j - 1;
            if (j == 0) {
                throw null;
            }
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmpn dmpnVar5 = (dmpn) g.b;
            dmpnVar5.a |= 8192;
            dmpnVar5.m = i2;
            if (!next.i().isEmpty()) {
                dmjn bZ4 = dmjo.b.bZ();
                dcdc<altv> i3 = next.i();
                int size = i3.size();
                int i4 = 0;
                while (i4 < size) {
                    dcep dcepVar2 = K;
                    altv altvVar = i3.get(i4);
                    Iterator<akpp> it3 = it;
                    dmjl bZ5 = dmjm.d.bZ();
                    String o = altvVar.a.o();
                    dcdc<altv> dcdcVar = i3;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dmjm dmjmVar = (dmjm) bZ5.b;
                    o.getClass();
                    int i5 = size;
                    int i6 = dmjmVar.a | 1;
                    dmjmVar.a = i6;
                    dmjmVar.b = o;
                    int i7 = altvVar.b;
                    dmjmVar.a = i6 | 2;
                    dmjmVar.c = i7;
                    dmjm bK3 = bZ5.bK();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dmjo dmjoVar = (dmjo) bZ4.b;
                    bK3.getClass();
                    dsrj<dmjm> dsrjVar = dmjoVar.a;
                    if (!dsrjVar.a()) {
                        dmjoVar.a = dsqw.cl(dsrjVar);
                    }
                    dmjoVar.a.add(bK3);
                    i4++;
                    it = it3;
                    i3 = dcdcVar;
                    K = dcepVar2;
                    size = i5;
                }
                dcepVar = K;
                it2 = it;
                g.k(dmnl.M, bZ4.bK());
            } else {
                dcepVar = K;
                it2 = it;
            }
            if (next.c() != 0) {
                dsqv<dmpn, dmol> dsqvVar2 = dmnl.L;
                dmoi bZ6 = dmol.n.bZ();
                long c = next.c();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dmol dmolVar = (dmol) bZ6.b;
                dmolVar.a |= 16;
                dmolVar.f = c;
                g.k(dsqvVar2, bZ6.bK());
                dsqv<dmpn, dnbc> dsqvVar3 = dmnl.F;
                dnbb bZ7 = dnbc.c.bZ();
                dnox bZ8 = dnpo.t.bZ();
                bZ8.b(dnow.SPOTLIT_PIN);
                dnpo bK4 = bZ8.bK();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dnbc dnbcVar = (dnbc) bZ7.b;
                bK4.getClass();
                dnbcVar.b = bK4;
                dnbcVar.a |= 1;
                g.k(dsqvVar3, bZ7.bK());
            }
            akti c2 = a2.c((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
            c2.Pt(new hvy(this, f, next));
            a2.f(c2);
            if (z4) {
                c2.c(new hvz());
            }
            hwbVar = new hwb(this, c2, a, b);
            synchronized (this) {
                this.h.n(next, hwbVar);
            }
        }
        return dccxVar.f();
        dccxVar.g(hwbVar);
        it = it2;
        K = dcepVar;
    }

    private final Bitmap m(akpp akppVar) {
        akps b = akppVar.b();
        Bitmap f = akppVar.f();
        if (b != akps.CUSTOM_ICON || f == null) {
            int a = this.f.a(b, akppVar.d());
            Bitmap bitmap = this.i.get(a);
            if (bitmap != null) {
                return bitmap;
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(this.e, a);
            this.i.put(a, decodeResource);
            return decodeResource;
        }
        return f;
    }

    @Override // defpackage.hwe
    public final void a(@dzsi akqi akqiVar, akra akraVar) {
        b(akpp.n(akraVar.S(), akqiVar == null ? 0L : akqiVar.c));
    }

    @Override // defpackage.hwe
    public final void b(akpp akppVar) {
        aktx q;
        amyn.b.a();
        akra f = akra.f(akppVar.a());
        akty a = this.a.a();
        if (akqi.e(akppVar.c())) {
            q = a.p(akppVar.c(), f.k(), f.o());
        } else {
            q = a.q(f);
        }
        a.o(q);
        if (!f.equals(this.j)) {
            this.j.aa(f);
            this.k = l(dcdc.f(akppVar), this.k, true, false, true);
        }
    }

    @Override // defpackage.hwe
    public final void c() {
        amyn.b.a();
        g(this.k);
        this.k = dcdc.e();
        this.j.t(0, 0);
        this.a.a().o(null);
    }

    @Override // defpackage.hwe
    public final synchronized dcdc<hwb> d(Iterable<akpp> iterable, boolean z) {
        return l(iterable, dcdc.e(), z, true, false);
    }

    @Override // defpackage.hwe
    public final synchronized dcdc<hwb> e(Iterable<akpp> iterable, Iterable<hwb> iterable2, boolean z) {
        return l(iterable, iterable2, z, false, false);
    }

    @Override // defpackage.hwe
    @dzsi
    public final synchronized akqq f() {
        if (this.h.D()) {
            return null;
        }
        return ((akpp) Collections.min(this.h.J(), new hwa())).a();
    }

    @Override // defpackage.hwe
    public final synchronized void g(Iterable<hwb> iterable) {
        for (hwb hwbVar : iterable) {
            j(hwbVar);
        }
    }

    @Override // defpackage.hwe
    public final synchronized void h() {
        for (Map.Entry entry : ((dbys) this.h).I()) {
            ((hwb) entry.getValue()).a();
        }
        this.h.p();
    }

    @Override // defpackage.hwe
    @dzsi
    public final hwb i(akpp akppVar, boolean z) {
        dcdc<hwb> d2 = d(dcdc.f(akppVar), z);
        if (d2.isEmpty()) {
            return null;
        }
        return d2.get(0);
    }

    @Override // defpackage.hwe
    public final synchronized void j(hwb hwbVar) {
        Map.Entry entry;
        Iterator it = ((dbys) this.h).I().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
            if (entry.getValue() == hwbVar) {
                break;
            }
        }
        if (entry != null) {
            ((hwb) entry.getValue()).a();
            this.h.G(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.hwe
    public final synchronized void k(@dzsi akpp akppVar, Rect rect) {
        if (akppVar == null) {
            if (!this.h.D()) {
                akppVar = this.h.J().iterator().next();
            } else {
                akppVar = akpp.d;
            }
        }
        if (akppVar.b() == akps.NAMED_STYLE) {
            akppVar = akpp.d;
        }
        Bitmap m = m(akppVar);
        int width = m.getWidth();
        int i = (-width) / 2;
        rect.set(i, -m.getHeight(), width + i, 0);
    }
}
