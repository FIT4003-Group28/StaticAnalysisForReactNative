package defpackage;
/* compiled from: PG */
/* renamed from: duna  reason: default package */
/* loaded from: classes6.dex */
public final class duna extends dsqp<dunb, duna> implements dssk {
    public duna() {
        super(dunb.f);
    }

    public final void a(Iterable<? extends dvgo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dunb dunbVar = (dunb) this.b;
        dunb dunbVar2 = dunb.f;
        dsrj<dvgo> dsrjVar = dunbVar.b;
        if (!dsrjVar.a()) {
            dunbVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dunbVar.b);
    }
}
