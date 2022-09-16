package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyg  reason: default package */
/* loaded from: classes3.dex */
public final class nyg extends nyr {
    public nyg(nyf nyfVar, nxe nxeVar) {
        super(nyfVar, nxeVar);
        b();
    }

    @Override // defpackage.nyr
    public final void b() {
        this.d.getClass();
        nxe nxeVar = this.e;
        nxeVar.getClass();
        Rect v = nxeVar.v();
        Rect t = this.d.t();
        Rect t2 = this.e.t();
        Rect s = this.d.s();
        Rect r = this.e.r();
        ezv.o(this.f, t, t2, 0.2352941f);
        ezv.o(this.j, s, r, 0.2352941f);
        this.j.top = this.f.bottom;
        this.h.set(this.j);
        etk.l(v.width() / v.height(), this.f, this.g);
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
        return 0.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float p() {
        return 1.0f;
    }
}
