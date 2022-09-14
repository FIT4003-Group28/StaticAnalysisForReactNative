package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzqc  reason: default package */
/* loaded from: classes6.dex */
public final class dzqc extends dzoc<dzqo> implements dzqp {
    final /* synthetic */ dzqd a;

    public dzqc(dzqd dzqdVar) {
        this.a = dzqdVar;
    }

    @Override // defpackage.dzqp
    public final dzrn<dzqo> Td() {
        throw null;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzqo> iterator() {
        return new dzqb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        if (this.a.containsKey(key)) {
            if (this.a.get(key) == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (this.a.get(key).equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int e = this.a.e(key);
        if (e == -1 || (value != null ? !value.equals(this.a.c[e]) : this.a.c[e] != null)) {
            return false;
        }
        dzqd dzqdVar = this.a;
        int i = (dzqdVar.d - e) - 1;
        Object[] objArr = dzqdVar.b;
        int i2 = e + 1;
        System.arraycopy(objArr, i2, objArr, e, i);
        Object[] objArr2 = this.a.c;
        System.arraycopy(objArr2, i2, objArr2, e, i);
        dzqd.h(this.a);
        dzqd dzqdVar2 = this.a;
        Object[] objArr3 = dzqdVar2.b;
        int i3 = dzqdVar2.d;
        objArr3[i3] = null;
        dzqdVar2.c[i3] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.d;
    }
}
