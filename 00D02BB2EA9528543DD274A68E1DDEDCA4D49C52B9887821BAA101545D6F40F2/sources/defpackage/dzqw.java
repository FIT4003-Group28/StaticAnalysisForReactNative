package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzqw  reason: default package */
/* loaded from: classes6.dex */
final class dzqw extends dzoc<dzqo> implements dzqp {
    final /* synthetic */ dzqz a;

    public dzqw(dzqz dzqzVar) {
        this.a = dzqzVar;
    }

    @Override // defpackage.dzqp
    public final dzrn<dzqo> Td() {
        throw null;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzqo> iterator() {
        return new dzqs(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
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
            dzqz dzqzVar = this.a;
            return dzqzVar.e && ((obj3 = dzqzVar.c[dzqzVar.f]) != null ? obj3.equals(value) : value == null);
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
            dzqz dzqzVar = this.a;
            if (!dzqzVar.e || ((obj2 = dzqzVar.c[dzqzVar.f]) != null ? !obj2.equals(value) : value != null)) {
                return false;
            }
            this.a.e();
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
            this.a.d(a);
            return true;
        }
        Object obj6 = this.a.c[a];
        if (obj6 != null ? !obj6.equals(value) : value != null) {
            return false;
        }
        this.a.d(a);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
