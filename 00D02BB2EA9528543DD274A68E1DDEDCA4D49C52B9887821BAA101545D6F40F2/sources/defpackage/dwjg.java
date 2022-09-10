package defpackage;
/* compiled from: PG */
/* renamed from: dwjg  reason: default package */
/* loaded from: classes6.dex */
public final class dwjg extends dsqp<dwjh, dwjg> implements dssk {
    public dwjg() {
        super(dwjh.c);
    }

    public final void a(Iterable<? extends dwjj> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwjh dwjhVar = (dwjh) this.b;
        dwjh dwjhVar2 = dwjh.c;
        dsrj<dwjj> dsrjVar = dwjhVar.a;
        if (!dsrjVar.a()) {
            dwjhVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dwjhVar.a);
    }
}
