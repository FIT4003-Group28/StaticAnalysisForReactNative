package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arey  reason: default package */
/* loaded from: classes2.dex */
public final class arey extends nus {
    private static final dnne af;
    public dxio<nxh> ad;
    public buvu ae;
    private arew ag;
    public dxio<nut> f;
    public efg g;

    static {
        dnnd bZ = dnne.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnne dnneVar = (dnne) bZ.b;
        dnneVar.a |= 1;
        dnneVar.b = 50;
        af = bZ.bK();
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((arez) btsx.b(arez.class, this)).ck(this);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        return jib.g(J(), Rp(R.string.MY_MAPS_TITLE));
    }

    @Override // defpackage.nus, defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        duls dulsVar;
        cqkf d = this.d.d(new oah(), null, false);
        nur nurVar = new nur(this, d);
        this.b = ((nus) this).e.a(nxl.MY_MAPS, null);
        this.b.j = nurVar;
        View c = d.c();
        arew arewVar = this.ag;
        nvg nvgVar = this.b;
        nup nupVar = arewVar.a;
        if (nupVar != null) {
            nvgVar.e();
            nvgVar.d(nupVar.a);
            nvgVar.d = nupVar.d;
            nvgVar.e = nupVar.e;
            nvgVar.f = nupVar.f;
            nvgVar.g = nupVar.g;
        }
        arewVar.a = nvgVar;
        arewVar.a.s();
        if (bundle != null) {
            arew arewVar2 = this.ag;
            arewVar2.a.c(bundle);
            arewVar2.a.s();
            arewVar2.e = (dnne) bvrs.b(bundle.getByteArray("arg_key_mm_request"), (dssr) dnne.c.cu(7));
        }
        arew arewVar3 = this.ag;
        if (arewVar3.e != null) {
            arewVar3.g.a(true);
            duyn bZ = duyo.e.bZ();
            dnsi bZ2 = dnsj.e.bZ();
            dnne dnneVar = arewVar3.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnsj dnsjVar = (dnsj) bZ2.b;
            dnneVar.getClass();
            dnsjVar.c = dnneVar;
            dnsjVar.a |= 32;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duyo duyoVar = (duyo) bZ.b;
            dnsj bK = bZ2.bK();
            bK.getClass();
            duyoVar.b = bK;
            duyoVar.a = 1 | duyoVar.a;
            try {
                dulsVar = (duls) dsqw.cq(duls.g, owx.a(arewVar3.d.a().a(), arewVar3.b.getResources()).bK().bS());
            } catch (dsrm e) {
                bvoo.f(new RuntimeException(e));
                dulsVar = duls.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duyo duyoVar2 = (duyo) bZ.b;
            dulsVar.getClass();
            duyoVar2.c = dulsVar;
            duyoVar2.a |= 2;
            dulh c2 = arewVar3.c.a().a.a().c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duyo duyoVar3 = (duyo) bZ.b;
            c2.getClass();
            duyoVar3.d = c2;
            duyoVar3.a |= 4;
            arewVar3.h.a(bZ.bK(), arewVar3.f, bvrj.UI_THREAD);
        }
        return c;
    }

    @Override // defpackage.nus, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ag = new arew(J(), this.ae, this.f, this.ad, af, new arex(this));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.eH;
    }

    @Override // defpackage.nus, defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.g;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        arew arewVar = this.ag;
        arewVar.a.b(bundle);
        bundle.putByteArray("arg_key_mm_request", arewVar.e.bS());
    }
}
