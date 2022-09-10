package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzip  reason: default package */
/* loaded from: classes6.dex */
public final class dzip extends dzoc<dzio> implements dzrv {
    final /* synthetic */ dzis a;

    public dzip(dzis dzisVar) {
        this.a = dzisVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzio> iterator() {
        return new dzil(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        dzis dzisVar;
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer) && entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue == 0) {
                dzis dzisVar2 = this.a;
                return dzisVar2.e && dzisVar2.c[dzisVar2.f] == intValue2;
            }
            int[] iArr = this.a.b;
            dzis dzisVar3 = this.a;
            int a = dzgv.a(intValue) & dzisVar3.d;
            int i2 = iArr[a];
            if (i2 == 0) {
                return false;
            }
            if (intValue == i2) {
                return dzisVar3.c[a] == intValue2;
            }
            do {
                dzisVar = this.a;
                a = (a + 1) & dzisVar.d;
                i = iArr[a];
                if (i == 0) {
                    return false;
                }
            } while (intValue != i);
            if (dzisVar.c[a] == intValue2) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) entry.getKey()).intValue();
        int intValue2 = ((Integer) entry.getValue()).intValue();
        if (intValue == 0) {
            dzis dzisVar = this.a;
            if (!dzisVar.e || dzisVar.c[dzisVar.f] != intValue2) {
                return false;
            }
            dzisVar.j();
            return true;
        }
        int[] iArr = this.a.b;
        dzis dzisVar2 = this.a;
        int a = dzgv.a(intValue) & dzisVar2.d;
        int i = iArr[a];
        if (i == 0) {
            return false;
        }
        if (i == intValue) {
            if (dzisVar2.c[a] != intValue2) {
                return false;
            }
            dzisVar2.i(a);
            return true;
        }
        while (true) {
            dzis dzisVar3 = this.a;
            a = (a + 1) & dzisVar3.d;
            int i2 = iArr[a];
            if (i2 == 0) {
                return false;
            }
            if (i2 == intValue && dzisVar3.c[a] == intValue2) {
                dzisVar3.i(a);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
