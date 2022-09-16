package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: eaum  reason: default package */
/* loaded from: classes6.dex */
public final class eaum {
    private static eaun a;

    public static eaun a() {
        eaut eautVar;
        if (a == null) {
            eauv eauvVar = new eauv();
            eaur eaurVar = new eaur("P");
            eauvVar.d(eaurVar, eaurVar);
            eauvVar.b(0);
            eauvVar.e("Y");
            eauvVar.b(1);
            eauvVar.e("M");
            eauvVar.b(2);
            eauvVar.e("W");
            eauvVar.b(3);
            eauvVar.e("D");
            List<Object> list = eauvVar.a;
            if (list.size() == 0) {
                eaut eautVar2 = new eaut(eaur.a);
                eauvVar.d(eautVar2, eautVar2);
            } else {
                int size = list.size();
                while (true) {
                    int i = size - 1;
                    if (i < 0) {
                        eautVar = null;
                        break;
                    } else if (list.get(i) instanceof eaut) {
                        eautVar = (eaut) list.get(i);
                        list = list.subList(i + 1, list.size());
                        break;
                    } else {
                        size = i - 1;
                    }
                }
                if (eautVar == null || list.size() != 0) {
                    Object[] c = eauv.c(list);
                    list.clear();
                    eauw eauwVar = (eauw) c[1];
                    eaut eautVar3 = new eaut((eaux) c[0]);
                    list.add(eautVar3);
                    list.add(eautVar3);
                } else {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
            }
            eauvVar.b(4);
            eauvVar.e("H");
            eauvVar.b(5);
            eauvVar.e("M");
            eauvVar.b(9);
            eauvVar.e("S");
            a = eauvVar.a();
        }
        return a;
    }
}
