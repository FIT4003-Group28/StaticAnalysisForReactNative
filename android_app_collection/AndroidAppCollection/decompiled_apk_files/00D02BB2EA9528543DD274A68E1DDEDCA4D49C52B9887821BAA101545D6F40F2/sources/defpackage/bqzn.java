package defpackage;
/* compiled from: PG */
/* renamed from: bqzn  reason: default package */
/* loaded from: classes4.dex */
public final class bqzn<T> extends btrh<T> {
    private final int d;

    public bqzn(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bsno bsnoVar = (bsno) obj;
            bqzm bqzmVar = ((bqzl) this.a).a;
            if (!bqzmVar.aD) {
                return;
            }
            bqzmVar.bs.e(bsnoVar.a());
            return;
        }
        bqzl bqzlVar = (bqzl) this.a;
        azre azreVar = (azre) obj;
        bqzm bqzmVar2 = bqzlVar.a;
        if (!bqzmVar2.aD) {
            return;
        }
        brlu q = bqzmVar2.q();
        if (q.ah()) {
            return;
        }
        bqzlVar.a.w(q);
    }
}
