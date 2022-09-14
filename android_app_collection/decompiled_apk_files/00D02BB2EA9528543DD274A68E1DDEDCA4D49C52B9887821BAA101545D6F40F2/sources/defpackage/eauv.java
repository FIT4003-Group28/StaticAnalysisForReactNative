package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: eauv  reason: default package */
/* loaded from: classes6.dex */
public final class eauv {
    public List<Object> a;
    private final int b = 1;
    private final int c = 2;
    private final int d = 10;
    private boolean e;
    private boolean f;
    private eauq[] g;

    public eauv() {
        List<Object> list = this.a;
        if (list == null) {
            this.a = new ArrayList();
        } else {
            list.clear();
        }
        this.e = false;
        this.f = false;
        this.g = new eauq[10];
    }

    public static Object[] c(List<Object> list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return new Object[]{list.get(0), list.get(1)};
            }
            eauo eauoVar = new eauo(list);
            return new Object[]{eauoVar, eauoVar};
        }
        return new Object[]{eaur.a, eaur.a};
    }

    public final eaun a() {
        eaun f = f(this.a, this.e, this.f);
        this.g = (eauq[]) this.g.clone();
        return f;
    }

    public final void b(int i) {
        eauq eauqVar = new eauq(1, 2, 10, i, this.g);
        d(eauqVar, eauqVar);
        this.g[i] = eauqVar;
    }

    public final void d(eaux eauxVar, eauw eauwVar) {
        this.a.add(eauxVar);
        this.a.add(eauwVar);
        boolean z = true;
        this.e = (eauxVar == null) | this.e;
        boolean z2 = this.f;
        if (eauwVar != null) {
            z = false;
        }
        this.f = z2 | z;
    }

    public final void e(String str) {
        Object obj;
        List<Object> list;
        List<Object> list2;
        List<Object> list3;
        List<Object> list4;
        eauu eauuVar = new eauu(str);
        Object obj2 = null;
        if (this.a.size() > 0) {
            obj2 = this.a.get(list3.size() - 2);
            obj = this.a.get(list4.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof eauq)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        eauq eauqVar = new eauq((eauq) obj2, eauuVar);
        this.a.set(list.size() - 2, eauqVar);
        this.a.set(list2.size() - 1, eauqVar);
        this.g[eauqVar.a] = eauqVar;
    }

    private static eaun f(List<Object> list, boolean z, boolean z2) {
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof eaut)) {
                eaut eautVar = (eaut) list.get(0);
                if (eautVar.b == null && eautVar.a == null) {
                    eaun f = f(list.subList(2, size), z, z2);
                    eaux eauxVar = f.a;
                    eauw eauwVar = f.b;
                    eautVar.a = eauxVar;
                    eautVar.b = eauwVar;
                    return new eaun(eautVar, eautVar);
                }
            }
            Object[] c = c(list);
            if (z) {
                return new eaun(null, (eauw) c[1]);
            }
            if (z2) {
                return new eaun((eaux) c[0], null);
            }
            return new eaun((eaux) c[0], (eauw) c[1]);
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }
}
