package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxm  reason: default package */
/* loaded from: classes5.dex */
final class dbxm extends dcji {
    final /* synthetic */ dbxo a;

    public dbxm(dbxo dbxoVar) {
        this.a = dbxoVar;
    }

    @Override // defpackage.dcji
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.dcji, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return dbze.b(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new dbxn(this.a);
    }

    @Override // defpackage.dcji, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        dbye dbyeVar = this.a.b;
        Collection collection = (Collection) dcjz.C(dbyeVar.a, ((Map.Entry) obj).getKey());
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        dbyeVar.b -= size;
        return true;
    }
}
