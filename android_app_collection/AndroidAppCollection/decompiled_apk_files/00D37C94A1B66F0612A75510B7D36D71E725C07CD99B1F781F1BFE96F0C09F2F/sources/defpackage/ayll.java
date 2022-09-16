package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayll  reason: default package */
/* loaded from: classes2.dex */
final class ayll {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final aylt f;
    final boolean g;
    final boolean h;

    public ayll(List list, Collection collection, Collection collection2, aylt ayltVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = ayltVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        boolean z4 = false;
        aqxo.z(!z2 || list == null, "passThrough should imply buffer is null");
        aqxo.z(!z2 || ayltVar != null, "passThrough should imply winningSubstream != null");
        aqxo.z(!z2 || (collection.size() == 1 && collection.contains(ayltVar)) || (collection.size() == 0 && ayltVar.b), "passThrough should imply winningSubstream is drained");
        aqxo.z((!z || ayltVar != null) ? true : z4, "cancelled should imply committed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayll a(aylt ayltVar) {
        Collection unmodifiableCollection;
        aqxo.z(!this.h, "hedging frozen");
        aqxo.z(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(ayltVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(ayltVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new ayll(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayll b() {
        return this.h ? this : new ayll(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }
}
