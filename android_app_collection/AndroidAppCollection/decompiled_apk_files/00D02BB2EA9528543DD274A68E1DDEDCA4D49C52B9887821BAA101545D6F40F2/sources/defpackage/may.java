package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: may  reason: default package */
/* loaded from: classes7.dex */
public final class may extends nor {
    private static final cjsz k = new cjsz(dtxm.dF);
    public final cjqy a;
    public final ddho b;
    public final not c;
    public final ckcw d;
    public final nop e;
    public final kdi f;
    public final dcdc<ldm> g;
    public final mcj h;
    public final mnz i;
    public final mwp j;
    private final cqkj l;
    private final jzp m;
    private final dcdc<brcl> n;
    private final kcv o;
    private final Runnable p;
    private final kxs q;
    private final btvo r;
    private final kdg s;
    private final asmp t;
    private final cqkf<mfa> u;

    public may(cqkj cqkjVar, jzp jzpVar, cjqy cjqyVar, cjqq cjqqVar, ckcw ckcwVar, ddho ddhoVar, dcdc dcdcVar, not notVar, kxu kxuVar, nop nopVar, kcv kcvVar, Runnable runnable, btvo btvoVar, kdg kdgVar, kdi kdiVar, dcdc dcdcVar2, asmp asmpVar, mcj mcjVar, mwp mwpVar, mnz mnzVar) {
        super(cjqyVar, cjqqVar);
        this.l = cqkjVar;
        this.m = jzpVar;
        this.a = cjqyVar;
        this.b = ddhoVar;
        this.n = dcdcVar;
        this.c = notVar;
        this.d = ckcwVar;
        this.e = nopVar;
        this.o = kcvVar;
        this.p = runnable;
        this.r = btvoVar;
        this.s = kdgVar;
        this.f = kdiVar;
        this.t = asmpVar;
        this.h = mcjVar;
        this.j = mwpVar;
        this.i = mnzVar;
        this.g = dcdcVar2 == null ? dcdc.e() : dcdcVar2;
        cqkf<mfa> d = cqkjVar.d(new mcu(), notVar.a(), false);
        this.u = d;
        View c = d.c();
        kxn k2 = kxo.k();
        k2.k();
        this.q = new kxs(c, k2, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        int i;
        dccx dccxVar = new dccx();
        if (!this.r.getCarParameters().h || !this.o.p()) {
            i = 0;
        } else {
            dccxVar.g(new mfg(nqu.y(), this.l.d.getResources().getString(R.string.CAR_SEARCH_CATEGORY_VOICE), this.m.h(), this.p, 0, false, dtxm.cu));
            i = 1;
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < this.n.size() && i2 < 8) {
            brcl brclVar = this.n.get(i3);
            int i4 = brclVar.d;
            cqtd cqtdVar = brclVar.c;
            String charSequence = ((cqsh) brclVar.b).a.toString();
            int i5 = i2 + 1;
            dccxVar.g(new mfg(nqu.ap(i4, cqtdVar), charSequence, this.m.h(), new max(this, charSequence, brclVar.a, i4, brclVar.e), i2, i3 == this.n.size() + (-1), this.b));
            i3++;
            i2 = i5;
        }
        this.u.e(new mff(this.l.d, this.e, dccxVar.f(), this.e.g()));
    }

    @Override // defpackage.non
    public final noq b() {
        s(k);
        this.s.d(this);
        this.q.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.u.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.q.b();
        this.s.e(this);
        this.t.x();
        this.t.v();
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.u.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "NavigationSearchCategoriesOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, this.u.c());
    }
}
