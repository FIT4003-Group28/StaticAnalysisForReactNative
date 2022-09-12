package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdk  reason: default package */
/* loaded from: classes5.dex */
final class dcdk extends dcpd<Map.Entry> {
    final /* synthetic */ Iterator a;

    public dcdk(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new dcdj((Map.Entry) this.a.next());
    }
}
