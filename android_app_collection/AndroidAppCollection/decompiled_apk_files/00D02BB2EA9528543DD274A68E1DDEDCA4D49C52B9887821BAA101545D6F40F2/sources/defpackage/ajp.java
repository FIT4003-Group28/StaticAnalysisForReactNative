package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajp  reason: default package */
/* loaded from: classes2.dex */
public final class ajp<T> {
    public final my<ArrayList<T>> a = new mz(10);
    public final aim<T, ArrayList<T>> b = new aim<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public final void a(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public final List b(T t) {
        return this.b.get(t);
    }

    public final void c(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
