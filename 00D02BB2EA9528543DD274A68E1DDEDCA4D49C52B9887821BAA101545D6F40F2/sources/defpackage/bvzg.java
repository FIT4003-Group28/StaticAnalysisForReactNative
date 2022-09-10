package defpackage;
/* compiled from: PG */
/* renamed from: bvzg  reason: default package */
/* loaded from: classes4.dex */
public final class bvzg extends bvwr<baad> {
    private final Runnable a;
    private final dzsj<axwo> b;
    private final bvws c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvzg(gga ggaVar, dzsj<axwo> dzsjVar, bvws bvwsVar) {
        super(baad.class);
        final gn g = ggaVar.g();
        g.getClass();
        Runnable runnable = new Runnable(g) { // from class: bvzf
            private final gn a;

            {
                this.a = g;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        };
        this.a = runnable;
        this.b = dzsjVar;
        this.c = bvwsVar;
    }

    @Override // defpackage.bvwr
    public final /* bridge */ /* synthetic */ void a(baad baadVar) {
        this.a.run();
        this.b.a().i(baadVar);
        this.c.b(dmcx.a, dmcx.b);
    }
}
