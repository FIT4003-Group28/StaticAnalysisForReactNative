package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ixr  reason: default package */
/* loaded from: classes.dex */
public class ixr extends ivk {
    private final iwj e;
    private final eeu f;
    private final dzsj<brba> g;
    private final iwl h;
    private final btrm i;
    private final iwb j;
    private final isu k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private cjtd p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ixr(ixq ixqVar) {
        this(ixqVar, null, null);
    }

    @Override // defpackage.ivk, defpackage.izs
    public boolean M(boolean z) {
        this.i.b(gdv.b(z));
        return super.M(z);
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean W() {
        boolean z = false;
        if (this.l && !A().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ivk, defpackage.izs
    public String X() {
        return this.o;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cjtd Y() {
        return this.p;
    }

    @Override // defpackage.ivk, defpackage.izs
    @dzsi
    public izd Z() {
        return this.j;
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean aa() {
        boolean z = false;
        if (ao() && !super.w().booleanValue() && bvpb.c(super.d())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ivk, defpackage.izs
    @dzsi
    public iyz ab() {
        return null;
    }

    @Override // defpackage.izs
    public izi ae() {
        return this.h;
    }

    @Override // defpackage.izs
    public izh af() {
        return this.e;
    }

    public void ag(boolean z) {
        izr izrVar = z ? izr.LOADING : izr.VIEW;
        if (QG() != izrVar) {
            QF(izrVar);
            cqkx.p(this);
        }
    }

    public void ah() {
        this.j.b();
    }

    public void ai(boolean z) {
        this.j.c(true);
    }

    public void aj(boolean z) {
        this.n = z;
    }

    public void ak(boolean z) {
        this.h.j(false);
    }

    public void al(boolean z) {
        this.l = true;
    }

    public void am() {
        this.h.a();
    }

    public void an() {
        this.h.b();
    }

    final boolean ao() {
        return this.m && this.k.e;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqkl c() {
        if (!((efh) this.f).b || !this.n) {
            return cqkl.a;
        }
        bwrs<brln> bwrsVar = this.b;
        if (bwrsVar != null) {
            this.g.a().i(bwrsVar);
        } else {
            this.g.a().e(bvpb.b(d()).toString());
        }
        this.i.b(brcn.a);
        return cqkl.a;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqss u() {
        return ibm.b();
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean y() {
        if (!ao() || !bvpb.c(super.d())) {
            return super.y();
        }
        return false;
    }

    public ixr(ixq ixqVar, @dzsi bzmm bzmmVar, @dzsi brxa brxaVar) {
        super(ixqVar.a);
        this.n = true;
        this.o = "";
        this.p = cjtd.b;
        this.f = ixqVar.b;
        this.g = ixqVar.d;
        this.h = ixqVar.c;
        this.i = ixqVar.e;
        this.j = ixqVar.g;
        this.k = ixqVar.h;
        this.m = true;
        this.c = null;
        if (bzmmVar != null && brxaVar != null) {
            mw mwVar = new mw(this) { // from class: ixo
                private final ixr a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.c = (bryd) obj;
                }
            };
            btvo a = brxaVar.a.a();
            brxa.a(a, 1);
            bryi a2 = brxaVar.b.a();
            brxa.a(a2, 2);
            bvjj a3 = brxaVar.c.a();
            brxa.a(a3, 3);
            Activity activity = (Activity) ((dxjd) brxaVar.d).a;
            brxa.a(activity, 4);
            cpv a4 = brxaVar.e.a();
            brxa.a(a4, 5);
            brxa.a(mwVar, 6);
            bzmmVar.a(new brwz(a, a2, a3, activity, a4, mwVar));
        }
        this.e = new iwj(ixqVar.f, new dbty(this) { // from class: ixp
            private final ixr a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ixr ixrVar = this.a;
                boolean z = true;
                if (ixrVar.QG() != izr.VIEW && ixrVar.QG() != izr.EDIT) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
