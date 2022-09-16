package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: axpa  reason: default package */
/* loaded from: classes2.dex */
public final class axpa implements axou {
    public static final axou a = axov.a(Collections.emptySet());
    private final List b;
    private final List c;

    public axpa(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final Set get() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((azqb) this.c.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(awwc.k(size));
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = ((azqb) this.b.get(i2)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj2 : (Collection) arrayList.get(i3)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
