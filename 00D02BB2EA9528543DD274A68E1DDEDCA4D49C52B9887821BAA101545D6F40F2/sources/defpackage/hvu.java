package defpackage;
/* compiled from: PG */
/* renamed from: hvu  reason: default package */
/* loaded from: classes.dex */
final class hvu implements crzp<Boolean> {
    final /* synthetic */ hvw a;

    public hvu(hvw hvwVar) {
        this.a = hvwVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        bvrj.UI_THREAD.c();
        this.a.a.a().aj().ap(crzmVar.l().booleanValue());
    }
}
