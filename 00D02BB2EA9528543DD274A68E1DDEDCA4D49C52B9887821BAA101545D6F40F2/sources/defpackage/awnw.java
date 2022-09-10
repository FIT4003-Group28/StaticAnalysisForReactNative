package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: awnw  reason: default package */
/* loaded from: classes3.dex */
public abstract class awnw extends ges {
    public cjxo ae;
    public dxio<awnv> af;
    public efg ag;

    protected boolean aJ() {
        return false;
    }

    protected boolean aR() {
        return false;
    }

    public final void aS() {
        this.af.a().f();
    }

    @Override // defpackage.ges, defpackage.gfo
    public boolean e() {
        boolean aR = aR();
        if (aR) {
            J().finish();
        } else {
            aS();
        }
        return aR;
    }

    protected abstract View i();

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        if (btpf.a(J())) {
            this.ae.a(7);
        }
        efg efgVar = this.ag;
        egj egjVar = new egj(this);
        egjVar.w(i());
        egjVar.y(aJ());
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.av(null);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        if (btpf.a(J())) {
            this.ae.b();
        }
        super.u();
    }
}
