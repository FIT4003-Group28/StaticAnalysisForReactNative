package defpackage;
/* compiled from: PG */
/* renamed from: zjl  reason: default package */
/* loaded from: classes7.dex */
final class zjl implements zde {
    final /* synthetic */ zjm a;

    public zjl(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // defpackage.zde
    public final void a(int i) {
        zjm zjmVar = this.a;
        if (zjmVar.a != null && i >= 0 && i < zjmVar.c.size()) {
            psf psfVar = (psf) this.a.a;
            psfVar.c.a(ckls.DIRECTIONS_WAYPOINT_CLICKED);
            psfVar.a(i);
        }
    }
}
