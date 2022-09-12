package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdm  reason: default package */
/* loaded from: classes5.dex */
class dcdm<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public dcdm(dcdn<K, V> dcdnVar) {
        Object[] objArr = new Object[dcdnVar.size()];
        Object[] objArr2 = new Object[dcdnVar.size()];
        dcpd<Map.Entry<K, V>> it = dcdnVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objArr[i] = next.getKey();
            objArr2[i] = next.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public dcdg<K, V> a(int i) {
        return new dcdg<>(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof dcep)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.b;
            dcdg<K, V> a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.f((K) objArr[i], (V) objArr2[i]);
            }
            return a.b();
        }
        dcep dcepVar = (dcep) obj;
        dcdg<K, V> a2 = a(dcepVar.size());
        dcpd it = dcepVar.iterator();
        dcpd it2 = ((dccr) this.b).iterator();
        while (it.hasNext()) {
            a2.f((K) it.next(), (V) it2.next());
        }
        return a2.b();
    }
}
