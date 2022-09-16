package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbxe  reason: default package */
/* loaded from: classes5.dex */
final class dbxe extends dcbs {
    final /* synthetic */ dbxg a;

    public dbxe(dbxg dbxgVar) {
        this.a = dbxgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcbs, defpackage.dcbh
    /* renamed from: a */
    public final Set b() {
        return this.a.a.keySet();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return dcjz.a(this.a.entrySet().iterator());
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.g(obj);
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
}
