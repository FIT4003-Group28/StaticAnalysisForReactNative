package defpackage;

import java.util.Arrays;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amtf  reason: default package */
/* loaded from: classes.dex */
public abstract class amtf implements Iterable {
    private final ampq a;

    /* JADX INFO: Access modifiers changed from: protected */
    public amtf() {
        this.a = amon.a;
    }

    public amtf(Iterable iterable) {
        this.a = ampq.j(iterable);
    }

    public static amtf b(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new amte(iterableArr);
    }

    public static amtf d(Iterable iterable) {
        if (iterable instanceof amtf) {
            return (amtf) iterable;
        }
        return new amtc(iterable, iterable);
    }

    public static amtf e(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    public final ampq a() {
        Iterator it = h().iterator();
        return it.hasNext() ? ampq.j(it.next()) : amon.a;
    }

    public final amtf c(ampt amptVar) {
        return d(arey.p(h(), amptVar));
    }

    public final amtf f(ampg ampgVar) {
        return d(arey.q(h(), ampgVar));
    }

    public final amuk g() {
        return amuk.n(h());
    }

    public final Iterable h() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        for (Object obj : h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(obj);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
