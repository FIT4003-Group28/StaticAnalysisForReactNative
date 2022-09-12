package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dcef  reason: default package */
/* loaded from: classes5.dex */
public final class dcef<E> extends dccq<E> {
    dcls<E> a;
    boolean b;

    public dcef() {
        this(4);
    }

    public final dcei<E> a() {
        dcls<E> dclsVar = this.a;
        if (dclsVar.c == 0) {
            return dcmq.a;
        }
        this.b = true;
        return new dcmq(dclsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dccq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        f(obj, 1);
    }

    public final void c(Iterable<? extends E> iterable) {
        dcls<E> dclsVar;
        if (iterable instanceof dclb) {
            dclb dclbVar = (dclb) iterable;
            if (dclbVar instanceof dcmq) {
                dclsVar = ((dcmq) dclbVar).b;
            } else {
                dclsVar = dclbVar instanceof dbyi ? ((dbyi) dclbVar).a : null;
            }
            if (dclsVar != null) {
                dcls<E> dclsVar2 = this.a;
                dclsVar2.g(Math.max(dclsVar2.c, dclsVar.c));
                for (int a = dclsVar.a(); a >= 0; a = dclsVar.b(a)) {
                    f(dclsVar.c(a), dclsVar.d(a));
                }
                return;
            }
            Set<dcla<E>> l = dclbVar.l();
            dcls<E> dclsVar3 = this.a;
            dclsVar3.g(Math.max(dclsVar3.c, l.size()));
            for (dcla<E> dclaVar : dclbVar.l()) {
                f(dclaVar.a(), dclaVar.b());
            }
            return;
        }
        super.d(iterable);
    }

    public final void f(E e, int i) {
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new dcls<>((dcls<? extends E>) this.a);
        }
        this.b = false;
        dbsk.s(e);
        dcls<E> dclsVar = this.a;
        dclsVar.n(e, i + dclsVar.j(e));
    }

    public dcef(int i) {
        this.b = false;
        this.a = new dcls<>(i);
    }
}
