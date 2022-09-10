package defpackage;
/* compiled from: PG */
/* renamed from: chqv  reason: default package */
/* loaded from: classes4.dex */
final class chqv implements bqlb {
    final /* synthetic */ chra a;

    public chqv(chra chraVar) {
        this.a = chraVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        bvrj.UI_THREAD.c();
        dcqe dcqeVar = chra.a;
    }

    @Override // defpackage.bqlb
    public final void e() {
        bvrj.UI_THREAD.c();
        dcqe dcqeVar = chra.a;
        chra chraVar = this.a;
        cjxu.l(chraVar.e, chraVar.g.H(), "Failed to delete rating");
    }
}
