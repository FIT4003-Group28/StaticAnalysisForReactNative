package defpackage;

import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nxb  reason: default package */
/* loaded from: classes3.dex */
public final class nxb extends nwq implements nxd {
    public final nxe a;
    public final nxe b;
    public boolean c;
    private final aynx d;
    private aypg e;

    public nxb(nxe nxeVar, nxe nxeVar2, aynx aynxVar) {
        this.a = nxeVar;
        this.b = nxeVar2;
        this.d = aynxVar;
    }

    @Override // defpackage.nwq, defpackage.nxe
    public final ampq I() {
        return (this.c ? this.b : this.a).I();
    }

    @Override // defpackage.nxe
    public final float l() {
        return (this.c ? this.b : this.a).l();
    }

    @Override // defpackage.nxe
    public final float m() {
        return (this.c ? this.b : this.a).m();
    }

    @Override // defpackage.nxe
    public final float n() {
        return (this.c ? this.b : this.a).n();
    }

    @Override // defpackage.nxe
    public final float o() {
        return (this.c ? this.b : this.a).o();
    }

    @Override // defpackage.nxe
    public final float p() {
        return (this.c ? this.b : this.a).p();
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        if ((nxeVar != this.a || this.c) && (nxeVar != this.b || !this.c)) {
            return;
        }
        J();
    }

    @Override // defpackage.nxe
    public final float q() {
        if (this.c) {
            return this.b.q();
        }
        return this.a.q();
    }

    @Override // defpackage.nxe
    public final Rect r() {
        return (this.c ? this.b : this.a).r();
    }

    @Override // defpackage.nxe
    public final Rect s() {
        return (this.c ? this.b : this.a).s();
    }

    @Override // defpackage.nxe
    public final Rect t() {
        return (this.c ? this.b : this.a).t();
    }

    @Override // defpackage.nxe
    public final Rect u() {
        return (this.c ? this.b : this.a).u();
    }

    @Override // defpackage.nxe
    public final Rect v() {
        if (this.c) {
            return this.b.v();
        }
        return this.a.v();
    }

    @Override // defpackage.nxe
    public final void x() {
        this.a.K(this);
        this.b.K(this);
        this.a.x();
        this.b.x();
        this.e = this.d.Z(new ayqb() { // from class: nxa
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nxb nxbVar = nxb.this;
                Boolean bool = (Boolean) obj;
                if (nxbVar.c == bool.booleanValue()) {
                    return;
                }
                nxbVar.c = bool.booleanValue();
                nxbVar.J();
            }
        });
    }

    @Override // defpackage.nxe
    public final void y() {
        this.a.L(this);
        this.b.L(this);
        this.a.y();
        this.b.y();
        aypg aypgVar = this.e;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.e = null;
        }
    }

    @Override // defpackage.nxe
    public final void z(int i, int i2) {
        this.b.z(i, i2);
        this.a.z(i, i2);
    }
}
