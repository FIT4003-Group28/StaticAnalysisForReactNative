package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdf  reason: default package */
/* loaded from: classes5.dex */
final class dcdf extends dcpd {
    final /* synthetic */ dcpd a;

    public dcdf(dcpd dcpdVar) {
        this.a = dcpdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getKey();
    }
}
