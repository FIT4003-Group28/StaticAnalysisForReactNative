package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cesf  reason: default package */
/* loaded from: classes4.dex */
public final class cesf {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dwvz a(@defpackage.dzsi java.lang.String r7, defpackage.btvo r8, defpackage.duls r9, @defpackage.dzsi defpackage.drfs r10, defpackage.cese r11, defpackage.cebr r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cesf.a(java.lang.String, btvo, duls, drfs, cese, cebr):dwvz");
    }

    public static dhsp b(Context context, baad baadVar) {
        drcq drcqVar;
        String str;
        dnwl I = baadVar.I();
        StringBuilder sb = new StringBuilder();
        if (!baadVar.G().isEmpty()) {
            sb.append(baadVar.G());
            sb.append(" · ");
        }
        sb.append(context.getResources().getQuantityString(R.plurals.LIST_COUNT_PLACES, baadVar.k(), Integer.valueOf(baadVar.k())));
        dhso bZ = dhsp.f.bZ();
        String E = baadVar.E(context);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsp dhspVar = (dhsp) bZ.b;
        E.getClass();
        dhspVar.a |= 2;
        dhspVar.c = E;
        String sb2 = sb.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsp dhspVar2 = (dhsp) bZ.b;
        sb2.getClass();
        dhspVar2.a |= 4;
        dhspVar2.d = sb2;
        drcn bZ2 = drco.d.bZ();
        String l = baadVar.l();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drco drcoVar = (drco) bZ2.b;
        l.getClass();
        drcoVar.a |= 2;
        drcoVar.c = l;
        baab o = baadVar.o();
        baab baabVar = baab.FAVORITES;
        int ordinal = o.ordinal();
        if (ordinal == 0) {
            drcqVar = drcq.FAVORITES;
        } else if (ordinal == 1) {
            drcqVar = drcq.WANT_TO_GO;
        } else if (ordinal == 2) {
            drcqVar = drcq.STARRED;
        } else if (ordinal == 5) {
            drcqVar = drcq.CUSTOM;
        } else {
            drcqVar = drcq.UNKNOWN_PLACE_LIST_TYPE;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drco drcoVar2 = (drco) bZ2.b;
        drcoVar2.b = drcqVar.g;
        drcoVar2.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsp dhspVar3 = (dhsp) bZ.b;
        drco bK = bZ2.bK();
        bK.getClass();
        dhspVar3.b = bK;
        dhspVar3.a |= 1;
        if (I != null) {
            dnwr dnwrVar = I.e;
            if (dnwrVar == null) {
                dnwrVar = dnwr.c;
            }
            str = dnwrVar.b;
        } else {
            str = "";
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsp dhspVar4 = (dhsp) bZ.b;
        str.getClass();
        dhspVar4.a |= 8;
        dhspVar4.e = str;
        return bZ.bK();
    }

    public static boolean c(drea dreaVar, cese ceseVar) {
        if (ceseVar.b()) {
            drec drecVar = dreaVar.b;
            if (drecVar == null) {
                drecVar = drec.c;
            }
            if (drecVar.a != 1) {
                return false;
            }
            int i = dreaVar.a;
            return ((i & 2) == 0 || (i & 4) == 0) ? false : true;
        }
        return false;
    }

    public static int d(dqwa dqwaVar, int i) {
        for (dqvu dqvuVar : dqwaVar.b) {
            int a = dqvt.a(dqvuVar.b);
            if (a == 0) {
                a = 1;
                continue;
            }
            if (a == i) {
                return dqvuVar.e;
            }
        }
        return 0;
    }
}
