package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dzma  reason: default package */
/* loaded from: classes6.dex */
public final class dzma extends dzod<dzme> implements dzmq {
    public final /* synthetic */ dzmd a;

    public dzma(dzmd dzmdVar) {
        this.a = dzmdVar;
    }

    @Override // defpackage.dzod, defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public final dzri<dzme> iterator() {
        return new dzlv(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator<? super dzme> comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        dzmd dzmdVar;
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
            dzmd dzmdVar2 = this.a;
            return dzmdVar2.d && ((obj2 = dzmdVar2.b[dzmdVar2.h]) != null ? obj2.equals(value) : value == null);
        }
        long[] jArr = this.a.a;
        dzmd dzmdVar3 = this.a;
        int b = dzmdVar3.c & ((int) dzgv.b(longValue));
        long j2 = jArr[b];
        if (j2 == 0) {
            return false;
        }
        if (longValue != j2) {
            do {
                dzmdVar = this.a;
                b = (b + 1) & dzmdVar.c;
                j = jArr[b];
                if (j == 0) {
                    return false;
                }
            } while (longValue != j);
            Object obj3 = dzmdVar.b[b];
            return obj3 == null ? value == null : obj3.equals(value);
        }
        Object obj4 = dzmdVar3.b[b];
        return obj4 == null ? value == null : obj4.equals(value);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        dzmd dzmdVar = this.a;
        if (dzmdVar.j != 0) {
            return new dzlz(dzmdVar, dzmdVar.e);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        dzme dzmeVar = (dzme) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        dzmd dzmdVar = this.a;
        if (dzmdVar.j != 0) {
            return new dzlz(dzmdVar, dzmdVar.f);
        }
        throw new NoSuchElementException();
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
            dzmd dzmdVar = this.a;
            if (!dzmdVar.d || ((obj2 = dzmdVar.b[dzmdVar.h]) != null ? !obj2.equals(value) : value != null)) {
                return false;
            }
            this.a.k();
            return true;
        }
        long[] jArr = this.a.a;
        dzmd dzmdVar2 = this.a;
        int b = dzmdVar2.c & ((int) dzgv.b(longValue));
        long j = jArr[b];
        if (j == 0) {
            return false;
        }
        if (j != longValue) {
            while (true) {
                dzmd dzmdVar3 = this.a;
                b = (b + 1) & dzmdVar3.c;
                long j2 = jArr[b];
                if (j2 == 0) {
                    return false;
                }
                if (j2 == longValue) {
                    Object obj3 = dzmdVar3.b[b];
                    if (obj3 == null) {
                        if (value == null) {
                            break;
                        }
                    } else if (obj3.equals(value)) {
                        break;
                    }
                }
            }
            this.a.j(b);
            return true;
        }
        Object obj4 = dzmdVar2.b[b];
        if (obj4 != null ? !obj4.equals(value) : value != null) {
            return false;
        }
        this.a.j(b);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        dzme dzmeVar = (dzme) obj;
        dzme dzmeVar2 = (dzme) obj2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        dzme dzmeVar = (dzme) obj;
        throw new UnsupportedOperationException();
    }
}
