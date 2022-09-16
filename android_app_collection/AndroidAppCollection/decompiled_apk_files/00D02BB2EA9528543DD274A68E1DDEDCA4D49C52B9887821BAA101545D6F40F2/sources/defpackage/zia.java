package defpackage;
/* compiled from: PG */
/* renamed from: zia  reason: default package */
/* loaded from: classes7.dex */
final class zia implements Runnable {
    final /* synthetic */ amte a;
    final /* synthetic */ zie b;

    public zia(zie zieVar, amte amteVar) {
        this.b = zieVar;
        this.a = amteVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vml a = this.b.c.a();
        amte amteVar = this.a;
        akrk c = a.c(amteVar);
        if (c != null) {
            akrp a2 = c.a();
            if (vml.a(a2)) {
                bvjk e = vml.e(a.d(amteVar));
                if (e != null) {
                    a.e.W(e, 0);
                }
                String a3 = amvj.a(a.a, amteVar.a.h(amteVar.a.i() - 1));
                avzl b = a.h.b(akqg.d(aksj.c(a2).l(1.1d, 1.1d)));
                a.c.b(b.d(), b.a, a3, false, new vmj(a));
            }
        }
        this.b.b.run();
    }
}
