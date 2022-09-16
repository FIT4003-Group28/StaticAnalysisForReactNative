package defpackage;
/* compiled from: PG */
/* renamed from: chud  reason: default package */
/* loaded from: classes4.dex */
public final class chud extends dsqp<chuu, chud> implements dssk {
    public chud() {
        super(chuu.l);
    }

    public final void a(Iterable<? extends drrv> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chuu chuuVar = (chuu) this.b;
        chuu chuuVar2 = chuu.l;
        dsrj<drrv> dsrjVar = chuuVar.e;
        if (!dsrjVar.a()) {
            chuuVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, chuuVar.e);
    }
}
