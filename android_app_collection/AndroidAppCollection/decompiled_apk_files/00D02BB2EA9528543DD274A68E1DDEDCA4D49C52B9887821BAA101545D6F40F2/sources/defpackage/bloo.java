package defpackage;
/* compiled from: PG */
/* renamed from: bloo  reason: default package */
/* loaded from: classes3.dex */
public final class bloo<T> extends btrh<T> {
    private final int d;

    public bloo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        docg docgVar = null;
        if (this.d != 0) {
            blom blomVar = (blom) this.a;
            cdjh cdjhVar = (cdjh) obj;
            int d = cdjhVar.d();
            int i = d - 1;
            if (d == 0) {
                throw null;
            }
            if (i != 0 && i != 1 && i != 2) {
                return;
            }
            blomVar.a(cdjhVar.a());
            return;
        }
        blom blomVar2 = (blom) this.a;
        bqje bqjeVar = (bqje) obj;
        bwrs<ilo> bwrsVar = blomVar2.a.h;
        if (bwrsVar == null) {
            return;
        }
        ilo c = bwrsVar.c();
        ilo c2 = bqjeVar.a.c();
        if (c == null || c2 == null || !c.ai().equals(c2.ai()) || bqjeVar.c == 5) {
            return;
        }
        if (c != c2) {
            if (c2.bp()) {
                docgVar = c2.bq();
            }
            c.bt(docgVar);
            blomVar2.a.h.d(c);
        }
        blomVar2.a(blomVar2.a.h);
    }
}
