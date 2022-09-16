package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dhe  reason: default package */
/* loaded from: classes3.dex */
public final class dhe {
    private static final List c = new ArrayList();
    public dhd a;
    public final List b = new ArrayList();

    private static final int b(List list, String str) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            dhj dhjVar = (dhj) it.next();
            if (dhjVar.i.equals(str)) {
                break;
            }
            i += dhjVar.g;
        }
        return i;
    }

    private static final String c(dhj dhjVar, String str) {
        if (dhjVar == null || dhjVar.a != null) {
            if (dhjVar == null) {
                return "";
            }
            String simpleName = dhjVar.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(simpleName).length());
            sb.append(str);
            sb.append("->");
            sb.append(simpleName);
            return sb.toString();
        }
        return dhjVar.getClass().getSimpleName();
    }

    public static dhd a(dhk dhkVar, dhj dhjVar, dhj dhjVar2, List list, tmt tmtVar, String str, String str2, String str3, String str4, boolean z) {
        dhd dhdVar;
        dhd dhdVar2;
        if (dhjVar == null && dhjVar2 == null) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (dhjVar2 == null) {
            int i = dhjVar.g;
            list.add(dhjVar);
            dhd d = dhd.d(dhjVar.g, dhjVar2, z);
            for (int i2 = 0; i2 < i; i2++) {
                d.f(dhb.e(null));
            }
            return d;
        }
        String c2 = c(dhjVar, str2);
        String c3 = c(dhjVar2, str3);
        if (dhjVar == null || dhl.i(dhjVar, dhjVar2)) {
            tmtVar.h(str, dhjVar, dhjVar2, c2, c3, true, str4);
            if (dhjVar2.h()) {
                dhd d2 = dhd.d(dhjVar == null ? 0 : dhjVar.g, dhjVar2, z);
                dhjVar2.g(dhjVar2.c, d2, dhjVar, dhjVar2);
                dhjVar2.g = d2.d;
                return d2;
            }
            dhd c4 = dhd.c(dhjVar2, z);
            Map b = dhj.b(dhjVar);
            Map b2 = dhj.b(dhjVar2);
            List arrayList = dhjVar == null ? c : new ArrayList(dhjVar.h);
            List list2 = dhjVar2.h;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (i3 < list2.size()) {
                String str5 = ((dhj) list2.get(i3)).i;
                if (b.containsKey(str5)) {
                    jj jjVar = (jj) b.get(str5);
                    dhj dhjVar3 = (dhj) jjVar.a;
                    int intValue = ((Integer) jjVar.b).intValue();
                    if (i5 > intValue) {
                        for (int i6 = 0; i6 < dhjVar3.g; i6++) {
                            c4.f(dhb.a(0, b(arrayList, str5), i4, 1, null, null, null, null));
                        }
                        arrayList.remove(intValue);
                        arrayList.add(i5, dhjVar3);
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            dhj dhjVar4 = (dhj) arrayList.get(i7);
                            jj jjVar2 = (jj) b.get(dhjVar4.i);
                            if (((Integer) jjVar2.b).intValue() != i7) {
                                dhdVar2 = c4;
                                b.put(dhjVar4.i, new jj((dhj) jjVar2.a, Integer.valueOf(i7)));
                            } else {
                                dhdVar2 = c4;
                            }
                            i7++;
                            c4 = dhdVar2;
                        }
                    } else {
                        dhdVar = c4;
                        if (intValue > i5) {
                            i4 = (b(arrayList, str5) + ((dhj) arrayList.get(intValue)).g) - 1;
                            i5 = intValue;
                            i3++;
                            c4 = dhdVar;
                        }
                        i3++;
                        c4 = dhdVar;
                    }
                }
                dhdVar = c4;
                i3++;
                c4 = dhdVar;
            }
            dhd dhdVar3 = c4;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                String str6 = ((dhj) arrayList.get(i8)).i;
                dhj dhjVar5 = (dhj) arrayList.get(i8);
                if (b2.get(str6) == null) {
                    sparseArray.put(i8, a(dhkVar, dhjVar5, null, list, tmtVar, str, c2, c3, str4, z));
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                dhj dhjVar6 = (dhj) list2.get(i10);
                jj jjVar3 = (jj) b.get(dhjVar6.i);
                int intValue2 = jjVar3 != null ? ((Integer) jjVar3.b).intValue() : -1;
                if (intValue2 < 0) {
                    dhd dhdVar4 = (dhd) sparseArray.get(i9);
                    dhd a = a(dhkVar, null, dhjVar6, list, tmtVar, str, c2, c3, str4, z);
                    sparseArray.put(i9, dhd.e(dhdVar4, a));
                    if (dhdVar4 != null) {
                        dhdVar4.g();
                    }
                    a.g();
                } else {
                    dhd dhdVar5 = (dhd) sparseArray.get(intValue2);
                    dhd a2 = a(dhkVar, (dhj) arrayList.get(intValue2), dhjVar6, list, tmtVar, str, c2, c3, str4, z);
                    sparseArray.put(intValue2, dhd.e(dhdVar5, a2));
                    if (dhdVar5 != null) {
                        dhdVar5.g();
                    }
                    a2.g();
                    i9 = intValue2;
                }
            }
            int size2 = sparseArray.size();
            dhd dhdVar6 = dhdVar3;
            for (int i11 = 0; i11 < size2; i11++) {
                dhd dhdVar7 = (dhd) sparseArray.valueAt(i11);
                dhdVar6 = dhd.e(dhdVar6, dhdVar7);
                if (dhdVar7 != null) {
                    dhdVar7.g();
                }
            }
            dhjVar2.g = dhdVar6.d;
            return dhdVar6;
        }
        dhd d3 = dhd.d(dhjVar.g, dhjVar2, z);
        dhjVar2.g = d3.d;
        tmtVar.h(str, dhjVar, dhjVar2, c2, c3, false, str4);
        return d3;
    }
}
