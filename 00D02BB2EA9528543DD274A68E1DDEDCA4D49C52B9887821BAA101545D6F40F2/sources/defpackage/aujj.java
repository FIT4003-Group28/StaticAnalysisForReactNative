package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aujj  reason: default package */
/* loaded from: classes.dex */
public final class aujj implements crzp<btvo> {
    final /* synthetic */ aujl a;

    public aujj(aujl aujlVar) {
        this.a = aujlVar;
    }

    @Override // defpackage.crzp
    public final synchronized void On(crzm<btvo> crzmVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        btvo l = crzmVar.l();
        if (l != null) {
            final aujk aujkVar = new aujk(l, this.a.a.a());
            this.a.d = new dbty(aujkVar) { // from class: auji
                private final aujn a;

                {
                    this.a = aujkVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a;
                }
            };
            this.a.b.a.a(aujkVar);
        }
    }
}
