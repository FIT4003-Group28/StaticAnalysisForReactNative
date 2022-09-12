package defpackage;
/* compiled from: PG */
/* renamed from: bwiu  reason: default package */
/* loaded from: classes4.dex */
public final class bwiu<T> extends btrh<T> {
    private final int d;

    public bwiu(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((bwis) this.a).a.i(((amqo) obj).a());
            return;
        }
        bwis bwisVar = (bwis) this.a;
        gds gdsVar = (gds) obj;
        try {
            if (!dbsd.a(bwisVar.a.b.P(), gdsVar.a.t())) {
                bwisVar.a.b.O(gdsVar.a.t());
                bwisVar.a.c();
                return;
            }
            bwisVar.a.j();
        } catch (RuntimeException e) {
            bvoo.j(e);
            throw e;
        }
    }
}
