package defpackage;

import dagger.internal.Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dxjj  reason: default package */
/* loaded from: classes6.dex */
public final class dxjj<T> implements Factory<Set<T>> {
    public static final Factory<Set<Object>> a = dxjd.b(Collections.emptySet());
    private final List<dzsj<T>> b;
    private final List<dzsj<Collection<T>>> c;

    public dxjj(List<dzsj<T>> list, List<dzsj<Collection<T>>> list2) {
        this.b = list;
        this.c = list2;
    }

    public static <T> dxji<T> b() {
        return new dxji<>();
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> a2 = this.c.get(i).a();
            size += a2.size();
            arrayList.add(a2);
        }
        HashSet hashSet = new HashSet(dxjb.b(size));
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T a3 = this.b.get(i2).a();
            dxjg.b(a3);
            hashSet.add(a3);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                dxjg.b(obj);
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
