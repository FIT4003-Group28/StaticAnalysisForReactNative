package defpackage;
/* compiled from: PG */
/* renamed from: vsh  reason: default package */
/* loaded from: classes7.dex */
final class vsh implements crzp<aufb> {
    final /* synthetic */ vsk a;

    public vsh(vsk vskVar) {
        this.a = vskVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        vtf vtfVar;
        aufb l = crzmVar.l();
        dbsk.s(l);
        synchronized (this.a.e) {
            vsk vskVar = this.a;
            boolean z = vskVar.i;
            boolean z2 = l.c;
            if (z != z2 && (vtfVar = vskVar.f) != null) {
                vtfVar.c(z2);
            }
            this.a.i = l.c;
        }
    }
}
