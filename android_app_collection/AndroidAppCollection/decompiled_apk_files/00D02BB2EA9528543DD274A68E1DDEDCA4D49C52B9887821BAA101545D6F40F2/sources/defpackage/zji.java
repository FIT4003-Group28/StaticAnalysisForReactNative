package defpackage;
/* compiled from: PG */
/* renamed from: zji  reason: default package */
/* loaded from: classes7.dex */
final class zji implements zdd {
    final /* synthetic */ zjm a;

    public zji(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // defpackage.zdd
    public final void a(int i, cjqm cjqmVar) {
        if (i < 0 || i >= this.a.c.size()) {
            return;
        }
        dnqh b = yys.b(cjqmVar);
        qbr qbrVar = this.a.a;
        if (qbrVar == null) {
            return;
        }
        bvrj.UI_THREAD.c();
        psf psfVar = (psf) qbrVar;
        psfVar.j();
        synchronized (psfVar.d) {
            ((psf) qbrVar).d.aJ(i);
        }
        psfVar.b.bO(7, b);
    }
}
