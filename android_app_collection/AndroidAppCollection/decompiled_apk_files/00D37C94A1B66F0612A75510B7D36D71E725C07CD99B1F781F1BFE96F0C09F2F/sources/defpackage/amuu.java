package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amuu  reason: default package */
/* loaded from: classes.dex */
final class amuu extends amzs {
    final amzs a;
    final /* synthetic */ amux b;

    public amuu(amux amuxVar) {
        this.b = amuxVar;
        this.a = amuxVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        return ((Map.Entry) this.a.mo416next()).getValue();
    }
}
