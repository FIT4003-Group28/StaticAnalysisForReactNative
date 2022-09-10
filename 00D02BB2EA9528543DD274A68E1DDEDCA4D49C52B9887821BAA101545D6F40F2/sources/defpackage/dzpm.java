package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpm  reason: default package */
/* loaded from: classes6.dex */
public final class dzpm extends dzoc<dzpl> implements dzrv {
    final /* synthetic */ dzpp a;

    public dzpm(dzpp dzppVar) {
        this.a = dzppVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzpl> iterator() {
        return new dzpi(this.a);
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
        if (entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            Object key = entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            if (key == null) {
                dzpp dzppVar = this.a;
                return dzppVar.d && dzppVar.b[dzppVar.e] == intValue;
            }
            Object[] objArr = this.a.a;
            int a = dzgv.a(key.hashCode()) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (key.equals(obj3)) {
                return this.a.b[a] == intValue;
            }
            do {
                a = (a + 1) & this.a.c;
                obj2 = objArr[a];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            if (this.a.b[a] == intValue) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int intValue = ((Integer) entry.getValue()).intValue();
        if (key == null) {
            dzpp dzppVar = this.a;
            if (!dzppVar.d || dzppVar.b[dzppVar.e] != intValue) {
                return false;
            }
            dzppVar.i();
            return true;
        }
        Object[] objArr = this.a.a;
        int a = dzgv.a(key.hashCode()) & this.a.c;
        Object obj2 = objArr[a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            dzpp dzppVar2 = this.a;
            if (dzppVar2.b[a] != intValue) {
                return false;
            }
            dzppVar2.h(a);
            return true;
        }
        while (true) {
            a = (a + 1) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key)) {
                dzpp dzppVar3 = this.a;
                if (dzppVar3.b[a] == intValue) {
                    dzppVar3.h(a);
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
