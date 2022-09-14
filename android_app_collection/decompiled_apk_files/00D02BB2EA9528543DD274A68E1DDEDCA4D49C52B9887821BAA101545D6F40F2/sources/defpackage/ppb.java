package defpackage;
/* compiled from: PG */
/* renamed from: ppb  reason: default package */
/* loaded from: classes7.dex */
final class ppb implements Runnable {
    final /* synthetic */ dvdy a;
    final /* synthetic */ gdf b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ ppd d;

    public ppb(ppd ppdVar, dvdy dvdyVar, gdf gdfVar, Runnable runnable) {
        this.d = ppdVar;
        this.a = dvdyVar;
        this.b = gdfVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.W(bvjk.jm, this.a.b);
        if (this.d.d.a()) {
            this.d.a.ac(bvjk.jn, this.d.d.b());
        }
        this.b.dismiss();
        this.c.run();
    }
}
