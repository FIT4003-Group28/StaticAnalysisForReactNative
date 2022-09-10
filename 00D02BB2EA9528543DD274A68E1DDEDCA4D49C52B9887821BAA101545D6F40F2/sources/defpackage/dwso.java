package defpackage;
/* compiled from: PG */
/* renamed from: dwso  reason: default package */
/* loaded from: classes6.dex */
public final class dwso extends dsqp<dwsr, dwso> implements dssk {
    public dwso() {
        super(dwsr.g);
    }

    public final void a(Iterable<? extends dwqg> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwsr dwsrVar = (dwsr) this.b;
        dwsr dwsrVar2 = dwsr.g;
        dwsrVar.c();
        dsod.bv(iterable, dwsrVar.e);
    }

    public final void b(Iterable<? extends dwrc> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwsr dwsrVar = (dwsr) this.b;
        dwsr dwsrVar2 = dwsr.g;
        dsrj<dwrc> dsrjVar = dwsrVar.b;
        if (!dsrjVar.a()) {
            dwsrVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dwsrVar.b);
    }

    public final void c(dwqg dwqgVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwsr dwsrVar = (dwsr) this.b;
        dwsr dwsrVar2 = dwsr.g;
        dwqgVar.getClass();
        dwsrVar.c();
        dwsrVar.e.add(dwqgVar);
    }
}
