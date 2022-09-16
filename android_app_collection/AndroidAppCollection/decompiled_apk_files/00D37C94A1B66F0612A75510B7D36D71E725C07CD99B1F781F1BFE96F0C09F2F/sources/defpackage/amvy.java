package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvy  reason: default package */
/* loaded from: classes.dex */
final class amvy extends amzs {
    final /* synthetic */ Iterator a;

    public amvy(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        return this.a.next();
    }
}
