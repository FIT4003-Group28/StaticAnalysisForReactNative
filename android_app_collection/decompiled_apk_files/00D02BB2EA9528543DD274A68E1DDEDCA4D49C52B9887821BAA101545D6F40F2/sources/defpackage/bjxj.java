package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjxj  reason: default package */
/* loaded from: classes3.dex */
public final class bjxj implements btzi<djaa, djae> {
    final /* synthetic */ bjxl a;

    public bjxj(bjxl bjxlVar) {
        this.a = bjxlVar;
    }

    private final void c() {
        this.a.b.b(new Runnable(this) { // from class: bjxi
            private final bjxj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.run();
            }
        });
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djaa> btzrVar, btzy btzyVar) {
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djaa> btzrVar, djae djaeVar) {
        int a = djad.a(djaeVar.b);
        if (a == 0 || a != 2) {
            c();
            return;
        }
        this.a.a.b(new bjfg());
        this.a.a.b(new bjfa(3, 2));
    }
}
