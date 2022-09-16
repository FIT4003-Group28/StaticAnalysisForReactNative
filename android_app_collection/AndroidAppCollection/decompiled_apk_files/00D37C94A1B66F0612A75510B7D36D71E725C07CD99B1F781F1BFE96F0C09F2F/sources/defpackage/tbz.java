package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tbz  reason: default package */
/* loaded from: classes4.dex */
public final class tbz {
    private static final Map a = new HashMap();

    protected static int a(Context context, String str, String str2) {
        int intValue;
        Map map = a;
        synchronized (map) {
            String valueOf = String.valueOf(str2);
            String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            Integer num = (Integer) map.get(concat);
            if (num == null) {
                intValue = context.getResources().getIdentifier(str2, str, context.getPackageName());
                map.put(concat, Integer.valueOf(intValue));
            } else {
                intValue = num.intValue();
            }
        }
        return intValue;
    }

    public static int b(Context context, awny awnyVar) {
        int B;
        for (int i = 0; i < awnyVar.c.size(); i++) {
            awoa awoaVar = (awoa) awnyVar.c.get(i);
            if (awoaVar.c == 3) {
                awnx awnxVar = (awnx) awoaVar.d;
                if ((awnxVar.b & 2) != 0) {
                    String str = awnxVar.c;
                    int B2 = awwc.B(awnyVar.f);
                    return a(context, ((B2 != 0 && B2 == 5) || ((B = awwc.B(awnyVar.f)) != 0 && B == 4)) ? "raw" : "drawable", str);
                }
            }
        }
        return 0;
    }

    public static int c(Context context, aodt aodtVar) {
        for (int i = 0; i < aodtVar.aa(); i++) {
            aodt aI = aodtVar.ab(i).aI();
            if (aI != null) {
                int b = aI.b(6);
                String e = b != 0 ? aI.e(b + aI.a) : null;
                if (e != null) {
                    return a(context, "drawable", e);
                }
            }
        }
        return 0;
    }
}
