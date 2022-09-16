package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* compiled from: PG */
/* renamed from: babv  reason: default package */
/* loaded from: classes2.dex */
public final class babv {
    public static final SharedPreferences a;

    static {
        bach b = bach.b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(babj.c);
            b.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
