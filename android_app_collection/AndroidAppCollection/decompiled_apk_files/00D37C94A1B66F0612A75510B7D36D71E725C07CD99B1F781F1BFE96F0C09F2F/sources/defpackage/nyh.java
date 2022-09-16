package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nyh  reason: default package */
/* loaded from: classes3.dex */
final class nyh extends nyr {
    private int b;

    public nyh(nxe nxeVar, nxe nxeVar2, int i) {
        super(nxeVar, nxeVar2);
        this.b = i;
        b();
    }

    @Override // defpackage.nyr
    public final void b() {
        nxe nxeVar = this.d;
        nxeVar.getClass();
        this.e.getClass();
        this.f.set(nxeVar.t());
        this.j.set(this.d.s());
        this.g.set(this.d.v());
        this.i.set(this.e.u());
        this.j.top = (int) (this.b / 2.0f);
        Rect rect = this.f;
        rect.offsetTo(rect.left, this.j.top);
        Rect rect2 = this.g;
        rect2.offsetTo(rect2.left, this.j.top);
        this.h.set(this.e.r());
        this.j.bottom = this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        return (this.d.t().centerY() - (this.b / 2.0f)) / this.b;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float m() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float n() {
        return 1.0f;
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
