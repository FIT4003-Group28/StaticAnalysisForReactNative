package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amqy  reason: default package */
/* loaded from: classes.dex */
public class amqy extends amro implements amwg {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: protected */
    public amqy(Map map) {
        super(map);
    }

    @Override // defpackage.amro
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.amro
    public final /* bridge */ /* synthetic */ Collection b() {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amro
    public final Collection c(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // defpackage.amro
    public final Collection d(Object obj, Collection collection) {
        return j(obj, (List) collection, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection] */
    @Override // defpackage.amwg
    public final List e(Object obj) {
        Collection collection = (Collection) ((amro) this).a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return d(obj, collection);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.util.Collection] */
    @Override // defpackage.amwg
    public final List f(Object obj) {
        Collection collection = (Collection) ((amro) this).a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection a = a();
        a.addAll(collection);
        ((amro) this).b -= collection.size();
        collection.clear();
        return c(a);
    }
}
