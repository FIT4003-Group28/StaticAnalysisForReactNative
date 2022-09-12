package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aloa  reason: default package */
/* loaded from: classes.dex */
public final class aloa implements aktt {
    final /* synthetic */ alob a;

    public aloa(alob alobVar) {
        this.a = alobVar;
    }

    @Override // defpackage.aktt
    public final void a(akzh akzhVar, alne alneVar) {
        synchronized (this.a.a) {
            this.a.c.clear();
            alob alobVar = this.a;
            alobVar.c.addAll(alobVar.b);
            this.a.b.clear();
        }
        for (Runnable runnable : this.a.c) {
            runnable.run();
        }
    }
}
