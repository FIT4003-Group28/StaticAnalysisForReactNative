package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dcfa  reason: default package */
/* loaded from: classes5.dex */
public final class dcfa<E> extends dcen<E> {
    private final Comparator<? super E> e;

    public dcfa(Comparator<? super E> comparator) {
        dbsk.s(comparator);
        this.e = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcen, defpackage.dccp, defpackage.dccq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b(obj);
    }

    @Override // defpackage.dcen
    /* renamed from: j */
    public final dcfc<E> f() {
        dcfc<E> S = dcfc.S(this.e, this.b, this.a);
        this.b = S.size();
        this.c = true;
        return S;
    }

    public final void k(E e) {
        super.b(e);
    }

    public final void l(E... eArr) {
        super.h(eArr);
    }

    public final void m(Iterable<? extends E> iterable) {
        super.i(iterable);
    }
}
