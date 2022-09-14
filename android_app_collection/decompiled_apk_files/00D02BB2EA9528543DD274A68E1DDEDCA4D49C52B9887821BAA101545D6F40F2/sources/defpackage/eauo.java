package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: eauo  reason: default package */
/* loaded from: classes6.dex */
final class eauo implements eaux, eauw {
    private final eaux[] a;
    private final eauw[] b;

    public eauo(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof eaux) {
                if (obj instanceof eauo) {
                    d(arrayList, ((eauo) obj).a);
                } else {
                    arrayList.add(obj);
                }
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof eauw) {
                if (obj2 instanceof eauo) {
                    d(arrayList2, ((eauo) obj2).b);
                } else {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList.size() <= 0) {
            this.a = null;
        } else {
            this.a = (eaux[]) arrayList.toArray(new eaux[arrayList.size()]);
        }
        if (arrayList2.size() <= 0) {
            this.b = null;
        } else {
            this.b = (eauw[]) arrayList2.toArray(new eauw[arrayList2.size()]);
        }
    }

    private static final void d(List<Object> list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.eaux
    public final int a(eapu eapuVar) {
        eaux[] eauxVarArr = this.a;
        int length = eauxVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += eauxVarArr[length].a(eapuVar);
            } else {
                return i;
            }
        }
    }

    @Override // defpackage.eaux
    public final int b(eapu eapuVar, int i) {
        eaux[] eauxVarArr = this.a;
        int length = eauxVarArr.length;
        int i2 = 0;
        while (i2 < i) {
            length--;
            if (length < 0) {
                break;
            }
            i2 += eauxVarArr[length].b(eapuVar, Integer.MAX_VALUE);
        }
        return i2;
    }

    @Override // defpackage.eaux
    public final void c(StringBuffer stringBuffer, eapu eapuVar) {
        for (eaux eauxVar : this.a) {
            eauxVar.c(stringBuffer, eapuVar);
        }
    }
}
