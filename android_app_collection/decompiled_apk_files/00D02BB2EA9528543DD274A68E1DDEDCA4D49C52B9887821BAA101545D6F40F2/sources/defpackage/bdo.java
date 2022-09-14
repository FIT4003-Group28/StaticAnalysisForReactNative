package defpackage;
/* compiled from: PG */
/* renamed from: bdo  reason: default package */
/* loaded from: classes3.dex */
final class bdo implements Runnable {
    final /* synthetic */ bid a;
    final /* synthetic */ bdr b;

    public bdo(bdr bdrVar, bid bidVar) {
        this.b = bdrVar;
        this.a = bidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bbz e = bbz.e();
            int i = bdr.h;
            String str = this.b.b.b;
            e.a(new Throwable[0]);
            bdr bdrVar = this.b;
            bdrVar.f = bdrVar.c.c();
            this.a.h((dehn) this.b.f);
        } catch (Throwable th) {
            this.a.g(th);
        }
    }
}
