package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyr  reason: default package */
/* loaded from: classes3.dex */
public abstract class nyr extends nyn implements nxe, nxd {
    final nxe d;
    final nxe e;
    protected final Rect f;
    protected final Rect g;
    protected final Rect h;
    final Rect i;
    final Rect j;

    public nyr(nxe nxeVar, nxe nxeVar2) {
        super(nxeVar2);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.d = nxeVar;
        this.e = nxeVar2;
    }

    public abstract void b();

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final Rect r() {
        return this.h;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final Rect s() {
        return this.j;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final Rect t() {
        return this.f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final Rect u() {
        return this.i;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final Rect v() {
        return this.g;
    }
}
