package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aldi  reason: default package */
/* loaded from: classes2.dex */
public abstract class aldi implements aleh {
    private static final dcqe a = dcqe.c("aldi");

    /* JADX INFO: Access modifiers changed from: protected */
    public static final List<Integer> c(List<akra> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        arrayList.add(0);
        dcvs c = dcvs.c(list.get(0).j(), list.get(0).n());
        int i2 = 1;
        double d = dcyn.a;
        while (i2 < list.size()) {
            dcvs c2 = dcvs.c(list.get(i2).j(), list.get(i2).n());
            d += c2.m(c);
            int round = Math.round((float) d);
            if (i != round) {
                arrayList.add(Integer.valueOf(round));
                i = round;
            }
            i2++;
            c = c2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(aldp aldpVar, boolean z, List<akra> list, List<Integer> list2, List<akuh> list3) {
        List<akra> list4;
        List<Integer> list5;
        int i;
        List<akuh> list6 = list3;
        List<Integer> c = c(aldpVar.a);
        if (!dcln.a.p(c)) {
            bvoo.h("The polyline point offsets are not strictly ordered.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b(aldpVar, aldpVar.c, z));
        if (!dcln.a.p(arrayList)) {
            bvoo.h("The polyline style offsets are not strictly ordered.", new Object[0]);
        }
        Collection<? extends akra> collection = aldpVar.a;
        list.addAll(collection);
        LinkedList linkedList = new LinkedList(arrayList);
        aldh aldhVar = (aldh) linkedList.poll();
        if (aldhVar == null) {
            bvoo.h("There should be at least one offset/style pair for a traffic polyline.", new Object[0]);
        } else {
            list6.add(aldhVar.a);
        }
        int i2 = 1;
        int i3 = 0;
        while (i2 < c.size()) {
            int intValue = c.get(i2).intValue();
            aldh aldhVar2 = (aldh) linkedList.peek();
            while (aldhVar2 != null && aldhVar2.b <= intValue) {
                linkedList.poll();
                if (i2 != c.size() - 1 || aldhVar2.b != intValue) {
                    list6.add(aldhVar2.a);
                    list2.add(Integer.valueOf(i2 + i3));
                }
                if (aldhVar2.b != intValue) {
                    int i4 = i2 + i3;
                    int i5 = i2 - 1;
                    akra akraVar = collection.get(i5);
                    akra akraVar2 = collection.get(i2);
                    int i6 = i3;
                    double d = aldhVar2.b;
                    i = intValue;
                    double intValue2 = c.get(i5).intValue();
                    list4 = collection;
                    list5 = c;
                    double intValue3 = c.get(i2).intValue();
                    Double.isNaN(intValue3);
                    Double.isNaN(intValue2);
                    double d2 = intValue3 - intValue2;
                    dbsk.r(d2 > dcyn.a, "Polyline point offsets are invalid: (A: %s, B: %s)", Double.valueOf(intValue2), Double.valueOf(intValue3));
                    Double.isNaN(d);
                    Double.isNaN(intValue2);
                    list.add(i4, akraVar.I(akraVar2, (float) ((d - intValue2) / d2)));
                    i3 = i6 + 1;
                } else {
                    list4 = collection;
                    list5 = c;
                    i = intValue;
                }
                aldhVar2 = (aldh) linkedList.peek();
                list6 = list3;
                intValue = i;
                c = list5;
                collection = list4;
            }
            i2++;
            i3 = i3;
            list6 = list3;
            c = c;
            collection = collection;
        }
    }

    protected abstract List<aldh> b(aldp aldpVar, boolean z, boolean z2);
}
