package defpackage;
/* compiled from: PG */
/* renamed from: dwbd  reason: default package */
/* loaded from: classes6.dex */
public final class dwbd extends dsqp<dwbk, dwbd> implements dssk {
    public dwbd() {
        super(dwbk.s);
    }

    public final void a(Iterable<? extends dpgs> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwbk dwbkVar = (dwbk) this.b;
        dwbk dwbkVar2 = dwbk.s;
        dwbkVar.c();
        dsod.bv(iterable, dwbkVar.j);
    }

    public final void b(dpgn dpgnVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwbk dwbkVar = (dwbk) this.b;
        dwbk dwbkVar2 = dwbk.s;
        dpgnVar.getClass();
        dwbkVar.e();
        dwbkVar.m.add(dpgnVar);
    }

    public final void c(dpgs dpgsVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwbk dwbkVar = (dwbk) this.b;
        dwbk dwbkVar2 = dwbk.s;
        dpgsVar.getClass();
        dwbkVar.c();
        dwbkVar.j.add(dpgsVar);
    }
}
