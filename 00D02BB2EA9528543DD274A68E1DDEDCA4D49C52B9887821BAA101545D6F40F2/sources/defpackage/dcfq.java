package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfq  reason: default package */
/* loaded from: classes5.dex */
public final class dcfq extends dcbg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public dcfq(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        int i = this.b;
        dbsk.s(it);
        dbsk.b(i >= 0, "limit is negative");
        return new dcfz(i, it);
    }
}
