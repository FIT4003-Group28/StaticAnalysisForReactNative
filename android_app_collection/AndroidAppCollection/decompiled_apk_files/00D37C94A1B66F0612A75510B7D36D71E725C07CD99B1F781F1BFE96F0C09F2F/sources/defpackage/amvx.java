package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvx  reason: default package */
/* loaded from: classes.dex */
final class amvx extends amtf {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public amvx(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.b;
        it.getClass();
        aqxo.q(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new amvw(it);
    }
}
