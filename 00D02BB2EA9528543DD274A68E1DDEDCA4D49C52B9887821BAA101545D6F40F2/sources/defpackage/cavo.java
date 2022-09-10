package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cavo  reason: default package */
/* loaded from: classes4.dex */
public final class cavo {
    private static final cqrp a = cqrp.d(12.0d);
    private static final cqrp b = cqrp.d(2.0d);
    private static final cqrp c = cqrp.f(14.0d);
    private static final cqrp d = cqrp.d(6.0d);

    public static boolean a(dqvy dqvyVar, dqwe dqweVar) {
        return ((dqvyVar.a & 16) == 0 || dqweVar.b.size() <= 1 || (dqvyVar.a & 1) == 0) ? false : true;
    }

    public static boolean b(dqvy dqvyVar, dqwe dqweVar) {
        return ((dqvyVar.a & 16) == 0 || dqweVar.b.size() <= 1 || (dqvyVar.a & 1) == 0) ? false : true;
    }

    public static void d(dqvy dqvyVar, dqwe dqweVar, boolean z, cqrp cqrpVar) {
        ArrayList arrayList = new ArrayList();
        for (dqwd dqwdVar : dqweVar.b) {
            arrayList.add(Integer.valueOf(dqwdVar.a));
        }
        new jhe(z, a, cqrpVar, b, c, d, dqvyVar.b, arrayList);
    }

    public static cqss c(int i) {
        if (i != 1) {
            if (i == 2) {
                return cqrt.c(R.color.qu_amber_600);
            }
            if (i == 3) {
                return cqrt.c(R.color.qu_orange_800);
            }
            if (i == 4) {
                return cqrt.c(R.color.qu_google_green_400);
            }
            if (i == 5) {
                return cqrt.c(R.color.qu_light_blue_600);
            }
            return cqrt.c(R.color.qu_orange_800);
        }
        return cqrt.c(R.color.qu_pink_500);
    }
}
