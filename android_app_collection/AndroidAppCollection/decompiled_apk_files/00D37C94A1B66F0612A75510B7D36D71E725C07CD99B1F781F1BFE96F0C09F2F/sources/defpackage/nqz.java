package defpackage;
/* compiled from: PG */
/* renamed from: nqz  reason: default package */
/* loaded from: classes3.dex */
public final class nqz implements nqj {
    public final axnm a;
    public final ayos b;
    public final ayos c;
    public final aypf d = new aypf();
    public nqy e;
    public nqy f;
    private final nqr g;
    private final axnm h;
    private nmc i;

    public nqz(axnm axnmVar, axnm axnmVar2, nqr nqrVar, ayos ayosVar, ayos ayosVar2) {
        this.g = nqrVar;
        this.h = axnmVar2;
        this.a = axnmVar;
        this.b = ayosVar;
        this.c = ayosVar2;
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        nqy nqyVar = this.g.b == nqq.LANDSCAPE_PLAYER_OVERLAY ? this.f : this.e;
        if (nqyVar != null) {
            nmc nmcVar2 = this.i;
            nnw nnwVar = (nnw) this.h.get();
            if (nmcVar == null && nmcVar2 != null) {
                nqyVar.w(false, nnwVar.a(nmcVar2));
            } else if (nmcVar != null && nmcVar2 == null) {
                nqyVar.w(true, nnwVar.a(nmcVar));
            }
        }
        this.i = nmcVar;
    }
}
