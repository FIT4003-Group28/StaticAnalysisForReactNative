package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: amux  reason: default package */
/* loaded from: classes2.dex */
public final class amux {
    private static final dcep<dgau> a = dcep.G(dgau.DEPART, dgau.TURN, dgau.NAME_CHANGE, dgau.STRAIGHT, dgau.UTURN, dgau.FORK, dgau.MERGE, dgau.ROUNDABOUT_EXIT, dgau.ROUNDABOUT_ENTER_AND_EXIT);
    private static final dcep<dovu> b = dcep.C(dovu.TYPE_TO_ROAD_NAME, dovu.TYPE_FOLLOW_ROAD_NAME);
    private static final akra c = akra.e(dcyn.a, dcyn.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.amuo... r6) {
        /*
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L34
            r3 = r6[r2]
            java.util.List<dozz> r3 = r3.C
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            dozz r4 = (defpackage.dozz) r4
            int r4 = r4.f
            dozy r4 = defpackage.dozy.b(r4)
            if (r4 != 0) goto L23
            dozy r4 = defpackage.dozy.UNKNOWN
        L23:
            dozy r5 = defpackage.dozy.TOLL
            if (r4 == r5) goto L2f
            dozy r5 = defpackage.dozy.PARTIAL_TOLL
            if (r4 == r5) goto L2f
            dozy r5 = defpackage.dozy.TOLL_ZONE_CROSSING
            if (r4 != r5) goto Ld
        L2f:
            r6 = 1
            return r6
        L31:
            int r2 = r2 + 1
            goto L3
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amux.a(amuo[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(@dzsi amuo[] amuoVarArr) {
        if (amuoVarArr.length != 0) {
            for (amuo amuoVar : amuoVarArr) {
                if (amuoVar == null || amuoVar.D.isEmpty()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(dgau dgauVar) {
        return dgauVar == dgau.TURN || dgauVar == dgau.UTURN;
    }

    public static boolean d(amuo amuoVar) {
        amuo amuoVar2;
        if (amuoVar.d == dgau.DESTINATION || (amuoVar2 = amuoVar.Q) == null) {
            return false;
        }
        return (amuoVar2.m <= 60 || amuoVar2.k <= 500) && amuoVar2.d != dgau.ROUNDABOUT_EXIT;
    }

    public static boolean e(amuo amuoVar) {
        return !amuoVar.F.isEmpty();
    }

    public static boolean f(amuo amuoVar, boolean z) {
        if (amuoVar.E == -1) {
            return true;
        }
        return z;
    }

    @dzsi
    public static dzke g(@dzsi amuo[] amuoVarArr, int i) {
        dpec dpecVar;
        dzjw dzjwVar = new dzjw();
        boolean z = false;
        int i2 = 0;
        for (amuo amuoVar : amuoVarArr) {
            if (amuoVar != null && (dpecVar = amuoVar.a) != null) {
                dqvj c2 = dqvj.c(dpecVar.b);
                if (c2 == null) {
                    c2 = dqvj.DRIVE;
                }
                if (c2 == dqvj.TRANSIT && amuoVar.d == dgau.DESTINATION) {
                    if (!z) {
                        dzjwVar.b(i2);
                        z = true;
                    }
                    i2 += amuoVar.k;
                }
            }
            if (z) {
                dzjwVar.b(i2);
                z = false;
            }
            i2 += amuoVar.k;
        }
        if ((dzjwVar.b & 1) != 0) {
            dzjwVar.b(i);
        }
        return dzjwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x024a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.amun h(defpackage.dpdq r40, @defpackage.dzsi defpackage.akra r41, @defpackage.dzsi defpackage.amvh r42) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amux.h(dpdq, akra, amvh):amun");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static dozz i(dpdq dpdqVar) {
        dpec dpecVar = dpdqVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        for (dozz dozzVar : dpecVar.j) {
            dozy b2 = dozy.b(dozzVar.f);
            if (b2 == null) {
                b2 = dozy.UNKNOWN;
            }
            if (b2.equals(dozy.SIDE_OF_ROAD)) {
                return dozzVar;
            }
        }
        return null;
    }

    @dzsi
    public static String k(@dzsi amuo amuoVar) {
        amup j = j(amuoVar);
        if (j == null) {
            return null;
        }
        return j.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuo l(Resources resources, dowh dowhVar, amuo amuoVar) {
        amun h = amuoVar.h();
        Object[] objArr = new Object[1];
        dpan dpanVar = dowhVar.f;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        objArr[0] = dpanVar.c;
        h.i = resources.getString(R.string.BIKESHARING_UNLOCK_IN_X, objArr);
        h.j = null;
        dpan dpanVar2 = dowhVar.f;
        if (dpanVar2 == null) {
            dpanVar2 = dpan.e;
        }
        douj doujVar = dpanVar2.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        h.A = doujVar.c;
        h.r = dcdc.e();
        return h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuo m(Resources resources, dowf dowfVar, amuo amuoVar) {
        amun h = amuoVar.h();
        dowd dowdVar = dowfVar.c;
        if (dowdVar == null) {
            dowdVar = dowd.f;
        }
        int i = dowdVar.d;
        String string = resources.getString(R.string.BIKESHARING_UNLOCK_BIKE);
        String quantityString = resources.getQuantityString(R.plurals.BIKESHARING_BIKES_AVAILABLE, i, Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(quantityString).length());
        sb.append(string);
        sb.append(" · ");
        sb.append(quantityString);
        h.i = sb.toString();
        h.j = null;
        dpan dpanVar = dowfVar.b;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        douj doujVar = dpanVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        h.A = doujVar.c;
        h.r = dcdc.e();
        return h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuo n(Resources resources, dowf dowfVar, amuo amuoVar) {
        amun h = amuoVar.h();
        dowd dowdVar = dowfVar.e;
        if (dowdVar == null) {
            dowdVar = dowd.f;
        }
        int i = dowdVar.e;
        String string = resources.getString(R.string.BIKESHARING_RETURN_BIKE);
        String quantityString = resources.getQuantityString(R.plurals.BIKESHARING_DOCKS_AVAILABLE, i, Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(quantityString).length());
        sb.append(string);
        sb.append(" · ");
        sb.append(quantityString);
        h.i = sb.toString();
        h.j = null;
        dpan dpanVar = dowfVar.b;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        douj doujVar = dpanVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        h.A = doujVar.c;
        h.r = dcdc.e();
        return h.a();
    }

    @dzsi
    private static amup o(amuo amuoVar) {
        for (amup amupVar : amuoVar.A) {
            if (amupVar.b() == dovu.TYPE_TO_ROAD_NAME) {
                return amupVar;
            }
        }
        return null;
    }

    @dzsi
    public static amup j(@dzsi amuo amuoVar) {
        amup b2;
        amup o;
        if (amuoVar == null) {
            return null;
        }
        if (amuoVar.d == dgau.DEPART && amuoVar.r) {
            return amuoVar.b();
        }
        if (amuoVar.d == dgau.UTURN && (o = o(amuoVar)) != null) {
            return o;
        }
        amuo amuoVar2 = amuoVar.R;
        if (amuoVar2 != null && a.contains(amuoVar2.d) && amuoVar2.r) {
            if (amuoVar2.d == dgau.UTURN) {
                b2 = o(amuoVar2);
            } else {
                b2 = amuoVar2.b();
            }
            if (b2 != null && b.contains(b2.b())) {
                return b2;
            }
        }
        return null;
    }
}
