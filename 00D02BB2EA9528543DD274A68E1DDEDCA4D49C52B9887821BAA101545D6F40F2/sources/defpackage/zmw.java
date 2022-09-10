package defpackage;
/* compiled from: PG */
/* renamed from: zmw  reason: default package */
/* loaded from: classes7.dex */
public class zmw implements zdc {
    private final zdb a;
    private boolean b;

    public zmw(zdb zdbVar, boolean z, boolean z2) {
        this.a = zdbVar;
        this.b = z2;
    }

    @Override // defpackage.zdc
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.zdc
    public cqkl b(cjqm cjqmVar) {
        boolean y;
        zjk zjkVar = (zjk) this.a;
        zjm zjmVar = zjkVar.a;
        dnqh b = yys.b(cjqmVar);
        qbr qbrVar = zjkVar.a.a;
        if (qbrVar != null) {
            bvrj.UI_THREAD.c();
            psf psfVar = (psf) qbrVar;
            psfVar.j();
            synchronized (psfVar.d) {
                ((psf) qbrVar).d.aI();
                ((psf) qbrVar).d.L(((psf) qbrVar).a);
                y = ((psf) qbrVar).d.y();
            }
            psfVar.i();
            psfVar.b.bO(true != y ? 3 : 2, b);
        }
        return cqkl.a;
    }

    public void c(boolean z, boolean z2) {
        this.b = z2;
    }
}
