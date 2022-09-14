package defpackage;
/* compiled from: PG */
/* renamed from: hvt  reason: default package */
/* loaded from: classes.dex */
final class hvt implements crzp<aufb> {
    final /* synthetic */ hvw a;

    public hvt(hvw hvwVar) {
        this.a = hvwVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        aufb l = crzmVar.l();
        dbsk.s(l);
        this.a.a.a().ai(l.c);
    }
}
