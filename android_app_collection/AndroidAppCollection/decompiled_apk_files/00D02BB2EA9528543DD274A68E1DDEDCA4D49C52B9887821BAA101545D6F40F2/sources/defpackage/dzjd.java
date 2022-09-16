package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dzjd  reason: default package */
/* loaded from: classes.dex */
public final class dzjd extends dzod<dzjh> implements dzjt {
    public final /* synthetic */ dzjg a;

    public dzjd(dzjg dzjgVar) {
        this.a = dzjgVar;
    }

    @Override // defpackage.dzod, defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public final dzri<dzjh> iterator() {
        return new dziy(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator<? super dzjh> comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        dzjg dzjgVar;
        int i;
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        if (intValue == 0) {
            dzjg dzjgVar2 = this.a;
            return dzjgVar2.d && ((obj2 = dzjgVar2.b[dzjgVar2.h]) != null ? obj2.equals(value) : value == null);
        }
        int[] iArr = this.a.a;
        dzjg dzjgVar3 = this.a;
        int a = dzgv.a(intValue) & dzjgVar3.c;
        int i2 = iArr[a];
        if (i2 == 0) {
            return false;
        }
        if (intValue != i2) {
            do {
                dzjgVar = this.a;
                a = (a + 1) & dzjgVar.c;
                i = iArr[a];
                if (i == 0) {
                    return false;
                }
            } while (intValue != i);
            Object obj3 = dzjgVar.b[a];
            return obj3 == null ? value == null : obj3.equals(value);
        }
        Object obj4 = dzjgVar3.b[a];
        return obj4 == null ? value == null : obj4.equals(value);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        dzjg dzjgVar = this.a;
        if (dzjgVar.j != 0) {
            return new dzjc(dzjgVar, dzjgVar.e);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        dzjg dzjgVar = this.a;
        if (dzjgVar.j != 0) {
            return new dzjc(dzjgVar, dzjgVar.f);
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        r7.a.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        return true;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L18
            goto L94
        L18:
            java.lang.Object r0 = r8.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r8 = r8.getValue()
            r2 = 1
            if (r0 != 0) goto L48
            dzjg r0 = r7.a
            boolean r3 = r0.d
            if (r3 == 0) goto L47
            V[] r3 = r0.b
            int r0 = r0.h
            r0 = r3[r0]
            if (r0 != 0) goto L3a
            if (r8 != 0) goto L47
            goto L41
        L3a:
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L41
            goto L47
        L41:
            dzjg r8 = r7.a
            r8.l()
            return r2
        L47:
            return r1
        L48:
            dzjg r3 = r7.a
            int[] r3 = r3.a
            dzjg r4 = r7.a
            int r5 = defpackage.dzgv.a(r0)
            int r6 = r4.c
            r5 = r5 & r6
            r6 = r3[r5]
            if (r6 != 0) goto L5a
            return r1
        L5a:
            if (r6 != r0) goto L72
            V[] r0 = r4.b
            r0 = r0[r5]
            if (r0 != 0) goto L65
            if (r8 != 0) goto L71
            goto L6b
        L65:
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L71
        L6b:
            dzjg r8 = r7.a
            r8.j(r5)
            return r2
        L71:
            return r1
        L72:
            dzjg r4 = r7.a
            int r5 = r5 + r2
            int r6 = r4.c
            r5 = r5 & r6
            r6 = r3[r5]
            if (r6 != 0) goto L7d
            return r1
        L7d:
            if (r6 != r0) goto L72
            V[] r4 = r4.b
            r4 = r4[r5]
            if (r4 != 0) goto L88
            if (r8 != 0) goto L72
            goto L8e
        L88:
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L72
        L8e:
            dzjg r8 = r7.a
            r8.j(r5)
            return r2
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjd.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        dzjh dzjhVar = (dzjh) obj;
        dzjh dzjhVar2 = (dzjh) obj2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        throw new UnsupportedOperationException();
    }
}
