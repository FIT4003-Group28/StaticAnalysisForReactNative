package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aiwv  reason: default package */
/* loaded from: classes.dex */
public final class aiwv {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 17;
            case 4:
                return 18;
            case 5:
                return 20;
            case 6:
                return 33;
            case 7:
            default:
                return 34;
            case 8:
                return 36;
        }
    }

    public static int b(Attributes attributes, int i, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return zgh.b(value, i);
            }
        }
        return i;
    }

    public static int c(float f) {
        return (int) (f * 1000.0f);
    }

    public static long d(Attributes attributes, long j, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                return zgh.c(value, j);
            }
        }
        return j;
    }

    public static zib e() {
        HashMap hashMap = new HashMap();
        hashMap.put("/transcript", new aiwn());
        hashMap.put("/transcript/text", new aiwm());
        hashMap.put("/timedtext", new aiwl());
        hashMap.put("/timedtext/window", new aiwk());
        hashMap.put("/timedtext/text", new aiwu());
        hashMap.put("/timedtext/head/pen", new aiwt());
        hashMap.put("/timedtext/head/ws", new aiws());
        hashMap.put("/timedtext/head/wp", new aiwr());
        hashMap.put("/timedtext/body/w", new aiwq());
        hashMap.put("/timedtext/body/p", new aiwp());
        hashMap.put("/timedtext/body/p/s", new aiwo());
        return zna.p(hashMap);
    }

    public static String f(Attributes attributes, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static String g(Attributes attributes, String str, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                return value;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean h(Attributes attributes, String[] strArr) {
        return b(attributes, 0, strArr) != 0;
    }

    public static Uri i(Context context) {
        return yhr.a(context, "player", "backed_up_player_settings.pb");
    }

    public static aynx j(aynx aynxVar, ampg ampgVar) {
        return aynxVar.n().O(new aitj(ampgVar));
    }

    public static aynx k(aynx aynxVar, ampg ampgVar) {
        return aynxVar.n().O(new aitj(ampgVar, 2));
    }

    public static ayob l(int i) {
        return new aiti(i, 1);
    }

    public static void m(Throwable th) {
        afus.c(2, 10, "AdNotificationController failed unexpectedly while receiving an RX event.", th);
    }

    public static ayob n(aacz aaczVar, long j) {
        atzt D = aiix.D(aaczVar);
        if ((j & (D != null ? D.j : 0L)) == 0) {
            return nps.n;
        }
        atzt D2 = aiix.D(aaczVar);
        return new aiti(D2 != null ? D2.k : 0);
    }
}
