package defpackage;
/* compiled from: PG */
/* renamed from: ddkw  reason: default package */
/* loaded from: classes5.dex */
public final class ddkw extends dsqp<ddkx, ddkw> implements dssk {
    public ddkw() {
        super(ddkx.e);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddkx ddkxVar = (ddkx) this.b;
        ddkx ddkxVar2 = ddkx.e;
        dsrf dsrfVar = ddkxVar.c;
        if (!dsrfVar.a()) {
            ddkxVar.c = dsqw.cg(dsrfVar);
        }
        dsod.bv(iterable, ddkxVar.c);
    }
}
