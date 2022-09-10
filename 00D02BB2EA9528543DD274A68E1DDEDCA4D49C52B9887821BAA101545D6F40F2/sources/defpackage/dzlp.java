package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzlp  reason: default package */
/* loaded from: classes6.dex */
public final class dzlp extends dzoc<dzlo> implements dzrv {
    final /* synthetic */ dzls a;

    public dzlp(dzls dzlsVar) {
        this.a = dzlsVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzlo> iterator() {
        return new dzll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        dzls dzlsVar;
        long j;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            long longValue = ((Long) entry.getKey()).longValue();
            int intValue = ((Integer) entry.getValue()).intValue();
            if (longValue == 0) {
                dzls dzlsVar2 = this.a;
                return dzlsVar2.e && dzlsVar2.c[dzlsVar2.f] == intValue;
            }
            long[] jArr = this.a.b;
            dzls dzlsVar3 = this.a;
            int b = dzlsVar3.d & ((int) dzgv.b(longValue));
            long j2 = jArr[b];
            if (j2 == 0) {
                return false;
            }
            if (longValue == j2) {
                return dzlsVar3.c[b] == intValue;
            }
            do {
                dzlsVar = this.a;
                b = (b + 1) & dzlsVar.d;
                j = jArr[b];
                if (j == 0) {
                    return false;
                }
            } while (longValue != j);
            if (dzlsVar.c[b] == intValue) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Long) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        long longValue = ((Long) entry.getKey()).longValue();
        int intValue = ((Integer) entry.getValue()).intValue();
        if (longValue == 0) {
            dzls dzlsVar = this.a;
            if (!dzlsVar.e || dzlsVar.c[dzlsVar.f] != intValue) {
                return false;
            }
            dzlsVar.k();
            return true;
        }
        long[] jArr = this.a.b;
        dzls dzlsVar2 = this.a;
        int b = dzlsVar2.d & ((int) dzgv.b(longValue));
        long j = jArr[b];
        if (j == 0) {
            return false;
        }
        if (j == longValue) {
            if (dzlsVar2.c[b] != intValue) {
                return false;
            }
            dzlsVar2.j(b);
            return true;
        }
        while (true) {
            dzls dzlsVar3 = this.a;
            b = (b + 1) & dzlsVar3.d;
            long j2 = jArr[b];
            if (j2 == 0) {
                return false;
            }
            if (j2 == longValue && dzlsVar3.c[b] == intValue) {
                dzlsVar3.j(b);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
