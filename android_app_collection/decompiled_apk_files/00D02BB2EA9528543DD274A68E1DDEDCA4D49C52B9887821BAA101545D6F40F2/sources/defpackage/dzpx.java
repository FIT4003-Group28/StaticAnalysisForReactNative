package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpx  reason: default package */
/* loaded from: classes6.dex */
public final class dzpx extends dzoc<dzpw> implements dzrv {
    final /* synthetic */ dzqa a;

    public dzpx(dzqa dzqaVar) {
        this.a = dzqaVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzpw> iterator() {
        return new dzpt(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() != null && (entry.getValue() instanceof Long)) {
            Object key = entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            if (key == null) {
                dzqa dzqaVar = this.a;
                return dzqaVar.d && dzqaVar.b[dzqaVar.e] == longValue;
            }
            Object[] objArr = this.a.a;
            int a = dzgv.a(key.hashCode()) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (key.equals(obj3)) {
                return this.a.b[a] == longValue;
            }
            do {
                a = (a + 1) & this.a.c;
                obj2 = objArr[a];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            if (this.a.b[a] == longValue) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Long)) {
            return false;
        }
        Object key = entry.getKey();
        long longValue = ((Long) entry.getValue()).longValue();
        if (key == null) {
            dzqa dzqaVar = this.a;
            if (!dzqaVar.d || dzqaVar.b[dzqaVar.e] != longValue) {
                return false;
            }
            dzqaVar.i();
            return true;
        }
        Object[] objArr = this.a.a;
        int a = dzgv.a(key.hashCode()) & this.a.c;
        Object obj2 = objArr[a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            dzqa dzqaVar2 = this.a;
            if (dzqaVar2.b[a] != longValue) {
                return false;
            }
            dzqaVar2.h(a);
            return true;
        }
        while (true) {
            a = (a + 1) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key)) {
                dzqa dzqaVar3 = this.a;
                if (dzqaVar3.b[a] == longValue) {
                    dzqaVar3.h(a);
                    return true;
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
