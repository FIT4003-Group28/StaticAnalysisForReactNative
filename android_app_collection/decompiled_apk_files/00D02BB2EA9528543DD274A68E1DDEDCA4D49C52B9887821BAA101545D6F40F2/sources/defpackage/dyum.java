package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyum  reason: default package */
/* loaded from: classes6.dex */
final class dyum {
    final boolean a;
    @dzsi
    final List<dyuf> b;
    final Collection<dyur> c;
    final Collection<dyur> d;
    final int e;
    @dzsi
    final dyur f;
    final boolean g;
    final boolean h;

    public dyum(@dzsi List<dyuf> list, Collection<dyur> collection, Collection<dyur> collection2, @dzsi dyur dyurVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        dbsk.t(collection, "drainedSubstreams");
        this.c = collection;
        this.f = dyurVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        boolean z4 = false;
        dbsk.m(!z2 || list == null, "passThrough should imply buffer is null");
        dbsk.m(!z2 || dyurVar != null, "passThrough should imply winningSubstream != null");
        dbsk.m(!z2 || (collection.size() == 1 && collection.contains(dyurVar)) || (collection.size() == 0 && dyurVar.b), "passThrough should imply winningSubstream is drained");
        dbsk.m((!z || dyurVar != null) ? true : z4, "cancelled should imply committed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dyum a() {
        return this.h ? this : new dyum(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dyum b(dyur dyurVar) {
        Collection unmodifiableCollection;
        dbsk.m(!this.h, "hedging frozen");
        dbsk.m(this.f == null, "already committed");
        Collection<dyur> collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(dyurVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(dyurVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new dyum(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }
}
