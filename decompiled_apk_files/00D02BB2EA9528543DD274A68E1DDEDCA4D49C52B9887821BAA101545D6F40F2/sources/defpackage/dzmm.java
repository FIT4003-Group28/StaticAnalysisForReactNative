package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzmm  reason: default package */
/* loaded from: classes6.dex */
final class dzmm extends dzoc<dzme> implements dzmf {
    final /* synthetic */ dzmp a;

    public dzmm(dzmp dzmpVar) {
        this.a = dzmpVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzme> iterator() {
        return new dzmi(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        dzmp dzmpVar;
        long j;
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long longValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        if (longValue == 0) {
            dzmp dzmpVar2 = this.a;
            return dzmpVar2.d && ((obj2 = dzmpVar2.b[dzmpVar2.e]) != null ? obj2.equals(value) : value == null);
        }
        long[] jArr = this.a.a;
        dzmp dzmpVar3 = this.a;
        int b = dzmpVar3.c & ((int) dzgv.b(longValue));
        long j2 = jArr[b];
        if (j2 == 0) {
            return false;
        }
        if (longValue != j2) {
            do {
                dzmpVar = this.a;
                b = (b + 1) & dzmpVar.c;
                j = jArr[b];
                if (j == 0) {
                    return false;
                }
            } while (longValue != j);
            Object obj3 = dzmpVar.b[b];
            return obj3 == null ? value == null : obj3.equals(value);
        }
        Object obj4 = dzmpVar3.b[b];
        return obj4 == null ? value == null : obj4.equals(value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long longValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        if (longValue == 0) {
            dzmp dzmpVar = this.a;
            if (!dzmpVar.d || ((obj2 = dzmpVar.b[dzmpVar.e]) != null ? !obj2.equals(value) : value != null)) {
                return false;
            }
            this.a.j();
            return true;
        }
        long[] jArr = this.a.a;
        dzmp dzmpVar2 = this.a;
        int b = dzmpVar2.c & ((int) dzgv.b(longValue));
        long j = jArr[b];
        if (j == 0) {
            return false;
        }
        if (j != longValue) {
            while (true) {
                dzmp dzmpVar3 = this.a;
                b = (b + 1) & dzmpVar3.c;
                long j2 = jArr[b];
                if (j2 == 0) {
                    return false;
                }
                if (j2 == longValue) {
                    Object obj3 = dzmpVar3.b[b];
                    if (obj3 == null) {
                        if (value == null) {
                            break;
                        }
                    } else if (obj3.equals(value)) {
                        break;
                    }
                }
            }
            this.a.h(b);
            return true;
        }
        Object obj4 = dzmpVar2.b[b];
        if (obj4 != null ? !obj4.equals(value) : value != null) {
            return false;
        }
        this.a.h(b);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
