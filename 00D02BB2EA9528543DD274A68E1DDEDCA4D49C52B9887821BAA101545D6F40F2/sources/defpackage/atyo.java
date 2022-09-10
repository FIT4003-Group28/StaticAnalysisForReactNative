package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: atyo  reason: default package */
/* loaded from: classes2.dex */
public final class atyo extends bxdu implements nxd, bxeq, nxe {
    public auaj a;
    public atln ad;
    public aufc ae;
    public cjqy af;
    public cqhn b;
    private cqkf<aual> bg;
    private final atyn bh = new atyn(this);
    public btrm c;
    public eeu d;
    public dxio<ascb> e;
    public bvsl f;
    public cqkj g;

    private final void aV(aste asteVar) {
        if (((efh) this.d).b) {
            this.e.a().l(asteVar);
        }
    }

    @Override // defpackage.bxel
    @dzsi
    protected final View OM() {
        return this.bg.c();
    }

    @Override // defpackage.bxel
    protected final egf ON() {
        dtjv dtjvVar = this.ax.F().b;
        if (dtjvVar == null) {
            dtjvVar = dtjv.d;
        }
        dqvj c = dqvj.c(dtjvVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return egf.d(c);
    }

    @Override // defpackage.bxdu
    protected final nxd PC() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & ImageMetadata.SHADING_MODE) != 0;
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    public final boolean aR() {
        return this.am.getDirectionsExperimentsParameters().l;
    }

    @Override // defpackage.bxel, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        dbsk.t(this.a, "should have been created by now");
        if (aR()) {
            this.bg = this.g.c(new atzs(), null);
        } else {
            this.bg = this.g.c(new auab(), null);
        }
        this.bg.e(this.a);
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtqw dtqwVar = nviVar.a.r;
        if (dtqwVar == null) {
            dtqwVar = dtqw.h;
        }
        dpjx dpjxVar = dtqwVar.b;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = cjqg.b(this.af);
        String str = dpjxVar.b;
        asswVar.b = str;
        asswVar.e = (dpjxVar.a & 2) != 0 ? dpjxVar.c : null;
        s.d(str);
        s.f(dtyb.ax);
        aV(s.a());
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DIRECTIONS);
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        if ((dthbVar.a & ImageMetadata.SHADING_MODE) != 0) {
            return this;
        }
        return null;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = cjqmVar.a().f();
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        asswVar.b = dxbpVar.b;
        dxbp dxbpVar2 = dwjjVar.b;
        if (dxbpVar2 == null) {
            dxbpVar2 = dxbp.x;
        }
        s.d(dxbpVar2.b);
        s.f(dtyb.ay);
        if ((dwjjVar.a & 32) != 0) {
            dvzj dvzjVar = dwjjVar.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            if ((dvzjVar.a & 1) != 0) {
                dvzj dvzjVar2 = dwjjVar.g;
                if (dvzjVar2 == null) {
                    dvzjVar2 = dvzj.y;
                }
                asswVar.e = dvzjVar2.b;
            }
        }
        if ((dwjjVar.a & 16) != 0) {
            dwir dwirVar = dwjjVar.f;
            if (dwirVar == null) {
                dwirVar = dwir.R;
            }
            s.j(dwirVar);
        }
        aV(s.a());
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = cjqg.b(this.af);
        asswVar.b = str;
        s.d(str);
        deaf b = deaf.b(dnqhVar.h);
        if (b == null) {
            b = deaf.UNASSIGNED_USER_ACTION_ID;
        }
        if (b == bxkq.SPEECH_RECOGNITION.g) {
            s.f(dtyb.az);
            s.h(true);
        } else {
            s.f(dtyb.ax);
        }
        aV(s.a());
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.a = new auaj(this.b, this.ae.b());
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.c;
        atyn atynVar = this.bh;
        dceq a = dcet.a();
        a.b(crhp.class, new atyp(crhp.class, atynVar, bvrj.UI_THREAD));
        btrmVar.g(atynVar, a.a());
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void u() {
        this.c.a(this.bh);
        super.u();
    }
}
