package defpackage;
/* compiled from: PG */
/* renamed from: ailw  reason: default package */
/* loaded from: classes.dex */
public final class ailw implements aimx {
    private final aiji a;
    private final aikh b;

    public ailw(aiji aijiVar, aikh aikhVar) {
        aijiVar.getClass();
        this.a = aijiVar;
        aikhVar.getClass();
        this.b = aikhVar;
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        if (this.a.g() == aijs.REMOTE) {
            ainaVar.M = ahfo.c(5) | ahfo.c(2);
            ainaVar.N = aijr.a(5) | aijr.a(2);
        } else {
            ainaVar.M = this.a.f().a;
            ainaVar.N = this.a.r() ? aijr.a(5) : aijr.a(1);
        }
        ainaVar.O = this.a.h().c;
        ainaVar.u(this.a.g().i);
        synchronized (this.b) {
            if (this.b.j()) {
                ainaVar.G = this.b.i();
                ainaVar.F = this.b.a();
                ainaVar.H = this.b.b().f;
                ainaVar.f51J = this.b.k();
            }
        }
    }
}
