package defpackage;
/* compiled from: PG */
/* renamed from: zpn  reason: default package */
/* loaded from: classes7.dex */
final class zpn implements Runnable {
    final /* synthetic */ dqvj a;
    final /* synthetic */ zpo b;

    public zpn(zpo zpoVar, dqvj dqvjVar) {
        this.b = zpoVar;
        this.a = dqvjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.e == this.a) {
            dnqh b = yys.b(cjqm.a);
            zpp zppVar = this.b.a;
            qbr qbrVar = zppVar.c;
            if (qbrVar == null) {
                return;
            }
            ((psf) qbrVar).k(zppVar.e, b, 2);
        }
    }
}
