package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbxc  reason: default package */
/* loaded from: classes5.dex */
final class dbxc extends dcbs<Map.Entry> {
    final Set<Map.Entry> a;
    final /* synthetic */ dbxg b;

    public dbxc(dbxg dbxgVar) {
        this.b = dbxgVar;
        this.a = dbxgVar.a.entrySet();
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbs
    protected final Set<Map.Entry> a() {
        return this.a;
    }

    @Override // defpackage.dcbs, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return dcjz.D(this.a, obj);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return dbze.e(this, collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        dbxg dbxgVar = this.b;
        return new dbxa(dbxgVar, dbxgVar.a.entrySet().iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!this.a.contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        this.b.b.a.remove(entry.getValue());
        this.a.remove(entry);
        return true;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        return c(collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        return d(collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}
