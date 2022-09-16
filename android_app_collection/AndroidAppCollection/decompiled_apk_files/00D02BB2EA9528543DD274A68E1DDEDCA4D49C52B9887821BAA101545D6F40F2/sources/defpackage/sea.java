package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: sea  reason: default package */
/* loaded from: classes7.dex */
public final class sea {
    public static List<sbe> a(List<amub> list, sdz sdzVar, cqkn<sbe> cqknVar, ddho ddhoVar) {
        String str;
        String string;
        ArrayList arrayList = new ArrayList();
        for (amub amubVar : list) {
            if (amubVar.h.equals(dqvj.TRANSIT)) {
                int size = arrayList.size();
                amve amveVar = amubVar.d;
                shd shdVar = null;
                if (!amveVar.b().i) {
                    dcdc<zdu> a = zsa.a(amveVar, vtj.TRANSIT_AUTO);
                    amtr a2 = amug.a(amubVar);
                    if (a2 != null) {
                        int i = 0;
                        while (true) {
                            if (i >= a2.e()) {
                                str = null;
                                break;
                            }
                            amuq d = a2.d(i);
                            if (!d.f() || (d.g().a & 2) == 0) {
                                i++;
                            } else {
                                Context context = sdzVar.a;
                                Object[] objArr = new Object[1];
                                dpgw dpgwVar = d.g().c;
                                if (dpgwVar == null) {
                                    dpgwVar = dpgw.r;
                                }
                                objArr[0] = dpgwVar.b;
                                str = context.getString(R.string.TRANSIT_ROUTE_SUMMARY_START_STATION, objArr);
                            }
                        }
                        if (str != null) {
                            amuf d2 = amug.d(a2);
                            if (d2 == null) {
                                string = null;
                            } else {
                                Context context2 = sdzVar.a;
                                Object[] objArr2 = new Object[1];
                                dpgw dpgwVar2 = ((amsm) d2).a.g().d;
                                if (dpgwVar2 == null) {
                                    dpgwVar2 = dpgw.r;
                                }
                                objArr2[0] = dpgwVar2.b;
                                string = context2.getString(R.string.TRANSIT_ROUTE_SUMMARY_FIRST_TRANSFER, objArr2);
                            }
                            shdVar = new shd(a, str, string, amubVar.c, cqknVar, ddhoVar, size, null);
                        }
                    }
                }
                if (shdVar != null) {
                    arrayList.add(shdVar);
                }
            }
        }
        return arrayList;
    }
}
