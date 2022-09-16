package defpackage;
/* compiled from: PG */
/* renamed from: bqwy  reason: default package */
/* loaded from: classes4.dex */
final class bqwy implements bqlb {
    public final bqla a;
    public final bwrs<ilo> b;
    final /* synthetic */ bqxf c;

    public bqwy(bqxf bqxfVar, bwrs<ilo> bwrsVar, bqkx bqkxVar) {
        this.c = bqxfVar;
        bqku c = bqla.c();
        c.b(bqkxVar);
        c.c(bqxfVar.aR().a());
        this.a = c.d();
        this.b = bwrsVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        this.c.ax.G().h(bqlfVar.b());
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.c.aU(new Runnable(this) { // from class: bqwx
            private final bqwy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.ax.G().g(bqtz.SAVING_FAILED);
            }
        });
    }
}
