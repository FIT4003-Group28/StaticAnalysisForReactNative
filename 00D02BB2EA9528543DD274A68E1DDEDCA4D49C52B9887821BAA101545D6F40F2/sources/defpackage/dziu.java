package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dziu  reason: default package */
/* loaded from: classes6.dex */
public final class dziu extends dzoc<dzjh> implements dzji {
    final /* synthetic */ dziv a;

    public dziu(dziv dzivVar) {
        this.a = dzivVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzjh> iterator() {
        return new dzit(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (this.a.d(intValue)) {
                if (this.a.i(intValue) == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (this.a.i(intValue).equals(entry.getValue())) {
                    return true;
                }
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
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int intValue = ((Integer) entry.getKey()).intValue();
            Object value = entry.getValue();
            int h = this.a.h(intValue);
            if (h != -1 && (value != null ? value.equals(this.a.b[h]) : this.a.b[h] == null)) {
                dziv dzivVar = this.a;
                int i = (dzivVar.c - h) - 1;
                int[] iArr = dzivVar.a;
                int i2 = h + 1;
                System.arraycopy(iArr, i2, iArr, h, i);
                Object[] objArr = this.a.b;
                System.arraycopy(objArr, i2, objArr, h, i);
                dziv.l(this.a);
                dziv dzivVar2 = this.a;
                dzivVar2.b[dzivVar2.c] = null;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
