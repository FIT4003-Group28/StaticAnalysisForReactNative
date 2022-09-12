package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzpb  reason: default package */
/* loaded from: classes6.dex */
public final class dzpb extends dzoc<dzpa> implements dzrv {
    final /* synthetic */ dzpe a;

    public dzpb(dzpe dzpeVar) {
        this.a = dzpeVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzpa> iterator() {
        return new dzox(this.a);
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
        if (entry.getValue() != null && (entry.getValue() instanceof Float)) {
            Object key = entry.getKey();
            float floatValue = ((Float) entry.getValue()).floatValue();
            if (key == null) {
                dzpe dzpeVar = this.a;
                return dzpeVar.d && dzpeVar.b[dzpeVar.e] == floatValue;
            }
            Object[] objArr = this.a.a;
            int a = dzgv.a(key.hashCode()) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (key.equals(obj3)) {
                return this.a.b[a] == floatValue;
            }
            do {
                a = (a + 1) & this.a.c;
                obj2 = objArr[a];
                if (obj2 == null) {
                    return false;
                }
            } while (!key.equals(obj2));
            if (this.a.b[a] == floatValue) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Float)) {
            return false;
        }
        Object key = entry.getKey();
        float floatValue = ((Float) entry.getValue()).floatValue();
        if (key == null) {
            dzpe dzpeVar = this.a;
            if (!dzpeVar.d || dzpeVar.b[dzpeVar.e] != floatValue) {
                return false;
            }
            dzpeVar.i();
            return true;
        }
        Object[] objArr = this.a.a;
        int a = dzgv.a(key.hashCode()) & this.a.c;
        Object obj2 = objArr[a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            dzpe dzpeVar2 = this.a;
            if (dzpeVar2.b[a] != floatValue) {
                return false;
            }
            dzpeVar2.h(a);
            return true;
        }
        while (true) {
            a = (a + 1) & this.a.c;
            Object obj3 = objArr[a];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key)) {
                dzpe dzpeVar3 = this.a;
                if (dzpeVar3.b[a] == floatValue) {
                    dzpeVar3.h(a);
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
