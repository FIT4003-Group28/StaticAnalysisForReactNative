package defpackage;
/* compiled from: PG */
/* renamed from: zhz  reason: default package */
/* loaded from: classes7.dex */
final class zhz implements Runnable {
    final /* synthetic */ amte a;
    final /* synthetic */ zie b;

    public zhz(zie zieVar, amte amteVar) {
        this.b = zieVar;
        this.a = amteVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vml a = this.b.c.a();
        bvjk e = vml.e(a.d(this.a));
        if (e != null) {
            a.e.ao(e);
        }
        this.b.b.run();
    }
}
