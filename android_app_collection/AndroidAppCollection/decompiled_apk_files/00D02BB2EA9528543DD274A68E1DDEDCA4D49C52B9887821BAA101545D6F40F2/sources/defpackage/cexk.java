package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cexk  reason: default package */
/* loaded from: classes4.dex */
public class cexk implements cete {
    @dzsi
    private String A;
    public final axni a;
    private final gga e;
    private final Executor f;
    private final dxio<afha> g;
    private final cavs h;
    private final axjh i;
    private final ceet j;
    private final cetx k;
    private final cetz l;
    private final cexn m;
    private final ceyw n;
    private final cetv o;
    private final cese p;
    private final gfw q;
    private axnw v;
    private final View.OnLayoutChangeListener r = new cexg(this);
    public dhtc b = dhtc.l;
    private dkfx s = dkfx.d;
    private List<cetb> t = dcdc.e();
    private List<cetj> u = dcdc.e();
    @dzsi
    private axne w = null;
    @dzsi
    private cetu x = null;
    @dzsi
    private cetb y = null;
    @dzsi
    private cexj z = null;
    @dzsi
    public axnj c = null;
    public Boolean d = false;

    public cexk(gga ggaVar, cqhn cqhnVar, Executor executor, dxio<afha> dxioVar, cavs cavsVar, axjh axjhVar, ceet ceetVar, cetx cetxVar, cetz cetzVar, cexn cexnVar, ceyw ceywVar, cetv cetvVar, axni axniVar, cese ceseVar, gfw gfwVar, @dzsi String str) {
        this.e = ggaVar;
        this.f = executor;
        this.g = dxioVar;
        this.h = cavsVar;
        this.i = axjhVar;
        this.j = ceetVar;
        this.k = cetxVar;
        this.l = cetzVar;
        this.m = cexnVar;
        this.n = ceywVar;
        this.o = cetvVar;
        this.a = axniVar;
        this.p = ceseVar;
        this.q = gfwVar;
        this.A = str;
    }

    private final boolean F() {
        return this.A == null;
    }

    public void A() {
        this.c = null;
    }

    @dzsi
    public <T extends cetb> T B(Class<T> cls) {
        for (cetb cetbVar : this.t) {
            if (cls.isInstance(cetbVar)) {
                return cls.cast(cetbVar);
            }
        }
        return null;
    }

    public dhtc C() {
        return this.b;
    }

    public m D() {
        return this.q.Ny();
    }

    public void E(@dzsi String str) {
        axnw axnwVar = this.v;
        dbsk.s(axnwVar);
        deha.q(axnwVar.b(str), new cexi(this), this.f);
    }

    @Override // defpackage.cete
    public List<cetb> a() {
        return this.t;
    }

    @Override // defpackage.cete
    public List<cetj> b() {
        return this.u;
    }

    @Override // defpackage.cete
    public jic c() {
        dqkn dqknVar = this.b.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        return new jic(dqknVar.c, ckqc.FIFE_MERGE, (cqtd) null, 0);
    }

    @Override // defpackage.cete
    public String d() {
        dqkn dqknVar = this.b.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        return dqknVar.b;
    }

    @Override // defpackage.cete
    public String e() {
        return this.b.g;
    }

    @Override // defpackage.cete
    public Boolean f() {
        return Boolean.valueOf(this.b.h);
    }

    @Override // defpackage.cete
    public String g() {
        dhtc dhtcVar = this.b;
        if ((dhtcVar.a & 4) != 0) {
            dree dreeVar = dhtcVar.d;
            if (dreeVar == null) {
                dreeVar = dree.c;
            }
            if (dreeVar.a.isEmpty()) {
                return "";
            }
            dree dreeVar2 = this.b.d;
            if (dreeVar2 == null) {
                dreeVar2 = dree.c;
            }
            return dreeVar2.b.isEmpty() ? dreeVar2.a : dreeVar2.b;
        }
        return "";
    }

    @Override // defpackage.cete
    public cqkl h() {
        afha a = this.g.a();
        gga ggaVar = this.e;
        dree dreeVar = this.b.d;
        if (dreeVar == null) {
            dreeVar = dree.c;
        }
        a.k(ggaVar, dreeVar.a, 1);
        return cqkl.a;
    }

    @Override // defpackage.cete
    public String i() {
        return this.b.c;
    }

    @Override // defpackage.cete
    public Boolean j() {
        boolean z = false;
        if (F() && i().isEmpty() && this.b.j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cete
    public String k() {
        return this.e.getString(R.string.PROFILE_TAGLINE_UPSELL_TEXT);
    }

    @Override // defpackage.cete
    public String l() {
        return this.e.getString(R.string.PROFILE_TAGLINE_UPSELL_TITLE_TEXT);
    }

    @Override // defpackage.cete
    public cqkl m() {
        this.j.k(this.b, this.q);
        return cqkl.a;
    }

    @Override // defpackage.cete
    public cqkl n() {
        y();
        return cqkl.a;
    }

    @Override // defpackage.cete
    public Boolean o() {
        return this.d;
    }

    @Override // defpackage.cete
    public View.OnLayoutChangeListener p() {
        return this.r;
    }

    @Override // defpackage.cete
    @dzsi
    public cetb q() {
        return this.y;
    }

    @Override // defpackage.cete
    @dzsi
    public axne r() {
        return this.w;
    }

    @Override // defpackage.cete
    @dzsi
    public jad s() {
        return this.z;
    }

    @Override // defpackage.cete
    @dzsi
    public axnf t() {
        return this.c;
    }

    @Override // defpackage.cete
    @dzsi
    public cetd u() {
        return this.x;
    }

    public void v(String str) {
        this.A = str;
    }

    public void w(dhtc dhtcVar) {
        bvrj.UI_THREAD.c();
        this.b = dhtcVar;
        cety cetyVar = (cety) B(cety.class);
        if (cetyVar != null) {
            cetyVar.j(this.b);
        }
        cqkx.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(defpackage.diak r20) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cexk.x(diak):void");
    }

    public void y() {
        if (this.b.equals(dhtc.l)) {
            return;
        }
        cawx bZ = cawy.h.bZ();
        dqkn dqknVar = this.b.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cawy cawyVar = (cawy) bZ.b;
        dqknVar.getClass();
        cawyVar.b = dqknVar;
        cawyVar.a |= 1;
        boolean F = F();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cawy cawyVar2 = (cawy) bZ.b;
        cawyVar2.a |= 2;
        cawyVar2.c = F;
        dqwa dqwaVar = this.b.e;
        if (dqwaVar == null) {
            dqwaVar = dqwa.g;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cawy cawyVar3 = (cawy) bZ.b;
        dqwaVar.getClass();
        cawyVar3.d = dqwaVar;
        int i = cawyVar3.a | 4;
        cawyVar3.a = i;
        dkfx dkfxVar = this.s;
        dkfxVar.getClass();
        cawyVar3.e = dkfxVar;
        cawyVar3.a = i | 8;
        dhtc dhtcVar = this.b;
        if ((dhtcVar.a & 128) != 0) {
            diog diogVar = dhtcVar.i;
            if (diogVar == null) {
                diogVar = diog.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cawy cawyVar4 = (cawy) bZ.b;
            diogVar.getClass();
            cawyVar4.f = diogVar;
            cawyVar4.a |= 16;
        }
        this.h.f(bZ.bK());
    }

    public void z() {
        if (!this.i.I() || this.c != null) {
            return;
        }
        this.v = this.i.J(this.A);
        E(null);
    }
}
