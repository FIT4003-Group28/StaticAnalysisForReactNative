package defpackage;
/* compiled from: PG */
/* renamed from: dluz  reason: default package */
/* loaded from: classes6.dex */
public final class dluz extends dsqp<dlva, dluz> implements dssk {
    public dluz() {
        super(dlva.d);
    }

    public final void a(Iterable<? extends dspd> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dlva dlvaVar = (dlva) this.b;
        dlva dlvaVar2 = dlva.d;
        dlvaVar.b();
        dsod.bv(iterable, dlvaVar.c);
    }

    public final void b(dspd dspdVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dlva dlvaVar = (dlva) this.b;
        dlva dlvaVar2 = dlva.d;
        dspdVar.getClass();
        dlvaVar.b();
        dlvaVar.c.add(dspdVar);
    }
}
