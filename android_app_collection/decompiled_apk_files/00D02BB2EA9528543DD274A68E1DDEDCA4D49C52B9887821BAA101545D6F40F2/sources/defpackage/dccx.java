package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dccx  reason: default package */
/* loaded from: classes.dex */
public final class dccx<E> extends dccp<E> {
    public dccx() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dccp, defpackage.dccq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.a(obj);
    }

    public final dcdc<E> f() {
        this.c = true;
        return dcdc.C(this.a, this.b);
    }

    public final void g(E e) {
        super.a(e);
    }

    public final void h(E... eArr) {
        super.c(eArr);
    }

    public final void i(Iterable<? extends E> iterable) {
        super.d(iterable);
    }

    public final void j(Iterator<? extends E> it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
    }

    public dccx(int i) {
        super(i);
    }
}
