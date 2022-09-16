package defpackage;
/* compiled from: PG */
/* renamed from: bzjm  reason: default package */
/* loaded from: classes4.dex */
public final class bzjm extends dsqp<bzjo, bzjm> implements dssk {
    public bzjm() {
        super(bzjo.e);
    }

    public final void a(String str, bzip bzipVar) {
        str.getClass();
        bzipVar.getClass();
        if (this.c) {
            bF();
            this.c = false;
        }
        bzjo bzjoVar = bzjo.e;
        ((bzjo) this.b).b().put(str, bzipVar);
    }

    public final void b(String str) {
        str.getClass();
        if (this.c) {
            bF();
            this.c = false;
        }
        bzjo bzjoVar = bzjo.e;
        ((bzjo) this.b).b().remove(str);
    }
}
