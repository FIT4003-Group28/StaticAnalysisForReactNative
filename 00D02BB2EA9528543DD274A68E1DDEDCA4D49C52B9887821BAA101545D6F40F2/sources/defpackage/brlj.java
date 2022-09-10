package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brlj  reason: default package */
/* loaded from: classes4.dex */
public final class brlj {
    public static Pair<String, Boolean> a(Context context, dbsg<Integer> dbsgVar, boolean z) {
        String str;
        if (dbsgVar.a()) {
            int intValue = dbsgVar.b().intValue();
            if (intValue > 60) {
                str = context.getString(true != z ? R.string.POI_PROMPT_DETOUR : R.string.ENROUTE_DEVIATION_TIME_SLOWER, bvtb.e(context.getResources(), intValue, bvsz.ABBREVIATED));
            } else if (intValue < -180) {
                str = context.getString(R.string.ENROUTE_DEVIATION_TIME_FASTER, bvtb.e(context.getResources(), -intValue, bvsz.ABBREVIATED));
            } else {
                str = context.getString(R.string.ENROUTE_DEVIATION_TIME_EQUIVALENT);
            }
        } else {
            str = "";
        }
        return Pair.create(str, false);
    }

    public static doud b(cray crayVar) {
        return c(crayVar.a, (int) crayVar.c());
    }

    public static doud c(amub amubVar, int i) {
        int i2 = amubVar.D;
        int i3 = 0;
        if (i < 0 || i > i2) {
            i = akn.b(i, 0, i2);
        }
        double d = i;
        int aa = amubVar.aa(d);
        akra X = amubVar.X(d);
        dbsk.s(X);
        akrk akrkVar = amubVar.l;
        amuo[] p = amubVar.p();
        int length = p.length;
        if (length > 0) {
            i3 = p[length - 1].j;
        }
        int i4 = i3 + 1;
        int j = X.j();
        int n = X.n();
        douc bZ = doud.c.bZ();
        bZ.a(j);
        bZ.b(n);
        int i5 = aa + 1;
        while (i5 < i4) {
            akrkVar.n(i5, X);
            int j2 = X.j();
            int n2 = X.n();
            bZ.a(j2 - j);
            bZ.b(n2 - n);
            i5++;
            j = j2;
            n = n2;
        }
        return bZ.bK();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r11 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dodr d(defpackage.amub r14, @defpackage.dzsi com.google.android.apps.gmm.map.model.location.GmmLocation r15, defpackage.doud r16, defpackage.amsx r17, int r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brlj.d(amub, com.google.android.apps.gmm.map.model.location.GmmLocation, doud, amsx, int):dodr");
    }

    public static dodr e(cray crayVar, @dzsi GmmLocation gmmLocation, doud doudVar) {
        return d(crayVar.a, gmmLocation, doudVar, crayVar.j, crayVar.h);
    }
}
