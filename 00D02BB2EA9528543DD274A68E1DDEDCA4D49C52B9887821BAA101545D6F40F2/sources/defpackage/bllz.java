package defpackage;
/* compiled from: PG */
/* renamed from: bllz  reason: default package */
/* loaded from: classes3.dex */
public final class bllz<T> extends btrh<T> {
    public bllz(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bllw bllwVar = (bllw) this.a;
        bqje bqjeVar = (bqje) obj;
        bwrs<ilo> bwrsVar = bqjeVar.a;
        if (bwrsVar == null) {
            return;
        }
        ilo c = bllwVar.a.b.c();
        ilo c2 = bwrsVar.c();
        if (c == null || c2 == null || bllwVar.a.b == bwrsVar || bqjeVar.c != 1 || !c.ai().equals(c2.ai())) {
            return;
        }
        c.bt(c2.bq());
        bllwVar.a.b.d(c);
    }
}
