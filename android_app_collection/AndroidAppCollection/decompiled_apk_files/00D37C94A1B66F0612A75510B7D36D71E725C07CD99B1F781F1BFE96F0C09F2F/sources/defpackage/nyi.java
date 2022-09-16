package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nyi  reason: default package */
/* loaded from: classes3.dex */
final class nyi extends nyr {
    private int b;

    public nyi(nxe nxeVar, nxe nxeVar2, int i) {
        super(nxeVar, nxeVar2);
        this.b = i;
        b();
    }

    @Override // defpackage.nyr
    public final void b() {
        nxe nxeVar = this.e;
        nxeVar.getClass();
        this.f.set(nxeVar.t());
        this.g.set(this.e.v());
        this.f.offset(0, (int) (this.b * 0.2f));
        this.g.offset(0, (int) (this.b * 0.2f));
        this.i.set(this.e.u());
        this.h.set(this.e.r());
        this.j.set(this.e.s());
        if (this.e.q() > 0.0f) {
            Rect rect = this.i;
            rect.offsetTo(rect.left, this.f.bottom);
            Rect rect2 = this.h;
            rect2.offsetTo(rect2.left, this.f.top);
            return;
        }
        this.h.offsetTo(this.f.left, this.f.bottom);
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void z(int i, int i2) {
        this.b = i2;
        b();
    }
}
