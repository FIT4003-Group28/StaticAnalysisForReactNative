package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ozb  reason: default package */
/* loaded from: classes7.dex */
public class ozb extends bllj {
    private static final int b = 2131101128;
    private static final dcdc<cqss> c = dcdc.h(ire.n(), ibl.H(), ire.k());
    public final Context a;
    private final cjzt d;
    private final cjqy e;
    private final bvrb f;
    private final dtof g;
    private final dxio<bbut> h;
    private final dxio<bqji> i;
    private final cqss j;
    private final cjtd k;
    @dzsi
    private final dvyw l;

    public ozb(Context context, cjzt cjztVar, cjqy cjqyVar, bvrb bvrbVar, dtof dtofVar, dxio<bbut> dxioVar, dxio<bqji> dxioVar2) {
        this.a = context;
        this.d = cjztVar;
        this.e = cjqyVar;
        this.f = bvrbVar;
        this.g = dtofVar;
        this.h = dxioVar;
        this.i = dxioVar2;
        dvyw dvywVar = dtofVar.b;
        this.l = dvywVar == null ? dvyw.bv : dvywVar;
        int i = dtofVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtofVar).c(dtofVar);
            dtofVar.bC = i;
        }
        dcdc<cqss> dcdcVar = c;
        this.j = dcdcVar.get(Math.abs(i % dcdcVar.size()));
        cjtd bY = owy.c(dtofVar).bY();
        this.k = oyf.b(bY.e, bY.d, null, cjztVar.e, (dtofVar.a & 256) != 0 ? decs.a(dtofVar.h) : null);
    }

    @dzsi
    private final dwfl x() {
        dvyw dvywVar = this.l;
        if (dvywVar == null || (dvywVar.a & 2097152) == 0) {
            return null;
        }
        dvxh dvxhVar = dvywVar.z;
        if (dvxhVar == null) {
            dvxhVar = dvxh.B;
        }
        if ((dvxhVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            return null;
        }
        dvxh dvxhVar2 = this.l.z;
        if (dvxhVar2 == null) {
            dvxhVar2 = dvxh.B;
        }
        dwfl dwflVar = dvxhVar2.q;
        return dwflVar == null ? dwfl.w : dwflVar;
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence b() {
        dvyw dvywVar = this.l;
        return (dvywVar == null || (dvywVar.a & 16) == 0) ? "" : dvywVar.i;
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence f() {
        dvyw dvywVar = this.l;
        return (dvywVar == null || dvywVar.A.size() <= 0) ? "" : this.l.A.get(0);
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public CharSequence g() {
        dvyw dvywVar = this.l;
        if (dvywVar == null) {
            return null;
        }
        if (dvywVar.o.size() > 0) {
            return this.l.o.get(0);
        }
        dvyw dvywVar2 = this.l;
        if ((dvywVar2.a & 1024) == 0) {
            return null;
        }
        return dvywVar2.p;
    }

    @Override // defpackage.bllj, defpackage.jax
    public jht h() {
        dtof dtofVar = this.g;
        dtkq dtkqVar = null;
        if (dtofVar == null || (dtofVar.a & 8) == 0) {
            return null;
        }
        bwrs a = bwrs.a(owy.c(dtofVar));
        Context context = this.a;
        cjzt cjztVar = this.d;
        cjqy cjqyVar = this.e;
        bvrb bvrbVar = this.f;
        dthb dthbVar = this.g.e;
        if (dthbVar == null) {
            dthbVar = dthb.F;
        }
        dthb dthbVar2 = dthbVar;
        dxio<bbut> dxioVar = this.h;
        dxio<bqji> dxioVar2 = this.i;
        if (this.g.f.size() != 0) {
            dtkqVar = this.g.f.get(0);
        }
        return new oye(context, cjztVar, cjqyVar, bvrbVar, a, dthbVar2, dxioVar, dxioVar2, dtkqVar).b();
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public CharSequence i() {
        return (CharSequence) dbsg.j(this.l).h(new dbrn(this) { // from class: oza
            private final ozb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a.getString(R.string.OVERFLOW_MENU_BUTTON_DESCRIPTION_WITH_PLACE, ((dvyw) obj).i);
            }
        }).f();
    }

    @Override // defpackage.bllj, defpackage.jax
    public jic k() {
        if (x() != null) {
            return owy.f(x(), b);
        }
        return new jic((String) null, ckqc.FULLY_QUALIFIED, oxa.a(194).a(), 250);
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean l() {
        return Boolean.valueOf((this.g.a & 4) != 0);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        dtof dtofVar = this.g;
        if ((dtofVar.a & 4) != 0) {
            cjyi cjyiVar = this.d.c;
            dthb dthbVar = dtofVar.d;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.d;
            cjyiVar.j(dthbVar, nxc.b(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean p() {
        return Boolean.valueOf((this.g.a & 8) != 0);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl q(cjqm cjqmVar) {
        dtof dtofVar = this.g;
        if ((dtofVar.a & 8) != 0) {
            cjyi cjyiVar = this.d.c;
            dthb dthbVar = dtofVar.e;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.d;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public cjtd s() {
        return this.k;
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public jic t() {
        dwfl x = x();
        if (x == null) {
            return null;
        }
        int i = b;
        ckqc i2 = owy.i(x);
        if (i2 == ckqc.FIFE) {
            i2 = ckqc.FIFE_BLUR_80;
        }
        return new jic(owy.h(x), i2, i, 250);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqss u() {
        return this.j;
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public jic v() {
        if (this.g.f.size() == 0 || this.g.f.get(0).b == 4086) {
            return null;
        }
        return oyf.a(this.g.f.get(0));
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public String w() {
        if (this.g.f.size() == 0 || this.g.f.get(0).b == 4086) {
            return null;
        }
        return this.g.f.get(0).e;
    }
}
