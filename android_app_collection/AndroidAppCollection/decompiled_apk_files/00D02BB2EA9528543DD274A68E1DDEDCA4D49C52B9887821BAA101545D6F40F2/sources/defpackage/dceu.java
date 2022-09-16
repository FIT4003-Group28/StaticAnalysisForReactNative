package defpackage;

import java.util.AbstractMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dceu  reason: default package */
/* loaded from: classes5.dex */
final class dceu extends dcdc<Map.Entry> {
    final /* synthetic */ dcev a;

    public dceu(dcev dcevVar) {
        this.a = dcevVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.a.d.get(i), this.a.a.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }
}
