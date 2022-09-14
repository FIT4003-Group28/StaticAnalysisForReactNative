package defpackage;
/* compiled from: PG */
/* renamed from: ddgp  reason: default package */
/* loaded from: classes5.dex */
public final class ddgp extends dsqp<ddgr, ddgp> implements dssk {
    public ddgp() {
        super(ddgr.d);
    }

    public final void a(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddgr ddgrVar = (ddgr) this.b;
        ddgr ddgrVar2 = ddgr.d;
        str.getClass();
        ddgrVar.b();
        ddgrVar.b.add(str);
    }

    public final void b(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddgr ddgrVar = (ddgr) this.b;
        ddgr ddgrVar2 = ddgr.d;
        ddgrVar.b();
        dsod.bv(iterable, ddgrVar.b);
    }
}
