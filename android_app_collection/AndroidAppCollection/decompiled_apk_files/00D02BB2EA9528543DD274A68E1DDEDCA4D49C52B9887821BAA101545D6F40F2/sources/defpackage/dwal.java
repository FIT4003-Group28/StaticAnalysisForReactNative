package defpackage;
/* compiled from: PG */
/* renamed from: dwal  reason: default package */
/* loaded from: classes.dex */
public final class dwal extends dsqp<dwao, dwal> implements dssk {
    public dwal() {
        super(dwao.R);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwao dwaoVar = (dwao) this.b;
        dwao dwaoVar2 = dwao.R;
        dsrf dsrfVar = dwaoVar.r;
        if (!dsrfVar.a()) {
            dwaoVar.r = dsqw.cg(dsrfVar);
        }
        dsod.bv(iterable, dwaoVar.r);
    }
}
