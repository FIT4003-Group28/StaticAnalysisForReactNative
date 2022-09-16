package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amuo  reason: default package */
/* loaded from: classes.dex */
class amuo implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public amuo(amup amupVar) {
        Object[] objArr = new Object[amupVar.size()];
        Object[] objArr2 = new Object[amupVar.size()];
        amzs it = amupVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public amum a(int i) {
        return new amum(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof amvn)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.b;
            amum a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.f(objArr[i], objArr2[i]);
            }
            return a.b();
        }
        amvn amvnVar = (amvn) obj;
        amum a2 = a(amvnVar.size());
        amzs it = amvnVar.iterator();
        amzs it2 = ((amub) this.b).iterator();
        while (it.hasNext()) {
            a2.f(it.mo416next(), it2.mo416next());
        }
        return a2.b();
    }
}
