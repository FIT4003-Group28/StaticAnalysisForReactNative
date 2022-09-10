package defpackage;
/* compiled from: PG */
/* renamed from: dwfi  reason: default package */
/* loaded from: classes6.dex */
public final class dwfi extends dsqp<dwfl, dwfi> implements dssk {
    public dwfi() {
        super(dwfl.w);
    }

    public final void a(Iterable<? extends dwfa> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwfl dwflVar = (dwfl) this.b;
        dwfl dwflVar2 = dwfl.w;
        dsrj<dwfa> dsrjVar = dwflVar.r;
        if (!dsrjVar.a()) {
            dwflVar.r = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dwflVar.r);
    }
}
