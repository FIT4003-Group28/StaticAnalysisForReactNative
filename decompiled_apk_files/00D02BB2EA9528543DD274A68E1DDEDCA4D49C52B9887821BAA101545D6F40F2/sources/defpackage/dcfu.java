package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcfu  reason: default package */
/* loaded from: classes.dex */
final class dcfu extends dcpd {
    final /* synthetic */ Iterator a;

    public dcfu(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }
}
