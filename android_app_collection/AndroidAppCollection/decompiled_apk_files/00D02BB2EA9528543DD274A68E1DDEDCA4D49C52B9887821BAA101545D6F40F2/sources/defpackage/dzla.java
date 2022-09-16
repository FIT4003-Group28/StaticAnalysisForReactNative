package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzla  reason: default package */
/* loaded from: classes6.dex */
public final class dzla extends dzoc<dzkj> implements dzrv {
    final /* synthetic */ dzlb a;

    public dzla(dzlb dzlbVar) {
        this.a = dzlbVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<dzkj> iterator() {
        return new dzkz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Double)) {
            long longValue = ((Long) entry.getKey()).longValue();
            if (this.a.e(longValue) && this.a.i(longValue) == ((Double) entry.getValue()).doubleValue()) {
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
        if (entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Double)) {
            long longValue = ((Long) entry.getKey()).longValue();
            double doubleValue = ((Double) entry.getValue()).doubleValue();
            int h = this.a.h(longValue);
            if (h != -1) {
                dzlb dzlbVar = this.a;
                if (doubleValue == dzlbVar.b[h]) {
                    int i = (dzlbVar.c - h) - 1;
                    long[] jArr = dzlbVar.a;
                    int i2 = h + 1;
                    System.arraycopy(jArr, i2, jArr, h, i);
                    double[] dArr = this.a.b;
                    System.arraycopy(dArr, i2, dArr, h, i);
                    dzlb.l(this.a);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
