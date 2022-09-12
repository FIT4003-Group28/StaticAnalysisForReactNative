package defpackage;
/* compiled from: PG */
/* renamed from: ajkr  reason: default package */
/* loaded from: classes2.dex */
final class ajkr implements aila {
    final /* synthetic */ ajku a;

    public ajkr(ajku ajkuVar) {
        this.a = ajkuVar;
    }

    @Override // defpackage.aila
    public final void b(dbsg<btlu> dbsgVar) {
        final ajku ajkuVar = this.a;
        final deig d = deig.d();
        ajkuVar.e.b(new Runnable(ajkuVar, d) { // from class: ajko
            private final ajku a;
            private final deig b;

            {
                this.a = ajkuVar;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajku ajkuVar2 = this.a;
                deig deigVar = this.b;
                ajkuVar2.d(ajkuVar2.g.g());
                deigVar.j(null);
            }
        }, bvrj.UI_THREAD);
        bvqd.a(d, this.a.e.h());
    }
}
