package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vxp  reason: default package */
/* loaded from: classes7.dex */
public final class vxp {
    @dzsi
    public static String a(bvsl bvslVar, dpec dpecVar) {
        if ((dpecVar.a & 4) != 0) {
            dowb dowbVar = dpecVar.d;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            if ((dowbVar.a & 1) == 0) {
                return null;
            }
            return bvslVar.i(dowbVar);
        }
        return null;
    }

    @dzsi
    public static String b(dpec dpecVar, Resources resources, bvsz bvszVar) {
        dgas e = e(dpecVar);
        if (e != null) {
            int i = e.a;
            if ((i & 1) == 0 && (i & 4) == 0) {
                return null;
            }
            return bvtb.e(resources, (i & 4) != 0 ? e.d : e.b, bvszVar).toString();
        }
        return null;
    }

    public static boolean c(dpec dpecVar) {
        if (dpecVar == null) {
            return false;
        }
        int size = dpecVar.j.size();
        for (int i = 0; i < size; i++) {
            dozy b = dozy.b(dpecVar.j.get(i).f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            if (b == dozy.TOLL) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(dpec dpecVar) {
        if (dpecVar == null) {
            return false;
        }
        int size = dpecVar.j.size();
        for (int i = 0; i < size; i++) {
            dozy b = dozy.b(dpecVar.j.get(i).f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            if (b == dozy.FERRY_BOAT) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public static dgas e(dpec dpecVar) {
        dgas dgasVar;
        doxd doxdVar = dpecVar.k;
        if (doxdVar == null) {
            doxdVar = doxd.l;
        }
        if ((doxdVar.a & 1) != 0) {
            doxd doxdVar2 = dpecVar.k;
            if (doxdVar2 == null) {
                doxdVar2 = doxd.l;
            }
            dgasVar = doxdVar2.b;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
        } else {
            dgasVar = null;
        }
        if (dgasVar == null) {
            if ((dpecVar.a & 8) == 0) {
                return null;
            }
            dgas dgasVar2 = dpecVar.e;
            return dgasVar2 == null ? dgas.e : dgasVar2;
        }
        return dgasVar;
    }

    public static int f(dpec dpecVar) {
        doxd doxdVar = dpecVar.k;
        if (doxdVar == null) {
            doxdVar = doxd.l;
        }
        dgas dgasVar = doxdVar.d;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        if ((dgasVar.a & 1) != 0) {
            doxd doxdVar2 = dpecVar.k;
            if (doxdVar2 == null) {
                doxdVar2 = doxd.l;
            }
            dgas dgasVar2 = doxdVar2.d;
            if (dgasVar2 == null) {
                dgasVar2 = dgas.e;
            }
            return dgasVar2.b;
        }
        return -1;
    }

    public static String g(Context context, int i, bvsz bvszVar) {
        return context.getString(R.string.DIRECTIONS_DURATION_WITHOUT_TRAFFIC, bvtb.e(context.getResources(), i, bvszVar).toString());
    }
}
