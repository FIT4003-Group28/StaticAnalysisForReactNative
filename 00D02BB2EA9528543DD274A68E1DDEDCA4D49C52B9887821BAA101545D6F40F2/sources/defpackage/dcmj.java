package defpackage;

import java.util.AbstractMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcmj  reason: default package */
/* loaded from: classes.dex */
final class dcmj extends dcdc<Map.Entry> {
    final /* synthetic */ dcmk a;

    public dcmj(dcmk dcmkVar) {
        this.a = dcmkVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        dbsk.z(i, this.a.c);
        dcmk dcmkVar = this.a;
        Object[] objArr = dcmkVar.a;
        int i2 = i + i;
        int i3 = dcmkVar.b;
        return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}
