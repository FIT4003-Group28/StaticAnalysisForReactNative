package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bsrl  reason: default package */
/* loaded from: classes4.dex */
public class bsrl extends ixr implements bsst {
    public final brzb e;
    private final bsri f;
    @dzsi
    private final iwg g;
    private final iwj h;
    private boolean i;
    private boolean j;
    @dzsi
    private cjhh k;
    private float l;
    private boolean m;
    private boolean n;

    public bsrl(ixq ixqVar, cqhn cqhnVar, dxio<ckrp> dxioVar, @dzsi final iwg iwgVar, bsri bsriVar, dxio<afha> dxioVar2, boolean z, @dzsi dfzq dfzqVar, brzb brzbVar) {
        super(ixqVar);
        this.k = null;
        this.l = 0.0f;
        this.e = brzbVar;
        this.f = bsriVar;
        this.g = iwgVar;
        this.i = z;
        this.j = true;
        this.h = new iwj(btsp.c(dxioVar.a()), new dbty(iwgVar) { // from class: bsrj
            private final iwg a;

            {
                this.a = iwgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a == null);
            }
        });
        if (dfzqVar != null) {
            this.m = true;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: bsrk
                private final bsrl a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bsrl bsrlVar = this.a;
                    bsrlVar.aw(true);
                    bsrlVar.e.f(true);
                    cqkx.p(bsrlVar);
                }
            };
            cjta b = cjtd.b();
            b.d = dtyb.aA;
            cjhn q = cjho.q(dfzqVar, 3, onClickListener, dxioVar2, b, null, null);
            cjta b2 = cjtd.b();
            b2.d = dtyb.aB;
            b2.g(dfzqVar.b);
            q.c(b2.a());
            cjta b3 = cjtd.b();
            b3.d = dtyb.aC;
            b3.g(dfzqVar.b);
            q.d(b3.a());
            this.k = q.a();
        }
    }

    @Override // defpackage.ivk, defpackage.izs
    @dzsi
    public izg U() {
        return this.g;
    }

    @Override // defpackage.ivk, defpackage.izs
    public void ad(int i, float f) {
        if (au() == null) {
            return;
        }
        if (f <= 0.0f) {
            this.l = -i;
        } else {
            float f2 = i;
            if (f <= f2) {
                this.l = f - f2;
            } else {
                this.l = 0.0f;
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.ixr, defpackage.izs
    public izi ae() {
        return this.f;
    }

    @Override // defpackage.ixr, defpackage.izs
    public izh af() {
        return this.h;
    }

    @Override // defpackage.bsst
    public brzb ap() {
        return this.e;
    }

    @Override // defpackage.bsst
    public Boolean aq() {
        boolean z = false;
        if (this.i && this.j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void ar(boolean z) {
        this.i = z;
    }

    public boolean as() {
        return this.i;
    }

    public void at(boolean z) {
        if (this.j != z) {
            this.j = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bsst
    @dzsi
    public cjhh au() {
        if (!this.m || this.n) {
            return null;
        }
        return this.k;
    }

    public void av(boolean z) {
        this.m = z;
    }

    public void aw(boolean z) {
        this.n = true;
    }

    @Override // defpackage.bsst
    public Float ax() {
        return Float.valueOf(this.l);
    }

    @Override // defpackage.ivk, defpackage.izs
    public Boolean n() {
        boolean z = true;
        if (this.e != null && this.j) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ixr, defpackage.ivk, defpackage.izs
    public cqss u() {
        return ibm.b();
    }
}
