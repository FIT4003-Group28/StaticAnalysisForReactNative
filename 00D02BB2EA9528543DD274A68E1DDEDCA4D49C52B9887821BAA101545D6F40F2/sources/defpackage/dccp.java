package defpackage;

import java.util.Arrays;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccp  reason: default package */
/* loaded from: classes.dex */
public class dccp<E> extends dccq<E> {
    Object[] a;
    int b;
    boolean c;

    public dccp(int i) {
        dbzb.d(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, e(length, i));
            this.c = false;
        } else if (!this.c) {
        } else {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final void a(E e) {
        dbsk.s(e);
        f(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = e;
    }

    @Override // defpackage.dccq
    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public final void c(E... eArr) {
        int length = eArr.length;
        dclq.h(eArr, length);
        f(this.b + length);
        System.arraycopy(eArr, 0, this.a, this.b, length);
        this.b += length;
    }

    @Override // defpackage.dccq
    public final void d(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(this.b + collection.size());
            if (collection instanceof dccr) {
                this.b = ((dccr) collection).A(this.a, this.b);
                return;
            }
        }
        super.d(iterable);
    }
}
