package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzoq  reason: default package */
/* loaded from: classes6.dex */
public final class dzoq extends dzoc<dzop> implements dzrv {
    final /* synthetic */ dzot a;

    public dzoq(dzot dzotVar) {
        this.a = dzotVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzop> iterator() {
        return new dzom(this.a);
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
        if (entry.getValue() != null && (entry.getValue() instanceof Boolean)) {
            Object key = entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (key == null) {
                dzot dzotVar = this.a;
                return dzotVar.d && dzotVar.b[dzotVar.e] == booleanValue;
            }
            Object[] objArr = this.a.a;
            int a = dzgv.a(key.hashCode()) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (key.equals(obj3)) {
                return this.a.b[a] == booleanValue;
            }
            do {
                a = (a + 1) & this.a.c;
                obj2 = objArr[a];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            if (this.a.b[a] == booleanValue) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Boolean)) {
            return false;
        }
        Object key = entry.getKey();
        boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
        if (key == null) {
            dzot dzotVar = this.a;
            if (!dzotVar.d || dzotVar.b[dzotVar.e] != booleanValue) {
                return false;
            }
            dzotVar.i();
            return true;
        }
        Object[] objArr = this.a.a;
        int a = dzgv.a(key.hashCode()) & this.a.c;
        Object obj2 = objArr[a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            dzot dzotVar2 = this.a;
            if (dzotVar2.b[a] != booleanValue) {
                return false;
            }
            dzotVar2.h(a);
            return true;
        }
        while (true) {
            a = (a + 1) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key)) {
                dzot dzotVar3 = this.a;
                if (dzotVar3.b[a] == booleanValue) {
                    dzotVar3.h(a);
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
