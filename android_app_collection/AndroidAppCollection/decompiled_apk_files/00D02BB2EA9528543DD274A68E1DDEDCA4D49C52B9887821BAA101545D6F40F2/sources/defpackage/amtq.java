package defpackage;

import java.util.AbstractList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amtq  reason: default package */
/* loaded from: classes2.dex */
public class amtq<T> extends AbstractList<T> {
    public static final amtq a = new amtq(dcdc.e(), -1);
    public final List<T> b;
    public final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public amtq(List<T> list, int i) {
        if (i != -1) {
            dbsk.z(i, list.size());
        }
        this.b = list;
        this.c = i;
    }

    public static <T> amtq<T> c(int i, @dzsi List<T> list) {
        if (list == null || list.isEmpty()) {
            return a;
        }
        return new amtq<>(dcdc.r(list), i);
    }

    public final boolean a() {
        return this.c != -1;
    }

    @dzsi
    public final T b() {
        if (a()) {
            return get(this.c);
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
