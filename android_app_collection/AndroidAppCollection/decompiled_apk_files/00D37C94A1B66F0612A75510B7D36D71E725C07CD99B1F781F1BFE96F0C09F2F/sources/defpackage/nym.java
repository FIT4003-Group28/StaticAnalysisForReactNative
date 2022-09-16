package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nym  reason: default package */
/* loaded from: classes3.dex */
public final class nym extends nyr {
    private final Rect b;
    private boolean c;

    public nym(nxe nxeVar) {
        super(null, nxeVar);
        this.b = new Rect();
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final ampq I() {
        return ampq.j(-16777216);
    }

    @Override // defpackage.nyr
    public final void b() {
        int i;
        nxe nxeVar = this.e;
        nxeVar.getClass();
        this.h.set(nxeVar.r());
        this.i.set(this.e.u());
        this.g.set(this.e.v());
        this.f.set(this.e.t());
        this.j.set(this.e.s());
        this.g.offset(0, this.b.top);
        if (!this.c) {
            i = this.b.top;
            this.f.top += i;
        } else {
            int i2 = this.b.top;
            i = i2 + i2;
        }
        this.f.bottom += i;
        this.h.offset(0, i);
        this.i.offset(0, i);
    }

    public final void c(zaw zawVar) {
        boolean z = this.c;
        this.c = zawVar.a.b.d() > 0;
        if (!this.b.equals(zawVar.a.a) || this.c != z) {
            this.b.set(zawVar.a.a);
            b();
        }
    }
}
