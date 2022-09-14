package defpackage;

import android.content.Context;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dapw  reason: default package */
/* loaded from: classes5.dex */
public final class dapw {
    public static int a(Context context) {
        char c;
        String e = daou.a(context).e(context, daos.CONFIG_LAYOUT_GRAVITY);
        if (e == null) {
            return 0;
        }
        String lowerCase = e.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals("start")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("center")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return 17;
        }
        return c != 1 ? 0 : 8388611;
    }
}
