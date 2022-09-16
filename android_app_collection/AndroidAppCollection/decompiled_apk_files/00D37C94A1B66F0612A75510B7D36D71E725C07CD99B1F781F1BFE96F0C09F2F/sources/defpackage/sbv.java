package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: sbv  reason: default package */
/* loaded from: classes4.dex */
public final class sbv {
    public static void a(View view, sbu... sbuVarArr) {
        if (view.getLayerType() == 1) {
            return;
        }
        for (sbu sbuVar : sbuVarArr) {
            if (!sbuVar.a()) {
                String name = sbuVar.name();
                String simpleName = view.getClass().getSimpleName();
                String.valueOf(name).length();
                String.valueOf(simpleName).length();
                view.setLayerType(1, null);
                return;
            }
        }
    }

    public static boolean b(View view, sbu... sbuVarArr) {
        if (view.getLayerType() != 1) {
            for (int i = 0; i <= 0; i++) {
                if (!sbuVarArr[i].a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void c(long j, sef sefVar, SortedMap sortedMap) {
        sho.a(true, "timeResolution must positive");
        sho.g(sefVar, "timeFormatter can not be null");
        sortedMap.put(Long.valueOf(j), sefVar);
    }

    public static ArrayList d() {
        return new ArrayList();
    }

    public static ArrayList e(Collection collection) {
        return new ArrayList(collection);
    }

    public static ArrayList f(int i) {
        return new ArrayList(i);
    }

    public static List g(List list, shj shjVar) {
        if (list instanceof RandomAccess) {
            return new shm(list, shjVar);
        }
        return new shl(list, shjVar);
    }

    public static void h(sgt sgtVar, sgp sgpVar, sgt sgtVar2, sgp sgpVar2) {
        Double valueOf = Double.valueOf(0.0d);
        if (sgtVar2 != null) {
            sgp c = sgtVar2.c(sgq.a);
            sgp d = sgtVar2.d(sgq.b, valueOf);
            HashMap h = shp.h();
            int i = -1;
            for (Object obj : sgtVar2.a) {
                i++;
                Object a = sgpVar2.a(obj, i, sgtVar2);
                Double d2 = (Double) c.a(obj, i, sgtVar2);
                Double d3 = (Double) d.a(obj, i, sgtVar2);
                h.put(a, Double.valueOf(d2 != null ? d2.doubleValue() + d3.doubleValue() : d3.doubleValue()));
            }
            sgtVar.f(sgq.b, new shh(sgpVar, h));
            return;
        }
        sgtVar.g(sgq.b, valueOf);
    }
}
