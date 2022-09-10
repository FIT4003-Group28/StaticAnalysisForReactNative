package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjfh  reason: default package */
/* loaded from: classes3.dex */
public final class bjfh implements crzp<btlu> {
    final /* synthetic */ bjfi a;

    public bjfh(bjfi bjfiVar) {
        this.a = bjfiVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [bjfj, T extends bjfj] */
    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        String h = btlu.h(crzmVar.l());
        if (!dbsd.a(h, this.a.ah)) {
            bjfi bjfiVar = this.a;
            bjfiVar.ah = h;
            bjfiVar.ag = bjfiVar.i();
        }
        cqkf<T> cqkfVar = this.a.af;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.a.ag);
    }
}
