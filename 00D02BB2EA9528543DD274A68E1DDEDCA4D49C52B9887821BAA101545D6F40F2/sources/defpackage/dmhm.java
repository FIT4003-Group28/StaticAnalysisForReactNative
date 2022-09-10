package defpackage;
/* compiled from: PG */
/* renamed from: dmhm  reason: default package */
/* loaded from: classes6.dex */
public final class dmhm extends dsqp<dmhn, dmhm> implements dssk {
    public dmhm() {
        super(dmhn.b);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmhn dmhnVar = (dmhn) this.b;
        dmhn dmhnVar2 = dmhn.b;
        dsrj<String> dsrjVar = dmhnVar.a;
        if (!dsrjVar.a()) {
            dmhnVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dmhnVar.a);
    }
}
