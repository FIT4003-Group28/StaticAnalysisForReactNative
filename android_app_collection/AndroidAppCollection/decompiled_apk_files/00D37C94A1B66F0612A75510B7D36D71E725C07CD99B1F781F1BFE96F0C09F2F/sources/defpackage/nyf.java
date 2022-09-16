package defpackage;

import android.graphics.Rect;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyf  reason: default package */
/* loaded from: classes3.dex */
public final class nyf extends nyr {
    private final afy b;

    public nyf(nxe nxeVar, nxe nxeVar2) {
        super(nxeVar, nxeVar2);
        this.b = new afy();
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void K(nxd nxdVar) {
        this.b.add(nxdVar);
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void L(nxd nxdVar) {
        this.b.remove(nxdVar);
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
        this.j.set(s);
        Rect rect = this.j;
        rect.top = rect.bottom - ezv.j(t.bottom - t.top, t2.bottom - t2.top, 0.22500001f);
        this.h.set(r.left, this.j.top, r.right, this.j.top + r.height());
        this.f.set(this.j);
        etk.l(v.width() / v.height(), this.f, this.g);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nxd) it.next()).ph(this);
        }
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
        return 0.0f;
    }
}
