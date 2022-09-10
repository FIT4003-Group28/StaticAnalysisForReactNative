package defpackage;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcje  reason: default package */
/* loaded from: classes5.dex */
public final class dcje extends dcpd<Map.Entry> {
    final /* synthetic */ Iterator a;

    public dcje(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return dcjz.q((Map.Entry) this.a.next());
    }
}
