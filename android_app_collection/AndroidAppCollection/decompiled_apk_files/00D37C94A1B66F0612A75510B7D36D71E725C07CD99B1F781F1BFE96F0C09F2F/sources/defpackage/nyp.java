package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyp  reason: default package */
/* loaded from: classes3.dex */
public final class nyp extends nyr {
    public nyp(nxe nxeVar) {
        super(null, nxeVar);
        b();
    }

    @Override // defpackage.nyr
    public final void b() {
        nxe nxeVar = this.e;
        nxeVar.getClass();
        this.g.set(nxeVar.v());
        this.f.set(this.e.t());
        this.h.set(this.e.r());
        this.i.set(this.e.u());
        this.j.set(this.e.s());
        int height = this.h.height() + this.f.height();
        this.f.offset(0, height);
        this.g.offset(0, height);
        this.h.offset(0, height);
        this.i.offset(0, height);
        this.j.offset(0, height);
    }
}
