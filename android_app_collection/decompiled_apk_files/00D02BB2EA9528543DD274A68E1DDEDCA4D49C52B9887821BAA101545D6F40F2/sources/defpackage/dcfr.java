package defpackage;

import java.util.Comparator;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcfr  reason: default package */
/* loaded from: classes5.dex */
public final class dcfr extends dcbg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Comparator b;

    public dcfr(Iterable iterable, Comparator comparator) {
        this.a = iterable;
        this.b = comparator;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dcgf(dcft.o(this.a, dcft.x()), this.b);
    }
}
