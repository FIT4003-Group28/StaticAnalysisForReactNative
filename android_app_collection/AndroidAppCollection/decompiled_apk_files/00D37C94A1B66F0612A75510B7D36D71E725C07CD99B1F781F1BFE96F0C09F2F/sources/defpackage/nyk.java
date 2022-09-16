package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyk  reason: default package */
/* loaded from: classes3.dex */
public final class nyk extends nyr {
    public nyk(nxe nxeVar, nxe nxeVar2) {
        super(nxeVar, nxeVar2);
        b();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final ampq I() {
        return ampq.j(-16777216);
    }

    @Override // defpackage.nyr
    public final void b() {
        this.d.getClass();
        nxe nxeVar = this.e;
        nxeVar.getClass();
        this.g.set(nxeVar.v());
        this.f.set(this.e.t());
        this.h.set(this.d.r());
        this.i.set(this.d.u());
        this.j.set(this.d.s());
        this.h.offset(0, this.f.bottom - this.h.top);
        this.j.offset(0, this.f.bottom - this.j.top);
        this.i.offset(0, this.f.bottom - this.i.top);
        if (this.d.q() > 0.0f) {
            this.h.set(this.d.r());
            this.h.offset(this.d.u().width(), 0);
        }
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float l() {
        return this.d.l();
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.nyn, defpackage.nxe
    public final float q() {
        return this.d.q();
    }
}
