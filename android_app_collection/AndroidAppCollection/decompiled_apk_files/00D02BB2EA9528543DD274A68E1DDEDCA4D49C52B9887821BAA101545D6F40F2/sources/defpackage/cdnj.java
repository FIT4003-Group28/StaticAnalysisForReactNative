package defpackage;
/* compiled from: PG */
/* renamed from: cdnj  reason: default package */
/* loaded from: classes4.dex */
final class cdnj implements bqlb {
    final /* synthetic */ mw a;
    final /* synthetic */ Runnable b;

    public cdnj(mw mwVar, Runnable runnable) {
        this.a = mwVar;
        this.b = runnable;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        mw mwVar = this.a;
        ilo c = bqlfVar.a().c();
        dbsk.s(c);
        mwVar.a(c);
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.b.run();
    }
}
