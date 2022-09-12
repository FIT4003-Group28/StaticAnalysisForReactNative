package defpackage;
/* compiled from: PG */
/* renamed from: ddqt  reason: default package */
/* loaded from: classes6.dex */
public final class ddqt extends dsqp<ddqu, ddqt> implements dssk {
    public ddqt() {
        super(ddqu.d);
    }

    public final void a(ddqv ddqvVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddqu ddquVar = (ddqu) this.b;
        ddru bK = ddqvVar.bK();
        ddqu ddquVar2 = ddqu.d;
        bK.getClass();
        ddquVar.b();
        ddquVar.c.add(bK);
    }

    public final void b(ddru ddruVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddqu ddquVar = (ddqu) this.b;
        ddqu ddquVar2 = ddqu.d;
        ddruVar.getClass();
        ddquVar.b();
        ddquVar.c.add(ddruVar);
    }

    public final void c(dtaw dtawVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddqu ddquVar = (ddqu) this.b;
        ddqu ddquVar2 = ddqu.d;
        dtawVar.getClass();
        ddquVar.b = dtawVar;
        ddquVar.a |= 1;
    }
}
