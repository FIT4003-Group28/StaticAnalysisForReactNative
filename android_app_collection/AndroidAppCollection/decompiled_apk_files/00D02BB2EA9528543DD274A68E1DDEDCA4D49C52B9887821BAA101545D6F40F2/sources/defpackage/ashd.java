package defpackage;
/* compiled from: PG */
/* renamed from: ashd  reason: default package */
/* loaded from: classes2.dex */
final class ashd implements crzp<aufb> {
    final /* synthetic */ ashf a;

    public ashd(ashf ashfVar) {
        this.a = ashfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        ashf ashfVar = this.a;
        aufb l = crzmVar.l();
        dbsk.s(l);
        ashfVar.a(l.c);
    }
}
