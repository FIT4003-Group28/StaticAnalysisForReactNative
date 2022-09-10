package defpackage;
/* compiled from: PG */
/* renamed from: cdni  reason: default package */
/* loaded from: classes4.dex */
final class cdni implements bqlb {
    final /* synthetic */ mw a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ cdnk c;

    public cdni(cdnk cdnkVar, mw mwVar, Runnable runnable) {
        this.c = cdnkVar;
        this.a = mwVar;
        this.b = runnable;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        mw mwVar = this.a;
        ilo c = bqlfVar.a().c();
        dbsk.s(c);
        mwVar.a(c);
        this.c.a.b(bqlfVar);
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.b.run();
    }
}
