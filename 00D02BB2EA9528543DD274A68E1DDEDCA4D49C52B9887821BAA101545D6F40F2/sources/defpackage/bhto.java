package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhto  reason: default package */
/* loaded from: classes3.dex */
public class bhto implements bhrz, bega {
    public final dxio<bhng> b;
    public final cjtd c;
    @dzsi
    private cjtd e;
    private boolean f;
    private boolean g;
    private final View.OnAttachStateChangeListener h;
    private final btvo i;
    private final dxio<cclq> j;
    private final dxio<begg> k;
    private final cclp l;
    private final bhru m;
    private final bhsk n;
    private final bhhf o;
    public dbsg<bwrs<ilo>> a = dbpy.a;
    private dcdc<bhsl> d = dcdc.e();

    public bhto(btvo btvoVar, huc hucVar, dxio<bhng> dxioVar, dxio<cclq> dxioVar2, dxio<begg> dxioVar3, cclp cclpVar, bhru bhruVar, bhsk bhskVar, bvpe bvpeVar, bhtp bhtpVar, bhhf bhhfVar) {
        cjta b = cjtd.b();
        b.d = dtxx.v;
        this.c = b.a();
        this.i = btvoVar;
        this.b = dxioVar;
        this.j = dxioVar2;
        this.k = dxioVar3;
        this.l = cclpVar;
        this.m = bhruVar;
        this.n = bhskVar;
        this.o = bhhfVar;
        this.h = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: bhtm
            private final bhto a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.c;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
    }

    private final void j() {
        this.a = dbpy.a;
        this.d = dcdc.e();
        this.f = false;
        this.g = false;
        this.e = null;
    }

    @Override // defpackage.bhrz
    public Boolean a() {
        boolean z = false;
        if (this.f && this.k.a().i(bege.MENU)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhrz
    public cqkl b() {
        if (a().booleanValue()) {
            this.k.a().k(bege.MENU);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhrz
    public View.OnAttachStateChangeListener c() {
        return this.h;
    }

    @Override // defpackage.bhrz
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.bhrz
    @dzsi
    public cjtd e() {
        return this.e;
    }

    @Override // defpackage.bhsa
    public List<? extends bhry> f() {
        return this.d;
    }

    @Override // defpackage.bhsa
    public Boolean g() {
        return Boolean.valueOf(this.i.getUgcOfferingsParameters().a());
    }

    @Override // defpackage.bhsa
    public Boolean h() {
        if (!this.a.a()) {
            return false;
        }
        return Boolean.valueOf(this.o.b(this.a.b()));
    }

    @Override // defpackage.bhsa
    public cqkl i() {
        dbsk.l(this.a.a());
        if (h().booleanValue()) {
            this.j.a().n(this.a.b());
        } else {
            this.j.a().k(this.a.b());
        }
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ddho ddhoVar;
        j();
        this.a = dbsg.i(bwrsVar);
        this.l.a(bwrsVar);
        this.d = this.n.a(this.l, dgfb.DISH, new bvqg(this) { // from class: bhtn
            private final bhto a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bhto bhtoVar = this.a;
                dbsk.l(bhtoVar.a.a());
                bhtoVar.b.a().a((ccln) obj, bhtoVar.a.b());
            }
        });
        this.f = this.m.f(this.l);
        boolean c = this.m.c(this.l);
        this.g = c;
        cjtd cjtdVar = null;
        if (!c) {
            if (this.m.a(this.l) == ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL) {
                ddhoVar = dtxx.y;
            } else {
                ddhoVar = this.m.b(this.l) == ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL ? dtxx.C : null;
            }
            if (ddhoVar != null) {
                cjta b = cjtd.b();
                b.d = ddhoVar;
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                cjtdVar = b.a();
            }
        }
        this.e = cjtdVar;
    }

    @Override // defpackage.bega
    public void u() {
        j();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.g);
    }
}
