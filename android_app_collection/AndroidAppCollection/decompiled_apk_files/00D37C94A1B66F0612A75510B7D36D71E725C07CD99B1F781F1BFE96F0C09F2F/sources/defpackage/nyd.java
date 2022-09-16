package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyd  reason: default package */
/* loaded from: classes3.dex */
public final class nyd extends nyr {
    private final Context b;
    private final int c;
    private int k;

    public nyd(Context context, int i, nxe nxeVar, nxe nxeVar2) {
        super(nxeVar, nxeVar2);
        this.b = context;
        this.c = i;
        b();
    }

    @Override // defpackage.nyr
    public final void b() {
        nxe nxeVar = this.d;
        nxeVar.getClass();
        this.b.getClass();
        this.g.set(nxeVar.v());
        this.f.set(this.d.t());
        this.h.set(this.d.r());
        this.j.set(this.d.s());
        int i = this.c;
        int i2 = (i == 16 || i == 8) ? this.k - this.j.top : 0;
        this.g.offset(0, i2);
        this.f.offset(0, i2);
        this.h.offset(0, i2);
        this.j.offset(0, i2);
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final void z(int i, int i2) {
        this.k = i2;
        b();
    }
}
