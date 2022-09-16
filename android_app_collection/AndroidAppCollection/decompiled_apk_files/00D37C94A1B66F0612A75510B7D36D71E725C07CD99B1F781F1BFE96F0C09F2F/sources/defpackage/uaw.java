package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: uaw  reason: default package */
/* loaded from: classes4.dex */
public final class uaw {
    public uaw() {
    }

    public uaw(amqo amqoVar) {
        aqxo.i(amqoVar);
    }

    public static int a(int i) {
        if (i != 0) {
            switch (i) {
                case 950:
                    return 951;
                case 951:
                    return 952;
                case 952:
                    return 953;
                default:
                    switch (i) {
                        case 1001:
                            return 1002;
                        case 1002:
                            return 1003;
                        case 1003:
                            return 1004;
                        case 1004:
                            return 1005;
                        case 1005:
                            return 1006;
                        default:
                            return 0;
                    }
            }
        }
        return 1;
    }

    public static SharedPreferences b(Context context, String str, ampq ampqVar) {
        if (ampqVar != null && ampqVar.h()) {
            String str2 = (String) ampqVar.c();
            str = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, aoqu] */
    public static aoqu c(String str, aorb aorbVar) {
        try {
            return aorbVar.n(Base64.decode(str, 3), aoos.a());
        } catch (IllegalArgumentException e) {
            throw new aopx("Unable to decode to byte array", new IOException(e));
        }
    }

    public static aoqu d(SharedPreferences sharedPreferences, String str, aorb aorbVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return c(string, aorbVar);
        } catch (aopx unused) {
            return null;
        }
    }

    public static String e(aoqu aoquVar) {
        return Base64.encodeToString(aoquVar.toByteArray(), 3);
    }

    public static void f(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void g(SharedPreferences.Editor editor, String str, aoqu aoquVar) {
        editor.putString(str, e(aoquVar));
    }

    public static boolean h(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean i(SharedPreferences sharedPreferences, String str, aoqu aoquVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        g(edit, str, aoquVar);
        return edit.commit();
    }
}
