package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amxz  reason: default package */
/* loaded from: classes.dex */
public final class amxz extends amvn {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient amup d;

    public amxz(amup amupVar, Object[] objArr, int i, int i2) {
        this.d = amupVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amvn
    public final amuk h() {
        return new amxy(this);
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return g().listIterator();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
