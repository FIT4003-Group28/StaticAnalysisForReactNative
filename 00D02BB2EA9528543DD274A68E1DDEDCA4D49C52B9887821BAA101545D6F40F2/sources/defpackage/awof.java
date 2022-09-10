package defpackage;
/* compiled from: PG */
/* renamed from: awof  reason: default package */
/* loaded from: classes3.dex */
final class awof implements crzp<aufb> {
    final /* synthetic */ awoi a;

    public awof(awoi awoiVar) {
        this.a = awoiVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        synchronized (this.a.d) {
            aufb l = crzmVar.l();
            dbsk.s(l);
            awoi awoiVar = this.a;
            boolean z = awoiVar.j;
            boolean z2 = l.c;
            if (z != z2) {
                awoiVar.j = z2;
                arcg arcgVar = awoiVar.e;
                arcf arcfVar = arcgVar.b;
                arcfVar.b = z2;
                arcfVar.a.b(arcgVar.d, arcfVar.a());
                arcf arcfVar2 = arcgVar.b;
                arcfVar2.a.b(arcgVar.e, arcfVar2.b());
            }
        }
    }
}
