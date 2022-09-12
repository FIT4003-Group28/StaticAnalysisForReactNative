package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: isl  reason: default package */
/* loaded from: classes6.dex */
public final class isl {
    @dzsi
    public static String a(@dzsi GmmLocation gmmLocation, @dzsi akqq akqqVar, bvsl bvslVar) {
        if (gmmLocation == null || akqqVar == null) {
            return null;
        }
        return d(gmmLocation, new akql(anae.a(akqqVar.a), anae.a(akqqVar.b)), null, bvslVar);
    }

    @dzsi
    public static String b(@dzsi GmmLocation gmmLocation, @dzsi dhjz dhjzVar, bvsl bvslVar) {
        return c(gmmLocation, dhjzVar, null, bvslVar);
    }

    @dzsi
    public static String c(@dzsi GmmLocation gmmLocation, @dzsi dhjz dhjzVar, @dzsi dowa dowaVar, bvsl bvslVar) {
        if (gmmLocation == null || dhjzVar == null) {
            return null;
        }
        int i = dhjzVar.a;
        if ((i & 2) != 0 && (i & 1) != 0) {
            return d(gmmLocation, new akql(anae.a(dhjzVar.c), anae.a(dhjzVar.b)), dowaVar, bvslVar);
        }
        return null;
    }

    @dzsi
    private static String d(GmmLocation gmmLocation, akql akqlVar, @dzsi dowa dowaVar, bvsl bvslVar) {
        float D = gmmLocation.D(akqlVar);
        if (D >= 620000.0d) {
            return null;
        }
        return bvslVar.c((int) D, dowaVar, true, true);
    }
}
