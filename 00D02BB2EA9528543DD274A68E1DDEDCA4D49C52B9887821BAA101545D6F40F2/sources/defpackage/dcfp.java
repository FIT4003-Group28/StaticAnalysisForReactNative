package defpackage;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfp  reason: default package */
/* loaded from: classes5.dex */
public final class dcfp extends dcbg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public dcfp(Iterable iterable, int i) {
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
        dcgh.p(it, this.b);
        return new dcfo(it);
    }
}
