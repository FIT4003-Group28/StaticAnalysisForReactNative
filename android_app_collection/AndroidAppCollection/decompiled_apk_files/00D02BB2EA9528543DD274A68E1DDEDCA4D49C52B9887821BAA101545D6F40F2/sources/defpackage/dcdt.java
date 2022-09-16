package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcdt  reason: default package */
/* loaded from: classes5.dex */
public final class dcdt extends dcpd {
    final dcpd<Map.Entry> a;
    final /* synthetic */ dcdw b;

    public dcdt(dcdw dcdwVar) {
        this.b = dcdwVar;
        this.a = dcdwVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next().getValue();
    }
}
