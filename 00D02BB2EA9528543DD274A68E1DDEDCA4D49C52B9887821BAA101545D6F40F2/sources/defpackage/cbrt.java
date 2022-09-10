package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbrt  reason: default package */
/* loaded from: classes4.dex */
public final class cbrt extends ges {
    public efg a;
    public cqkj b;
    public cbuq c;
    public cbse d;
    private cqkf<cbuo> e;
    @dzsi
    private cbup f;
    private cbsc g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        if (this.f != null) {
            this.e.e(null);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbuo> d = this.b.d(new cbun(), viewGroup, false);
        this.e = d;
        d.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        cbsd cbsdVar = (cbsd) this.g;
        cbuf l = cbsdVar.a.a.l();
        dbsk.s(l);
        if (l.ordinal() != 1) {
            return false;
        }
        ((cbrz) cbsdVar.d).a.c();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        cbse cbseVar = this.d;
        cbsl a = cbseVar.a.a();
        cbse.a(a, 1);
        cbsi a2 = cbseVar.b.a();
        cbse.a(a2, 2);
        cbse.a(this, 3);
        cbsd cbsdVar = new cbsd(a, a2, this);
        this.g = cbsdVar;
        cbte cbteVar = ((cbtg) bvrs.e(bundle, cbtg.class, (dssr) cbtg.c.cu(7))).b;
        if (cbteVar == null) {
            cbteVar = cbte.e;
        }
        cbsd cbsdVar2 = cbsdVar;
        crzo<cbuf> crzoVar = cbsdVar2.a;
        cbuf b = cbuf.b(cbteVar.b);
        if (b == null) {
            b = cbuf.UNKNOWN;
        }
        crzoVar.a(b);
        cbsh cbshVar = cbsdVar2.c;
        cbti cbtiVar = cbteVar.c;
        if (cbtiVar == null) {
            cbtiVar = cbti.c;
        }
        crzo<cbto> crzoVar2 = cbshVar.a;
        cbto cbtoVar = cbtiVar.b;
        if (cbtoVar == null) {
            cbtoVar = cbto.b;
        }
        crzoVar2.a(cbtoVar);
        cbsk cbskVar = cbsdVar2.b;
        cbtq cbtqVar = cbteVar.d;
        if (cbtqVar == null) {
            cbtqVar = cbtq.c;
        }
        crzo<cbtv> crzoVar3 = cbskVar.a;
        cbtv cbtvVar = cbtqVar.b;
        if (cbtvVar == null) {
            cbtvVar = cbtv.h;
        }
        crzoVar3.a(cbtvVar);
        cbuq cbuqVar = this.c;
        cbsd cbsdVar3 = (cbsd) this.g;
        cbrx cbrxVar = cbsdVar3.d;
        cbss cbssVar = cbsdVar3.e;
        cbuq.a(cbrxVar, 1);
        cbuq.a(cbssVar, 2);
        cbvn a3 = cbuqVar.a.a();
        cbuq.a(a3, 3);
        cbvy a4 = cbuqVar.b.a();
        cbuq.a(a4, 4);
        Executor a5 = cbuqVar.c.a();
        cbuq.a(a5, 5);
        cqhn a6 = cbuqVar.d.a();
        cbuq.a(a6, 6);
        this.f = new cbup(cbrxVar, cbssVar, a3, a4, a5, a6);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.a;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cbtf bZ = cbtg.c.bZ();
        cbsd cbsdVar = (cbsd) this.g;
        cbuf l = cbsdVar.a.a.l();
        dbsk.s(l);
        cbto l2 = cbsdVar.c.a().l();
        dbsk.s(l2);
        cbth bZ2 = cbti.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        cbti cbtiVar = (cbti) bZ2.b;
        l2.getClass();
        cbtiVar.b = l2;
        cbtiVar.a |= 1;
        cbti bK = bZ2.bK();
        cbtv f = cbsdVar.b.f();
        cbtp bZ3 = cbtq.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        cbtq cbtqVar = (cbtq) bZ3.b;
        f.getClass();
        cbtqVar.b = f;
        cbtqVar.a |= 1;
        cbtq bK2 = bZ3.bK();
        cbtd bZ4 = cbte.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        cbte cbteVar = (cbte) bZ4.b;
        cbteVar.b = l.d;
        int i = cbteVar.a | 1;
        cbteVar.a = i;
        bK.getClass();
        cbteVar.c = bK;
        int i2 = i | 2;
        cbteVar.a = i2;
        bK2.getClass();
        cbteVar.d = bK2;
        cbteVar.a = i2 | 4;
        cbte bK3 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cbtg cbtgVar = (cbtg) bZ.b;
        bK3.getClass();
        cbtgVar.b = bK3;
        cbtgVar.a |= 1;
        bvrs.l(bundle, bZ.bK());
    }
}
