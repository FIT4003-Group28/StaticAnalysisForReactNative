package defpackage;

import android.os.Build;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcsv  reason: default package */
/* loaded from: classes.dex */
public final class dcsv {
    public static String a(String str, String str2, boolean z) {
        if (str.length() + str2.length() > 23) {
            str2 = str2.substring(Math.max(str2.lastIndexOf(46), str2.lastIndexOf(36)) + 1);
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        return (z || Build.VERSION.SDK_INT < 26) ? concat.substring(0, Math.min(concat.length(), 23)) : concat;
    }

    public static int b(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
