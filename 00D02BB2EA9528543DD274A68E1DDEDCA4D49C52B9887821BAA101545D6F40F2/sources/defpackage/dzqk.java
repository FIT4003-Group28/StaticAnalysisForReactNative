package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqk  reason: default package */
/* loaded from: classes6.dex */
public final class dzqk extends dzod<dzqo> implements dzra {
    final /* synthetic */ dzqn a;

    public dzqk(dzqn dzqnVar) {
        this.a = dzqnVar;
    }

    @Override // defpackage.dzqp
    public final /* bridge */ /* synthetic */ dzrn Td() {
        return new dzqg(this.a);
    }

    @Override // defpackage.dzod, defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public final dzri<dzqo> iterator() {
        return new dzqf(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator<? super dzqo> comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (key == null) {
            dzqn dzqnVar = this.a;
            return dzqnVar.e && ((obj3 = dzqnVar.c[dzqnVar.i]) != null ? obj3.equals(value) : value == null);
        }
        Object[] objArr = this.a.b;
        int a = dzgv.a(key.hashCode()) & this.a.d;
        Object obj4 = objArr[a];
        if (obj4 == null) {
            return false;
        }
        if (!key.equals(obj4)) {
            do {
                a = (a + 1) & this.a.d;
                obj2 = objArr[a];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            Object obj5 = this.a.c[a];
            return obj5 == null ? value == null : obj5.equals(value);
        }
        Object obj6 = this.a.c[a];
        return obj6 == null ? value == null : obj6.equals(value);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        dzqn dzqnVar = this.a;
        if (dzqnVar.k != 0) {
            return new dzqj(dzqnVar, dzqnVar.f);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        dzqn dzqnVar = this.a;
        if (dzqnVar.k != 0) {
            return new dzqj(dzqnVar, dzqnVar.g);
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
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (key == null) {
            dzqn dzqnVar = this.a;
            if (!dzqnVar.e || ((obj2 = dzqnVar.c[dzqnVar.i]) != null ? !obj2.equals(value) : value != null)) {
                return false;
            }
            this.a.f();
            return true;
        }
        Object[] objArr = this.a.b;
        int a = dzgv.a(key.hashCode()) & this.a.d;
        Object obj3 = objArr[a];
        if (obj3 == null) {
            return false;
        }
        if (!obj3.equals(key)) {
            while (true) {
                a = (a + 1) & this.a.d;
                Object obj4 = objArr[a];
                if (obj4 == null) {
                    return false;
                }
                if (obj4.equals(key)) {
                    Object obj5 = this.a.c[a];
                    if (obj5 == null) {
                        if (value == null) {
                            break;
                        }
                    } else if (obj5.equals(value)) {
                        break;
                    }
                }
            }
            this.a.e(a);
            return true;
        }
        Object obj6 = this.a.c[a];
        if (obj6 != null ? !obj6.equals(value) : value != null) {
            return false;
        }
        this.a.e(a);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        dzqo dzqoVar = (dzqo) obj;
        dzqo dzqoVar2 = (dzqo) obj2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        throw new UnsupportedOperationException();
    }
}
