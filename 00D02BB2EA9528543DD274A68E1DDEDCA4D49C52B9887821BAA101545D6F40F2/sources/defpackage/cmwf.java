package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cmwf  reason: default package */
/* loaded from: classes.dex */
public class cmwf extends cmvs implements m, ax, h, avr, agm {
    private final o a;
    private final avq b;
    private aw c;
    private aq d;
    public final agl x;

    public cmwf() {
        o oVar = new o(this);
        this.a = oVar;
        this.b = avq.c(this);
        this.x = new agl(new cmwd(this));
        if (oVar != null) {
            oVar.a(new l() { // from class: com.google.android.gms.car.CarComponentActivity$2
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    if (iVar != i.ON_DESTROY || cmwf.this.G()) {
                        return;
                    }
                    cmwf.this.NA().c();
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in CarComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private final void m(i iVar) {
        o oVar = this.a;
        if (oVar instanceof o) {
            oVar.e(iVar);
        }
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final Object I() {
        cmwe cmweVar;
        aw awVar = this.c;
        if (awVar == null && (cmweVar = (cmwe) J()) != null) {
            awVar = cmweVar.a;
        }
        if (awVar == null) {
            return null;
        }
        cmwe cmweVar2 = new cmwe();
        cmweVar2.a = awVar;
        return cmweVar2;
    }

    @Override // defpackage.h
    public final aq MX() {
        if (this.d == null) {
            this.d = new af(null, this, No() != null ? No().getExtras() : null);
        }
        return this.d;
    }

    @Override // defpackage.ax
    public final aw NA() {
        if (this.c == null) {
            cmwe cmweVar = (cmwe) J();
            if (cmweVar != null) {
                this.c = cmweVar.a;
            }
            if (this.c == null) {
                this.c = new aw();
            }
        }
        return this.c;
    }

    @Override // defpackage.m
    public final k Nh() {
        return this.a;
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void Oe(Bundle bundle) {
        o oVar = this.a;
        if (oVar instanceof o) {
            oVar.d(j.CREATED);
        }
        super.Oe(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.agm
    public final agl Oj() {
        return this.x;
    }

    @Override // defpackage.avr
    public final avp Qg() {
        return this.b.a;
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void e(Bundle bundle) {
        this.b.a(bundle);
        m(i.ON_CREATE);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void f() {
        m(i.ON_START);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void g() {
        m(i.ON_STOP);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void r() {
        m(i.ON_RESUME);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void s() {
        m(i.ON_PAUSE);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void t() {
        m(i.ON_DESTROY);
    }

    @Override // defpackage.cmvs
    public void u() {
        this.x.a();
    }
}
