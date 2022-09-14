package defpackage;
/* compiled from: PG */
/* renamed from: cbty  reason: default package */
/* loaded from: classes4.dex */
public final class cbty extends dsqp<cbtz, cbty> implements dssk {
    public cbty() {
        super(cbtz.f);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cbtz cbtzVar = (cbtz) this.b;
        cbtz cbtzVar2 = cbtz.f;
        dsrj<String> dsrjVar = cbtzVar.c;
        if (!dsrjVar.a()) {
            cbtzVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cbtzVar.c);
    }
}
